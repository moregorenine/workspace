$(document).ready(function() {
	$('.popup-with-form').magnificPopup({
		type: 'inline',
		preloader: false,
//		focus: '#system',
		
		// When elemened is focused, some mobile browsers in some cases zoom in
		// It looks not nice, so we disable it:
		callbacks: {
			beforeOpen: function() {
				if($(window).width() < 700) {
					this.st.focus = false;
				} else {
//					this.st.focus = '#system';
				}
			}
		}
	});

	$('#aLogin').bind('click', function() {
		var params = $.extend({}, doAjax_params_default);
		params['url'] = "/home/loginHtml";
		params['requestType'] = "GET";
		params['dataType'] = "html";
		params['successCallbackFunction'] = drawDivLogin;
		doAjax(params);
	});
	
	$('#aSignup').bind('click', function() {
		var params = $.extend({}, doAjax_params_default);
		params['url'] = "/home/signupHtml";
		params['requestType'] = "GET";
		params['dataType'] = "html";
		params['successCallbackFunction'] = drawDivSignup;
		doAjax(params);
	});
});

/**
 * Sign Up Jsp Page Layer Popup 세팅 
 * @param html
 * @returns
 */
function drawDivLogin(html) {
	$('#divLogin').html(html);
}

/**
 * Sign Up Jsp Page Layer Popup 세팅 
 * @param html
 * @returns
 */
function drawDivSignup(html) {
	$('#divSignup').html(html);
}