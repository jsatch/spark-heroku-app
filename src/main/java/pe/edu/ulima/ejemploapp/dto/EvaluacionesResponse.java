
package pe.edu.ulima.ejemploapp.dto;

import pe.edu.ulima.ejemploapp.beans.Evaluacion;
import java.util.List;

public class EvaluacionesResponse {
    private List<Evaluacion> evaluaciones;

    public EvaluacionesResponse() {
    }

    public EvaluacionesResponse(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
}
