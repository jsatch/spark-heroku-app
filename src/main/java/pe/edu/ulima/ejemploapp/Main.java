
package pe.edu.ulima.ejemploapp;

import com.google.gson.Gson;
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
            GestorEvaluaciones gestor = new GestorEvaluaciones();
            try{
                EvaluacionesResponse response = 
                        new EvaluacionesResponse(gestor.obtenerEvaluaciones());
                return new Gson().toJson(response);
            }catch(Exception e){
                return e.getMessage();
            }
            
        } );
    }
    
    
    
    static int obtenerPuertoHeroku() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
    
}
