
package pe.edu.ulima.ejemploapp;

import com.google.gson.Gson;
import java.util.List;
import pe.edu.ulima.ejemploapp.beans.Evaluacion;
import pe.edu.ulima.ejemploapp.dao.EvaluacionDAO;
import pe.edu.ulima.ejemploapp.dto.EvaluacionesResponse;
import spark.ModelAndView;
import spark.Spark;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.stop;

public class Main {

    public static void main(String[] args) {
        port(obtenerPuertoHeroku());
        Spark.staticFiles.location("/public");
        
        get("/parar", (req, resp)->{
            stop();
            return "";
        });
        get("/", (req, resp)->{

            return new ModelAndView(null, "ejemplo.hbs");
        }, new HandlebarsTemplateEngine());
        
        get("/evaluaciones", (req, resp)->{
            EvaluacionesResponse response = 
                    new EvaluacionesResponse(new EvaluacionDAO().obtener());
            return new Gson().toJson(response);
        });
    }
    
    
    
    static int obtenerPuertoHeroku() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
    
}
