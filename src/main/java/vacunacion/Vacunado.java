package vacunacion;

public class Vacunado {

    private int dosis;
    private int edad;

    public Vacunado(int edad){
        this.dosis = 1;
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void segundaDosis(){
        dosis = 2;
    }

    public int cantidadDosis(){
        return dosis;
    }
}
