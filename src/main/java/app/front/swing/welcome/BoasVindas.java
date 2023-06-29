/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.front.swing.welcome;

import app.backend.app.leitor.LeitorPlanoUsuario;
import app.backend.app.utils.PrimeiraLetraMaiuscula;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo.felix
 */
public class BoasVindas extends javax.swing.JPanel implements BoasVindasModel{

    private LeitorPlanoUsuario leitor;
    
    private String plano;
    
    public BoasVindas(String usuario) {
        initComponents();
        
        this.leitor = new LeitorPlanoUsuario(new File ("C:\\Users\\gustavo.felix\\Downloads\\planoFindLog.csv"));
        PrimeiraLetraMaiuscula letraMaiuscula = new PrimeiraLetraMaiuscula();
        
        try {
            this.plano = leitor.verificaPlanoUsuario(usuario);
        } catch (IOException ex) {
            Logger.getLogger(BoasVindas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boasVindas.setText("Boas Vindas, " + letraMaiuscula.retornaPrimeiraLetraMaiuscula(usuario + "!"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boasVindas = new javax.swing.JLabel();
        produtos = new app.front.swing.utils.Botao();
        assinatura = new app.front.swing.utils.Botao();
        botao1 = new app.front.swing.utils.Botao();

        setBackground(new java.awt.Color(255, 255, 255));

        boasVindas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        boasVindas.setForeground(new java.awt.Color(51, 51, 51));
        boasVindas.setText("Boas Vindas, Usuario.");

        produtos.setText("Meus Produtos");
        produtos.setColor(new java.awt.Color(255, 255, 255));
        produtos.setColorOver(new java.awt.Color(204, 255, 255));
        produtos.setContentAreaFilled(true);
        produtos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosActionPerformed(evt);
            }
        });

        assinatura.setText("Minha Assinatura");
        assinatura.setColor(new java.awt.Color(255, 255, 255));
        assinatura.setColorOver(new java.awt.Color(204, 255, 255));
        assinatura.setContentAreaFilled(true);
        assinatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assinatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assinaturaActionPerformed(evt);
            }
        });

        botao1.setText("Voltar para Login");
        botao1.setBorderPainted(false);
        botao1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assinatura, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(boasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(assinatura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtosActionPerformed

    private void assinaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assinaturaActionPerformed

    }//GEN-LAST:event_assinaturaActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao1ActionPerformed
    
    public void voltarParaLogin(ActionListener irParaHome) {
        botao1.addActionListener(irParaHome);
    }
    
    public void assinaturaActionListener(ActionListener e) {
        assinatura.addActionListener(e);
    }
    
    public void buscarPlano(String usuario) {
  
    }
    
    public String getPlano() {
        return plano;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.front.swing.utils.Botao assinatura;
    private javax.swing.JLabel boasVindas;
    private app.front.swing.utils.Botao botao1;
    private app.front.swing.utils.Botao produtos;
    // End of variables declaration//GEN-END:variables
}