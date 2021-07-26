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

    public void agregarVacunado(Vacunado vacunado){
        listaVacunados.add(vacunado);
    }

    public int cantidadVacunadosParciales(){
        int cantidadVacunadosParciales = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.cantidadDosis() == 1)
                cantidadVacunadosParciales++;
        }
        return cantidadVacunadosParciales;
    }

    public int cantidadVacunadosCompletamente(){
        int cantidadVacunadosCompletamente = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.cantidadDosis() == 2)
                cantidadVacunadosCompletamente++;
        }
        return cantidadVacunadosCompletamente;
    }

    public int cantidadVacunadosA(){
        int cantidadVacuandos = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.getEdad() >= 18 && vacunado.getEdad() <= 39){
                cantidadVacuandos++;
            }
        }
        return cantidadVacuandos;
    }

    public int cantidadVacunadosB(){
        int cantidadVacuandos = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.getEdad() >= 40 && vacunado.getEdad() <= 49){
                cantidadVacuandos++;
            }
        }
        return cantidadVacuandos;
    }

    public int cantidadVacunadosC(){
        int cantidadVacuandos = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.getEdad() >= 50 && vacunado.getEdad() <= 59){
                cantidadVacuandos++;
            }
        }
        return cantidadVacuandos;
    }

    public int cantidadVacunadosD(){
        int cantidadVacuandos = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.getEdad() >= 60 && vacunado.getEdad() <= 69){
                cantidadVacuandos++;
            }
        }
        return cantidadVacuandos;
    }

    public int cantidadVacunadosE(){
        int cantidadVacuandos = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.getEdad() >= 70 && vacunado.getEdad() <= 79){
                cantidadVacuandos++;
            }
        }
        return cantidadVacuandos;
    }

    public int cantidadVacunadosF(){
        int cantidadVacuandos = 0;
        for (Vacunado vacunado : listaVacunados){
            if (vacunado.getEdad() >= 80){
                cantidadVacuandos++;
            }
        }
        return cantidadVacuandos;
    }

    public String getNombreCentro(){
        return nombre;
    }

}
