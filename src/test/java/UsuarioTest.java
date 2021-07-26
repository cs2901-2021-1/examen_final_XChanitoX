import org.testng.Assert;
import org.testng.annotations.Test;
import vacunacion.AplicativoVacunacion;
import vacunacion.Usuario;

import java.io.IOException;
import java.util.logging.Logger;

public class UsuarioTest {

    @Test
    public void login(){
        var usuario1 = new Usuario("Pedro", "ordeP");
        Assert.assertTrue(usuario1.iniciarSesion());
    }

    @Test
    public void cerrarSesion(){
        var usuario1 = new Usuario("Pedro", "ordeP");
        Assert.assertTrue(usuario1.cerrarSesion());
    }

}
