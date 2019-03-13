//页面初始化模块
$(function() {
	var pInit = function() {
		var init = function() {

			var ajaxFileUpload = function(url, secureuri, fileElementId, type,
					dataType, callback) {
				$.ajaxFileUpload({
					url : url, // 用于文件上传的服务器端请求地址
					secureuri : secureuri, // 一般设置为false
					fileElementId : fileElementId, // 文件上传空间的id属性 <input
					// type="file" id="imageFile"
					// name="imageFile" />
					type : type, // get 或 post
					dataType : dataType, // 返回值类型
					success : callback, // 服务器成功响应处理函数
					error : function(data, status, e) // 服务器响应失败处理函数
					{
						alert(e);
					}
				});
			};
			var uploadImage = function(object, path) {
				// var Img = new Image();
				// Img.src = object.value;
				// alert(object.height+":"+object.width);
				// return false;
				var filepath = path;
				filepath = (filepath + '').toLowerCase();
				var regex = new RegExp(
						'\\.(jpg)$|\\.(png)$|\\.(jpeg)$|\\.(gif)$', 'gi');
				/** 上传图片文件格式验证 */
				if (!filepath || !filepath.match(regex)) {
					eDialog.alert('请选择图片格式为(.jpg,.png,.jpeg,.gif).');
					uploadfile.value = "";
					return;
				}
				var url = GLOBAL.WEBROOT + '/seller/gift/uploadimage';
				var callback = function(returnInfo) {
					/** 上传成功，隐藏上传组件，并显示该图片 */
					if (returnInfo.success == "ok") {
						$("#image").attr("src", returnInfo.map.imagePath);
						$("#giftPic").val(returnInfo.map.vfsId);
						$("#pictrueName").val(returnInfo.map.imageName);
					} else {
						eDialog.error(returnInfo.message);
					}
				};
				ajaxFileUpload(url, false, $(object).attr('id'), "POST",
						"json", callback);
			};

			var saveGdsGift = function(obj) {
				if (!$("#detailInfoForm").valid())
					return false;
				var giftId = $("#giftId").val();
				var params = ebcForm.formParams($("#detailInfoForm"))
				params.push({"name":"giftId","value":giftId});
				var btn = $(obj);
				btn.button('loading');// 设置按钮为处理状态，并为中读，不允许点击
				$.eAjax({
					url : GLOBAL.WEBROOT + "/seller/gift/savegiftedit",
					data :params,
					success : function(returnInfo) {
						btn.button('reset');
						if (returnInfo.resultFlag == 'ok') {
							eDialog.success('赠品保存成功！', {
								buttons : [ {
									caption : "确定",
									callback : function() {
										window.location.href = GLOBAL.WEBROOT
												+ '/seller/gift?shopId='
												+ $("#shopId").val();
									}
								} ]
							});
						} else {
							eDialog.error('赠品保存失败！');
						}
					},
					exception : function() {
						btn.button('reset');
					}
				});
			}

			$("#selectSku").live(
					'click',
					function() {
						bDialog.open({
							title : '单品列表',
							width : 860,
							height : 510,
							url : GLOBAL.WEBROOT + '/seller/gift/giftskuopen?shopId='
									+ $("#shopId").val(),
							params : {
								'shopId' : $("#shopId").val()
							},
							callback : function(data) {
								if (data && data.results
										&& data.results.length > 0) {
									$("#skuId").val(data.results[0].skuId);
									$("#gdsId").val(data.results[0].gdsId);
									$("#skuName").val(data.results[0].skuName);
									$("#skuName").attr('title',
											data.results[0].skuName);
								}
							}
						});
					});

			$("#picture").live("change", function(o) {
				var path = $(this).val();
				uploadImage(this, path);
			});

			$("#btnFormSave").live("click", function() {
				saveGdsGift(this);
			});
			$("#btnReturn").live("click", function() {
				window.location.href = GLOBAL.WEBROOT + '/seller/gift?shopId='+$("#shopId").val();
			});
		};
		return {
			init : init
		};
	};
	pageConfig.config({
		// 指定需要加载的插件，名称请参考requirejs.common.js中定义的插件名称，注意大小写
		plugin : [],
		// 指定页面
		init : function() {
			var giftAdd = new pInit();
			giftAdd.init();
		}
	});
});

function modiAmount(){
	$("input[name='radio']:checked").each(function (){	
//		alert($(this).attr('id'));
		var p = /^\d+?$/;
		if($(this).attr('id')=="modifyDel"){
			//调减					
			var giftAmountHide = $("#giftAmountHide").val();
			var giftValidHide = $("#giftValidHide").val();
			var midofyAmount = $("#midofyAmount").val().trim();
			if(p.test(midofyAmount)){
				$("#giftValid").val(0);
				$("#giftAmount").val(0);
			}
			var a = 0;
			//如果修改的值为空
			$("#NUMBERERROR").hide();
			if(!p.test(midofyAmount)){
				$("#NUMBERERROR").show();	
				_giftFlag = false;
				$("#giftAmount").val(giftAmountHide);
				$("#giftValid").val(giftValidHide);
			}
			if(midofyAmount==""){
				$("#giftAmount").val(giftAmountHide);
				$("#giftValid").val(giftValidHide);
				_giftFlag = true;
				$("#NUMBERERROR").hide();
			}else if(p.test(midofyAmount)){
				if(parseInt(midofyAmount)>parseInt(giftValidHide)){
					$("#erro").show();
					_giftFlag = false;
					$("#giftAmount").val(giftAmountHide);
					$("#giftValid").val(giftValidHide);
				}else{
					$("#erro").hide();
					_giftFlag = true;
					$("#giftAmount").val( parseInt(giftAmountHide)-parseInt(midofyAmount) );
					$("#giftValid").val( parseInt(giftValidHide)-parseInt(midofyAmount) );
				}
				
			}
		}else{
			//调增
			$("#NUMBERERROR").hide();
			if (!String.prototype.trim) {
				String.prototype.trim = function() {
					return this.replace(/^\s+|\s+$/g, '');
				};
			}
			var giftAmountHide = $("#giftAmountHide").val();
			var giftValidHide = $("#giftValidHide").val();
			var midofyAmount = $("#midofyAmount").val().trim();
			if(p.test(midofyAmount)){
				$("#giftValid").val(0);
				$("#giftAmount").val(0);
			}
			var a = 0;
			//如果修改的值为空
			if(!p.test(midofyAmount)){
				$("#NUMBERERROR").show();
				_giftFlag = false;
				$("#giftAmount").val(giftAmountHide);
				$("#giftValid").val(giftValidHide);
			}
			if(midofyAmount==""){
				$("#giftAmount").val(giftAmountHide);
				$("#giftValid").val(giftValidHide);
				$("#NUMBERERROR").hide();
				_giftFlag = true;
			}else if(p.test(midofyAmount)){
				$("#erro").hide();
				_giftFlag = true;
				$("#giftAmount").val( parseInt(giftAmountHide)+parseInt(midofyAmount) );
				$("#giftValid").val( parseInt(giftValidHide)+parseInt(midofyAmount) );
			}
		}
	});
}