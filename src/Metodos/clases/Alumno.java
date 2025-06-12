package Metodos.clases;

public class Alumno {
    int id;
    String nombre;
    String apellido;
//METODOS
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public void saberAprobado(double calificacion){
        if (calificacion>6){
            System.out.println("aprobo la materia");
        }
        else {
            System.out.println("no aprobé");
        }
    }

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
//GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
