$(document).ready(function() {
	fnInitDivSignup();
});

/**
 * Sign Up Jsp Page 조회
 * @returns
 */
function fnInitDivSignup() {
	var params = $.extend({}, doAjax_params_default);
	params['url'] = "/users/signup";
	params['requestType'] = "GET";
	params['dataType'] = "html";
	params['successCallbackFunction'] = fnInitDivSignupCallback;
	doAjax(params);
}

/**
 * Sign Up Jsp Page Layer Popup 세팅 
 * @param html
 * @returns
 */
function fnInitDivSignupCallback(html) {
	$('#divSignup').html(html);
	
	$('.popup-with-form').magnificPopup({
		type: 'inline',
		preloader: false,
		focus: '#name',
		
		// When elemened is focused, some mobile browsers in some cases zoom in
		// It looks not nice, so we disable it:
		callbacks: {
			beforeOpen: function() {
				if($(window).width() < 700) {
					this.st.focus = false;
				} else {
					this.st.focus = '#name';
				}
			}
		}
	});
}