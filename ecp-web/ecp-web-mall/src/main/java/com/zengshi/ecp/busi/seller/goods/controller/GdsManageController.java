package com.zengshi.ecp.busi.seller.goods.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zengshi.ecp.base.controller.EcpBaseController;
import com.zengshi.ecp.base.vo.EcpBasePageRespVO;
import com.zengshi.ecp.base.vo.EcpBaseResponseVO;
import com.zengshi.ecp.busi.seller.coup.shop.vo.ShopVO;
import com.zengshi.ecp.busi.seller.goods.vo.GdsCountVO;
import com.zengshi.ecp.busi.seller.goods.vo.GdsInfoVO;
import com.zengshi.ecp.busi.seller.goods.vo.GdsManageVO;
import com.zengshi.ecp.busi.seller.goods.vo.GdsShiptempVO;
import com.zengshi.ecp.busi.seller.goods.vo.GdsShopVO;
import com.zengshi.ecp.busi.seller.goods.vo.GdsSkuVO;
import com.zengshi.ecp.busi.seller.goods.vo.GdsVerifyVO;
import com.zengshi.ecp.goods.dubbo.constants.GdsConstants;
import com.zengshi.ecp.goods.dubbo.constants.GdsOption.GdsQueryOption;
import com.zengshi.ecp.goods.dubbo.dto.GdsShiptempReqDTO;
import com.zengshi.ecp.goods.dubbo.dto.GdsShiptempRespDTO;
import com.zengshi.ecp.goods.dubbo.dto.GdsTypeRespDTO;
import com.zengshi.ecp.goods.dubbo.dto.GdsVerifyReqDTO;
import com.zengshi.ecp.goods.dubbo.dto.GdsVerifyRespDTO;
import com.zengshi.ecp.goods.dubbo.dto.gdsinfo.GdsInfoReqDTO;
import com.zengshi.ecp.goods.dubbo.dto.gdsinfo.GdsInfoRespDTO;
import com.zengshi.ecp.goods.dubbo.dto.gdsinfo.GdsSkuInfoReqDTO;
import com.zengshi.ecp.goods.dubbo.dto.gdsinfo.GdsSkuInfoRespDTO;
import com.zengshi.ecp.goods.dubbo.interfaces.IGdsInfoManageRSV;
import com.zengshi.ecp.goods.dubbo.interfaces.IGdsInfoQueryRSV;
import com.zengshi.ecp.goods.dubbo.interfaces.IGdsShiptemRSV;
import com.zengshi.ecp.goods.dubbo.interfaces.IGdsSkuInfoManageRSV;
import com.zengshi.ecp.goods.dubbo.interfaces.IGdsSkuInfoQueryRSV;
import com.zengshi.ecp.goods.dubbo.interfaces.IGdsTypeRSV;
import com.zengshi.ecp.goods.dubbo.util.GdsUtils;
import com.zengshi.ecp.server.front.dto.BaseInfo;
import com.zengshi.ecp.server.front.dto.PageResponseDTO;
import com.zengshi.ecp.server.front.exception.BusinessException;
import com.zengshi.ecp.server.front.util.SysCfgUtil;
import com.zengshi.ecp.staff.dubbo.dto.ShopInfoResDTO;
import com.zengshi.ecp.staff.dubbo.interfaces.IShopInfoRSV;
import com.zengshi.ecp.system.util.GdsParamsTool;
import com.zengshi.paas.utils.LogUtil;
import com.zengshi.paas.utils.ObjectCopyUtil;
import com.zengshi.paas.utils.StringUtil;

/**
 * 
 * Title: ECP <br>
 * Project Name:ecp-web-manage <br>
 * Description: 商品管理<br>
 * Date:2015年8月18日上午9:21:20 <br>
 * Copyright (c) 2015 ZengShi All Rights Reserved <br>
 * 
 * @author gxq
 * @version
 * @since JDK 1.6
 */
@Controller
@RequestMapping("/seller/goods/gdsmanage")
public class GdsManageController extends EcpBaseController {
    private static String MODULE = GdsManageController.class.getName();

    private static String OPERATE_FLAG_UP = "1";

    private static String OPERATE_FLAG_DOWN = "0";
    
    private static String OPERATE_FLAG_DELETE = "99";

    private static final String URL = "/seller/goods/gdsmgr";

    private static final String IF_GDS_SCORE = "0";// 不是积分商城的商品

    @Resource
    private IGdsInfoQueryRSV iGdsInfoQueryRSV;

    @Resource
    private IGdsSkuInfoQueryRSV iGdsSkuInfoQueryRSV;

    @Resource
    private IGdsInfoManageRSV iGdsInfoManageRSV;

    @Resource
    private IGdsSkuInfoManageRSV iGdsSkuInfoManageRSV;

    @Resource
    private IGdsTypeRSV iGdsTypeRSV;

    @Resource
    private IShopInfoRSV iShopInfoRSV;

    @Resource
    private IGdsShiptemRSV iGdsShiptemRSV;
    /**
     * 
     * init:(初始化跳转到商品管理列表页面). <br/>
     * 
     * @author gxq
     * @return
     * @since JDK 1.6
     */
    @RequestMapping()
    public String init(Model model, GdsShopVO gsShopVO) {
        List<GdsTypeRespDTO> gdsTypeList = iGdsTypeRSV.queryAllGdsTypesFromCache();
        try {
            model.addAttribute("GDS_VERIFY_SWITCH",SysCfgUtil.fetchSysCfg("GDS_VERIFY_SWITCH").getParaValue());
        } catch (Exception e) {
            model.addAttribute("GDS_VERIFY_SWITCH","0");
        }
        model.addAttribute("gdsTypeList", gdsTypeList);
        model.addAttribute("gsShopVO", gsShopVO);
        //model.addAttribute("shopId", gsShopVO.getShopId());
        model.addAttribute("ifGdsScore", IF_GDS_SCORE);
        return URL + "/seller-gdsmgr";
    }

    /**
     * 
     * gridList:(获取商品管理页的商品列表). <br/>
     * 
     * @author gxq
     * @param model
     * @param vo
     * @return
     * @throws Exception
     * @since JDK 1.6
     */
    @RequestMapping("/gridlist")
    public String gridList(Model model, GdsManageVO vo) throws Exception {
        // /后场服务所需要的DTO；
        GdsInfoReqDTO dto = vo.toBaseInfo(GdsInfoReqDTO.class);
        // 组织参数
        ObjectCopyUtil.copyObjValue(vo, dto, "", false);
        dto.setGdsStatus(vo.getStatus());
        if (StringUtil.isNotEmpty(vo.getGdsId())) {
            dto.setId(vo.getGdsId());
        }
        if (StringUtil.isEmpty(vo.getStatus())) {
            dto.setGdsStatus(GdsConstants.GdsInfo.GDS_STATUS_WAITSHELVES);
        }
        if (StringUtil.isNotEmpty(vo.getCatgCode())) {
            dto.setPlatCatgs(vo.getCatgCode());
        }
        if (StringUtil.isNotEmpty(vo.getStartTime())) {
            dto.setBegCreateTime(new Timestamp(vo.getStartTime().getTime()));
        }
        if (StringUtil.isNotEmpty(vo.getEndTime())) {
            dto.setEndCreateTime(new Timestamp(vo.getEndTime().getTime()));
        }
        if(StringUtil.isNotBlank(vo.getPriceSort())){
            
            dto.setPriceSort(vo.getPriceSort());
        }
        if (StringUtil.isNotEmpty(vo.getIsbn())) {
            dto.setIsbn(vo.getIsbn());
        }
        dto.setIfScoreGds(vo.getIfGdsScore());
        List<Long> propIds = new ArrayList<Long>();
        // 出版日期:1005作者:1001
        propIds.add(1005l);
        propIds.add(1001l);
        dto.setPropIds(propIds);
        dto.setGdsQueryOptions(new GdsQueryOption[] { GdsQueryOption.BASIC,
                GdsQueryOption.SHIPTEMPLATE, GdsQueryOption.PROP, GdsQueryOption.MAINPIC });
        PageResponseDTO<GdsInfoRespDTO> page = new PageResponseDTO<GdsInfoRespDTO>();
        EcpBasePageRespVO<Map> respVO = null;
        String url = URL+"/models/seller-gdslist";
        try {
        	
        	if (StringUtil.isEmpty(vo.getShopId())) {
                throw new BusinessException("web.gds.200008");
            }
        	
        	
            page = iGdsInfoQueryRSV.queryGdsInfoListPageWithAuth(dto);
            if (CollectionUtils.isNotEmpty(page.getResult())) {
                String verifySwitch = "";
                try {
                    verifySwitch = SysCfgUtil.fetchSysCfg("GDS_VERIFY_SWITCH").getParaValue();
                } catch (Exception e) {
                    LogUtil.error(MODULE, "获取商品审核开关参数失败！", e);
                }
                ShopInfoResDTO shopInfoResDTO = iShopInfoRSV.findShopInfoByShopID(vo.getShopId());
                for (GdsInfoRespDTO gdsInfoRespDTO : page.getResult()) {
                    if (gdsInfoRespDTO.getAllPropMaps() != null) {
                        if (gdsInfoRespDTO.getAllPropMaps().get("1005") != null) {
                            String gdsPublishTime = gdsInfoRespDTO.getAllPropMaps().get("1005")
                                    .getValues().get(0).getPropValue();
                            gdsInfoRespDTO.setGdsPublishTime(gdsPublishTime);

                        }
                        if (gdsInfoRespDTO.getAllPropMaps().get("1001") != null) {
                            String author = gdsInfoRespDTO.getAllPropMaps().get("1001").getValues()
                                    .get(0).getPropValue();
                            gdsInfoRespDTO.setGdsAuthor(author);
                        }
                    }
                    gdsInfoRespDTO.setShopStatus(shopInfoResDTO.getShopStatus());
                    gdsInfoRespDTO.setVerifySwitch(verifySwitch);
                }
            }
            respVO = EcpBasePageRespVO.buildByPageResponseDTO(page);
            GdsParamsTool.setMainPicURL(respVO);
            if (GdsUtils.isEqualsValid(vo.getIfGdsScore())) {
                super.addPageToModel(model, GdsParamsTool.batchGdsDetailUrl(respVO, "url", 2l));
            } else {
                super.addPageToModel(model, GdsParamsTool.batchGdsDetailUrl(respVO, "url"));
            }
            model.addAttribute("ifGdsScore", vo.getIfGdsScore());
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "查询列表业务异常", e);
            model.addAttribute("_error_msg_", e.getErrorMessage());
            model.addAttribute("_error_code_", e.getErrorCode());
            // super.addPageToModel(model, respVO);
            // return url;
        } catch (Exception e){
        	LogUtil.error(MODULE, "查询列表遇到异常", e);
            model.addAttribute("_error_msg", "查询遇到异常");
        }
       /* GdsParamsTool.setMainPicURL(respVO);
        if (GdsUtils.isEqualsValid(vo.getIfGdsScore())) {
            super.addPageToModel(model, GdsParamsTool.batchGdsDetailUrl(respVO, "url", 2l));
        } else {
            super.addPageToModel(model, GdsParamsTool.batchGdsDetailUrl(respVO, "url"));
        }
        model.addAttribute("ifGdsScore", vo.getIfGdsScore());*/
        return url;
    }

    /**
     * 
     * gdsBatchUp:(单个商品上下架). <br/>
     * 
     * @author gxq
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/gdsupdown")
    @ResponseBody
    public EcpBaseResponseVO gdsBatchUp(GdsManageVO gdsVo) {
        EcpBaseResponseVO vo = new EcpBaseResponseVO();
        GdsInfoReqDTO dto = new GdsInfoReqDTO();
        ObjectCopyUtil.copyObjValue(gdsVo, dto, "", false);
        if (OPERATE_FLAG_UP.equals(gdsVo.getOperateFlag())) {
            dto.setGdsStatus(GdsConstants.GdsInfo.GDS_STATUS_ONSHELVES);
        } else if (OPERATE_FLAG_DOWN.equals(gdsVo.getOperateFlag())) {
            dto.setGdsStatus(GdsConstants.GdsInfo.GDS_STATUS_OFFSHELVES);
        }
        if (!StringUtil.isBlank(gdsVo.getOperateId())) {
            dto.setId(Long.parseLong(gdsVo.getOperateId()));
        }
        try {
            iGdsInfoManageRSV.doGdsShelves(dto);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "报错了啦", e);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_EXCEPTION);
            vo.setResultMsg(e.getErrorMessage());
        }
        return vo;
    }

    
    @RequestMapping("/shopStatus")
    @ResponseBody
    public GdsManageVO shopStatus(Long shopId){
 	   //判断店铺状态
        ShopInfoResDTO shopInfoResDTOStatus = iShopInfoRSV.findShopInfoByShopID(shopId);
    	GdsManageVO manageVO = new GdsManageVO();
    	manageVO.setStatus(shopInfoResDTOStatus.getShopStatus());
    	return manageVO;
    }
    /**
     * 
     * gdsBatchupdown:(批量上下架). <br/>
     * 
     * @author gxq
     * @param gdsVo
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/gdsbatchupdown")
    @ResponseBody
    public EcpBaseResponseVO gdsBatchupdown(GdsManageVO gdsVo) {
        EcpBaseResponseVO vo = new EcpBaseResponseVO();
        GdsInfoReqDTO dto = new GdsInfoReqDTO();
        ObjectCopyUtil.copyObjValue(gdsVo, dto, "", false);
        String[] idList = gdsVo.getOperateId().split(",");
        Long[] ids = new Long[idList.length];
        if (ids.length > 0) {
            for (int i = 0; i < idList.length; i++) {
                if (StringUtil.isNotBlank(idList[i])) {
                    ids[i] = Long.parseLong(idList[i]);
                }
            }
        }
        dto.setIds(ids);
        if (OPERATE_FLAG_UP.equals(gdsVo.getOperateFlag())) {
            dto.setGdsStatus(GdsConstants.GdsInfo.GDS_STATUS_ONSHELVES);
        } else if (OPERATE_FLAG_DOWN.equals(gdsVo.getOperateFlag())) {
            dto.setGdsStatus(GdsConstants.GdsInfo.GDS_STATUS_OFFSHELVES);
        }
        try {
            iGdsInfoManageRSV.batchDoGdsShelves(dto);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "报错了啦", e);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            vo.setResultMsg(e.getErrorMessage());
        }
        return vo;
    }

    /**
     * 
     * gdsBatchRemove:(批量删除商品). <br/>
     * 
     * @author gxq
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/gdsbatchremove")
    @ResponseBody
    public EcpBaseResponseVO gdsBatchRemove(Model model, GdsManageVO gdsVo) {
        EcpBaseResponseVO vo = new EcpBaseResponseVO();
        GdsInfoReqDTO dto = new GdsInfoReqDTO();
        ObjectCopyUtil.copyObjValue(gdsVo, dto, "", false);
        // 获取企业编码
        ShopInfoResDTO shopInfo = iShopInfoRSV.findShopInfoByShopID(gdsVo.getShopId());
        Long companyId = null;
        if (StringUtil.isNotEmpty(shopInfo)) {
            companyId = shopInfo.getCompanyId();
        } else {
            throw new BusinessException("web.gds.2000012");
        }
        dto.setCompanyId(companyId);
        String[] idList = gdsVo.getOperateId().split(",");
        Long[] ids = new Long[idList.length];
        if (ids.length > 0) {
            for (int i = 0; i < idList.length; i++) {
                if (StringUtil.isNotBlank(idList[i])) {
                    ids[i] = Long.parseLong(idList[i]);
                }
            }
        }
        dto.setIds(ids);
        try {
            iGdsInfoManageRSV.batchDelGdsInfo(dto);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
        } catch (BusinessException err) {
            LogUtil.error(MODULE, "批量删除失败", err);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            vo.setResultMsg(err.getErrorMessage());
        }
        return vo;
    }

    /**
     * 
     * gdsBatchRemove:(单个删除商品). <br/>
     * 
     * @author gxq
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/gdsremove")
    @ResponseBody
    public EcpBaseResponseVO gdsRemove(Model model, GdsManageVO gdsVo) {
        EcpBaseResponseVO vo = new EcpBaseResponseVO();
        GdsInfoReqDTO dto = new GdsInfoReqDTO();
        ObjectCopyUtil.copyObjValue(gdsVo, dto, "", false);
        if (!StringUtil.isBlank(gdsVo.getOperateId())) {
            dto.setId(Long.parseLong(gdsVo.getOperateId()));
        }
        // 获取企业编码
        ShopInfoResDTO shopInfo = iShopInfoRSV.findShopInfoByShopID(gdsVo.getShopId());
        Long companyId = null;
        if (StringUtil.isNotEmpty(shopInfo)) {
            companyId = shopInfo.getCompanyId();
        } else {
            throw new BusinessException("web.gds.2000012");
        }
        dto.setCompanyId(companyId);
        try {
            iGdsInfoManageRSV.delGdsInfo(dto);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
        } catch (BusinessException err) {
            LogUtil.error(MODULE, "删除商品失败！", err);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            vo.setResultMsg(err.getErrorMessage());
        }
        return vo;
    }

    /**
     * 
     * copyGds:(商品设置运费模板). <br/>
     * 
     * @author gxq
     * @param model
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/setshiptemp")
    @ResponseBody
    public EcpBaseResponseVO copyGds(Model model, GdsManageVO gdsManageVO) {
        EcpBaseResponseVO vo = new EcpBaseResponseVO();
        GdsInfoReqDTO dto = new GdsInfoReqDTO();
        if (StringUtil.isNotEmpty(gdsManageVO.getGdsId())) {
            dto.setId(gdsManageVO.getGdsId());
        }
        if (StringUtil.isNotEmpty(gdsManageVO.getShipTemplateId())) {
            dto.setShipTemplateId(gdsManageVO.getShipTemplateId());
        }
        dto.setShopId(gdsManageVO.getShopId());
        try {
            iGdsInfoManageRSV.editGdsShipTemplate(dto);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "报错了啦", e);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_EXCEPTION);
        }
        return vo;
    }
    
    
    @RequestMapping(value="/shiptemplist")
    public String gridShiptempList (Model model,GdsShiptempVO vo){
        GdsShiptempReqDTO reqDTO = vo.toBaseInfo(GdsShiptempReqDTO.class);
        ObjectCopyUtil.copyObjValue(vo, reqDTO, "", false);
        if(StringUtil.isNotEmpty(vo.getShipTemplateId())){
            reqDTO.setId(vo.getShipTemplateId());
        }
        if(StringUtil.isNotEmpty(vo.getShopId())){
            reqDTO.setShopId(vo.getShopId());
        }
//        reqDTO.setIfFilterValue(GdsConstants.Commons.STATUS_VALID);
        //调用，并结果返回；从后场返回的分页对象，封装为前店所需要的分页对象；
        EcpBasePageRespVO<Map> respVO = null;
        try {
            PageResponseDTO<GdsShiptempRespDTO> list = iGdsShiptemRSV.queryGdsShipTemp(reqDTO);
            respVO = EcpBasePageRespVO.buildByPageResponseDTO(list);
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "获取运费模板列表失败！", e);
        } catch (Exception e) {
            LogUtil.error(MODULE, "获取运费模板列表失败！", e);
        }
        super.addPageToModel(model, respVO);
        return URL+"/models/shiptemp-list";
    }
    
    

    /**
     * 
     * gridskulist:(获取商品单品管理列表). <br/>
     * 
     * @author gxq
     * @param model
     * @param vo
     * @return
     * @throws Exception
     * @since JDK 1.6
     */
    @RequestMapping("/gridskulist")
    public String gridskulist(Model model, @RequestParam("gdsId")
    String gdsId, @RequestParam("status")
    String status) throws Exception {
        List<GdsSkuInfoRespDTO> list = new ArrayList<GdsSkuInfoRespDTO>();
        // /后场服务所需要的DTO；
        GdsInfoReqDTO dto = new GdsInfoReqDTO();
        if (!StringUtil.isBlank(gdsId)) {
            dto.setId(Long.parseLong(gdsId));
        }
        if (GdsConstants.GdsInfo.GDS_STATUS_DELETE.equals(status)) {
            dto.setGdsStatusArr(GdsUtils.getDeleteStatusList());
        } else {
            dto.setGdsStatusArr(GdsUtils.getNoDeleteStatusList());
        }

        // 模拟一个后场返回的列表信息；
        list = iGdsInfoQueryRSV.querySkuInfosByGdsId(dto);
        model.addAttribute("skuList", list);
        return URL + "/list/sku-list";
    }

    /**
     * 
     * skuupdown:(单品上下架). <br/>
     * 
     * @author gxq
     * @param model
     * @param skuId
     * @param gdsId
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/skuupdown")
    @ResponseBody
    public EcpBaseResponseVO skuupdown(@Valid
    GdsSkuVO gdsSkuVO) {
        EcpBaseResponseVO vo = new EcpBaseResponseVO();
        GdsSkuInfoReqDTO dto = new GdsSkuInfoReqDTO();
        if (!StringUtil.isEmpty(gdsSkuVO.getSkuId())) {
            dto.setId(gdsSkuVO.getSkuId());
        }
        if (!StringUtil.isEmpty(gdsSkuVO.getGdsId())) {
            dto.setGdsId(gdsSkuVO.getGdsId());
        }
        if (!StringUtil.isEmpty(gdsSkuVO.getShopId())) {
            dto.setShopId(gdsSkuVO.getShopId());
        }
        if (OPERATE_FLAG_UP.equals(gdsSkuVO.getOperateFlag())) {
            dto.setGdsStatus(GdsConstants.GdsInfo.GDS_STATUS_ONSHELVES);
            //判断审核开关是否开启
           String GDS_VERIFY_SWITCH = SysCfgUtil.fetchSysCfg("GDS_VERIFY_SWITCH").getParaValue();
           if(GdsConstants.Commons.STATUS_VALID.equals(GDS_VERIFY_SWITCH)){
               
           }
        } else if (OPERATE_FLAG_DOWN.equals(gdsSkuVO.getOperateFlag())) {
            dto.setGdsStatus(GdsConstants.GdsInfo.GDS_STATUS_OFFSHELVES);
        }
        try {
            iGdsSkuInfoManageRSV.doSkuShelves(dto);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "单品上架失败", e);
            vo.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            vo.setResultMsg(e.getErrorMessage());
        }
        return vo;
    }

    /**
     * 
     * skuOpen:(上下架单条记录时候，弹出的单品列表框). <br/>
     * 
     * @author gxq
     * @return
     * @since JDK 1.6
     */
    @RequestMapping("/sku-open")
    public String skuOpen() {
        return URL + "/list/sku-grid";
    }

    /**
     * 
     * freeOpen:(设置运费模板的时候弹出的运费模板列表框). <br/>
     * 
     * @author gxq
     * @param model
     * @param id
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/free-open")
    public String freeOpen(Model model) {
        return URL + "/models/shiptemp-grid";
    }

    
    /**
     * 
     * commitforverify:(提交商品上架、删除审核). <br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author gxq 
     * @param model
     * @return 
     * @since JDK 1.6
     */
    @RequestMapping(value="/commitforverify")
    @ResponseBody
    public EcpBaseResponseVO commitforverify(Model model,GdsVerifyVO gdsVerifyVO){
        EcpBaseResponseVO ecpBaseResponseVO = new EcpBaseResponseVO();
        /**
         * 在审核开关开启的情况下，任何的审核操作或者编辑操作，就将受到 尚未审核完成的限制。
         */
        try {
            if(whetherHaveWaiteVerify(gdsVerifyVO)){
                //该商品尚处于审核状态，无法进行其他操作
                ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
                ecpBaseResponseVO.setResultMsg("该商品尚处于提交待审核状态，暂时无法进行其他操作！");
            }else{
                GdsVerifyReqDTO gdsVerifyReqDTO = new GdsVerifyReqDTO();
                ObjectCopyUtil.copyObjValue(gdsVerifyVO, gdsVerifyReqDTO, null, false);
                Long[] ids = new Long[]{gdsVerifyVO.getGdsId()};
                gdsVerifyReqDTO.setIds(ids);
                //操作类型
                StringBuffer str = new StringBuffer();
                if(GdsConstants.GdsInfo.GDS_STATUS_ONSHELVES.equals(gdsVerifyVO.getOperateType())){
                    //上架提交
                    str.append("提交上架审核成功！");
                }else if(GdsConstants.GdsInfo.GDS_STATUS_DELETE.equals(gdsVerifyVO.getOperateType())){
                    //删除提交
                    str.append("提交删除审核成功！");
                }
                iGdsInfoManageRSV.doGdsVerify(gdsVerifyReqDTO);
                ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
                ecpBaseResponseVO.setResultMsg(str.toString());
            }
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "提交审核失败！", e);
            ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            ecpBaseResponseVO.setResultMsg("提交审核失败,原因："+e.getErrorMessage());
        } catch (Exception e) {
            LogUtil.error(MODULE, "提交审核失败！", e);
            ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            ecpBaseResponseVO.setResultMsg("提交审核失败,原因：系统异常，请联系管理员！");
        }
        return ecpBaseResponseVO;
    }
    
    /**
     * 
     * batchCommitForVerify:(批量提交上架、删除审核). <br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author gxq 
     * @param gdsVerifyVO
     * @return 
     * @since JDK 1.6
     */
    @RequestMapping(value="/batchcommitforverify")
    @ResponseBody
    public EcpBaseResponseVO batchCommitForVerify(GdsVerifyVO gdsVerifyVO){
        EcpBaseResponseVO ecpBaseResponseVO = new EcpBaseResponseVO();
        GdsVerifyReqDTO gdsVerifyReqDTO = new GdsVerifyReqDTO();
        ObjectCopyUtil.copyObjValue(gdsVerifyVO, gdsVerifyReqDTO, "", false);
        String[] idList = gdsVerifyVO.getOperateId().split(",");
        Long[] ids = new Long[idList.length];
        if (ids.length > 0) {
            for (int i = 0; i < idList.length; i++) {
                if (StringUtil.isNotBlank(idList[i])) {
                    ids[i] = Long.parseLong(idList[i]);
                }
            }
        }
        /**
         * 在审核开关开启的情况下，任何的审核操作或者编辑操作，就将受到 尚未审核完成的限制。
         */
        try {
            if(whetherHaveWaiteVerify(gdsVerifyVO)){
                //该商品尚处于审核状态，无法进行其他操作
                ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
                ecpBaseResponseVO.setResultMsg("该商品尚处于提交待审核状态，暂时无法进行其他操作！");
            }else{
                gdsVerifyReqDTO.setIds(ids);
                //操作类型
                StringBuffer str = new StringBuffer();
                if(GdsConstants.GdsInfo.GDS_STATUS_ONSHELVES.equals(gdsVerifyVO.getOperateType())){
                    //上架提交
                    str.append("批量提交上架审核成功！");
                }else if(GdsConstants.GdsInfo.GDS_STATUS_DELETE.equals(gdsVerifyVO.getOperateType())){
                    //删除提交
                    str.append("批量提交删除审核成功！");
                }
                iGdsInfoManageRSV.doGdsVerify(gdsVerifyReqDTO);
                ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
                ecpBaseResponseVO.setResultMsg(str.toString());
            }
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "批量提交审核失败！", e);
            ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            ecpBaseResponseVO.setResultMsg("批量提交审核失败！");
        } catch (Exception e) {
            LogUtil.error(MODULE, "批量提交审核失败！", e);
            ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            ecpBaseResponseVO.setResultMsg("批量提交审核失败！");
        }
        return ecpBaseResponseVO;
    }
    
    /**
     * 
     * whetherHaveWaiteVerify:(判断是否存在提交待审核状态的商品操作审核记录). <br/> 
     * 
     * @author gxq 
     * @return 
     * @since JDK 1.6
     */
    public boolean whetherHaveWaiteVerify(GdsVerifyVO gdsVerifyVO){
    	if(gdsVerifyVO.getOperateId() !=null){
    	String ids[] = gdsVerifyVO.getOperateId().split(",");
    	if(ids.length > 0){
    		for(String id:ids){
    	     GdsVerifyReqDTO dto = new GdsVerifyReqDTO();
    	        dto.setGdsId(Long.parseLong(id));
    	        dto.setShopId(gdsVerifyVO.getShopId());
    	        dto.setVerifyStatus(GdsConstants.GdsVerify.WAITE_VERIFY);//提交待审核
    	        PageResponseDTO<GdsVerifyRespDTO> pageInfo = iGdsInfoQueryRSV.queryGdsVerifyInfoPage(dto);
    	        if(pageInfo != null && pageInfo.getResult() != null && pageInfo.getResult().size()>0){
    	            return true;
    	        }
    	       
    		}
    		 return false;
    	}else{
    		//参数不为空却没传有效id，默认不可以处理
    		return true;
    	}
    	}else{
    	
        GdsVerifyReqDTO dto = new GdsVerifyReqDTO();
        dto.setGdsId(gdsVerifyVO.getGdsId());
        dto.setShopId(gdsVerifyVO.getShopId());
        dto.setSkuId(gdsVerifyVO.getSkuId());
        dto.setVerifyStatus(GdsConstants.GdsVerify.WAITE_VERIFY);//提交待审核
        PageResponseDTO<GdsVerifyRespDTO> pageInfo = iGdsInfoQueryRSV.queryGdsVerifyInfoPage(dto);
        if(pageInfo != null && pageInfo.getResult() != null && pageInfo.getResult().size()>0){
            return true;
        }
        return false;
    	}
    }
    
    /**
     * 
     * gdsVerifyRecord:(跳转到商品审核记录弹出框). <br/> 
     * @author gxq 
     * @return 
     * @since JDK 1.6
     */
    @RequestMapping(value="/gdsverifyrecord")
    public String gdsVerifyRecord(){
        return URL + "/models/gds-verify-record-grid";
    }
    
    
    @RequestMapping(value="/verifylist")
    public String gridList(Model model,GdsVerifyVO gdsVerifyVO){
        GdsVerifyReqDTO dto = gdsVerifyVO.toBaseInfo(GdsVerifyReqDTO.class);
       
        EcpBasePageRespVO<Map> respVO = null;
        try {
            ObjectCopyUtil.copyObjValue(gdsVerifyVO, dto, null, false);
            if(StringUtil.isNotEmpty(gdsVerifyVO.getStartTime())){
                dto.setBegCreateTime(new Timestamp(gdsVerifyVO.getStartTime().getTime()));
            }
            if(StringUtil.isNotEmpty(gdsVerifyVO.getEndTime())){
                dto.setEndCreateTime(new Timestamp(gdsVerifyVO.getEndTime().getTime()));
            }

//        		dto.setStatus(GdsConstants.Commons.STATUS_VALID);
            
            
            PageResponseDTO<GdsVerifyRespDTO> pageInfo = iGdsInfoQueryRSV.queryGdsVerifyInfoPage(dto);
            respVO = EcpBasePageRespVO.buildByPageResponseDTO(pageInfo);
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "获取商品审核列表失败！",e);
        } catch (Exception e) {
            LogUtil.error(MODULE, "获取商品审核列表失败！",e);
        }
        super.addPageToModel(model, respVO);
        return URL+"/models/gds-verify-record-list";
    }
    
    /**
     * 
     * whetherCanOperate:(判断该商品是否存在提交待审核的记录). <br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author gxq 
     * @param gdsVerifyVO
     * @return 
     * @since JDK 1.6
     */
    @RequestMapping(value="/whethercanoperate")
    @ResponseBody
    public EcpBaseResponseVO whetherCanOperate(GdsVerifyVO gdsVerifyVO){
        EcpBaseResponseVO ecpBaseResponseVO = new EcpBaseResponseVO();
        try {
            if(whetherHaveWaiteVerify(gdsVerifyVO)){
                //存在
                ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
                ecpBaseResponseVO.setResultMsg("该商品尚处于提交待审核状态，暂时无法进行其他操作！");
            }else{
                //不存在
                ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_SUCCESS);
            }
        } catch (BusinessException e) {
            LogUtil.error(MODULE, "", e);
            ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            ecpBaseResponseVO.setResultMsg("该商品尚处于提交待审核状态，暂时无法进行其他操作！");
        } catch (Exception e) {
            LogUtil.error(MODULE, "", e);
            ecpBaseResponseVO.setResultFlag(EcpBaseResponseVO.RESULT_FLAG_FAILURE);
            ecpBaseResponseVO.setResultMsg("该商品尚处于提交待审核状态，暂时无法进行其他操作！");
        }
        return ecpBaseResponseVO;
    }
    
    
}
