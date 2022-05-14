package figuras;

public class Circulo extends FormaGeometrica {
    public void calcularArea(float raio) {
        this.area = (float)(Math.PI*raio*raio);
    }
    
    public void calcularPerimetro(float raio) {
        this.perimetro = (float)(2*Math.PI*raio);
    }
}
