$(function() {

	// 页面业务逻辑处理内容
	var pageInit = function() {

		var init = function() {

			// 赠送类型 事件
			$(".sendTypePoints").click(function() {
				if ($(this).val() == '0') {
					// 固定值
					$("#help-inline0").removeClass("hide");
					$("#help-inline1").addClass("hide");
				} else {
					// 指定倍数
					$("#help-inline1").removeClass("hide");
					$("#help-inline0").addClass("hide");
				}
				// 为空 不参与积分赠送
				if ($(this).val() == '') {
					$(".points").addClass("hide");
					$("#sendAmount").val('');
				} else {
					$(".points").removeClass("hide");
				}
			});

			// 全局变量
			var giftTr;
			// 商品删除按钮功能
			$("#giftTable tr td a[ name='delGdsRow']").live('click',
					function(e) {
						// giftTr=e.currentTarget.parentNode.parentNode;
						giftTr = $(e.currentTarget).parent().parent();
						eDialog.confirm("确定删除吗？", {
							buttons : [ {
								caption : '确认',
								callback : function() {
									giftTr.remove();
								}
							}, {
								caption : '取消',
								callback : $.noop
							} ]
						});
					});

			// 批量删除功能
			$("#btn_gift_del_batch")
					.live(
							'click',
							function(e) {

								var _doAction = false;
								var _l = $("#giftTable tbody tr td input[ name='checkboxgds']");
								for (var i = 0; i < _l.length; i++) {
									if (_l[i].checked) {
										_doAction = true;
										break;
									}
								}
								if (!_doAction) {
									eDialog.alert('请，选择需要删除的数据。');
									return;
								}

								eDialog
										.confirm(
												"确定批量删除吗？",
												{
													buttons : [
															{
																caption : '确认',
																callback : function() {
																	var _l = $("#giftTable tbody tr td input[ name='checkboxgds']");
																	var _tr = null;
																	for (var i = 0; i < _l.length; i++) {
																		if (_l[i].checked) {
																			// 选中
																			// 删除
																			_tr = $(
																					_l[i])
																					.parent()
																					.parent();
																			_tr
																					.remove();
																		}
																	}
																}
															},
															{
																caption : '取消',
																callback : $.noop
															} ]
												});
							});

			// checkbox赠品选择事件
			$("#giftTable thead tr input[ id='dt_row_all_check']")
					.live(
							'click',
							function(e) {
								// 选中 表示全选
								if (e.currentTarget.checked) {
									$(
											"#giftTable tbody tr td input[ name='checkboxgds']")
											.prop('checked', true);
								} else {
									// 全部取消
									$(
											"#giftTable tbody tr td input[ name='checkboxgds']")
											.prop('checked', false);
								}
							});

			// 赠品选择 window
			$('#btnGiftSelect').unbind('click').click(
					function() {
						bDialog.open({
							title : '赠品选择',
							width : 800,
							height : 550,
							url : GLOBAL.WEBROOT
									+ "/seller/giftprom?shopId="
									+ $('#shopId').val(),
							callback : function(data) {
								if (data && data.results && data.results[0]) {
									discountRuleFun
											.initList(data.results[0].skuIds);
								}

							}
						});
					});
		};
		return {
			init : init
		};

	};
	pageConfig.config({
		// 指定需要加载的插件，名称请参考common中定义的插件名称，注意大小写
		plugin : [ 'bForm' ],
		// 指定页面
		init : function() {
			var p = new pageInit();
			p.init();
		}
	});

});

var discountRuleFun = {
	// 判断是否为数字
	isNum : function(s) {
		if (s != null && s != "") {
			return !isNaN(s);
		}
		return false;
	},

	// 保存 提交验证
	valid : function() {
		var _reData = new Object();
		_reData.value = false;// 返回默认 失败

		var data = new Array();

		// 验证金额
		var orderMoney = $('#orderMoney').val();
		if (!promCheck.priceNumber(orderMoney)) {
			eDialog.alert('促销规则-订单金额格式不正确，请最多保留两位小数。', null);
			_reData.value = false;// 返回默认 失败
			return _reData;
		}
		// 促销类型为赠送 赠品时，赠品必需选择
		var _l = $("#giftTable tbody tr td input[ name='checkboxgds']");
		if (_l.length <= 0) {
		} else {
			// 赠品 设置数量
			var _promCnt = null;
			for (var i = 0; i < _l.length; i++) {
				// 验证是否为有效数字
				_promCnt = $('#giftCnt-' + _l[i].id).val();// 赠品总数量取值
				_everyTimeCnt = $('#everyTimeCnt-' + _l[i].id).val();// 赠品每次赠送数量

				if (!this.isNum(_promCnt)) {
					var _giftId = _l[i].id;
					eDialog.alert('优惠规则，赠品编码：' + _giftId.split("-")[2]
							+ " 对应的赠送总量，请输入有效的数字 " + _promCnt + " ！", null);
					_reData.value = false;// 返回默认 失败
					return _reData;
				}
				if (!this.isNum(_everyTimeCnt)) {
					var _giftId = _l[i].id;
					eDialog.alert('优惠规则，赠品编码：' + _giftId.split("-")[2]
							+ " 对应的每次赠送量，请输入有效的数字 " + _everyTimeCnt + " ！",
							null);
					_reData.value = false;// 返回默认 失败
					return _reData;
				}
				data.push({
					'name' : 'giftMap[' + _l[i].id + ']',
					'value' : _promCnt + "-" + _everyTimeCnt
				});
			}
		}
		_reData.value = true;
		_reData.result = data;
		return _reData;
	},
	// 促销商品列表
	initList : function(_giftIds) {
		// 编辑 进入 promId非空
		var _promId = $('#promId').val();
		// _skuIds 初始化页面为空 ，open页面回掉可非空
		if (!_giftIds) {
			_giftIds = new Array();
		}

		var _giftIdsTmp = new Array();
		var selectArr = new Array();
		// 当前页面的列表数据 需要加入到skuIds中
		var _l = $("#giftTable tbody tr td input[ name='checkboxgds']");
		if (_l && _l.length > 0) {
			for (var i = 0; i < _l.length; i++) {
				var _promCnt = $('#giftCnt-' + _l[i].id).val();// 赠品总数量取值
				var _everyTimeCnt = $('#everyTimeCnt-' + _l[i].id).val();// 赠品每次赠送数量
				selectArr.push(_l[i].parentNode.parentNode.id + "-" + _promCnt
						+ "-" + _everyTimeCnt);
				// 去重
				for (var j = 0; j < _giftIds.length; j++) {
					if (_l[i].parentNode.parentNode.id == _giftIds[j]) {
						delete _giftIds[j];
					}
				}
			}
		} else {
			// 没有数据 清空
			if (_giftIds && _giftIds.length == 0) {
				_giftIds = '';
			}
		}
		for (var j = 0; j < selectArr.length; j++) {
			_giftIds.push(selectArr[j]);
		}
		// ajax请求
		$.eAjax({
			url : GLOBAL.WEBROOT + "/seller/giftprom/giftList",
			data : [ {
				name : 'promId',
				value : _promId
			}, {
				name : 'giftIds',
				value : _giftIds
			} ],
			"dataType" : "text",
			success : function(returnInfo) {
				$('#giftTableId').empty();
				$('#giftTableId').append(returnInfo);
				// 查看
				if ($('#doAction').val() == "view") {
					$(".giftClass").hide();// 批量删除按钮 赠品选择按钮
					$("a[ name='delGdsRow']").hide();// 删除按钮

				}
			}
		});
	},
	hide : function() {
		$('.giftClass').hide();
	},
	show : function() {
		$('.giftClass').show();
	}

};
