package Encapsulamiento2.test;

import Encapsulamiento2.clases.Alumno;

public class TestAlumno {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(20, "Karen", "Correa");

        System.out.println("Edad: "+ alu2.getEdad());
        System.out.println("Nombre: "+ alu2.getNombre());
        System.out.println("Apellido: "+alu2.getApellido());
    }
}
