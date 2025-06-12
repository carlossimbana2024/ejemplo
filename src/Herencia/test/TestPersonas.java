package Herencia.test;

import Herencia.clases.Consultor;
import Herencia.clases.Empleado;
import Herencia.clases.Jefe;
import Herencia.clases.Persona;

public class TestPersonas {
    public static void main(String[] args) {
        Empleado emple = new Empleado();
        emple.getNum_legajo();//METODO PROPIO
        emple.getNombre();//METODO HEREDADO

        Consultor consul = new Consultor();
        consul.getNombre(); //METODO HEREDAADO
        consul.getNombre_consultora();//METODO PROPIO

        System.out.println("###############polimorfismo########");
        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();
        // vector [4] = "HOLA";
        Persona perso = new Persona();
        
    }
}
