import org.testng.Assert;
import org.testng.annotations.Test;
import vacunacion.AplicativoVacunacion;
import vacunacion.Usuario;
import vacunacion.Vacunado;

import java.io.IOException;
import java.util.logging.Logger;

public class VacunadoTest {
    @Test
    public void vacunarse(){
        var vacunado = new Vacunado();
        vacunado.segundaDosis();
        Assert.assertEquals(vacunado.cantidadDosis(), 2);
    }
}
