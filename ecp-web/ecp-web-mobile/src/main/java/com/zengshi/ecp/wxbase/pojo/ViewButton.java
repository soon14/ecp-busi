package com.zengshi.ecp.wxbase.pojo;

/**
 * view类型的菜单 
 * @author wangbh
 *
 */
public class ViewButton extends Button {

	private String type;  
    private String url;  
  
    public String getType() {  
        return type;  
    }  
  
    public void setType(String type) {  
        this.type = type;  
    }  
  
    public String getUrl() {  
        return url;  
    }  
  
    public void setUrl(String url) {  
        this.url = url;  
    }  
}
