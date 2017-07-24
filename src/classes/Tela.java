import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import static jdk.nashorn.internal.objects.NativeMath.max;
/**
 * @author Mauro
 */
public class Tela extends javax.swing.JFrame {
    Ponto p1 = new Ponto();
    Ponto p2 = new Ponto();  
    Ponto p3 = new Ponto();
    Ponto p4 = new Ponto();
    Ponto[] pontosIntermediarios, pontosIntermediariosProjetado;
    
    ArrayList<Ponto> pontosAmostra = new ArrayList<Ponto>();
    ArrayList<Ponto> pontosAmostraProjetado = new ArrayList<Ponto>();
    
    ArrayList<Ponto> NPontos = new ArrayList<Ponto>();
    
    ArrayList<Aresta> Arestas = new ArrayList<Aresta>();
    ArrayList<Ponto> Vertices = new ArrayList<Ponto>();
    ArrayList<Face> Faces = new ArrayList<Face>();
    
    //variáveis responsáveis por manter a escala definida pelo usuário
    double escalax = 1, escalay = 1;
    //tamanho padrão da tela
    double tam = 500;
    //controla qual dos botões o usuário apertou na hora de escolher a coordenada do ponto por clique
    int opt;
    //variáveis que pegam a altura e largura definida pelo usuário
    double altura = tam, largura = tam;
    
    int narestas, nvertices, nfaces;
    
    //quantidade de curvas
    int qtdCurvas = 0;
    
    double fator;
    int velocidade;
    //variável de controle do modo de pontos
    int modo = 1;
    
    int gerouCurva = 0;
    Boolean achou = false;

    double temp;
    //construtor
    public Tela() {
        //chama o método que inicializa os componentes gráficos
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jTextField1.setText("0.0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ponto 1");

        jLabel2.setText("Coordenadas dos pontos de controle(x e y):");

        jTextField2.setText("0.0");

        jLabel3.setText("Ponto 2");

        jLabel4.setText("Ponto 3");

        jLabel5.setText("Ponto 4");

        jTextField3.setText("0.0");

        jTextField4.setText("0.0");

        jTextField5.setText("0.0");

        jTextField6.setText("0.0");

        jTextField7.setText("0.0");

        jTextField8.setText("0.0");

        jButton1.setText("Desenhar retas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Definir dimensão da área (largura x altura) :");

        jTextField9.setText("400.0");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setText("400.0");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Gerar Catmull-Rom Spline");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("set p1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("set p2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("set p3");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("set p4");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Apagar retas");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Salvar últimos pontos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Carregar Ultimos Pontos");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel7.setText("Fator do Z:");

        jButton11.setText("Desenhar projeção");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Desenhar sólido");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel8.setText("Último ponto");

        jTextField11.setText("0.0");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton13.setText("4 pontos");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("N pontos");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel9.setText("Quantidade de pontos de ctrl:");

        jTextField12.setText("0.0");

        jButton15.setText("Nova Curva");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTextField13.setText("0.4");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jButton19.setText("Gerar estrutura baseada em arestas");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton16.setText("Desenhar arestas");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Checar Lei de Euler");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel10.setText("Trab 3 - parte 1:");

        jButton18.setText("Desenhar vértices");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton20.setText("Desenhar faces");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jTextField14.setText("50");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel11.setText("Velocidade do desenho(ms)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton19)
                                    .addComponent(jButton17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton18)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton13)
                                    .addComponent(jButton14))
                                .addGap(119, 119, 119))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                            .addComponent(jTextField4)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addGap(77, 77, 77)
                                .addComponent(jButton12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9)
                                    .addComponent(jButton1))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addComponent(jButton2)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9)
                                    .addComponent(jButton10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton11)
                                    .addComponent(jButton12)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton19)
                            .addComponent(jButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17)
                            .addComponent(jButton16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //Procedimento que pega as coordenadas pontos quando o usuário clica no painel
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Graphics gp = jPanel2.getGraphics();
        
        //esse switch controla qual das opções de ponto o usuário escolheu antes de clicar no painel
        if(modo == 0){
            switch (opt){
                case 1:               
                    p1.definirCoordenadas(evt.getX(), evt.getY()); 
                    jTextField1.setText(Double.toString(escalax*p1.getX()));
                    jTextField2.setText(Double.toString(escalay*p1.getY()));
                    gp.setColor(Color.black);
                    gp.drawOval((int)p1.getX(), evt.getY(), 4, 4);
                    opt = 0;
                    break;

                case 2:
                    p2.definirCoordenadas(evt.getX(), evt.getY());
                    jTextField3.setText(Double.toString(escalax*p2.getX()));
                    jTextField4.setText(Double.toString(escalay*p2.getY()));
                    gp.setColor(Color.red);
                    gp.drawOval((int)p2.getX(), evt.getY(), 4, 4);
                    opt = 0;
                    break;  
                case 3:
                    p3.definirCoordenadas(evt.getX(), evt.getY());
                    jTextField5.setText(Double.toString(escalax*p3.getX()));
                    jTextField6.setText(Double.toString(escalay*p3.getY()));
                    gp.setColor(Color.green);
                    gp.drawOval((int)p3.getX(), evt.getY(), 4, 4);
                    opt = 0;
                    break;    
                case 4:
                    p4.definirCoordenadas(evt.getX(), evt.getY());
                    jTextField7.setText(Double.toString(escalax*p4.getX()));
                    jTextField8.setText(Double.toString(escalay*p4.getY()));
                    gp.setColor(Color.blue);
                    gp.drawOval((int)p4.getX(), evt.getY(), 4, 4);
                    opt = 0;
                    break;
                default:
                    break;
            }
        }else {
            Ponto aux = new Ponto(evt.getX(),evt.getY());
            //aux.definirCoordenadas(evt.getX(),evt.getY());
            jTextField11.setText(Double.toString(escalax*aux.getX()));
            jTextField12.setText(Double.toString(escalay*(altura-aux.getY())));
            NPontos.add(aux);
            gp.drawOval((int)aux.getX(), evt.getY(), 4, 4);
        }
        
    }//GEN-LAST:event_jPanel2MouseClicked

    //Procedimento que vai desenhar as linhas ligando os pontos escolhidos pelo usuário
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Graphics gp = jPanel2.getGraphics();  
        if(modo ==0){    
            if(Double.parseDouble(jTextField1.getText()) < largura && Double.parseDouble(jTextField3.getText()) < largura && 
                    Double.parseDouble(jTextField5.getText()) < largura && Double.parseDouble(jTextField7.getText()) < largura &&
                    Double.parseDouble(jTextField2.getText()) < altura && Double.parseDouble(jTextField4.getText()) < altura &&
                    Double.parseDouble(jTextField6.getText()) < altura && Double.parseDouble(jTextField8.getText()) < altura){

            p1.definirCoordenadas(Double.parseDouble(jTextField1.getText())/escalax, Double.parseDouble(jTextField2.getText())/escalay);
            p2.definirCoordenadas(Double.parseDouble(jTextField3.getText())/escalax, Double.parseDouble(jTextField4.getText())/escalay);
            p3.definirCoordenadas(Double.parseDouble(jTextField5.getText())/escalax, Double.parseDouble(jTextField6.getText())/escalay);
            p4.definirCoordenadas(Double.parseDouble(jTextField7.getText())/escalax, Double.parseDouble(jTextField8.getText())/escalay);

                 
            gp.setColor(Color.black); 

            gp.drawLine((int)(p1.getX()),(int) (p1.getY()), (int)(p2.getX()), (int)(p2.getY()));

            gp.setColor(Color.red);       
            gp.drawLine((int)p2.getX(),(int) p2.getY(), (int)p3.getX(), (int)p3.getY());

            gp.setColor(Color.green);       
            gp.drawLine((int)p3.getX(), (int)p3.getY(),(int) p4.getX(),(int) p4.getY());

    //        gp.setColor(Color.blue);
    //        gp.drawLine((int)p4.getX(), (int)p4.getY(),(int) p1.getX(),(int) p1.getY());  
            }
            if(Double.parseDouble(jTextField1.getText()) > largura ){
                jTextField1.setText("0.0");
            }if(Double.parseDouble(jTextField3.getText()) > largura ){
                jTextField3.setText("0.0");
            }if(Double.parseDouble(jTextField5.getText()) > largura ){
                jTextField5.setText("0.0");
            }if(Double.parseDouble(jTextField7.getText()) > largura ){
                jTextField7.setText("0.0");
            }if(Double.parseDouble(jTextField2.getText()) > altura ){
                jTextField2.setText("0.0");
            }if(Double.parseDouble(jTextField4.getText()) > altura ){
                jTextField4.setText("0.0");
            }if(Double.parseDouble(jTextField6.getText()) > altura ){
                jTextField6.setText("0.0");
            }if(Double.parseDouble(jTextField8.getText()) > altura ){
                jTextField8.setText("0.0");
            }
        } else {
            gp.setColor(Color.blue);
            for(int i = 0 ; i < NPontos.size()-1; i++){
                      gp.drawLine((int)NPontos.get(i).getX(), (int)NPontos.get(i).getY(),
                              (int) NPontos.get(i+1).getX(),(int) NPontos.get(i+1).getY());
               }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Procedimento que vai desenhar a curva
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Graphics gp = jPanel2.getGraphics();
        if(modo==0){
            if(Double.parseDouble(jTextField1.getText()) < largura && Double.parseDouble(jTextField3.getText()) < largura && 
                    Double.parseDouble(jTextField5.getText()) < largura && Double.parseDouble(jTextField7.getText()) < largura &&
                    Double.parseDouble(jTextField2.getText()) < altura && Double.parseDouble(jTextField4.getText()) < altura &&
                    Double.parseDouble(jTextField6.getText()) < altura && Double.parseDouble(jTextField8.getText()) < altura){

                p1.definirCoordenadas(Double.parseDouble(jTextField1.getText())/escalax, Double.parseDouble(jTextField2.getText())/escalay);
                p2.definirCoordenadas(Double.parseDouble(jTextField3.getText())/escalax, Double.parseDouble(jTextField4.getText())/escalay);
                p3.definirCoordenadas(Double.parseDouble(jTextField5.getText())/escalax, Double.parseDouble(jTextField6.getText())/escalay);
                p4.definirCoordenadas(Double.parseDouble(jTextField7.getText())/escalax, Double.parseDouble(jTextField8.getText())/escalay);



                Ponto[] pontos = new Ponto[4];       
                pontos[0] = p1;
                pontos[1] = p2;
                pontos[2] = p3;
                pontos[3] = p4;

                //inicializo um vetor de Pontos e suas configurações são definidas no método gerarPontosIntermediários. 
                //escolhi 10000 pontos intermediários pra ficar mais suave
                pontosIntermediarios = CatmullRomSplineIntermediarios.gerarPontosIntermediarios(pontos, 1000);

                //varro o vetor de pontos e desenho linhas entre todos os pontos
                for (int i = 0;i < pontosIntermediarios.length - 2;i++) {
                    gp.drawLine((int)pontosIntermediarios[i].getX(), (int)pontosIntermediarios[i].getY(),
                           (int)pontosIntermediarios[i+1].getX(), (int)pontosIntermediarios[i+1].getY());           
                }
                qtdCurvas++;

            } 
            if(Double.parseDouble(jTextField1.getText()) > largura ){
                jTextField1.setText("0.0");
            }if(Double.parseDouble(jTextField3.getText()) > largura ){
                jTextField3.setText("0.0");
            }if(Double.parseDouble(jTextField5.getText()) > largura ){
                jTextField5.setText("0.0");
            }if(Double.parseDouble(jTextField7.getText()) > largura ){
                jTextField7.setText("0.0");
            }if(Double.parseDouble(jTextField2.getText()) > altura ){
                jTextField2.setText("0.0");
            }if(Double.parseDouble(jTextField4.getText()) > altura ){
                jTextField4.setText("0.0");
            }if(Double.parseDouble(jTextField6.getText()) > altura ){
                jTextField6.setText("0.0");
            }if(Double.parseDouble(jTextField8.getText()) > altura ){
                jTextField8.setText("0.0");
            }
        } else {
            
            pontosIntermediarios = CatmullRomSplineIntermediarios.gerarPontosIntermediariosN(NPontos, 1000);

                //varro o vetor de pontos e desenho linhas entre todos os pontos
            for (int i = 0;i < pontosIntermediarios.length-1;i++) {
                gp.drawLine((int)pontosIntermediarios[i].getX(), (int)pontosIntermediarios[i].getY(),
                        (int)pontosIntermediarios[i+1].getX(), (int)pontosIntermediarios[i+1].getY());           
                } 

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //faz um calculo com o tamanho de tela padrão e as escolhidas pelo usuário e gera as escalas
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        largura = Double.parseDouble(jTextField9.getText());
        altura = Double.parseDouble(jTextField10.getText());
        escalax = largura/tam;
        escalay = altura/tam; 
    }//GEN-LAST:event_jButton2ActionPerformed
      
    //procedimento que altera a variável opt, para que proximo clique no painel salve as coordenadas no ponto 1
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        opt = 1;
    }//GEN-LAST:event_jButton4ActionPerformed
    
    //apaga todas as linhas,curvas e pontos da tela
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
       NPontos.clear();
       jPanel2.repaint();
        
    }//GEN-LAST:event_jButton8MouseClicked
   
    //procedimento que altera a variável opt, para que proximo clique no painel salve as coordenadas no ponto 2
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        opt = 2;
    }//GEN-LAST:event_jButton5ActionPerformed
    
    //procedimento que altera a variável opt, para que proximo clique no painel salve as coordenadas no ponto 3
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        opt = 3;
    }//GEN-LAST:event_jButton6ActionPerformed
    
    //procedimento que altera a variável opt, para que proximo clique no painel salve as coordenadas no ponto 4
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        opt = 4;
    }//GEN-LAST:event_jButton7ActionPerformed
    
    //Salva num arquivo texto as últimas coordenadas selecionadas
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(modo == 0){       
            try {
                FileWriter arq = new FileWriter("arq.txt");
                arq.write("0"+" ");
                arq.write(Double.toString(p1.getX())+" "+(Double.toString(p1.getY()))+" ");
                arq.write("");
                arq.write(Double.toString(p2.getX())+" "+(Double.toString(p2.getY()))+" ");
                arq.write("");
                arq.write(Double.toString(p3.getX())+" "+(Double.toString(p3.getY()))+" ");
                arq.write("");
                arq.write(Double.toString(p4.getX())+" "+(Double.toString(p4.getY()))+" ");
                arq.write("");
                arq.write(Double.toString(escalax)+" "+(Double.toString(escalay))+" ");
                arq.close(); 
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            try {
                FileWriter arq = new FileWriter("arq.txt");
                arq.write("1"+" "+NPontos.size()+" ");
                for(int i = 0; i<NPontos.size();i++){
                    arq.write(Double.toString(NPontos.get(i).getX())+" "+(Double.toString(NPontos.get(i).getY()))+" ");
                    arq.write("");
                }
                arq.write(Double.toString(escalax)+" "+(Double.toString(escalay))+" ");
                
                arq.close(); 
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }          
    }//GEN-LAST:event_jButton9ActionPerformed
    
    //Procedimento que vai pegar do arquivo texto as coordenadas salvas e vai atribuir os valores aos pontos 
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            BufferedReader arq = new BufferedReader(new FileReader ("arq.txt"));
            try {
                String linha = arq.readLine();
                String [] pontosSalvos = linha.split(" ");
                if (Double.parseDouble(pontosSalvos[0]) == 0){
                    p1.definirCoordenadas(Double.parseDouble(pontosSalvos[0]), Double.parseDouble(pontosSalvos[1]));
                    p2.definirCoordenadas(Double.parseDouble(pontosSalvos[2]), Double.parseDouble(pontosSalvos[3]));
                    p3.definirCoordenadas(Double.parseDouble(pontosSalvos[4]), Double.parseDouble(pontosSalvos[5]));
                    p4.definirCoordenadas(Double.parseDouble(pontosSalvos[6]), Double.parseDouble(pontosSalvos[7]));
                    escalax = Double.parseDouble(pontosSalvos[8]);
                    escalay = Double.parseDouble(pontosSalvos[9]);
                    jTextField1.setText(Double.toString(escalax*p1.getX()));
                    jTextField2.setText(Double.toString(escalay*p1.getY()));
                    jTextField3.setText(Double.toString(escalax*p2.getX()));
                    jTextField4.setText(Double.toString(escalay*p2.getY()));
                    jTextField5.setText(Double.toString(escalax*p3.getX()));
                    jTextField6.setText(Double.toString(escalay*p3.getY()));
                    jTextField7.setText(Double.toString(escalax*p4.getX()));
                    jTextField8.setText(Double.toString(escalay*p4.getY()));
                    jTextField10.setText(Double.toString(escalay*tam));
                } else{
                    modo = 1;
                    int tam = Integer.parseInt(pontosSalvos[1]);
                    for (int i = 2; i < pontosSalvos.length-2; i=i+2) {
                        NPontos.add(new Ponto(Double.parseDouble(pontosSalvos[i]), Double.parseDouble(pontosSalvos[i+1])));
                    }
                    escalax = Double.parseDouble(pontosSalvos[pontosSalvos.length-2]);
                    escalay = Double.parseDouble(pontosSalvos[pontosSalvos.length-1]);
                }        
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Graphics gp = jPanel2.getGraphics();
        if(modo == 0){
            double z = CalculaZ(p1,p2,p3,p4);
            fator = Double.parseDouble(jTextField13.getText());
            Ponto[] pontos = new Ponto[4];       
            pontos[0] = new Ponto(p1.getX()  + 0.353* z*fator ,p1.getY() + 0.353* z*fator);
            pontos[1] = new Ponto(p2.getX()  + 0.353* z*fator ,p2.getY() + 0.353* z*fator);
            pontos[2] = new Ponto(p3.getX()  + 0.353* z*fator ,p3.getY() + 0.353* z*fator);
            pontos[3] = new Ponto(p4.getX()  + 0.353* z*fator ,p4.getY() + 0.353* z*fator);

            pontosIntermediariosProjetado = CatmullRomSplineIntermediarios.gerarPontosIntermediarios(pontos, 1000);          

            for (int i = 0;i < pontosIntermediariosProjetado.length - 2;i++) {
                gp.drawLine((int)pontosIntermediariosProjetado[i].getX(), (int)pontosIntermediariosProjetado[i].getY(), 
                           (int)pontosIntermediariosProjetado[i+1].getX(), (int)pontosIntermediariosProjetado[i+1].getY());           
            }
            
        } else{
            double z = CalculaZN(NPontos);
            fator = Double.parseDouble(jTextField13.getText());
            ArrayList<Ponto> NPontos2 = new ArrayList<Ponto>();
            for(int i = 0; i<NPontos.size();i++){
                NPontos2.add(new Ponto(NPontos.get(i).getX() + 0.353 * z*fator ,NPontos.get(i).getY() + 0.353 * z*fator));
            }
            
            pontosIntermediariosProjetado = CatmullRomSplineIntermediarios.gerarPontosIntermediariosN(NPontos2, 1000);          

            for (int i = 0;i < pontosIntermediariosProjetado.length - 1;i++) {
                gp.drawLine((int)pontosIntermediariosProjetado[i].getX(), (int)pontosIntermediariosProjetado[i].getY(), 
                           (int)pontosIntermediariosProjetado[i+1].getX(), (int)pontosIntermediariosProjetado[i+1].getY());           
            }

        }
        

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Graphics gp = jPanel2.getGraphics();
        for (int i = 0;i < pontosIntermediariosProjetado.length - 3;i++) {
            if(i%150==0)
            gp.drawLine((int)pontosIntermediariosProjetado[i].getX(), (int)pontosIntermediariosProjetado[i].getY(), 
                       (int)pontosIntermediarios[i].getX(), (int)pontosIntermediarios[i].getY());           
            }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        modo = 0;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        modo = 1;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jPanel2.repaint();
       NPontos.clear();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
 
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(modo ==0){
            p1.resetarPonto();
            p2.resetarPonto();
            p3.resetarPonto();
            p4.resetarPonto();
        } else{
            NPontos.clear();
            Arestas.clear();
            pontosAmostra.clear();
            pontosAmostraProjetado.clear();
            Vertices.clear();
            Faces.clear();
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        
        for (int i = 0;i < pontosIntermediarios.length;i++) {       
            if(i%250==0) pontosAmostra.add(pontosIntermediarios[i]);              
        }
        for (int i = 0;i < pontosIntermediariosProjetado.length;i++) {       
            if(i%250==0) pontosAmostraProjetado.add(pontosIntermediariosProjetado[i]);              
        }
        for(int i = 0; i<pontosAmostra.size();i++){
                Arestas.add(new Aresta(pontosAmostra.get(i), pontosAmostraProjetado.get(i)));
                if(i<pontosAmostra.size()-1){
                    Arestas.add(new Aresta(pontosAmostra.get(i),pontosAmostra.get(i+1)));
                    Arestas.add(new Aresta(pontosAmostraProjetado.get(i),pontosAmostraProjetado.get(i+1)));
                }
        }
        for(int i = 0; i<pontosAmostra.size()-1;i++){            
                if(pontosAmostra.get(i+1)!=null){                 
                   Ponto ax1 = new Ponto(pontosAmostra.get(i).getX(),pontosAmostra.get(i).getY());
                   Ponto ax2 = new Ponto(pontosAmostraProjetado.get(i).getX(),pontosAmostraProjetado.get(i).getY());
                   Ponto ax3 = new Ponto(pontosAmostra.get(i+1).getX(),pontosAmostra.get(i+1).getY());
                   Ponto ax4 = new Ponto(pontosAmostraProjetado.get(i+1).getX(), pontosAmostraProjetado.get(i+1).getY());
                   Faces.add(new Face(ax1,ax2,ax3,ax4));
                }
        }
        //BUG
//        for (int i = 0; i < Arestas.size()-1; i++) {
//            Ponto aux1 = Arestas.get(i).getP1();
//            for (int j = 0; j < Vertices.size()-1; j++) {
//               if(aux1.getX() == Vertices.get(j).getX() && aux1.getY() == Vertices.get(j).getY()) 
//                   achou = true;
//            }
//            if(achou == false) Vertices.add(aux1);
//            achou = false;
//            Ponto aux2 = Arestas.get(i).getP2();
//            for (int j = 0; j < Vertices.size()- 1; j++) {
//                if(aux2.getX() == Vertices.get(j).getX() && aux2.getY() == Vertices.get(j).getY()) 
//                   achou = true;
//            }
//            if(achou == false) Vertices.add(aux2);
//            achou = false;
//        }
        for (int i = 0; i < pontosAmostra.size()-3; i++) {
            Vertices.add(pontosAmostra.get(i));
            Vertices.add(pontosAmostraProjetado.get(i));
        }
        
                        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Graphics gp = jPanel2.getGraphics();
        velocidade = Integer.parseInt(jTextField14.getText());

        for (int i = 0; i < Arestas.size(); i++) {
            Ponto ponto1 = Arestas.get(i).getP1();
            Ponto ponto2 = Arestas.get(i).getP2();
            gp.drawLine((int)ponto1.getX(),(int)ponto1.getY(),(int)ponto2.getX(),(int)ponto2.getY());
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        velocidade = Integer.parseInt(jTextField14.getText());
        Graphics gp = jPanel2.getGraphics();        for (int i = 0; i < Vertices.size(); i++) {
            gp.drawOval((int)Vertices.get(i).getX(), (int)Vertices.get(i).getY(), 3, 3);
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        int qtdArestas = Faces.size() + Vertices.size() -1;
        //showMessageDialog(null, "Esse sólido contém "+Vertices.size()+" vértices, "+Arestas.size()+" arestas e "+Faces.size()+" faces.");
        showMessageDialog(null, "Esse sólido contém "+Vertices.size()+" vértices, "+qtdArestas+" arestas e, portanto,  "+Faces.size()+" faces.");


    }//GEN-LAST:event_jButton17ActionPerformed

    
    //DESENHA SÓLIDO A PARTIR DAS FACES
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Graphics gp = jPanel2.getGraphics();
        velocidade = Integer.parseInt(jTextField14.getText());
        
        for (int i = 0; i < Faces.size(); i++) {
            Polygon aux = new Polygon();
            Ponto aux1 = Faces.get(i).getP1();
            Ponto aux2 = Faces.get(i).getP2();
            Ponto aux3 = Faces.get(i).getP3();
            Ponto aux4 = Faces.get(i).getP4();
            aux.addPoint((int)aux1.getX(), (int)aux1.getY());     
            aux.addPoint((int)aux2.getX(), (int)aux2.getY());       
            aux.addPoint((int)aux4.getX(), (int)aux4.getY());
            aux.addPoint((int)aux3.getX(), (int)aux3.getY());
            gp.drawPolygon(aux);
            if(i%2==0) gp.setColor(Color.green);       
            if(i%3==0) gp.setColor(Color.yellow);           
            if(i%5==0) gp.setColor(Color.blue);           
            if(i%4==0) gp.setColor(Color.red); 
            gp.fillPolygon(aux);
            gp.setColor(Color.black);
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
        
            }
        });
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private double CalculaZ(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        double d1,d2,d3,d4,d5,d6;
        
        d1 = Math.sqrt(Math.pow((p1.getX() - p2.getX()),2 ) +
                               Math.pow((p1.getY() - p2.getY()),2 ) );     
        d2 = Math.sqrt(Math.pow((p1.getX() - p3.getX()),2 ) +
                               Math.pow((p1.getY() - p3.getY()),2 ) );
        d3 = Math.sqrt(Math.pow((p1.getX() - p4.getX()),2 ) +
                               Math.pow((p1.getY() - p4.getY()),2 ) );
        d4 = Math.sqrt(Math.pow((p2.getX() - p3.getX()),2 ) +
                               Math.pow((p2.getY() - p3.getY()),2 ) );
        d5 = Math.sqrt(Math.pow((p2.getX() - p4.getX()),2 ) +
                               Math.pow((p2.getY() - p4.getY()),2 ) );
        d6 = Math.sqrt(Math.pow((p3.getX() - p4.getX()),2 ) +
                               Math.pow((p3.getY() - p4.getY()),2 ) );
        
        return max(d1,d2,d3,d4,d5,d6); // AAAAAAAAAAAAAAAAAAAAAAAAAAA????
        
    }

    private double CalculaZN(ArrayList<Ponto> NPontos) {
        double z = 1;
        for (int i = 0; i < NPontos.size(); i++) {
            for (int j = i+1 ; j < NPontos.size(); j++) {
                double aux =  Math.sqrt(Math.pow(( NPontos.get(i).getX() - NPontos.get(j).getX()),2) +
                                       Math.pow((NPontos.get(i).getY() - NPontos.get(j).getY()),2)); 
                if(aux>z) z=aux;
            }
        }
        return z;
    }
    
}

