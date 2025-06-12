package encapsulamiento.Test;
import encapsulamiento.entidades.TrianguloRectangulo;
public class TestFiguras {
    public static void main(String[] args) {
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo(3,2);
        TrianguloRectangulo triangulo2 = new TrianguloRectangulo(5,6);

        System.out.println(triangulo1);
        System.out.println("El perimetro del triangulo1 es: "+ triangulo1.calcularPerimetro());

        System.out.println(triangulo2);
        System.out.println("El perimetro del triangulo2 es: "+triangulo2.calcularPerimetro());
        System.out.println("este es un nuevo cambio");

    }
}
