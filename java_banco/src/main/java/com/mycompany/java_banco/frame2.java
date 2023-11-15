/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java_banco;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author gabri_
 */
public class frame2 extends javax.swing.JFrame {

    /**
     * Creates new form frame2
     */
    public frame2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        janela2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        valor = new javax.swing.JTextField();
        enviar_tabela = new javax.swing.JButton();
        bandeira = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        pagamento = new javax.swing.JTextField();
        tudo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        parcelamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Retífica de Peças Soares™");

        janela2.setBackground(new java.awt.Color(153, 204, 255));

        tabela.setBackground(new java.awt.Color(69, 161, 230));
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"31/10/2023", "Cartão", "200,00", "MasterCard", "2x"},
                {"01/11/1023", "Pix", "50,00", null, null},
                {"02/11/2023", "Espécie", "100,00", null, null}
            },
            new String [] {
                "Data", "Pagamento", "Valor (R$)", "Bandeira", "Parcelamento"
            }
        ));
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
        }

        valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valorFocusLost(evt);
            }
        });
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        enviar_tabela.setBackground(new java.awt.Color(69, 161, 230));
        enviar_tabela.setForeground(new java.awt.Color(255, 255, 255));
        enviar_tabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoEnviar.png"))); // NOI18N
        enviar_tabela.setText("ENVIAR");
        enviar_tabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enviar_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_tabelaActionPerformed(evt);
            }
        });

        bandeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandeiraActionPerformed(evt);
            }
        });

        data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataFocusLost(evt);
            }
        });
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        pagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pagamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pagamentoFocusLost(evt);
            }
        });
        pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoActionPerformed(evt);
            }
        });

        tudo.setBackground(new java.awt.Color(69, 161, 230));
        tudo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tudo.setForeground(new java.awt.Color(255, 255, 255));
        tudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoLupa.png"))); // NOI18N
        tudo.setText("PESQUISAR");
        tudo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tudoActionPerformed(evt);
            }
        });

        jLabel1.setText("Data");

        jLabel2.setText("Pagamento");

        jLabel3.setText("Valor");

        jLabel4.setText("Bandeira");

        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar");

        jLabel6.setText("Parcelamento");

        javax.swing.GroupLayout janela2Layout = new javax.swing.GroupLayout(janela2);
        janela2.setLayout(janela2Layout);
        janela2Layout.setHorizontalGroup(
            janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janela2Layout.createSequentialGroup()
                .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(janela2Layout.createSequentialGroup()
                        .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(janela2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janela2Layout.createSequentialGroup()
                                        .addComponent(pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tudo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(janela2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel5))))
                            .addGroup(janela2Layout.createSequentialGroup()
                                .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(janela2Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(janela2Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel6))
                                            .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(parcelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(janela2Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel2))
                                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(janela2Layout.createSequentialGroup()
                                                        .addGap(32, 32, 32)
                                                        .addComponent(jLabel3))
                                                    .addGroup(janela2Layout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addComponent(jLabel4))
                                                    .addComponent(bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(janela2Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(janela2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(enviar_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        janela2Layout.setVerticalGroup(
            janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janela2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(janela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tudo)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parcelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviar_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(janela2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void bandeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bandeiraActionPerformed

    private void enviar_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_tabelaActionPerformed
        DefaultTableModel dadosPagamento = (DefaultTableModel) tabela.getModel();
        
        Object[] dados = {data.getText(), pagamento.getText(), valor.getText(), bandeira.getText(), parcelamento.getText()};
        
        if(data.getText().equals("") && pagamento.getText().equals("") && valor.getText().equals("") && bandeira.getText().equals("") && parcelamento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira valores válidos.");
        } else {
            dadosPagamento.addRow(dados);
            data.setText("");
            pagamento.setText("");
            valor.setText("");
            bandeira.setText("");
            parcelamento.setText("");

        }
        
    }//GEN-LAST:event_enviar_tabelaActionPerformed

    
    private void valorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFocusGained

    private void valorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFocusLost

    private void pagamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagamentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoFocusGained

    private void pagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoFocusLost

    private void pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoActionPerformed

    private void tudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tudoActionPerformed
        DefaultTableModel dadosPagamento = (DefaultTableModel) tabela.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<>(dadosPagamento);

        tabela.setRowSorter(sorter);

        String botaoPesquisa = pesquisa.getText();

        if (botaoPesquisa.equals("Pix") && botaoPesquisa.equals("Cartão") && botaoPesquisa.equals("Espécie")) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(botaoPesquisa));
        }
    }//GEN-LAST:event_tudoActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        
    }//GEN-LAST:event_pesquisaActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void dataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFocusLost

    private void dataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFocusGained

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frame2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bandeira;
    private javax.swing.JTextField data;
    private javax.swing.JButton enviar_tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel janela2;
    private javax.swing.JTextField pagamento;
    private javax.swing.JTextField parcelamento;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTable tabela;
    private javax.swing.JButton tudo;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
