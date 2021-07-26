package vacunacion;

public class Usuario {
    private String nombre;
    private String contrasenha;

    public Usuario(String nombre, String contrasenha){
        this.nombre = nombre;
        this.contrasenha = contrasenha;
    }

    public boolean iniciarSesion(){
        StringBuilder builder = new StringBuilder(contrasenha);
        contrasenha = builder.reverse().toString();

        return contrasenha.equals(nombre);
    }

    public boolean cerrarSesion(){
        return true;
    }

}
