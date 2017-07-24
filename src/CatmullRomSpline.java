/**
 * @author Mauro
 */

//Essa classe calcula a equação da curva independente do eixo
public class CatmullRomSpline {
    double p1_Val,p2_Val,p3_Val,p4_Val;
    public CatmullRomSpline(double p1, double p2, double p3, double p4){
        this.p1_Val = p1;
        this.p2_Val = p2;
        this.p3_Val = p3;
        this.p4_Val = p4;
    }
    
    
    
    //equação da curva
    public double calculaEq(double t) {
        return 0.5 * ((2 * p2_Val) + (p3_Val - p1_Val) * t + (2 * p1_Val - 5 * p2_Val + 4 * p3_Val - p4_Val) * t * t +
               (3 * p2_Val - p1_Val - 3 * p3_Val + p4_Val) * t * t * t);    
    }

    public double getP1_Val() {
        return p1_Val;
    }

    public void setP1_Val(float p1_Val) {
        this.p1_Val = p1_Val;
    }

    public double getP2_Val() {
        return p2_Val;
    }

    public void setP2_Val(float p2_Val) {
        this.p2_Val = p2_Val;
    }

    public double getP3_Val() {
        return p3_Val;
    }

    public void setP3_Val(float p3_Val) {
        this.p3_Val = p3_Val;
    }

    public double getP4_Val() {
        return p4_Val;
    }

    public void setP4_Val(float p4_Val) {
        this.p4_Val = p4_Val;
    }  

}
