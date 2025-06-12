package claabstracta.clases;

public abstract class Figura {
    protected double x;//pos en x
    protected double y;// pos en y

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();

}
