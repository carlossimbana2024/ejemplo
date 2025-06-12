package Herencia.clases;

public class Persona {
    int id;
    String nombre;
    String apellido;
    String domicilio;
    String telefono;
//CONSTRUCTOR VACÍO
    public Persona() {
    }
//CONSTRUCTOR CON PAÁMETROS
    public Persona(int id, String nombre, String domicilio, String apellido, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.apellido = apellido;
        this.telefono = telefono;
    }
//GETTERS Y SETTERS


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
