
package pe.edu.ulima.ejemploapp;

public class Parametros {
    public static final String USER_MONGODB = "evaluaciones";
    public static final String PWD_MONGODB = "evaluaciones";
    public static final String PORT_MONGODB = "63387";
    
    //public static final String URL_MONGODB = "ds163387.mlab.com:63387";
    public static final String URL_MONGODB = 
            String.format("mongodb://%s:%s@ds163387.mlab.com:%s/evaluaciones", 
                USER_MONGODB, PWD_MONGODB, PORT_MONGODB);
    
}
