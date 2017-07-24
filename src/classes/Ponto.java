/**
 * @author Mauro
 */
//classe pra criar os pontos
//engenharia de software é para os fracos
public class Ponto {
//    double x;
//    double y;
    private double x;
    private double y;
    private int tam;
    private double escalax, escalay;
    
    public Ponto(){    
    }
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void definirCoordenadas(double x, double y){
        this.x = x;
        this.tam = 500;
        this.y = tam - y;
    }
    public void resetarPonto(){
        this.x = 0;
        this.y = 0;
    }
   
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
   
}
