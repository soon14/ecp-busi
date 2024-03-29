package com.zengshi.ecp.cms.dubbo.dto;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.zengshi.ecp.server.front.dto.BaseResponseDTO;

public class CmsLayoutTypeRespDTO extends BaseResponseDTO {
    
    /*----以下是model新添加字段 start---*/
    /**
     * 状态翻译
     */
    private String statusZH;
    /**
     * 布局展示方式翻译
     */
    private String layoutShowTypeZH;
    /**
     * 布局项尺寸LIST
     */
    private List<Integer> layoutItemList;
    /**
     * 布局项尺寸Map
     */
    private Map<String,String> layoutItemSizeMap;
    /*----以下是model新添加字段  end ---*/

    private Long id;

    private Long pageTypeId;

    private String layoutTypeName;

    private String layoutItemSize;

    private String layoutShowType;

    private String status;

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

    public Long getPageTypeId() {
        return pageTypeId;
    }

    public void setPageTypeId(Long pageTypeId) {
        this.pageTypeId = pageTypeId;
    }

    public String getLayoutTypeName() {
        return layoutTypeName;
    }

    public void setLayoutTypeName(String layoutTypeName) {
        this.layoutTypeName = layoutTypeName == null ? null : layoutTypeName.trim();
    }

    public String getLayoutItemSize() {
        return layoutItemSize;
    }

    public void setLayoutItemSize(String layoutItemSize) {
        this.layoutItemSize = layoutItemSize == null ? null : layoutItemSize.trim();
    }

    public String getLayoutShowType() {
        return layoutShowType;
    }

    public void setLayoutShowType(String layoutShowType) {
        this.layoutShowType = layoutShowType == null ? null : layoutShowType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", pageTypeId=").append(pageTypeId);
        sb.append(", layoutTypeName=").append(layoutTypeName);
        sb.append(", layoutItemSize=").append(layoutItemSize);
        sb.append(", layoutShowType=").append(layoutShowType);
        sb.append(", status=").append(status);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
    
    public String getStatusZH() {
        return statusZH;
    }

    public void setStatusZH(String statusZH) {
        this.statusZH = statusZH;
    }

    public List<Integer> getLayoutItemList() {
        return layoutItemList;
    }

    public void setLayoutItemList(List<Integer> layoutItemList) {
        this.layoutItemList = layoutItemList;
    }
    
    public String getLayoutShowTypeZH() {
        return layoutShowTypeZH;
    }

    public void setLayoutShowTypeZH(String layoutShowTypeZH) {
        this.layoutShowTypeZH = layoutShowTypeZH;
    }
    
    public Map<String, String> getLayoutItemSizeMap() {
        return layoutItemSizeMap;
    }

    public void setLayoutItemSizeMap(Map<String, String> layoutItemSizeMap) {
        this.layoutItemSizeMap = layoutItemSizeMap;
    }
}
