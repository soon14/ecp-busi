package com.zengshi.ecp.prom.test.service.busi.service.valid;

import javax.annotation.Resource;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import com.zengshi.ecp.prom.dubbo.dto.PromDTO;
import com.zengshi.ecp.prom.service.busi.valid.interfaces.IPromValidSV;
import com.zengshi.ecp.server.front.exception.BusinessException;
import com.zengshi.ecp.server.test.EcpServicesTest;

/**
 * Title: AI-ECP <br>
 * Description: <br>
 * Date: 2015-8-5 <br>
 * Copyright (c) 2015 AI <br>
 * 
 * @author huangjx
 */
public class PromInfoValidSVImplTest extends EcpServicesTest {

    @Resource
    private IPromValidSV promInfoValidSV;

    @Test
    @Rollback(false)
    public void testValid() throws BusinessException {

        PromDTO promDTO = new PromDTO();
        /*
         * promDTO.setStatus("10"); promDTO.setStartTime(new Date());
         * 
         * promDTO.setShowStartTime(new Date()); promDTO.setShowEndTime(new Date());
         * promDTO.setShopId(new Long(11)); promDTO.setPromTypeShow("满减");
         * promDTO.setPromTypeCode("100"); promDTO.setPromTheme("主题"); promDTO.setPromContent("内容");
         * promDTO.setPromClass("20");// 10 order 20 product promDTO.setPriority(new Long(500));
         * promDTO.setIfBlacklist("1"); ArrayList<String> l = new ArrayList<String>(); l.add("1");
         * l.add("2"); promDTO.setBlackSkuList(l); promDTO.setJoinRange("1");// 1 全场 0 部分
         * promDTO.setIfShow("1"); promDTO.setId(new Long(11)); promDTO.setEndTime(new Date());
         * promDTO.setCreateTime(new Date()); promDTO.setCreateStaff(new Long(1100000));
         */

        // 获得json条件
        String json = "{\"buyX\":\"100\",\"sendY\":\"2\"}";
        // json = "{\"orderMoney\":\"100\",\"sendAmount\":\"2\",\"coupId\":\"2111\"}";
        promDTO.setDiscountRule(json);
        try {
            promInfoValidSV.valid(promDTO);
        } catch (BusinessException e) {
            e.printStackTrace();
        }

    }

}
