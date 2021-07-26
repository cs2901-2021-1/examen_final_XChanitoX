package vacunacion;

public class Vacunado {

    private int dosis;

    public Vacunado(){
        this.dosis = 1;
    }

    public void segundaDosis(){
        dosis = 2;
    }

    public int cantidadDosis(){
        return dosis;
    }
}
