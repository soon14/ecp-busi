package com.zengshi.ecp.staff.service.busi.score.interfaces;

import com.zengshi.ecp.server.front.exception.BusinessException;
import com.zengshi.ecp.staff.dubbo.dto.OrderBackMainReqDTO;
import com.zengshi.ecp.staff.dubbo.dto.OrderBackSubReqDTO;

/**
 * 
 * Title: ECP <br>
 * Project Name:pmph-services-server <br>
 * Description: 针对人卫退货需求，积分服务改造<br>
 * Date:2016年9月1日下午3:29:44  <br>
 * Copyright (c) 2016 ZengShi All Rights Reserved <br>
 * 
 * @author huangxl5
 * @version  
 * @since JDK 1.6
 */
public interface IScoreToOrderRWSV {

	 /**
	  * 
	  * selTotalScoreByBackOrder:(能过orderId，比例，查询此次退货需要扣除的积分). <br/> 
	  * 入参：orderId、退货金额比例scale、是否最后一笔退货lastFlag
	  * @author huangxl5 
	  * @param req
	  * @return
	  * @throws BusinessException 
	  * @since JDK 1.6
	  */
   public Long selTotalScoreByBackOrderRW(OrderBackMainReqDTO<OrderBackSubReqDTO> req) throws BusinessException;
  
	
	/**
     * 
     * saveScoreFrozenForOrderBack:(同意退货：冻结订单赠送的积分). <br/> 
     * 按比例进行冻结
     * @author huangxl5
     * @param req
     * @return
     * @throws BusinessException 
     * @since JDK 1.6
     */
    public Long saveScoreFrozenForOrderBackRW(OrderBackMainReqDTO<OrderBackSubReqDTO> req) throws BusinessException;
    
    
    /**
     * 
     * saveScoreAddForOrderBack:(退货同意退款，解冻当时冻结的积分，并扣除). <br/> 
     * 按比例进行扣除
     * @author huangxl5
     * @param req
     * @return
     * @throws BusinessException 
     * @since JDK 1.6
     */
    public boolean saveScoreAddForOrderBackRW(OrderBackMainReqDTO<OrderBackSubReqDTO> req) throws BusinessException;
    
    /**
     * 
     * saveScoreFrozenModifyForOrderBackRW:(人卫调整金额之后，需要冻结的积分). <br/> 
     * 金额可能调高，也可能调低，调整之后，冻结金额也需要调整，可用积分也跟着变化
     * @author huangxl5 
     * @param req
     * @return
     * @throws BusinessException 
     * @since JDK 1.6
     */
    public Long saveScoreFrozenModifyForOrderBackRW(OrderBackMainReqDTO<OrderBackSubReqDTO> req) throws BusinessException;
    
    
    /**
 	  * 
 	  * selTotalScoreByBackOrderAllRW:(通过orderId，比例，查询此次退货需要扣除的积分，不进行是否能扣为负的判断). <br/> 
 	  * 入参：orderId、退货金额比例scale、是否最后一笔退货lastFlag
 	  * @author huangxl5 
 	  * @param req
 	  * @return
 	  * @throws BusinessException 
 	  * @since JDK 1.6
 	  */
    public long selTotalScoreByBackOrderAllRW(OrderBackMainReqDTO<OrderBackSubReqDTO> req) throws BusinessException;
    
}

