/**
 * Defines javaScript functions required by support console web app
 */

//jQuery plugin to prevent double submission of forms
jQuery.fn.preventDoubleSubmission = function() {
	$(this).on('submit', function(e){
		var $form = $(this);
		if ($form.data('submitted') === true) {
			// Previously submitted - don't submit again
			e.preventDefault();
			debug_log('prevented');
		} else {
			// Mark it so that the next submit can be ignored
			$form.data('submitted', true);
			debug_log('submited');
		}
	});
	// Keep chainability
	return this;
}


