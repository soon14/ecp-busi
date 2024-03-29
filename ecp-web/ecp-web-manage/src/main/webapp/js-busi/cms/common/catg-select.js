/**
 * 分类下拉选择器。
 */
(function($) {
	
	var Constants = {
			treeContentDIV : "gdsCategoryDropDownDIV",    			// zTree DIV
			treeId : "gdsCategoryTree",				   			// zTree Id.
			$this : null,									   			// 当前对象.
			multi : false,									   			// 是否多选.
			//url : GLOBAL.WEBROOT+"/goods/mediacatg/asyncData/selector/getNodes"  // 分类节点异步加载地址.
			url:GLOBAL.WEBROOT+"/goods/category/asyncData/selector/getNodes?catgType=1"
			
	};
	
	
 
	$.fn.mcDropDown = function(opt){
		var p = $.extend($.fn.mcDropDown.p,$.fn.mcDropDown.defaults,opt);
		Constants.$this = this;
		Constants.multi = p.multi;
		createTreeContentDIV(p);
		// $.fn.mcDropDown.initDropDown(p);
		this.bind('click',{obj : this},showTree);
	};
	
	
	$.fn.mcDropDown.change = function(){
	    $.fn.mcDropDown.initDropDown($.fn.mcDropDown.p);
	}
	
	
	/**
	 * 默认设置。
	 */
	$.fn.mcDropDown.defaults = {
			multi : false,	// 是否多选 true-多选 false-单选。
			backfillCatgName : '',  // 分类名回填组件ID。
			backfillCatgCode : '',     // 分类编码回填组件ID。
			width : '230px', // 默认宽度。
			height : '350px', // 默认高度。
			backgroundColor : '#f0f6e4' // 背景色。
	};

	 /**
     * 树节点点击事件响应。
     */
	function onTreeClick(event, treeId, treeNode, clickFlag) {
		// 复选情况节点点击直接返回。
		if($.fn.mcDropDown.p.multi){
			return;
		}
		
		var zTree = categoryTree.getTree(),
		nodes = zTree.getSelectedNodes();
		if(null != nodes && nodes.length > 0){
			var catgName = nodes[0].name;
			var catgCode = nodes[0].id;
			
			if('' != $.fn.mcDropDown.p.backfillCatgName){
				
				$('#'+$.fn.mcDropDown.p.backfillCatgName).val(catgName);
			}
			if('' != $.fn.mcDropDown.p.backfillCatgCode){
				$('#'+$.fn.mcDropDown.p.backfillCatgCode).val(catgCode);
			}
			
		}
	}
	 /**
	  * 多选。
	  */
	 function onCheck(e, treeId, treeNode) {
		    if(!multi){
		    	return;
		    }
			var zTree = categoryTree.getTree();
			var nodes = zTree.getCheckedNodes(true);
			var catgName = "";
			var catgId = "";
			
			
			for (var i=0, l=nodes.length; i<l; i++) {
				catgName += nodes[i].name + ",";
				catgId += nodes[i].id + ",";
			}
			if (catgName.length > 0 ) catgName = catgName.substring(0, catgName.length-1);
			if (catgId.length > 0 ) catgId = catgId.substring(0, catgId.length-1);
			
           if('' != $.fn.mcDropDown.p.backfillCatgName){
				$('#'+$.fn.mcDropDown.p.backfillCatgName).val(catgName);
			}
			if('' != $.fn.mcDropDown.p.backfillCatgCode){
				$('#'+$.fn.mcDropDown.p.backfillCatgCode).val(catgCode);
			}
			
			
		}
	 
	 
	
	 /**
	  * ajax数据过滤.
	  * @param treeId
	  * @param parentNode
	  * @param responseData
	  * @returns
	  */
	 function ajaxDataFilter(treeId, parentNode, responseData) {
	        if (responseData) {
	            if(responseData.errorMessage){
	          	  eDialog.error('分类树初始异常!');
	          	  return;
	            }
	            for(var i =0; i < responseData.length; i++) {
	                var nodeData = responseData[i];
	                if(true == nodeData.isRoot){
	                    responseData[i].nocheck = true;
	                }
	              }
	          }
	          return responseData;
	 };
    
    /**
     * zTree异步错误.
     */
    function zTreeOnAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {
    	eDialog.alert('分类树异步加载出错!状态码['+textStatus+']-'+errorThrown);
    };
    
    /**
     * zTree异步成功回调.
     */
    function zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {
        var catgCode = $('#v-catg-code').val();
        if(null != catgCode && ''!=catgCode){
        	var treeObj = categoryTree.getTree();
        	var selectNode = treeObj.getNodeByParam('id',catgCode,null);
			treeObj.selectNode(selectNode);
        }
    };
    /**
	  * 树节点点击前事件。
	  */
	 function beforeClick(treeId, treeNode, clickFlag) {
			return (treeNode.click != false);
	 }
	 
    /**
	 * 树设置.
	 */
	var categoryTree = {
			 // 商品分类树初始化功能代码段。
			settingNormal : {
				    view:{
						selectedMulti:false
					},
					check : {
						enable : false,
						chkboxType : {"Y":"","N":""}
					},
					data: {
						simpleData: {
							enable: true
						}
					},
					async: {
						enable: true,
						url:Constants.url,
						type:"post",
						autoParam:["id"],
						otherParam:{
							"siteId":function(){
								var siteId = $('#siteId').val();
    						   if(2 != siteId){
    							   siteId = "1";
    						   }
    						   return siteId;
							}
					     },
					    dataFilter: ajaxDataFilter
					},
					callback: {
						beforeClick: beforeClick,
						onClick : onTreeClick,
						onAsyncError : zTreeOnAsyncError,
						onAsyncSuccess: zTreeOnAsyncSuccess,
						onCheck : onCheck
					}
			},
			// 搜索设置
			settingSearch : {
					view:{
						selectedMulti: false
					},
					data: {
						simpleData: {
							enable: true
						}
					},
					async: {
    					enable: true,
    					url:GLOBAL.WEBROOT+"/goods/category/asyncData/catgsearch",
    					type:"post",
    					otherParam:{
    						"catgType":'1',
    						"catgName":function(){
    							return $('#keyword').val();
    						},
    					"siteId":function(){
    						   var siteId = $('#siteId').val();
    						   if(2 != siteId){
    							   siteId = "1";
    						   }
    						   return siteId;
    				     	}
    					},
    					dataFilter: ajaxDataFilter
    				},
					callback: {
						beforeClick: beforeClick,
						onClick : onTreeClick,
						onAsyncError : zTreeOnAsyncError,
						onAsyncSuccess: zTreeOnAsyncSuccess,
						onCheck : onCheck
					}
			},
			/**
			 * 获取分类树选定节点。
			 * @returns
			 */
			getSelectedNode : function(){
				// 获取zTree
		    	var _catgTree = categoryTree.getTree();
				var nodes = _catgTree.getSelectedNodes();
				if(0 < nodes.length){
					return nodes[0];
				}
			},
			getParentNode : function(){
				var nodeObj = categoryTree.getSelectedNode();
				if(nodeObj){
					return nodeObj.getParentNode();
				}
			},
			/**
			 * 获取分类树对象。
			 * @returns
			 */
			getTree : function(){
			   return $.fn.zTree.getZTreeObj(Constants.treeId);
			}
	};
	
	function showTree(e) {
		var treeOffset = e.data.obj.offset();
		$("#"+Constants.treeId).css({left:treeOffset.left + "px", top:treeOffset.top + e.data.obj.outerHeight() + "px"}).slideDown("fast");
		$("#"+Constants.treeContentDIV).css({left:treeOffset.left + "px","z-index":1000, top:treeOffset.top + e.data.obj.outerHeight() + "px"}).slideDown("fast");
		$("body").bind("mousedown", onBodyDown);
	}
	function onBodyDown(event) {
		if (!(event.target.id == Constants.$this.attr('id') || event.target.id == Constants.treeContentDIV || $(event.target).parents("#"+Constants.treeContentDIV).length>0)) {
			hideTree();
		}
	}
	function hideTree() {
		$("#"+Constants.treeContentDIV).fadeOut("fast");
		$("body").unbind("mousedown", onBodyDown);
	}
	
	function createTreeContentDIV(opt){
		
		var div = document.createElement("div");
		div.id = Constants.treeContentDIV;
		div.style.display = 'none';
		div.style.position = 'absolute';
		div.style.backgroundColor = opt.backgroundColor;
		div.style.overflow = 'auto';
		div.style.width = opt.width;
		div.style.height = opt.height;
		div.style.borderColor = 'black';
		div.style.borderWidth = '1px';
		div.style.borderStyle = 'solid';
		
		var ul = document.createElement('ul');
		ul.id = Constants.treeId;
		ul.className = 'ztree';
		
		div.appendChild(ul);
		
		Constants.$this.parent().append($(div));
		
	}
	
	function initTree(){
		categoryTree.settingNormal.async.url = Constants.url;
		// 树展现
    	$.fn.zTree.init($("#"+Constants.treeId), categoryTree.settingNormal);
	}
	
	$.fn.mcDropDown.p = {};
	
	
	$.fn.mcDropDown.initDropDown = function(opt){
		categoryTree.settingNormal.view.selectedMulti = opt.multi;
		categoryTree.settingNormal.check.enable = opt.multi;
		initTree();
	};

})(jQuery);