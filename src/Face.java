/**
 *
 * @author Mauro
 */
public class Face {
    private Aresta A1,A2,A3,A4;
    private Ponto P1,P2,P3,P4;
    
    public Face(Aresta A1, Aresta A2, Aresta A3, Aresta A4){
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
        this.A4 = A4;
    }
    
     public Face(Ponto A1, Ponto A2, Ponto A3, Ponto A4){
        this.P1 = A1;
        this.P2 = A2;
        this.P3 = A3;
        this.P4 = A4;
    }

    public Ponto getP1() {
        return P1;
    }

    public void setP1(Ponto P1) {
        this.P1 = P1;
    }

    public Ponto getP2() {
        return P2;
    }

    public void setP2(Ponto P2) {
        this.P2 = P2;
    }

    public Ponto getP3() {
        return P3;
    }

    public void setP3(Ponto P3) {
        this.P3 = P3;
    }

    public Ponto getP4() {
        return P4;
    }

    public void setP4(Ponto P4) {
        this.P4 = P4;
    }

    public Aresta getA1() {
        return A1;
    }

    public void setA1(Aresta A1) {
        this.A1 = A1;
    }

    public Aresta getA2() {
        return A2;
    }

    public void setA2(Aresta A2) {
        this.A2 = A2;
    }

    public Aresta getA3() {
        return A3;
    }

    public void setA3(Aresta A3) {
        this.A3 = A3;
    }

    public Aresta getA4() {
        return A4;
    }

    public void setA4(Aresta A4) {
        this.A4 = A4;
    }
  

}
