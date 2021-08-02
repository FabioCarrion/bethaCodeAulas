package interfacePacote;

public class FiguraGeometricaMain {
    public static void main(String [] args) {

        Quadrado quadrado;
        quadrado = new Quadrado(2);

        System.out.println("Area do " +  quadrado.getNomeFigura() +" : " + quadrado.getArea() );
        System.out.println("Perimetro do quadrado : " + quadrado.getPerimetro());

        Triangulo triangulo;
        triangulo = new Triangulo(5,5,5)
        System.out.println("Area do " +  triangulo.getNomeFigura() +" : " + triangulo.getArea() );

    }
}
