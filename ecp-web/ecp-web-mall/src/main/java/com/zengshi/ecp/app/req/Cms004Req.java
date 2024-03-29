package com.zengshi.ecp.app.req;

import com.zengshi.butterfly.app.model.IBody;

/**
 * Title: ECP <br>
 * Project Name:ecp-web-mall <br>
 * Description: 获取APP排行榜服务-入参<br>
 * Date:2016-2-22下午6:52:57  <br>
 * Copyright (c) 2016 ZengShi All Rights Reserved <br>
 * 
 * @author jiangzh
 * @version  
 * @since JDK 1.6 
 */
public class Cms004Req extends IBody {
    
    /** 
     * 内容位置ID. 
     */ 
    private Long placeId;
    
    private Integer tabSize;
    
    public Long getPlaceId() {
        return placeId;
    }
    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }
    public Integer getTabSize() {
        return tabSize;
    }
    public void setTabSize(Integer tabSize) {
        this.tabSize = tabSize;
    }
    
    
}

