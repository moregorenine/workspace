//$(document).ready(function() {
//});
$('#btnRegUser').click(function() {
	var data = {};
	data.password = "test2";
	data.email = "test4";
	var params = $.extend({}, doAjax_params_default);
	params['url'] = "/user/create";
	params['requestType'] = POST;
	params['data'] = data;
	params['successCallbackFunction'] = cbSignUp;
	doAjax(params);
});