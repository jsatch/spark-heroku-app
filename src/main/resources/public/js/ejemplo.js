var obtenerEvaluaciones = function () {
    $.get("/evaluaciones", function (data) {
        var evaluaciones = JSON.parse(data).evaluaciones;
        
        evaluaciones.forEach(function(eva){
            var templateEva = '<div class="panel panel-default">'+
            '<div class="panel-body">'+
            '<div class="row">' +
              '<div class="col-md-3">'+
                '<h4>' + eva.nombre + '</h4>'+
                '<h5>' + eva.ciclo +  ' </h5>'+
              '</div>'+
              '<div class="col-md-9">'+
                '<div class="btn-group pull-right" role="group" aria-label="...">'+
                  '<button type="button" class="btn btn-default">'+
                    '<span class="glyphicon glyphicon-pencil" >'+
                    '</span>'+
                  '</button>'+
                  '<button type="button" class="btn btn-default">'+
                    '<span class="glyphicon glyphicon-ok" >'+
                    '</span>'+
                  '</button>'+
                  '<button type="button" class="btn btn-default">'+
                    '<span class="glyphicon glyphicon-th-list" >'+
                    '</span>'+
                  '</button>'+
                '</div>'+
              '</div>'+
            '</div>'+
          '</div>'+
        '</div>';
            $('#main').append(templateEva);
        });
        console.log(data);
    });
};

$(document).ready(function () {
    obtenerEvaluaciones();
    $('#butSalir').click(function (evt) {
        location.href = 'http://www.ulima.edu.pe';
    });
});
