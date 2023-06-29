/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.front.swing.login;

import app.backend.app.leitor.LeitorCSV;
import app.front.swing.home.Home;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import app.backend.domain.LoginDomain;
import java.io.File;

public class Login extends javax.swing.JPanel {

    private LeitorCSV leitor;

    public boolean clicado;

    public Login() throws FileNotFoundException {
        initComponents();
        this.leitor = new LeitorCSV(new File("C:\\Users\\gustavo.felix\\Downloads\\login.csv"));

    }

    public LoginDomain retornaLogin() {
        LoginDomain login = new LoginDomain();
        login.setSenha(fieldSenha1.getText());
        login.setUsuario(fieldLogin1.getText());

        return login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldSenha1 = new app.front.swing.utils.FieldSenha();
        LoginText = new javax.swing.JLabel();
        UsuarioText = new javax.swing.JLabel();
        SenhaText = new javax.swing.JLabel();
        botao1 = new app.front.swing.utils.Botao();
        fieldLogin1 = new app.front.swing.utils.FieldLogin();

        setBackground(new java.awt.Color(255, 255, 255));

        fieldSenha1.setText("fieldSenha1");

        LoginText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LoginText.setForeground(new java.awt.Color(153, 153, 153));
        LoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginText.setText("Login");

        UsuarioText.setText("Usuário");

        SenhaText.setText("Senha");

        botao1.setBorder(null);
        botao1.setText("Acessar");
        botao1.setColor(new java.awt.Color(204, 204, 204));
        botao1.setColorOver(new java.awt.Color(234, 234, 234));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        fieldLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(LoginText))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fieldSenha1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                                        .addComponent(fieldLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(LoginText)
                                .addGap(34, 34, 34)
                                .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLogin1ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        try {
            boolean loginNaBase = leitor.buscaLoginArquivoCsv(this.retornaLogin());
            if (loginNaBase) {

                new Home(fieldLogin1.getText()).setVisible(true);

            } else {
                JOptionPane.showInputDialog("Usúario e/ou senha incorretos");
                new Main().setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao1ActionPerformed

    public void botao1ActionListener(ActionListener evt) {
        botao1.addActionListener(evt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel SenhaText;
    private javax.swing.JLabel UsuarioText;
    private app.front.swing.utils.Botao botao1;
    private app.front.swing.utils.FieldLogin fieldLogin1;
    private app.front.swing.utils.FieldSenha fieldSenha1;
    // End of variables declaration//GEN-END:variables
}
