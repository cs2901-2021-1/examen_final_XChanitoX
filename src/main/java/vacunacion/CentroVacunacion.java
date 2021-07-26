package vacunacion;

import java.util.ArrayList;
import java.util.List;

public class CentroVacunacion {
    private List<Vacunado> listaVacunados = new ArrayList<>();
    private String nombre;

    public CentroVacunacion(String nombre){
        this.nombre = nombre;
    }


    public int cantidadVacunados(){
        return listaVacunados.size();
    }

    public int cantidadVacunadosParciales(){
        int cantidadVacunadosParciales = 0;
        for (Vacunado ciudadano : listaVacunados){
            if (ciudadano.cantidadDosis() == 1)
                cantidadVacunadosParciales++;
        }
        return cantidadVacunadosParciales;
    }

    public int cantidadVacunadosCompletamente(){
        int cantidadVacunadosCompletamente = 0;
        for (Vacunado ciudadano : listaVacunados){
            if (ciudadano.cantidadDosis() == 2)
                cantidadVacunadosCompletamente++;
        }
        return cantidadVacunadosCompletamente;
    }

    public String getNombreCentro(){
        return nombre;
    }

}
