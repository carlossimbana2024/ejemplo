package Herencia.clases;

public class Jefe extends Persona{
    int id_jefe;
    String Departamento_jefe;

    public Jefe() {
    }

    public Jefe(int id, String nombre, String domicilio, String apellido, String telefono, int id_jefe, String departamento_jefe) {
        super(id, nombre, domicilio, apellido, telefono);
        this.id_jefe = id_jefe;
        Departamento_jefe = departamento_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return Departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        Departamento_jefe = departamento_jefe;
    }
}
