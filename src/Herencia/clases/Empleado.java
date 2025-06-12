package Herencia.clases;

public class Empleado extends Persona{
    //creamos atributos propios que no se repiten
    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }
//GENERAMOS EL CONSTRUCTOR PERO ESTA VEZ CON LOS ATRIBUTOS QUE HEREDAMOS DE LA SUPER CLASE(Persona)
    public Empleado(int id, String nombre, String domicilio, String apellido, String telefono, int num_legajo, String cargo, Double sueldo) {
        super(id, nombre, domicilio, apellido, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
//GENERAMOS GETTERS Y SETTERS

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
