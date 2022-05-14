package figuras;

public class Retangulo extends FormaGeometrica {
    public void calcularArea(float lado1, float lado2) {
        this.area = (lado1*lado2);
    }
    
    public void calcularPerimetro(float lado1, float lado2) {
        this.perimetro = (2*lado1+2*lado2 );
    }
}
