package com.zengshi.controller.epay;

import com.zengshi.ecp.aip.dao.model.AipSvLogWithBLOBs;
import com.zengshi.ecp.order.dubbo.interfaces.pay.IPaymentRSV;
import com.zengshi.epay.utils.ConstantsForEpay;
import com.zengshi.util.RequestParamUtil;
import com.zengshi.service.AipEpayService;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ABCPayNotifyController  {
	private final static Logger logger = LoggerFactory.getLogger(ABCPayNotifyController.class);
	private final static String MESSAGE = "message";
	private final static String PAYRETURNURL = "payReturnUrl";
	private final static String FLAG = "flag";
	private final static String SUCCESS = "0";
	private final static String FAILURE = "1";

	@Autowired
	AipEpayService aipEpayService;//本地服务
	
	@Autowired
    IPaymentRSV paymentRSV; //dubbo服务
	
	String flag=ConstantsForEpay.NotifyInfo.FLAG;
	String message=ConstantsForEpay.NotifyInfo.RETURN_MSG;
	String success_status=ConstantsForEpay.NotifyInfo.SUCCES_STATUS;


	@RequestMapping(value = "/abcpaynotify", method = { RequestMethod.POST, RequestMethod.GET })
	public void abcpayNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		logger.info("Begin to deal ABCPayNotifyController data!");
		String payWay = "9004";
		Map<String, String> payInfo = RequestParamUtil.getParamsMap(request);
		Timestamp requestTime = new Timestamp(new Date().getTime());
		logger.info("请求数据payInfo：" + payInfo.toString());
		
		//日志记录aip_sv_log
		AipSvLogWithBLOBs tAipSvLogWithBLOBs=new AipSvLogWithBLOBs();
		tAipSvLogWithBLOBs.setAppKey("ABCPayNotifyController9004");
		tAipSvLogWithBLOBs.setServiceName("ABCPayNotifyController");
		tAipSvLogWithBLOBs.setRequest(payInfo.toString());
		tAipSvLogWithBLOBs.setRequestTime(requestTime);
		Map<String, String> returnMap = new HashMap<String, String>();
		//调用dubbo服务，获取回参Map
		try {
			returnMap = paymentRSV.paymentCallback(payWay, payInfo);
			// returnMap中含有两个参数，flag：0：成功，>0：其他 ；message:返回信息
			String payreturnurl = "";
			if (returnMap != null) {
			    //TODO
				logger.info("ReturnMap" + returnMap.toString());
				String result = "message=" + returnMap.get(MESSAGE) ;
				out.write(result);
				String flag = returnMap.get(FLAG);
				if(SUCCESS.equals(flag)){
					payreturnurl =returnMap.get(PAYRETURNURL);
					response.sendRedirect(payreturnurl);
				}else{
					response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
					out.write(result);
				}
			} else {
			    response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
				logger.error("返回的Map为空！");
				out.write("NULL");
			}
			
		} catch (Exception e) {
		    response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
			out.write("result=Error&desc=调用沃易购后场异常");
			logger.error("调用沃易购后场异常：",e);
	        Writer result = new StringWriter();
	        PrintWriter printWriter = new PrintWriter(result);
	        e.printStackTrace(printWriter);
	        //将异常信息记录至日志表中
	        returnMap.put("exception", result.toString());
			throw e;
		} finally {
			out.flush();
			out.close();
			try {
				Timestamp responseTime = new Timestamp(new Date().getTime());
				tAipSvLogWithBLOBs.setResponseTime(responseTime);
				tAipSvLogWithBLOBs.setResponse(returnMap.toString());
				// 插入日志
				aipEpayService.insertEpayLog(tAipSvLogWithBLOBs);
			} catch (Exception e) {
				logger.error("数据库异常！", e);
				throw new Exception("数据库异常！请稍后重试！");
			}
		}
	}
	

	/**
	 * @Title: abcpayRefundNotify
	 * @Description:收银台退款处理后修改退货表状态
	 * @author: liangdl5
	 * @Create: 2015年7月3日 下午5:41:37
	 * @Modify: 2015年7月3日 下午5:41:37
	 * @param:
	 * @return:
	 */
	@RequestMapping(value = "/abcpayRefundNotify", method = { RequestMethod.POST, RequestMethod.GET })
	public void abcpayRefundNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		logger.info("Begin to deal abcpayRefundNotify data!");
		String payWay = "9998";
		Map<String, String> payInfo = RequestParamUtil.getParamsMap(request);
		Timestamp requestTime = new Timestamp(new Date().getTime());
		logger.info("请求数据payInfo：" + payInfo.toString());
		
		//日志记录aip_sv_log
		AipSvLogWithBLOBs tAipSvLogWithBLOBs=new AipSvLogWithBLOBs();
		tAipSvLogWithBLOBs.setAppKey("ABCPayRefundNotify9998");
		tAipSvLogWithBLOBs.setServiceName("ABCPayRefundNotify9998");
		tAipSvLogWithBLOBs.setRequest(payInfo.toString());
		tAipSvLogWithBLOBs.setRequestTime(requestTime);
		Map<String, String> returnMap = new HashMap<String, String>();
		//调用dubbo服务，获取回参Map
		try {
			returnMap = paymentRSV.refundCallback(payWay, payInfo);
			// returnMap中含有两个参数，flag：0：成功，>0：其他 ；message:返回信息
			if (returnMap != null) {
				logger.info("ReturnMap" + returnMap.toString());
				String result = "result=" + returnMap.get("result") + "&resultDesc=" + returnMap.get("resultDesc") ;
				out.write(result);
			} else {
				logger.error("返回的Map为空！");
				out.write("result=Error&resultDesc=调用沃易购后场返回NULL");
			}
		} catch (Exception e) {
			out.write("result=Error&resultDesc=调用沃易购后场异常");
			logger.error("调用沃易购后场异常：",e);
	        Writer result = new StringWriter();
	        PrintWriter printWriter = new PrintWriter(result);
	        e.printStackTrace(printWriter);
	        //将异常信息记录至日志表中
	        returnMap.put("exception", result.toString());
			throw e;
		} finally {
			out.flush();
			out.close();
			try {
				Timestamp responseTime = new Timestamp(new Date().getTime());
				tAipSvLogWithBLOBs.setResponseTime(responseTime);
				tAipSvLogWithBLOBs.setResponse(returnMap.toString());
				// 插入日志
				aipEpayService.insertEpayLog(tAipSvLogWithBLOBs);
			} catch (Exception e) {
				logger.error("数据库异常！", e);
				throw new Exception("数据库异常！请稍后重试！");
			}
		}
	}
}
