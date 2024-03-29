package com.zengshi.ecp.goods.dubbo.dto;

import java.sql.Timestamp;

import com.zengshi.ecp.server.front.dto.BaseInfo;

@SuppressWarnings("rawtypes")
public class GdsInterfaceGdsReqDTO extends BaseInfo{
    
    /** 
     * serialVersionUID:
     */ 
    private static final long serialVersionUID = -1L;

    private Long id;

    private Long gdsId;

    private Long skuId;

    private Long shopId;

    private String originGdsId;

    private String originSkuId;

    private String origin;
    
//    private String updateRule;

    private String status;

    private Timestamp createTime;

    private Long createStaff;

    private Timestamp updateTime;

    private Long updateStaff;

    //用于检索的开始结束时间
    private String startTime;
    
    private String endTime;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGdsId() {
        return gdsId;
    }

    public void setGdsId(Long gdsId) {
        this.gdsId = gdsId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getOriginGdsId() {
        return originGdsId;
    }

    public void setOriginGdsId(String originGdsId) {
        this.originGdsId = originGdsId == null ? null : originGdsId.trim();
    }

    public String getOriginSkuId() {
        return originSkuId;
    }

    public void setOriginSkuId(String originSkuId) {
        this.originSkuId = originSkuId == null ? null : originSkuId.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Long createStaff) {
        this.createStaff = createStaff;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(Long updateStaff) {
        this.updateStaff = updateStaff;
    }

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gdsId=").append(gdsId);
        sb.append(", skuId=").append(skuId);
        sb.append(", shopId=").append(shopId);
        sb.append(", originGdsId=").append(originGdsId);
        sb.append(", originSkuId=").append(originSkuId);
        sb.append(", origin=").append(origin);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append("]");
        return sb.toString();
    }

}

