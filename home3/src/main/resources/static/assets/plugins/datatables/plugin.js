require.config({
	shim : {
		'datatables' : [ 'jquery', 'core', 'datatables.net' ],
	},
	paths : {
		'datatables' : 'assets/plugins/datatables/datatables.min',
		'datatables.net' : 'assets/plugins/datatables/DataTables-1.10.18/js/jquery.dataTables.min',
	}
});