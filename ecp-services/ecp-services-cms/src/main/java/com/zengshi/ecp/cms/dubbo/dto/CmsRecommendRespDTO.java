package com.zengshi.ecp.cms.dubbo.dto;

import java.sql.Timestamp;

import com.zengshi.ecp.server.front.dto.BaseResponseDTO;

public class CmsRecommendRespDTO extends BaseResponseDTO {

    /*--------------------------以下为model后添加的字段 start--------------------------*/
    /**
     * 状态翻译
     */
    private String statusZH;
    /**
     * 推荐类型翻译
     */
    private String recommendTypeZH;
    /**
     * 作者图片URL
     */
    private String authorImageUrl;
    /**
     * 推荐商品名字翻译
     */
    private String recommendGdsName;
    /**
     * 该作者其他的作品
     */
    private String otherProductionName;
    /**
     * 该作者推荐的作品
     */
    private String recommendProductionName;
    /**
     * 喜欢该作者还喜欢
     */
    private String otherLikeName;

    /*--------------------------以下为model后添加的字段 end------------------------*/
    private Long id;

    private String recommendType;

    private Long recommendGdsId;

    private String authorName;

    private String authorIntroduction;

    private String authorImage;

    private String otherProduction;

    private String recommendProduction;

    private String otherLike;

    private Integer sortNo;

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

    public String getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(String recommendType) {
        this.recommendType = recommendType == null ? null : recommendType.trim();
    }

    public Long getRecommendGdsId() {
        return recommendGdsId;
    }

    public void setRecommendGdsId(Long recommendGdsId) {
        this.recommendGdsId = recommendGdsId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getAuthorIntroduction() {
        return authorIntroduction;
    }

    public void setAuthorIntroduction(String authorIntroduction) {
        this.authorIntroduction = authorIntroduction == null ? null : authorIntroduction.trim();
    }

    public String getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage == null ? null : authorImage.trim();
    }

    public String getOtherProduction() {
        return otherProduction;
    }

    public void setOtherProduction(String otherProduction) {
        this.otherProduction = otherProduction == null ? null : otherProduction.trim();
    }

    public String getRecommendProduction() {
        return recommendProduction;
    }

    public void setRecommendProduction(String recommendProduction) {
        this.recommendProduction = recommendProduction == null ? null : recommendProduction.trim();
    }

    public String getOtherLike() {
        return otherLike;
    }

    public void setOtherLike(String otherLike) {
        this.otherLike = otherLike == null ? null : otherLike.trim();
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
        sb.append(", recommendType=").append(recommendType);
        sb.append(", recommendGdsId=").append(recommendGdsId);
        sb.append(", authorName=").append(authorName);
        sb.append(", authorIntroduction=").append(authorIntroduction);
        sb.append(", authorImage=").append(authorImage);
        sb.append(", otherProduction=").append(otherProduction);
        sb.append(", recommendProduction=").append(recommendProduction);
        sb.append(", otherLike=").append(otherLike);
        sb.append(", sortNo=").append(sortNo);
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

    public String getRecommendTypeZH() {
        return recommendTypeZH;
    }

    public void setRecommendTypeZH(String recommendTypeZH) {
        this.recommendTypeZH = recommendTypeZH;
    }

    public String getAuthorImageUrl() {
        return authorImageUrl;
    }

    public void setAuthorImageUrl(String authorImageUrl) {
        this.authorImageUrl = authorImageUrl;
    }

    public String getRecommendGdsName() {
        return recommendGdsName;
    }

    public void setRecommendGdsName(String recommendGdsName) {
        this.recommendGdsName = recommendGdsName;
    }

    public String getOtherProductionName() {
        return otherProductionName;
    }

    public void setOtherProductionName(String otherProductionName) {
        this.otherProductionName = otherProductionName;
    }

    public String getRecommendProductionName() {
        return recommendProductionName;
    }

    public void setRecommendProductionName(String recommendProductionName) {
        this.recommendProductionName = recommendProductionName;
    }

    public String getOtherLikeName() {
        return otherLikeName;
    }

    public void setOtherLikeName(String otherLikeName) {
        this.otherLikeName = otherLikeName;
    }

}
