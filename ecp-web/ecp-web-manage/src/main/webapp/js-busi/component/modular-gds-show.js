;
(function(factory) {
	if (typeof define === "function" && define.amd) {
		// AMD模式
		define([ 'jquery-powerSwitch',"ecp-component/wap/cms-url-tool"], function(slide,urlTool) {
			factory(jQuery);
			// /返回对象，要求，其中必须要有一个 componentInit的方法；
			return {
				componentInit : function() {
					$(".modular-gds-show").modular_gds_show();
				}
			};
		});
	} else {
		// 全局模式 ，不使用AMD 规范的时候，使用的插件
		factory(jQuery);
	}
}(function($) {
	// / 具体插件的定义；
	var defaultOpts = {
		placeId : ""
	};

	$homepage_floorvm = {
		"webRoot":$webroot,
		/**
		 * 获取 楼层下的信息，如，页签、商品……；如果有符合要求的信息，则调用数据处理的回调函数(callback);否则直接返回；
		 * 入参：
		 * placeId : 内容位置Id；
		 * gdsSize : 位置展示商品个数
		 * tabSize : 页签个数
		 * placeWidth : 图片宽度
		 * placeHeight" : 图片长度
		 * status : 状态
		 * callback : 回调函数，对于数据处理的回调函数；
		 * @author gxq
		 */
		getData : function(opts){
			$.eAjax({
				url : $webroot + '/cmshomepagegetdata/qryFloorVM',
				data : {
					"adPlaceId" : opts.adPlaceId,
					"placeId" : opts.placeId,
					"gdsSize" : opts.gdsSize,
					"tabSize" : opts.tabSize,
					"placeWidth" : opts.placeWidth,
					"placeHeight" : opts.placeHeight,
					"status" : opts.status
				},
				async : true,
				type : "post",
				dataType : "html",
				success : function(data, textStatus) {
					if(opts.callback && $.isFunction(opts.callback)){
						opts.callback(data);
					}
				}
			});
		},
			
		/**
		 * 调用获取数据组件
		 */
		"control":function(el,opts){
			$homepage_floorvm.webRoot = opts.webRoot + "";
			opts.webRoot = "";
			//加载动态图
			$(".modular-body", el).append("<div class='tpl-loading'></div>");
			$homepage_floorvm.getData({
				"placeId" : opts.placeId,
				"tabSize" : opts.tabSize,
				"placeWidth" : opts.placeWidth,
				"placeHeight" : opts.placeHeight,
				"status" : opts.status,
				"callback":function(datas){
					if(!datas){
						datas="<div>亲，商品数据丢失！</div>";
					}
					//返回楼层VM，填充楼层信息（页签、页签对应的DIV）
					$("#gds-show-render",$(el)).empty();
					$("#gds-show-render",$(el)).html(datas);
					$homepage_floorvm.doHref(el);
					//返回楼层VM，填充楼层信息（广告、标签、商品）
					var $floorTabs = $(".floorTabList a",el).eq(0);
					
					var floorId = $("#digitn",el).attr("floor-id");
					
					if($floorTabs.length > 0){
						$homepage_floorvm.bindTabChange(el,floorId);
					}
					
					$homepage_floorvm.queryFloorInfo(el,floorId, $floorTabs);
				}
			});
		},
		"queryFloorInfo":function(el,floorId,$floorTabs){
			if(floorId == undefined){//如果没有楼层id  则表示错误数据 
				$("#digitn", el).empty().html("楼层数据获取错误！");
				return this;
			}
			if($floorTabs && $floorTabs.length <= 0){
				$floorTabs = null;
			}
			
			var tabId = null;
			var isLoad = null;//是否加载，yes:已加载，no：未加载 
			if($floorTabs){
				 tabId = $floorTabs.attr("id");
				 isLoad = $floorTabs.attr("isLoad");//是否加载，yes:已加载，no：未加载 
				 $($floorTabs).attr("isLoad","yes");
				 
				 $(".floor-div-gds", el).hide();
				 $("#floorGdsDIV_" + tabId,el).show();
			}
			
			var opts = $(el).data();
			opts.tabId = tabId;
			opts.floorId = floorId;

			if(!$floorTabs || isLoad == "no"){
				$($floorTabs).attr("isLoad","yes");
				$("#floorGdsDIV_"+tabId, el).html("<div class='tpl-loading'></div>");
				$.eAjax({
					url : $webroot + '/cmshomepagegetdata/queryFloorInfoVM',
					data : {
						"tabId" : opts.tabId,
						"floorId" : opts.floorId,
						"gdsSize" : opts.showAmount,
						"placeWidth" : opts.placeWidth,
						"placeHeight" : opts.placeHeight,
						"status" : opts.status
					},
					async : true,
					type : "post",
					dataType : "html",
					success : function(datas, textStatus) {
						if($floorTabs && tabId){
							$("#floorGdsDIV_"+tabId, el).empty().html(datas);
						}else{
							$(".tab-content", el).empty().html(datas);
						}
						$homepage_floorvm.doHref(el);
					}
				});
			}
		},
		"bindTabChange":function(el,floorId){
			//绑定tab页切换
			$(".floorTabList a",el).live("mouseover",function(e){
				if($(this).parent("li").hasClass("active")){
					return $(this);
				}
				//获取楼层商品数据
				$(".floorTabList li",el).removeClass("active");
				$(this).parent("li").addClass("active");
				$homepage_floorvm.queryFloorInfo(el,floorId,$(this));
			});
		},
		"doHref":function(el){
			var webRoot = $homepage_floorvm.webRoot ||  $webroot || "";
			var datas = $("a[lazy-href]",$(el));
			if(datas && 0 < datas.length && _eCmsUrlTool && _eCmsUrlTool.getHtmlAbsUrl){
				datas.each(function(){
					var $a = $(this);
					var lazyHref = $a.attr("lazy-href") || "";
					if(lazyHref && 0 != lazyHref){
						$a.attr("href",_eCmsUrlTool.getHtmlAbsUrl(webRoot,lazyHref));
						$a.attr("target","_blank");
					}
					$a.removeAttr("lazy-href");
				});
			}
		}
	};
	$.fn.modular_gds_show = function() {
		return this.each(function() {
			var status = $(this).data("comStatus");
			if(!status || status == "" || status =="undefined" ||status==undefined || status == "init"){

			} else {
				return $(this);
			}
			$(this).data("comStatus","do");
			
			var opts = $.ecpPlugin.parseOptions(this, defaultOpts);
			if(opts == null){
				opts = {} ;
			}
			$homepage_floorvm.control(this,opts);
			
			$(this).data("comStatus","end");
			return $(this);
		});
	};
}));