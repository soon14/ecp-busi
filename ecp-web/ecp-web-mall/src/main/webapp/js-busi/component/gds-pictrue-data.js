/**
 * 商品详情里最近浏览的商品。自执行函数；
 */
$gdsPictrueData = function(){
	/**
	 * 根据需要展示的商品数量来获取最近浏览的商品数量，则调用数据处理的回调函数(callback);否则直接返回；
	 */
	var getData = function(opts){
		$.eAjax({
			url : GLOBAL.WEBROOT + '/gdsdetail/querygdspictrue',
			data : {
				"pictrueNum" : opts.pictrueNum,
				"pictrueHeight" : opts.pictrueHeight,
				"pictrueWidth" : opts.pictrueWidth,
				"pictrueMoreHeight" : opts.pictrueMoreHeight,
				"pictrueMoreWidth" : opts.pictrueMoreWidth,
				"gdsId" : opts.gdsId,
				"skuId" : opts.skuId
			},
			async : true,
			type : "post",
			dataType : "json",
			success : function(data, textStatus) {
				if (data == null) {
					return;
				} else {
					if(opts.callback && $.isFunction(opts.callback)){
						opts.callback(data);
					}
				}
			}
		});
	};
	return {
		"getData" : getData
	};
}();