
package pe.edu.ulima.ejemploapp;

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
    }
    
    static int obtenerPuertoHeroku() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
    
}
