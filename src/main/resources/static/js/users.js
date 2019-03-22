/**
 * Created by Tomasz Sokół on 2019-03-21.
 */
alert('dfdf');
$(document).ready(function() {
    $('#users').DataTable( {
        "processing": true,
        "serverSide": true,
        "ajax": "http://localhost:8080/users/all"
    } );
} );
