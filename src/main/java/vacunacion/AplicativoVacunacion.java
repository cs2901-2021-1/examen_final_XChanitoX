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

    public void clear(){
        centrosDeAlta.clear();
        centroDeBaja.clear();
    }
}
