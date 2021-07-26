package vacunacion;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class AplicativoVacunacion{
    private List<CentroVacunacion> centros = new ArrayList<>();

    static final Logger logger = Logger.getLogger(AplicativoVacunacion.class.getName());

    private static AplicativoVacunacion instance;
    private AplicativoVacunacion(){}

    public static AplicativoVacunacion getInstance(){
        if (instance == null)
            instance = new AplicativoVacunacion();
        return instance;
    }

    public double avanceVacunacion(){
        double cantidadTotalVacunados = 0;
        double porcentajeVacunados = 0;
        for (CentroVacunacion centro: centros){
            cantidadTotalVacunados = cantidadTotalVacunados + centro.cantidadVacunados();
        }
        porcentajeVacunados = (cantidadTotalVacunados / 22935533)*100;
        return porcentajeVacunados;
    }

    public double coberturaVacunacion(){
        double cantidadTotalVacunadosCompletamente = 0;
        double porcentajeVacunadosParciales = 0;

        for (CentroVacunacion centro: centros){
            cantidadTotalVacunadosCompletamente = cantidadTotalVacunadosCompletamente + centro.cantidadVacunadosCompletamente();
        }

        porcentajeVacunadosParciales = (cantidadTotalVacunadosCompletamente/22935533)*100;

        return porcentajeVacunadosParciales;
    }

    public int numeroCentros(){
        return centros.size();
    }

    public int cantidadVacunadosParcialmente(){
        int cantidadTotalVacunadosParciales = 0;

        for (CentroVacunacion centro: centros){
            cantidadTotalVacunadosParciales = cantidadTotalVacunadosParciales + centro.cantidadVacunadosParciales();
        }

        return cantidadTotalVacunadosParciales;
    }

    public int cantidadVacunadosCompletamente(){
        int cantidadTotalVacunadosCompletamente = 0;

        for (CentroVacunacion centro: centros){
            cantidadTotalVacunadosCompletamente = cantidadTotalVacunadosCompletamente + centro.cantidadVacunadosCompletamente();
        }

        return cantidadTotalVacunadosCompletamente;
    }

    public void darDeAlta(CentroVacunacion centro){
        this.centros.add(centro);
    }

    public void darDeBaja(CentroVacunacion centro){
        this.centros.remove(centro);
    }

    /*
    public static void main(String[] args){
        var entradaEscaner = new Scanner(System.in);

        logger.info("Ingrese su contraseña: ");

        var usuario = entradaEscaner.nextLine();
        var contrasenha = entradaEscaner.nextLine();

        Usuario usuario1 = new Usuario(usuario, contrasenha);

        if (usuario1.verificarUsuario()){

        }
    }*/

    public List<CentroVacunacion> obtenerCentros() {
        return centros;
    }

    public void clear(){
        centros.clear();
    }
}
