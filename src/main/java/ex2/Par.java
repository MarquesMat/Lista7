package ex2;

public class Par<F, S > {
    private F first;
    private S second;
    
    public void setF(F elem) {
        this.first = elem;
    }
    
    public F getF() {
        return this.first;
    }
    
    public void setS(S elem) {
        this.second = elem;
    }
    
    public S getS() {
        return this.second;
    }
}
