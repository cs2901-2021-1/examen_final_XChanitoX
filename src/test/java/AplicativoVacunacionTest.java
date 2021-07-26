import org.testng.Assert;
import org.testng.annotations.Test;
import vacunacion.AplicativoVacunacion;
import vacunacion.CentroVacunacion;

import java.io.IOException;
import java.util.logging.Logger;

public class AplicativoVacunacionTest {

    AplicativoVacunacion app = AplicativoVacunacion.getInstance();

    static final Logger logger = Logger.getLogger(AplicativoVacunacion.class.getName());

    @Test
    public void anhadirCentro(){
        app.clear();
        CentroVacunacion centro1 = new CentroVacunacion("Centro1");
        app.anhadirCentro(centro1);
        Assert.assertEquals(app.numeroCentros(), 1);
    }

    @Test
    public void darDeAlta(){
        app.clear();
        CentroVacunacion centro1 = new CentroVacunacion("Centro1");
        app.anhadirCentro(centro1);
        app.darDeAlta(centro1);
        Assert.assertEquals(app.numeroCentrosDeAlta(), 1);
    }

    @Test(invocationCount = 1, threadPoolSize = 50)
    public void respuestaReporte() throws IOException {
        app.clear();
        CentroVacunacion centro1 = new CentroVacunacion("Centro1");
        CentroVacunacion centro2 = new CentroVacunacion("Centro2");
        CentroVacunacion centro3 = new CentroVacunacion("Centro3");
        CentroVacunacion centro4 = new CentroVacunacion("Centro4");
        CentroVacunacion centro5 = new CentroVacunacion("Centro5");

        app.anhadirCentro(centro1);
        app.anhadirCentro(centro2);
        app.anhadirCentro(centro3);
        app.anhadirCentro(centro4);
        app.anhadirCentro(centro5);

        app.darDeAlta(centro1);
        app.darDeAlta(centro2);
        app.darDeAlta(centro3);
        app.darDeAlta(centro4);
        app.darDeAlta(centro5);
        app.porcentajeVacunadosPorEdad();

        app.darDeBaja(centro3);

        long beginTime = System.currentTimeMillis();
        long maxExecutionTime = 2000;

        //TEST
        app.avanceVacunacion();
        app.coberturaVacunacion();
        app.numeroCentros();
        app.cantidadVacunadosParcialmente();
        app.cantidadVacunadosCompletamente();

        long finalTime = System.currentTimeMillis();
        long executionTime = finalTime - beginTime;
        logger.info(String.valueOf(executionTime));
        Assert.assertTrue(executionTime < maxExecutionTime);
    }
}
