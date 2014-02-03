$(document).ready(function(){
	$(function() {
		$('#menu > ul').dropotron({ mode: 'fade', offsetY: -20, IEOffsetX: -40 });
	});
	
	$("#login").ajaxForm({
		type: 'post',
		dataType: 'json',
		success: function() {
			if (result.loggedIn) {
			    location.href="postLogin";
			}
		},
		error: function() {
			$(".error").remove();
            $("#login").prepend("<div class='error'>Login Failed. Username or Password is incorrect.</div>");
		},
	});
});