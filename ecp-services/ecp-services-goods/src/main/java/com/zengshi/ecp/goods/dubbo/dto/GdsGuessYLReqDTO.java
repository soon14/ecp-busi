package com.zengshi.ecp.goods.dubbo.dto;

import java.sql.Timestamp;
import java.util.List;

import com.zengshi.ecp.server.front.dto.BaseInfo;

/**
 * 
 * Title: ECP <br>
 * Project Name:ecp-services-goods <br>
 * Description: 猜你喜欢入参对象<br>
 * Date:2015年9月6日上午10:53:52  <br>
 * Copyright (c) 2015 ZengShi All Rights Reserved <br>
 * 
 * @author linwb3
 * @version  
 * @since JDK 1.6
 */
@SuppressWarnings("rawtypes")
public class GdsGuessYLReqDTO extends BaseInfo {
    /** 
     * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
     * @since JDK 1.6 
     */ 
    private static final long serialVersionUID = -1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 批量删除主键
     */
    private List<Long> ids;
    
    /**
     * 对应分类编码
     */
    private String catgCode;

    /**
     * 商品编码
     */
    private Long gdsId;

    /**
     * 单品编码
     */
    private Long skuId;
    
    
    /**
     * 商品名称
     */
    private String gdsName;

    /**
     * 排序
     */
    private Integer sortNo;

    /**
     * 是否默认
     */
    private String ifDefault;

    /**
     * 状态 1有效 0删除
     */
    private String status;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 创建人
     */
    private Long createStaff;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

    /**
     * 更新人
     */
    private Long updateStaff;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatgCode() {
        return catgCode;
    }

    public void setCatgCode(String catgCode) {
        this.catgCode = catgCode == null ? null : catgCode.trim();
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


	public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getIfDefault() {
        return ifDefault;
    }

    public void setIfDefault(String ifDefault) {
        this.ifDefault = ifDefault == null ? null : ifDefault.trim();
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

    public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getGdsName() {
		return gdsName;
	}

	public void setGdsName(String gdsName) {
		this.gdsName = gdsName;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", catgCode=").append(catgCode);
        sb.append(", gdsId=").append(gdsId);
        sb.append(", skuId=").append(skuId);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", ifDefault=").append(ifDefault);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append("]");
        return sb.toString();
    }
}
