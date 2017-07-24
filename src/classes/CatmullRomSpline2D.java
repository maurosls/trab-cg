/**
 * @author Mauro
 */

//essa classe simplesmente vai criar dois objetos CatmullRomSpline, um pra cada eixo
public class CatmullRomSpline2D {
    
    private CatmullRomSpline splineX, splineY;

    public CatmullRomSpline2D(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {     
        splineX = new CatmullRomSpline(p1.getX(),p2.getX(),p3.getX(),p4.getX());      
        splineY = new CatmullRomSpline(p1.getY(), p2.getY(), p3.getY(), p4.getY());
    }
    

    public Ponto coordPontoIntermediario(double t) {
        return new Ponto(splineX.calculaEq(t), splineY.calculaEq(t));
    }

  
}
