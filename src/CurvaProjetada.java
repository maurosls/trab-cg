
/**
 *
 * @author Mauro
 */


//VAI GERAR OS PONTOS DA PROJEÇÃO DA CURVA ORIGINAL
public class CurvaProjetada {
    
    Ponto curva1[],curva2[];
    Double z;
    public CurvaProjetada(Ponto curva1[], Ponto curva2[], Double z){
        for (int i = 0;i < curva1.length - 1;i++) {
            curva2[i].setX( (curva1[i].getX() + 0.353* z ) );
            curva2[i].setY( (curva1[i].getY() + 0.353* z ) );
        }           
    }
}
