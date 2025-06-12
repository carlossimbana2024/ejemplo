package Metodos.Test;

import Metodos.clases.Alumno;

public class TestAlumno {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno  alu2 = new Alumno(35,"carlos","simbaña");
//HACEMOS USO DEL GET PARA TRAER LOS DATOS
        System.out.println("El id del alumno 2 es: "+alu2.getId());
        System.out.println("El nombre del alumno 2: "+alu2.getNombre());
        System.out.println("El apellidos del alumno 2 es: "+alu2.getApellido());
// USAMOS EL SET PARA COLOCAR LOS DATOS
        alu1.setId(1);
        alu1.setNombre("Mela");
        alu1.setApellido("Lore");
        System.out.println("---------------------------------");
        System.out.println("El id del alumno 1 es: "+alu1.getId());
        System.out.println("El nombre del alumno 1 es: "+alu1.getNombre());
        System.out.println("El apellidos del alumno 1 es: "+alu1.getApellido());
        System.out.println("---------------------------------");
 // USAMOS EL SET PARA MODIFICAR LOS DATOS(EN ESTE CASO DEL ALU2)
        alu2.setId(2);
        System.out.println("El id del alumno 2 es: "+alu2.getId());
        System.out.println("El nombre del alumno 2: "+alu2.getNombre());
        System.out.println("El apellidos del alumno 2 es: "+alu2.getApellido());

    }
}
