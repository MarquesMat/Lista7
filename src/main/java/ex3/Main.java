package ex3;

import figuras.*;

public class Main {
    public static void imprimirFiguras(FormaGeometrica forma) {
        System.out.println("AREA: "+forma.getArea());
        System.out.println("PERIMETRO: "+forma.getPerimetro());
    }
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();
        Quadrado quadrado = new Quadrado();
        
        FormaGeometrica vet1[] = {circulo, triangulo}, vet2[] = {retangulo, quadrado};
        
        circulo.calcularArea(10);
        circulo.calcularPerimetro(10);
        triangulo.calcularArea(3.8f, 4);
        triangulo.calcularPerimetro(3.8f, 4, 6.2f);
        retangulo.calcularArea(10, 12.1f);
        retangulo.calcularPerimetro(10, 12.1f);
        quadrado.calcularArea(1.5f);
        quadrado.calcularPerimetro(1.5f);
        
        Generica.somarAreas(vet1);
        Generica.somarAreas(vet2);
        
        System.out.println("CIRCULO");
        imprimirFiguras(circulo);
        System.out.println("\nTRIANGULO");
        imprimirFiguras(triangulo);
        System.out.println("\nRETANGULO");
        imprimirFiguras(retangulo);
        System.out.println("\nQUADRADO");
        imprimirFiguras(quadrado);
        System.out.println("\nSOMA DAS AREAS: "+Generica.getSomaAreas());
    }
}
