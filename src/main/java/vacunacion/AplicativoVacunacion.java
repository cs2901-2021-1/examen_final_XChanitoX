package vacunacion;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;


public class AplicativoVacunacion{
    private List<CentroVacunacion> centrosDeAlta = new ArrayList<>();
    private List<CentroVacunacion> centroDeBaja = new ArrayList<>();

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
        for (CentroVacunacion centro: centrosDeAlta){
            cantidadTotalVacunados = cantidadTotalVacunados + centro.cantidadVacunados();
        }
        porcentajeVacunados = (cantidadTotalVacunados / 22935533)*100;
        return porcentajeVacunados;
    }

    public double coberturaVacunacion(){
        double cantidadTotalVacunadosCompletamente = 0;
        double porcentajeVacunadosParciales = 0;

        for (CentroVacunacion centro: centrosDeAlta){
            cantidadTotalVacunadosCompletamente = cantidadTotalVacunadosCompletamente + centro.cantidadVacunadosCompletamente();
        }

        porcentajeVacunadosParciales = (cantidadTotalVacunadosCompletamente/22935533)*100;

        return porcentajeVacunadosParciales;
    }

    public int numeroCentros(){
        return centrosDeAlta.size() + centroDeBaja.size();
    }

    public int cantidadVacunadosParcialmente(){
        int cantidadTotalVacunadosParciales = 0;

        for (CentroVacunacion centro: centrosDeAlta){
            cantidadTotalVacunadosParciales = cantidadTotalVacunadosParciales + centro.cantidadVacunadosParciales();
        }

        return cantidadTotalVacunadosParciales;
    }

    public int cantidadVacunadosCompletamente(){
        int cantidadTotalVacunadosCompletamente = 0;

        for (CentroVacunacion centro: centrosDeAlta){
            cantidadTotalVacunadosCompletamente = cantidadTotalVacunadosCompletamente + centro.cantidadVacunadosCompletamente();
        }

        return cantidadTotalVacunadosCompletamente;
    }

    public void anhadirCentro(CentroVacunacion nuevoCentro){
        this.centroDeBaja.add(nuevoCentro);
    }

    public void darDeAlta(CentroVacunacion centro){
        this.centrosDeAlta.add(centro);
        this.centroDeBaja.remove(centro);
    }

    public void darDeBaja(CentroVacunacion centro){
        this.centroDeBaja.add(centro);
        this.centrosDeAlta.remove(centro);
    }

    public int numeroCentrosDeAlta(){
        return centrosDeAlta.size();
    }

    public void porcentajeVacunadosPorEdad(){
        int vacunadosA = 0;
        int vacunadosB = 0;
        int vacunadosC = 0;
        int vacunadosD = 0;
        int vacunadosE = 0;
        int vacunadosF = 0;

        for (CentroVacunacion centro: centrosDeAlta){
            vacunadosA += centro.cantidadVacunadosA();
            vacunadosB += centro.cantidadVacunadosB();
            vacunadosC += centro.cantidadVacunadosC();
            vacunadosD += centro.cantidadVacunadosD();
            vacunadosE += centro.cantidadVacunadosE();
            vacunadosF += centro.cantidadVacunadosF();
        }

        String cadena = vacunadosA+"";
        String mensajeA = "Porcentaje vacunados [18 - 39]: " + cadena;
        cadena = vacunadosB+"";
        String mensajeB = "Porcentaje vacunados [40 - 49]: " + cadena;
        cadena = vacunadosC+"";
        String mensajeC = "Porcentaje vacunados [50 - 59]: " + cadena;
        cadena = vacunadosD+"";
        String mensajeD = "Porcentaje vacunados [60 - 69]: " + cadena;
        cadena = vacunadosE+"";
        String mensajeE = "Porcentaje vacunados [70 - 79]: " + cadena;
        cadena = vacunadosF+"";
        String mensajeF = "Porcentaje vacunados de 80 a más: " + cadena;

        logger.info(mensajeA);
        logger.info(mensajeB);
        logger.info(mensajeC);
        logger.info(mensajeD);
        logger.info(mensajeE);
        logger.info(mensajeF);
    }

    public void clear(){
        centrosDeAlta.clear();
        centroDeBaja.clear();
    }
}
