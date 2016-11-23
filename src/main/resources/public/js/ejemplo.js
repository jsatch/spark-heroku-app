var obtenerEvaluaciones = function () {
    $.get("/evaluaciones", function (data) {
        console.log(data);
    });
};

$(document).ready(function () {
    obtenerEvaluaciones();
    $('#butSalir').click(function (evt) {
        location.href = 'http://www.ulima.edu.pe';
    });
});
