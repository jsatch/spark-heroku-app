
package pe.edu.ulima.ejemploapp.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import pe.edu.ulima.ejemploapp.GestorEvaluaciones;

/**
 *
 * @author hernan
 */
public class TestEvaluaciones {
    
    public TestEvaluaciones() {
    }
    
    @Test
    public void testListarEvaluaciones(){
        GestorEvaluaciones gestor = new GestorEvaluaciones();
        assertTrue(gestor.obtenerEvaluaciones().size() == 2);
    }
    
}
