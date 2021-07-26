import org.testng.Assert;
import org.testng.annotations.Test;
import vacunacion.CentroVacunacion;
import vacunacion.Vacunado;

public class CentroVacunacionTest {
    @Test
    public void agregarVacunado(){
        var vacunado1 = new Vacunado();
        var centro = new CentroVacunacion("CentroA");
        centro.agregarVacunado(vacunado1);
        Assert.assertEquals(centro.cantidadVacunados(), 1);
    }

    @Test
    public void cantidadVacunadosParciales(){
        var vacunado1 = new Vacunado();
        var centro = new CentroVacunacion("CentroA");
        centro.agregarVacunado(vacunado1);
        Assert.assertEquals(centro.cantidadVacunadosParciales(), 1);
    }

    @Test
    public void cantidadVacunadosCompletamente(){
        var vacunado1 = new Vacunado();
        var centro = new CentroVacunacion("CentroA");
        centro.agregarVacunado(vacunado1);
        vacunado1.segundaDosis();
        Assert.assertEquals(centro.cantidadVacunadosCompletamente(), 1);
    }

    @Test
    public void getNombre(){
        var centro = new CentroVacunacion("CentroA");
        Assert.assertEquals(centro.getNombreCentro(), "CentroA");
    }

}
