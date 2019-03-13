package com.zengshi.ecp.order.dubbo.dto;


import java.util.List;

import com.zengshi.ecp.server.front.dto.BaseInfo;

public class RCrePreOrdsRequest extends BaseInfo {
    /** 
     * serialVersionUID:. 
     * @since JDK 1.6 
     */ 
    private static final long serialVersionUID = 7901536631132019766L;

    //买家id
    private Long staffId;
    
    //来源
    private String source;
    
    
    private List<RCrePreOrdRequest> carList;


    public Long getStaffId() {
        return staffId;
    }


    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public List<RCrePreOrdRequest> getCarList() {
        return carList;
    }


    public void setCarList(List<RCrePreOrdRequest> carList) {
        this.carList = carList;
    }


    public String getSource() {
        return source;
    }


    public void setSource(String source) {
        this.source = source;
    }

}
