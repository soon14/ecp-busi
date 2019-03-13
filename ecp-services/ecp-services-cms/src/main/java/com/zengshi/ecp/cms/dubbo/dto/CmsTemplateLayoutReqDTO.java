package com.zengshi.ecp.cms.dubbo.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.zengshi.ecp.server.front.dto.BaseInfo;

public class CmsTemplateLayoutReqDTO extends BaseInfo {
    /*--------------------------以下为model后添加的字段 start--------------------------*/
    /**
     * 状态SET，用于查询
     */
    private Set<String> statusSet = new HashSet<String>();
    /**
     * 模板布局项SET，用于查询
     */
    private List<CmsTemplateLayoutItemReqDTO> templateLayoutItemReqDTOList ;
    /*--------------------------以下为model后添加的字段 end------------------------*/

    private Long id;

    private Long layoutTypeId;

    private Long templateId;

    private String status;

    private Integer showOrder;

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

    public Long getLayoutTypeId() {
        return layoutTypeId;
    }

    public void setLayoutTypeId(Long layoutTypeId) {
        this.layoutTypeId = layoutTypeId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
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
        sb.append(", layoutTypeId=").append(layoutTypeId);
        sb.append(", templateId=").append(templateId);
        sb.append(", status=").append(status);
        sb.append(", showOrder=").append(showOrder);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
    
    public Set<String> getStatusSet() {
        return statusSet;
    }

    public void setStatusSet(Set<String> statusSet) {
        this.statusSet = statusSet;
    }

    public List<CmsTemplateLayoutItemReqDTO> getTemplateLayoutItemReqDTOList() {
        return templateLayoutItemReqDTOList;
    }

    public void setTemplateLayoutItemReqDTOList(
            List<CmsTemplateLayoutItemReqDTO> templateLayoutItemReqDTOList) {
        this.templateLayoutItemReqDTOList = templateLayoutItemReqDTOList;
    }
    
}