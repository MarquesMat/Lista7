package ex1;

public class Semana {
    private DiaDaSemana dia;
    public enum DiaDaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }
    
    public boolean ehDiaUtil() {
        return (this.getDia() != DiaDaSemana.DOMINGO && this.getDia() != DiaDaSemana.SABADO);
    }
    
    public DiaDaSemana getDia() {
        return this.dia;
    }
}
