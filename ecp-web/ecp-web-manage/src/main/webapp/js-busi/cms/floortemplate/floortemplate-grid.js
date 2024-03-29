$(function(){
	floortemplate_grid.init();
});

var floortemplate_grid = {
	init : function(){//初始化
		//初始化查询条件，回填值
		SearchObj.initSearchParams({paramsId:"searchParams",formId:"searchForm"});
		
		//初始化列表
		var params = ebcForm.formParams($("#searchForm"));
		$("#dataGridTable").initDT({
	        'pTableTools' : false,
	        'pSingleCheckClean' : false,
	        'pCheckColumn' : false, //是否显示单选/复选框的列
	        'pCheck' : "multi",
	        'params' : params,
	        "sAjaxSource": $webroot + 'floortemplate/gridlist',
	        //指定列数据位置
	        "aoColumns": [
	        	{ "mData": "id", "sTitle":"ID","sWidth":"40px","bSortable":false},
				{ "mData": "templateName", "sTitle":"楼层模板名称","bSortable":false},
				{ "mData": "templateNo", "sTitle":"楼层模板编码","bSortable":false},
				{ "mData": "vfsUrl", "sTitle":"示例图","sWidth":"300px","bSortable":false,"mRender": function(data,type,row){
					return "<img src='"+data+"' stlyle='max-width:300px;max-height:50px;'>";
				}},
				{ "mData": "statusZH", "bVisible":true,"sTitle":"状态","sWidth":"80px","bSortable":false},
				{ "mData": "floorPlaceNum", "bVisible":true,"sTitle":"内容位置个数","sWidth":"100px","bSortable":false},
				{ "mData": "sortNo", "sTitle":"排序","sWidth":"80px","bSortable":false},
				{"targets": -1,"mData": "id","sTitle":"操作","sWidth":"180px","bSortable":false,"sClass": "left",
					"mRender": function(data,type,row){
						if(row.status == "0"){//无效
							return "<a href='javascript:void(0)' onclick='floortemplate_grid.showByID("+data+")'>查看</a> | <a href='javascript:void(0)' onclick='floortemplate_grid.changeStatus("+data+",\"1\")'>发布</a> | <a href='javascript:void(0)' onclick='floortemplate_grid.edit("+data+")'>编辑</a> | <a href='javascript:void(0)' onclick='floortemplate_grid.deleteByID("+data+")'>使失效</a>";
						}else if(row.status == "1"){//有效
							return "<a href='javascript:void(0)' onclick='floortemplate_grid.showByID("+data+")'>查看</a> | <a href='javascript:void(0)' onclick='floortemplate_grid.changeStatus("+data+",\"0\")'>撤消</a>";
						}else{//使失效
							return "<a href='javascript:void(0)' onclick='floortemplate_grid.showByID("+data+")'>查看</a>";
						}
					}
				}
	        ],
	        "eDbClick" : function(){
	        	//edit();
	        }
		});
		//绑定查询按钮
		$('#btnFormSearch').click(function(){
			if(!$("#searchForm").valid()) return false;
			var p = ebcForm.formParams($("#searchForm"));
			$('#dataGridTable').gridSearch(p);
		});
		//绑定重置按钮
		$('#btnFormReset').click(function(){
			ebcForm.resetForm('#searchForm');
		});
		//绑定添加按钮
		$('#btn_code_add').click(function(){
			eNav.setSubPageText('新增楼层模板');
			var searchParams = SearchObj.getFormParam($("#searchForm"));
			var params = {
				"searchParams":searchParams
			}
			SearchObj.openPage({
				"url" : $webroot+'floortemplate/add',
				"params" : params,
				"method" :"post"
			});
		});
		//绑定编辑按钮
		$('#btn_code_edit').click(function(){
			floortemplate_grid.edit();
		});
		//绑定使失效按钮
		$('#btn_code_del').click(function(){
			floortemplate_grid.deleteBatch();
		});
		//绑定生效按钮
		$('#btn_code_up').click(function(){
			floortemplate_grid.changeStatusBatch("1");
		});
		//绑定失效按钮
		$('#btn_code_down').click(function(){
			floortemplate_grid.changeStatusBatch("0");
		});
		//绑定批量使失效按钮
		$('#btn_code_batch_del').click(function(){
			floortemplate_grid.deleteBatch();
		});
	},
	edit : function(id){   //编辑
		var param = {
				'id':id
		};
		$.eAjax({
			url : $webroot+'floortemplate/isexistfloor',
			type : "POST",
			data : param,
			datatype:'json',
			beforeSend:function(){
				$.gridLoading({"message":"正在加载中...."});
				eNav.setSubPageText('编辑楼层模板');
			},
			success : function(returnInfo) {
				if(returnInfo.resultFlag != "ok"){
					eDialog.alert('该模板已被使用，不允许编辑！');
					$.gridUnLoading();
					return ;
				}else{
					var searchParams = SearchObj.getFormParam($("#searchForm"));
					var params = {
						"id":id,
						"searchParams":searchParams
					}
					SearchObj.openPage({
						"url" : $webroot+'floortemplate/edit',
						"params" : params,
						"method" :"post"
					});
				}
			},error : function(e,xhr,opt){
				eDialog.error("出现异常!");
				$.gridUnLoading();
			},complete:function(){
				$.gridUnLoading();
			}
		});
	},
	deleteByID : function(id){   //使失效
		$.eAjax({
			url : $webroot+'floortemplate/isexistfloor',
			type : "POST",
			data : {'id':id},
			datatype:'json',
			beforeSend:function(){
				$.gridLoading({"message":"正在加载中...."});
			},
			success : function(returnInfo) {
				if(returnInfo.resultFlag != "ok"){
					eDialog.alert('该模板已被使用，不允许失效！');
					$.gridUnLoading();
					return ;
				}else{
					eDialog.confirm("您确认将该记录失效吗？", {
						buttons : [{
							caption : '确认',
							callback : function(){
								$.eAjax({
									url : $webroot + 'floortemplate/delete',
									type : "POST",
									data : {'ids':id},
									datatype:'json',
									success : function(returnInfo) {
										if(returnInfo.resultFlag=='ok'){
											eDialog.success('失效成功！'); 
											$('#dataGridTable').gridReload();
										}
									}
								});
							}
						},{
							caption : '取消',
							callback : $.noop
						}]
					});
				}
			},error : function(e,xhr,opt){
				eDialog.error("出现异常!");
				$.gridUnLoading();
			},complete:function(){
				$.gridUnLoading();
			}
		});
	},
	deleteBatch : function(){   //批量使失效
		var ids = $('#dataGridTable').getCheckIds();
		if(!ids || ids.length==0){
			eDialog.alert('请选择至少选择一个项目进行操作！');
			return ;
		}
		var param = {
				'ids':ids.join(",")
		};
		eDialog.confirm("您确认使失效该记录吗？", {
			buttons : [{
				caption : '确认',
				callback : function(){
					$.eAjax({
						url : $webroot + 'floortemplate/delete',
						type : "POST",
						data : param,
						datatype:'json',
						beforeSend:function(){
							$.gridLoading({"message":"正在加载中...."});
						},
						success : function(returnInfo) {
							if(returnInfo.resultFlag=='ok'){
								eDialog.success('使失效成功！'); 
								$('#dataGridTable').gridReload();
							}
						},error : function(e,xhr,opt){
							eDialog.error("出现异常!");
							$.gridUnLoading();
						},complete:function(){
							$.gridUnLoading();
						}
					});
				}
			},{
				caption : '取消',
				callback : $.noop
			}]
		});
	},
	changeStatus : function(id,status){ //生效、失效
		
		if(status == "0"){
			$.eAjax({
				url : $webroot+'floortemplate/isexistfloor',
				type : "POST",
				data : {'id':id},
				datatype:'json',
				beforeSend:function(){
					$.gridLoading({"message":"正在加载中...."});
				},
				success : function(returnInfo) {
					if(returnInfo.resultFlag != "ok"){
						eDialog.alert('该模板已被使用，不允许撤消！');
						$.gridUnLoading();
						return ;
					}else{
						eDialog.confirm("您确认撤消该记录吗？", {
							buttons : [{
								caption : '确认',
								callback : function(){
									$.eAjax({
										url : $webroot + "floortemplate/changestatus",
										type : "POST",
										data : param = {
												'ids':id,
												'status':status
										},
										datatype:'json',
										success : function(returnInfo) {
											if(returnInfo.resultFlag=='ok'){
												var text = "发布成功！";
												if(status == "0"){
													text = "撤销成功！";
												}else{
													text = "发布成功！";
												}
												eDialog.success(text); 
												$('#dataGridTable').gridReload();
											}
										}
									});
								}
							},{
								caption : '取消',
								callback : $.noop
							}]
						});
					}
				},error : function(e,xhr,opt){
					eDialog.error("出现异常!");
					$.gridUnLoading();
				},complete:function(){
					$.gridUnLoading();
				}
			});
		}else{
			$.eAjax({
				url : $webroot + "floortemplate/changestatus",
				type : "POST",
				data : {
						'ids':id,
						'status':status
				},
				datatype:'json',
				beforeSend:function(){
					$.gridLoading({"message":"正在加载中...."});
				},
				success : function(returnInfo) {
					if(returnInfo.resultFlag=='ok'){
						var text = "发布成功！";
						if(status == "0"){
							text = "撤销成功！";
						}else{
							text = "发布成功！";
						}
						eDialog.success(text); 
						$('#dataGridTable').gridReload();
					}
				},error : function(e,xhr,opt){
					eDialog.error("出现异常!");
					$.gridUnLoading();
				},complete:function(){
					$.gridUnLoading();
				}
			});
		}
	},
	changeStatusBatch : function(status){ //批量生效、失效 
		var ids = $('#dataGridTable').getCheckIds();
		if(!ids || ids.length==0){
			eDialog.alert('请选择至少选择一条记录进行操作！');
			return ;
		}
		var param = {
				'ids':ids.join(","),
				'status':status
		};
		$.eAjax({
			url : $webroot + "floortemplate/changestatus",
			type : "POST",
			data : param,
			datatype:'json',
			beforeSend:function(){
				$.gridLoading({"message":"正在加载中...."});
			},
			success : function(returnInfo) {
				if(returnInfo.resultFlag=='ok'){
					var text = "发布成功！";
					if(status == "0"){
						text = "撤销成功！";
					}else{
						text = "发布成功！";
					}
					eDialog.success(text); 
					$('#dataGridTable').gridReload();
				}
			},error : function(e,xhr,opt){
				eDialog.error("出现异常!");
				$.gridUnLoading();
			},complete:function(){
				$.gridUnLoading();
			}
		});
	},
	//查看详情
	showByID : function (id) {
		eNav.setSubPageText('查看楼层模板');
		var searchParams = SearchObj.getFormParam($("#searchForm"));
		var params = {
			"id":id,
			"searchParams":searchParams
		}
		SearchObj.openPage({
			"url" : $webroot+'floortemplate/view',
			"params" : params,
			"method" :"post"
		});
	}
};
