
package pe.edu.ulima.ejemploapp.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import pe.edu.ulima.ejemploapp.Parametros;
import pe.edu.ulima.ejemploapp.beans.Evaluacion;

public class EvaluacionDAO {
    private final MongoClient mClient;
    public EvaluacionDAO(){
        mClient = new MongoClient(new MongoClientURI(Parametros.URL_MONGODB));
    }
    
    public List<Evaluacion> obtener(){
        MongoDatabase db = mClient.getDatabase("evaluaciones");
        MongoCollection<Evaluacion> colEval = 
                db.getCollection("evaluaciones", Evaluacion.class);
        
        List<Evaluacion> evaluaciones = 
                colEval.find().into(new ArrayList<Evaluacion>());
        return evaluaciones;
               
    }
}
