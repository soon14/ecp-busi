package com.zengshi.ecp.busi.goods.gdsdetail.vo;

import java.io.Serializable;
import java.util.List;

import com.zengshi.ecp.prom.dubbo.dto.PromInfoDTO;
import com.zengshi.ecp.server.front.dto.BaseInfo;

public class GdsPromMatchVO extends BaseInfo implements Serializable{
    /** 
     * serialVersionUID:TODO(重新封装促销那边获取的数据). 
     * @since JDK 1.6 
     */ 
    private static final long serialVersionUID = -5760486412637892804L;
    
    private PromInfoDTO promInfoDTO;
    
    private List<GdsPromMatchSkuVO> gdsPromMatchSkuVOList;

    //促销名称截取，6个文字
    private String promThemeCut;

    private String ifPromShipFree;

    public PromInfoDTO getPromInfoDTO() {
        return promInfoDTO;
    }

    public void setPromInfoDTO(PromInfoDTO promInfoDTO) {
        this.promInfoDTO = promInfoDTO;
    }

    public List<GdsPromMatchSkuVO> getGdsPromMatchSkuVOList() {
        return gdsPromMatchSkuVOList;
    }

    public void setGdsPromMatchSkuVOList(List<GdsPromMatchSkuVO> gdsPromMatchSkuVOList) {
        this.gdsPromMatchSkuVOList = gdsPromMatchSkuVOList;
    }

    public String getPromThemeCut() {
        return promThemeCut;
    }

    public void setPromThemeCut(String promThemeCut) {
        this.promThemeCut = promThemeCut;
    }

    public String getIfPromShipFree() {
        return ifPromShipFree;
    }

    public void setIfPromShipFree(String ifPromShipFree) {
        this.ifPromShipFree = ifPromShipFree;
    }
}

