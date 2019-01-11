/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.lazy.IBk;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author Elísio Kavaimunwa
 */
public class Index extends javax.swing.JFrame {

    private Integer tempoEmprego;
    private String estadoResidencia = "";
    private Integer tempoResidencia;
    private String tempoEmpregoString = "";
    private String ocupacao = "";
    private Double saldoDevedor;
    private String saldoDevedorString = "";

    public Index() throws IOException {
        initComponents();
        Canvas canvas = new Canvas();
        this.jPanel1.add(canvas);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanelFundo1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultados = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelFundo = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxSaldoDevedor = new javax.swing.JComboBox<>();
        txtTempoEmprego = new javax.swing.JTextField();
        cbxOcupacao = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        cbxEstadoResidencia = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtTempoResidencia = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile Qualify");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dinheiroo.jpg"))); // NOI18N
        jButton13.setIconTextGap(1);
        jButton13.setSelected(true);

        jPanelFundo1.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFundo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 102))); // NOI18N

        txtAreaResultados.setColumns(20);
        txtAreaResultados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAreaResultados.setRows(5);
        txtAreaResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(txtAreaResultados);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/trash.gif"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundo1Layout = new javax.swing.GroupLayout(jPanelFundo1);
        jPanelFundo1.setLayout(jPanelFundo1Layout);
        jPanelFundo1Layout.setHorizontalGroup(
            jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addGroup(jPanelFundo1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelFundo1Layout.setVerticalGroup(
            jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Profile Qualify");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jPanelFundo.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 102))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Questionário", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 24), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Estado de Residencia: ");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setText("Saldo Devedor:");

        cbxSaldoDevedor.setBackground(new java.awt.Color(255, 255, 255));
        cbxSaldoDevedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "em kwanza...", "40.000 - 70.000", ">=  90.000", "150.000 - 250.000", ">= 500.000", " ", " " }));
        cbxSaldoDevedor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cbxSaldoDevedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSaldoDevedorActionPerformed(evt);
            }
        });

        txtTempoEmprego.setText("em ano");
        txtTempoEmprego.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtTempoEmprego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempoEmpregoActionPerformed(evt);
            }
        });

        cbxOcupacao.setBackground(new java.awt.Color(255, 255, 255));
        cbxOcupacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autonomo", "Publico", "Privado", "Desempregado" }));
        cbxOcupacao.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Ocupação:");

        cbxEstadoResidencia.setBackground(new java.awt.Color(255, 255, 255));
        cbxEstadoResidencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Financiada", "Alugada", "Própria" }));
        cbxEstadoResidencia.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel10.setText("Tempo de Residencia: ");

        txtTempoResidencia.setText("em ano");
        txtTempoResidencia.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtTempoResidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempoResidenciaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel11.setText("Tempo de Emprego: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxSaldoDevedor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTempoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEstadoResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTempoResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator6)
                .addContainerGap())
            .addComponent(jSeparator10)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTempoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstadoResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSaldoDevedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 24), new java.awt.Color(0, 0, 102))); // NOI18N

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Tick_Mark-128.png"))); // NOI18N
        jButton17.setText("Submeter");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.png"))); // NOI18N
        jMenu2.setToolTipText("Home");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu2.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
                jMenu2MenuDragMouseDragged(evt);
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/actividades.png"))); // NOI18N
        jMenuItem1.setText("Sistema");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator2);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equipa.png"))); // NOI18N
        jMenuItem2.setText("Equipa");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator3);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/orientador.jpg"))); // NOI18N
        jMenuItem3.setText("Orientador");
        jMenuItem3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator4);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jMenuItem4.setText("Sair");
        jMenuItem4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSaldoDevedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSaldoDevedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSaldoDevedorActionPerformed
    public void reconhecer() {
        //Inicio  Pegar os dados do formulario
        if (verificarCampos()) {
            tempoEmprego = Integer.parseInt(txtTempoEmprego.getText());
            estadoResidencia = cbxEstadoResidencia.getSelectedItem().toString();
            ocupacao = (String) cbxOcupacao.getSelectedItem();
            tempoResidencia = Integer.parseInt(txtTempoResidencia.getText());
            saldoDevedorString = (String) cbxSaldoDevedor.getSelectedItem();

            //Fim  Pegar os dados do formulario
            /* switch (saldoDevedorString) {
            case "40.000 - 70.000":
                saldoDevedor = 1.0;
                break;
            case ">=  90.000":
                saldoDevedor = 1.1;
                break;
            case "150.000 - 250.000":
                saldoDevedor = 1.2;
                break;
            case ">= 500.000":
                saldoDevedor = 1.3;
                break;

            default:
                break;
        }*/
            // Inicio Classificação
            ConverterUtils.DataSource ds = null;
            try {
                ds = new ConverterUtils.DataSource("src/reconhecimento/emprestimo.arff"); //crega a base de dados
            } catch (Exception ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
            Instances ins = null;
            try {
                ins = ds.getDataSet();
            } catch (Exception ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }

            //indico ao weka qual é o indice do atributo de classificaçao , neste caso será o 5 porque quer-se saber se pagou ou não o emprestimo
            ins.setClassIndex(5);
            //NaiveBayes nb = new NaiveBayes();
            IBk nb = new IBk();
            
            try {
                
                nb.buildClassifier(ins);
            } catch (Exception ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }

            Instance novo = new DenseInstance(6);
            novo.setDataset(ins);
            novo.setValue(0, tempoEmprego);
            // novo.setValue(1, ocupacao);
            novo.setValue(2, tempoResidencia);
            novo.setValue(3, estadoResidencia);
            // novo.setValue(4, saldoDevedorString);

            try {
                double probabilidade[] = nb.distributionForInstance(novo);
                probabilidade[0] = probabilidade[0] * 100;
                probabilidade[1] = probabilidade[1] * 100;
                float sim, nao;
                sim = (float) probabilidade[0];
                nao = (float) probabilidade[1];
                if (sim > nao) {
                    ImageIcon sucesso = new ImageIcon(Index.class.getResource("sucesso.jpg"));
                    JOptionPane.showMessageDialog(null, "Lhe foi beneficiado um crédito ", "Parabéns", 0, sucesso);
                }else{
                    ImageIcon fracasso = new ImageIcon(Index.class.getResource("fracasso.jpg"));
                    JOptionPane.showMessageDialog(null, "Não foi beneficiado um crédito ", "Parabéns", 0, fracasso);
               
                }
                txtAreaResultados.setText("Probabilidades: \nPagar o Emprestimo: " + sim + " %" + "\nNão pagar Emprestimo: " + nao + " %" + "\n\nTempo: " + tempoEmprego + "\nEstado: " + estadoResidencia + "\nOcupacao: " + ocupacao.toString() + "\nSaldo: " + saldoDevedor + "\nTempo Residencia: " + tempoResidencia);
            } catch (Exception e) {
                   
            }
            
            txtTempoEmprego.setBackground(Color.white);
            txtTempoResidencia.setBackground(Color.white);

            // Fim Classificação
        } else {
            JOptionPane.showMessageDialog(null, "Preenche os campos em falta...");
            txtTempoEmprego.setBackground(Color.red);
            txtTempoResidencia.setBackground(Color.red);
        }

    }

    public boolean verificarCampos() {
        if (txtTempoEmprego.getText().equals("em ano") || txtTempoResidencia.getText().equals("em ano")) {
            return false;
        } else {
            return true;
        }

    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        reconhecer();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jMenu2MenuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenu2MenuDragMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MenuDragMouseDragged

    private void txtTempoResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempoResidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempoResidenciaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        int sair = JOptionPane.showConfirmDialog(null, "Tem a certeza que deseja sair?", "Selecione uma Opção", WIDTH);
        if (sair != 1) {
            System.exit(0);
        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ImageIcon imageIcon = new ImageIcon(Index.class.getResource("nos.jpg"));

        JOptionPane.showMessageDialog(null, "Olá! Somos estudantes do ISPH (Instituto Superior Politécnico Da Huíla)\n"
                + "Pertencemos ao curso de Ciências da Computação, IVº Ano, 2018.\n"
                + "A Equipa é composta pelos seguintes elementos:\n"
                + "     Aisha Lubadika\n"
                + "     António Sebastião\n"
                + "     Bernardino Tchiteculo\n"
                + "     Elisio Kavaimunwa\n"
                + "     Isabel Augusto\n", "Sobre Nós", 0, imageIcon);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtAreaResultados.setText("");
        txtTempoEmprego.setBackground(Color.white);
        txtTempoResidencia.setBackground(Color.white);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTempoEmpregoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempoEmpregoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempoEmpregoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Index().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxEstadoResidencia;
    private javax.swing.JComboBox<String> cbxOcupacao;
    private javax.swing.JComboBox<String> cbxSaldoDevedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelFundo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea txtAreaResultados;
    private javax.swing.JTextField txtTempoEmprego;
    private javax.swing.JTextField txtTempoResidencia;
    // End of variables declaration//GEN-END:variables
}