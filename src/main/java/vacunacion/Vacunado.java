package vacunacion;

public class Vacunado {

    private int dosis;

    public Vacunado(){
        this.dosis = 1;
    }

    public void vacunarse(){
        dosis++;
    }

    public int cantidadDosis(){
        return dosis;
    }
}
