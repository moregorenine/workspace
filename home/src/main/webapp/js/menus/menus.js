$(document).ready(function() {
	
	/*버튼 Event 정의*/
	$("#formMenus").submit(function( event ) {
		event.preventDefault();
		var nodes = menusZtree.zTree.getNodes();
		var data = {};
		data.zTrees = nodes;
		var params = $.extend({}, doAjax_params_default);
		params['url'] = "/menus";
		params['requestType'] = "POST";
		params['data'] = JSON.stringify(data);
		params['successCallbackFunction'] = menu.submitCB;
		doAjax(params);
	});
	
	$("#menuNm").keyup(function() {
		menusZtree.zTree.getSelectedNodes()[0].name = $("#menuNm").val();
		menusZtree.zTree.updateNode(menusZtree.zTree.getSelectedNodes()[0]);
	});
	
	$("#url").keyup(function() {
		menusZtree.zTree.getSelectedNodes()[0].url = $("#url").val();
		menusZtree.zTree.updateNode(menusZtree.zTree.getSelectedNodes()[0]);
	});
	
	$("#useYn").change(function() {
		menusZtree.zTree.getSelectedNodes()[0].useYn = $("#useYn").val();
		menusZtree.zTree.updateNode(menusZtree.zTree.getSelectedNodes()[0]);
	});
});

var menu = {
		/**
		 * 메뉴 등록 submit 버튼 Callback Function
		 */
		submitCB : function(data) {
			//@Valid 검증 결과 error 존재할 경우
			//해당 error Message alert!
			//사용자가 setting한 successCallbackFunction은 미실행
			if(data.errorValidMsg.length > 0) {
				alert(data.errorValidMsg);
			} else {
				location.replace("/menus");
			}
		}
	}