
import java.util.ArrayList;

/**
 * @author Mauro
 */

//essa classe vai fazer os pontos intermediários(os pontos entre os pontos de controle)
public class CatmullRomSplineIntermediarios {
    
    public static Ponto[] gerarPontosIntermediarios(Ponto[] pontos, int qtdSubdivisoes) {
        Ponto[] pontosIntermediarios = new Ponto[pontos.length * qtdSubdivisoes];
        double passo = 1 / (double) qtdSubdivisoes;

        for (int i = 0; i < pontos.length-1; i++) {
            Ponto p1,p2,p3,p4;
            
            if (i==0){
                p1 = pontos[i];
            }else{
                p1 = pontos[i-1];
            }
            
            p2 = pontos[i];
            p3 = pontos[i+1];
            
            if(i+2 == pontos.length){
                p4 = pontos[i+1];
            } else {
                p4 = pontos[i+2];
            }
            
            CatmullRomSpline2D curva = new CatmullRomSpline2D(p1, p2, p3, p4);

            for (int j = 0; j <= qtdSubdivisoes; j++) {
                pontosIntermediarios[(i*qtdSubdivisoes)+j] = curva.coordPontoIntermediario(j * passo);
            }
        }
        return pontosIntermediarios;
    }
    public static Ponto[] gerarPontosIntermediariosN(ArrayList<Ponto> NPontos, int qtdSubdivisoes) {
        Ponto[] pontosIntermediarios = new Ponto[NPontos.size() * qtdSubdivisoes];
        double passo = 1 / (double) qtdSubdivisoes;

        for (int i = 0; i < NPontos.size() - 1; i++) {
            Ponto p1,p2,p3,p4;           
            if (i==0){
                p1 = NPontos.get(i);
            }else{
                p1 = NPontos.get(i-1);
            }            
            p2 = NPontos.get(i);
            p3 = NPontos.get(i+1);            
            if(i+2 == NPontos.size()){
                p4 = NPontos.get(i+1);
            } else {
                p4 = NPontos.get(i+2);
            }            
            CatmullRomSpline2D curva = new CatmullRomSpline2D(p1, p2, p3, p4);
            for (int j = 0; j <= qtdSubdivisoes; j++) {
                pontosIntermediarios[(i*qtdSubdivisoes)+j] = curva.coordPontoIntermediario(j * passo);
            }
        }
        return pontosIntermediarios;
    }
}
