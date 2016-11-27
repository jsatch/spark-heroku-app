
package pe.edu.ulima.ejemploapp;

import java.util.List;
import pe.edu.ulima.ejemploapp.beans.Evaluacion;
import pe.edu.ulima.ejemploapp.dao.EvaluacionDAO;

public class GestorEvaluaciones {
    public List<Evaluacion> obtenerEvaluaciones(){
        return new EvaluacionDAO().obtener();
    }
}
