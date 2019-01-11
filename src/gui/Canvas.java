/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Elísio Kavaimunwa
 */
public class Canvas extends javax.swing.JPanel {

    //Carregar uma imagem
    BufferedImage imagemFundo;
    
    public Canvas() throws IOException {
        initComponents();
        try {
            this.imagemFundo = ImageIO.read(new File("C:\\Users\\Elísio Kavaimunwa\\Documents\\NetBeansProjects\\carqualify\\src\\imagens\\fundo_1.jpg"));
        } catch (IOException e) {
            System.out.println("Imagem não encontrada. \n" + e.getMessage());
        }
        
    }
    
    @Override
    protected void  paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagemFundo, 0, 0, null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
