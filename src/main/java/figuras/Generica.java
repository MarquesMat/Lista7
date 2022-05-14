package figuras;

public class Generica {
    private static float somaAreas = 0;
    
    public static <T extends FormaGeometrica> void somarAreas(T array[]) {
        for (T area : array) {
            somaAreas += area.getArea();
        }
    }
    
    public static float getSomaAreas() {
        return somaAreas;
    }
}
