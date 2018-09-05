$(document).ready(function() {
});

var sidebar = {
	selectMenu : function(url){
		var params = $.extend({}, doAjax_params_default);
		params['url'] = url;
		params['requestType'] = "GET";
		params['dataType'] = "html";
		params['successCallbackFunction'] = layout.drawContent;
		doAjax(params);
	},
	selectMenuCallback : function(pHtml){
		alert(pHtml);
	}
}