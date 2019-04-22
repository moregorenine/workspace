$(document).ready(function() {
	require([ 'datatables', 'jquery' ], function(datatable, $) {
		$('.datatable').DataTable({
			buttons : [ 'excel', 'pdf' ]
		});
	});
});