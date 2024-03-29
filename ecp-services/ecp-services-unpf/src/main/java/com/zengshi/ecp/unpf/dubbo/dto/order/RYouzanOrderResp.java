package com.zengshi.ecp.unpf.dubbo.dto.order;

import com.zengshi.ecp.server.front.dto.BaseResponseDTO;

/**
 * Created by guojingman on 2017/2/24.
 */
public class RYouzanOrderResp extends BaseResponseDTO {
    private int totalCount;
    private int pageNo;
    private int pageSize;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
