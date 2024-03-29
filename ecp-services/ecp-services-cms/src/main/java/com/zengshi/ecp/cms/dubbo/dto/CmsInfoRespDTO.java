/** 
 * Project Name:ecp-services-cms 
 * File Name:CmsInfoOutDTO.java 
 * Package Name:com.zengshi.ecp.cms.dubbo.dto 
 * Date:2015-8-7下午6:28:01 
 * Copyright (c) 2015, ZengShi All Rights Reserved. 
 * 
 */ 
package com.zengshi.ecp.cms.dubbo.dto;

import java.sql.Timestamp;

import com.zengshi.ecp.server.front.dto.BaseResponseDTO;

/**
 * Title: ECP <br>
 * Project Name:ecp-services-cms <br>
 * Description: <br>
 * Date:2015-8-7下午6:28:01  <br>
 * Copyright (c) 2015 ZengShi All Rights Reserved <br>
 * 
 * @author wenyf
 * @version  
 * @since JDK 1.7
 */
public class CmsInfoRespDTO extends BaseResponseDTO {
    /*----以下是model新添加字段 start---*/
    /**
     * 发布时间开始
     */
    private Timestamp startPubTime;
    /**
     * 结束时间结束
     */
    private Timestamp endPubTime;
    /**
     * 失效时间开始
     */
    private Timestamp startLostTime;
    /**
     * 失效时间结束
     */
    private Timestamp endLostTime;
    /**
     * 信息类型翻译
     */
    private String typeName;
    /**
     * 静态文件URl
     */
    private String staticUrl;
    /**
     * 附件URl
     */
    private String vfsUrl;
    /**
     * 状态翻译
     */
    private String statusName;
    /**
     * 站点名称
     */
    private String siteName;
    /**
     * 模板名称
     */
    private String templateName;
    /**
     * 内容位置名称
     */
    private String placeName;
    
    /*----以下是model新添加字段  end ---*/
    
    private Long id;

    private Long siteId;

    private Long templateId;

    private Long placeId;

    private String infoTitle;

    private String remark;

    private String status;

    private Integer sortNo;

    private String source;

    private String infoType;

    private Timestamp pubTime;

    private Timestamp lostTime;

    private String staticId;

    private String vfsName;

    private String vfsId;

    private Long createStaff;

    private Timestamp createTime;

    private Long updateStaff;

    private Timestamp updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle == null ? null : infoTitle.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }

    public Timestamp getPubTime() {
        return pubTime;
    }

    public void setPubTime(Timestamp pubTime) {
        this.pubTime = pubTime;
    }

    public Timestamp getLostTime() {
        return lostTime;
    }

    public void setLostTime(Timestamp lostTime) {
        this.lostTime = lostTime;
    }

    public String getStaticId() {
        return staticId;
    }

    public void setStaticId(String staticId) {
        this.staticId = staticId == null ? null : staticId.trim();
    }

    public String getVfsName() {
        return vfsName;
    }

    public void setVfsName(String vfsName) {
        this.vfsName = vfsName == null ? null : vfsName.trim();
    }

    public String getVfsId() {
        return vfsId;
    }

    public void setVfsId(String vfsId) {
        this.vfsId = vfsId == null ? null : vfsId.trim();
    }

    public Long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Long createStaff) {
        this.createStaff = createStaff;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", siteId=").append(siteId);
        sb.append(", templateId=").append(templateId);
        sb.append(", placeId=").append(placeId);
        sb.append(", infoTitle=").append(infoTitle);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", source=").append(source);
        sb.append(", infoType=").append(infoType);
        sb.append(", pubTime=").append(pubTime);
        sb.append(", lostTime=").append(lostTime);
        sb.append(", staticId=").append(staticId);
        sb.append(", vfsName=").append(vfsName);
        sb.append(", vfsId=").append(vfsId);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
    
    public Timestamp getStartPubTime() {
        return startPubTime;
    }

    public void setStartPubTime(Timestamp startPubTime) {
        this.startPubTime = startPubTime;
    }

    public Timestamp getEndPubTime() {
        return endPubTime;
    }

    public void setEndPubTime(Timestamp endPubTime) {
        this.endPubTime = endPubTime;
    }

    public Timestamp getStartLostTime() {
        return startLostTime;
    }

    public void setStartLostTime(Timestamp startLostTime) {
        this.startLostTime = startLostTime;
    }

    public Timestamp getEndLostTime() {
        return endLostTime;
    }

    public void setEndLostTime(Timestamp endLostTime) {
        this.endLostTime = endLostTime;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
    
    public String getStaticUrl() {
        return staticUrl;
    }

    public void setStaticUrl(String staticUrl) {
        this.staticUrl = staticUrl == null ? null : staticUrl.trim();
    }
    
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }
    
    public String getVfsUrl() {
        return vfsUrl;
    }

    public void setVfsUrl(String vfsUrl) {
        this.vfsUrl = vfsUrl == null ? null : vfsUrl.trim();
    }

}

