package com.zengshi.ecp.busi.cms.channel.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class CmsChannelVO  implements Serializable{
	  /**
     * 图片URL
     */
    private String vfsUrl;

    private boolean newCreate;
    
    private Long id;

    private String channelName;

    private String channelType;

    private Long channelParent;

    private String channelLabel;

    private String channelUrl;

    private Long channelTemplate;

    private Long siteId;

    private Integer sortNo;

    private String status;

    private Timestamp createTime;

    private String createStaff;

    private Timestamp updateTime;

    private String updateStaff;

    private String isresiteinfo;

    private Long siteinfoId;

    private String isOutLink;

    private String siteInfoType;
    
    private String platformType;

    private String channelIcon;
    
    private String remark;
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public Long getChannelParent() {
        return channelParent;
    }

    public void setChannelParent(Long channelParent) {
        this.channelParent = channelParent;
    }

    public String getChannelLabel() {
        return channelLabel;
    }

    public void setChannelLabel(String channelLabel) {
        this.channelLabel = channelLabel == null ? null : channelLabel.trim();
    }

    public String getChannelUrl() {
        return channelUrl;
    }

    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl == null ? null : channelUrl.trim();
    }

    public Long getChannelTemplate() {
        return channelTemplate;
    }

    public void setChannelTemplate(Long channelTemplate) {
        this.channelTemplate = channelTemplate;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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

    public String getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(String createStaff) {
        this.createStaff = createStaff == null ? null : createStaff.trim();
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(String updateStaff) {
        this.updateStaff = updateStaff == null ? null : updateStaff.trim();
    }

    public String getIsresiteinfo() {
        return isresiteinfo;
    }

    public void setIsresiteinfo(String isresiteinfo) {
        this.isresiteinfo = isresiteinfo == null ? null : isresiteinfo.trim();
    }

    public Long getSiteinfoId() {
        return siteinfoId;
    }

    public void setSiteinfoId(Long siteinfoId) {
        this.siteinfoId = siteinfoId;
    }

    public String getIsOutLink() {
        return isOutLink;
    }

    public void setIsOutLink(String isOutLink) {
        this.isOutLink = isOutLink == null ? null : isOutLink.trim();
    }

    public String getSiteInfoType() {
        return siteInfoType;
    }

    public void setSiteInfoType(String siteInfoType) {
        this.siteInfoType = siteInfoType;
    }

    public String getPlatformType() {
		return platformType;
	}

	public String getChannelIcon() {
		return channelIcon;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public void setChannelIcon(String channelIcon) {
		this.channelIcon = channelIcon;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", channelName=").append(channelName);
        sb.append(", channelType=").append(channelType);
        sb.append(", channelParent=").append(channelParent);
        sb.append(", channelLabel=").append(channelLabel);
        sb.append(", channelUrl=").append(channelUrl);
        sb.append(", channelTemplate=").append(channelTemplate);
        sb.append(", siteId=").append(siteId);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", isresiteinfo=").append(isresiteinfo);
        sb.append(", siteinfoId=").append(siteinfoId);
        sb.append(", isOutLink=").append(isOutLink);
        sb.append("]");
        return sb.toString();
    }
    
    public boolean isNewCreate() {
        return newCreate;
    }

    public void setNewCreate(boolean newCreate) {
        this.newCreate = newCreate;
    }

	public String getVfsUrl() {
		return vfsUrl;
	}

	public void setVfsUrl(String vfsUrl) {
		this.vfsUrl = vfsUrl;
	}
    
    
}

