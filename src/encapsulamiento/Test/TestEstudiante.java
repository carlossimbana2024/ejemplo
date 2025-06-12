package encapsulamiento.Test;

import encapsulamiento.entidades.Estudiante;

import java.util.Scanner;

public class TestEstudiante {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante();
        String nombre;
        String apellido;
        int cedula;
        String carrera;
        int semestre;
        String foto;
        String jornada;
        String arrastre;

        Scanner nom = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre=nom.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido=nom.nextLine();
        System.out.println("Ingrese su cedula: ");
        cedula=nom.nextInt();
        Scanner cec = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su carrera: ");
        carrera=cec.nextLine();
        System.out.println("Ingrese el semestre en que se encuetre en numero: ");
        semestre=cec.nextInt();
        Scanner last = new Scanner(System.in);
        System.out.println("¿Tiene segunda matricula? (si/no) : ");
        arrastre=last.nextLine();


        est1.setNombre(nombre);
        est1.setApellido(apellido);
        est1.setCedula(cedula);
        est1.setCarrera(carrera);
        est1.setSemestre(semestre);
        est1.setArrastre(arrastre);


        System.out.println(est1);
    }
}