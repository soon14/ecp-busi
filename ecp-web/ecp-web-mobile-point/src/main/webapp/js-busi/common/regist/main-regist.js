$(function(){
	
	/*$("#refleshCaptchaCode").click(function(){
		$("#captchaCodeImg").attr("src","captcha/CapthcaImage?"+(new Date()).getTime());
	});*/
	
	$('.wbtn').on('click',function(){
		
		var staff_code = $('#staffCode').val();
		if(staff_code==""||staff_code==null){
			eDialog.alert("登录账号不能为空");
			return;
		}
		var StaffPassword = $('#StaffPassword').val();
		if(StaffPassword==""||StaffPassword==null){
			eDialog.alert("登录密码不能为空");
			return;
		}
		if(StaffPassword!=$('#StaffPassword2').val()){
			eDialog.alert("对不起，您输入的两次密码不正确");
			return;
		}
		var serialNumber = $('#serialNumber').val();
		if(serialNumber==''||serialNumber==null){
			eDialog.alert("手机号码不能为空");
			return;
		}
		
		var phoneCode = $('#phoneCode').val();
		if(phoneCode==''||phoneCode==null){
			eDialog.alert("手机验证码不能为空");
			return;
		}
		
		var val = ebcForm.formParams($("#formRegist"));
	 	$.eAjax({
			url : $webroot+'/register/regist',
			data : val,
			datatype:'json',
			async : false,
			success : function(returnInfo) {
				if(returnInfo.resultFlag=='ok'){
					$('#j_username').val($('#staffCode').val());
					$('#j_password').val($('#StaffPassword').val());
					eDialog.alert(returnInfo.resultMsg,function(){
						$.eAjax({
			    			url : GLOBAL.WEBROOT+'/j_spring_security_check',
			    			data : ebcForm.formParams($("#loginform")),
			    			datatype:'json',
			    			success : function(returnInfo) {
			    				$.eAjax({
					    			url : GLOBAL.WEBROOT+'/login/check',
					    			data : ebcForm.formParams($("#loginform")),
					    			datatype:'json',
					    			success : function(returnInfo) {
					    				window.location.href = GLOBAL.WEBROOT + '/homepage';
					    			}
			    				});
			    			},
			    			exception:function(){
			    				eDialog.alert("登录异常");
			    			}
			    			});
						
					});
				    }else{
				    	eDialog.alert(returnInfo.resultMsg);
				}
			},
			exception:function(){
				
		      }
		});
		
		
	});
	//校验用户名是否存在
	$('#staffCode').blur(function(){
		var staffCode = $('#staffCode').val();
		var strExp=/^[a-zA-Z0-9~!@#$%^&*()_-]{4,18}$/;
		//这个校验，必须与统一的校验脚本一致ecp-web-js包的e.validate.method.js
		if (strExp.test(staffCode)) {
			$.eAjax({
    			url : GLOBAL.WEBROOT+'/register/staffcode/check?staffCode=' + staffCode,
    			datatype:'json',
    			success : function(returnInfo) {
    				if (returnInfo.resultFlag != 'ok') {
    					eDialog.alert("用户名已经存在");
    					/*$('#isExist').html("<font color='red'>用户名已经存在</font>");*/
    				} else {
    					//$('#isExist').html("该用户名可以使用");
    				}
    			},
    		});
		}
	});
	
	$.smsDialogPlugin.show({
		PhoneNoId : "serialNumber",
		sendButtonId:"sms-win-getcode"
	});
	
	
});