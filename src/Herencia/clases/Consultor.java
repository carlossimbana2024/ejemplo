package Herencia.clases;

public class Consultor extends Persona{
    String nombre_consultora;
    int num_consultora;

    public Consultor() {
    }

    public Consultor(String nombre_consultora, int num_consultora) {
        this.nombre_consultora = nombre_consultora;
        this.num_consultora = num_consultora;
    }
//CONSTRUCTOR CON PARÁMETROS HEREDADOS
    public Consultor(int id, String nombre, String domicilio, String apellido, String telefono, String nombre_consultora, int num_consultora) {
        super(id, nombre, domicilio, apellido, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultora = num_consultora;
    }
//GETTERS Y SETTERS
    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultora() {
        return num_consultora;
    }

    public void setNum_consultora(int num_consultora) {
        this.num_consultora = num_consultora;
    }
}
