package com.zengshi.ecp.search.service.common.interfaces;

import com.zengshi.ecp.search.dubbo.dto.SecObjectBuildLogReqDTO;
import com.zengshi.ecp.server.front.exception.BusinessException;

/**
 * Title: ECP <br>
 * Project Name:ecp-services-search-server-xhs <br>
 * Description: <br>
 * Date:2016年1月20日下午7:40:45  <br>
 * Copyright (c) 2016 ZengShi All Rights Reserved <br>
 * 
 * @author huangdf
 * @version  
 * @since JDK 1.6
 */
public interface ISecObjectBuildLogSV {
    
    /**
     * 保存日志
     * @param secObjectBuildLogDTO
     * @return
     */
    public long saveSecObjectBuildLog(SecObjectBuildLogReqDTO secObjectBuildLogDTO) throws BusinessException;

}

