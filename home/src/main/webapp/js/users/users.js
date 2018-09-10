$(document).ready(function() {
	$('#btnRegUser').click(function() {
		debugger;
		var data = {};
		data.password = "test2";
		data.email = "test4";
		var params = $.extend({}, doAjax_params_default);
		params['url'] = "/users";
		params['requestType'] = "POST";
		//params['data'] = data;
		params['successCallbackFunction'] = cll1;
		doAjax(params);
	});
});

function cll1() {
	alert(2);
}