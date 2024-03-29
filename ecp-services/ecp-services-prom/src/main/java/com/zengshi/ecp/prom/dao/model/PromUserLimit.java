package com.zengshi.ecp.prom.dao.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class PromUserLimit extends PromUserLimitKey implements Serializable {
    private Long promCntLimit;

    private Long buyCnt;

    private Long remaindCnt;

    private Timestamp createTime;

    private Long createStaff;

    private static final long serialVersionUID = 1L;

    public Long getPromCntLimit() {
        return promCntLimit;
    }

    public void setPromCntLimit(Long promCntLimit) {
        this.promCntLimit = promCntLimit;
    }

    public Long getBuyCnt() {
        return buyCnt;
    }

    public void setBuyCnt(Long buyCnt) {
        this.buyCnt = buyCnt;
    }

    public Long getRemaindCnt() {
        return remaindCnt;
    }

    public void setRemaindCnt(Long remaindCnt) {
        this.remaindCnt = remaindCnt;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promCntLimit=").append(promCntLimit);
        sb.append(", buyCnt=").append(buyCnt);
        sb.append(", remaindCnt=").append(remaindCnt);
        sb.append(", createTime=").append(createTime);
        sb.append(", createStaff=").append(createStaff);
        sb.append("]");
        return sb.toString();
    }
}