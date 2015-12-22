/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nessacademy.gui;

import com.nessacademy.bean.DictionaryWord;
import com.nessacademy.controller.DictionaryWordService;
import com.nessacademy.wrapper.DictionaryWords;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author P3502442
 */
public class Main extends javax.swing.JFrame {

    
    DictionaryWordService wordService;
    private static final String WORDS_XML = "./words.xml";
    JAXBContext context;
    
    public Main() {
        initComponents();
        wordService = new DictionaryWordService();
        try {
            context = JAXBContext.newInstance(DictionaryWords.class);
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        wordService.add("Retazec", "String");
        wordService.add("Pes", "Dog");
        wordService.add("Macka", "Cat");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        outputXml = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnPrintXml = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputSql = new javax.swing.JTextArea();
        btnPrintSql = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnFindXml = new javax.swing.JButton();
        btnFindSql = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taXml = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        taSql = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputXml.setColumns(20);
        outputXml.setRows(5);
        jScrollPane1.setViewportView(outputXml);

        jLabel1.setText("Print from XML");

        btnPrintXml.setText("Print XML");
        btnPrintXml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintXmlMouseClicked(evt);
            }
        });

        jLabel2.setText("Print from SQL");

        outputSql.setColumns(20);
        outputSql.setRows(5);
        jScrollPane2.setViewportView(outputSql);

        btnPrintSql.setText("Print SQL");
        btnPrintSql.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintSqlMouseClicked(evt);
            }
        });

        jLabel3.setText("Find word at XML");

        jLabel4.setText("Find word at SQL");

        btnFindXml.setText("Find at XML");
        btnFindXml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindXmlMouseClicked(evt);
            }
        });

        btnFindSql.setText("Find at SQL");
        btnFindSql.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindSqlMouseClicked(evt);
            }
        });

        taXml.setColumns(20);
        taXml.setRows(5);
        jScrollPane3.setViewportView(taXml);

        taSql.setColumns(20);
        taSql.setRows(5);
        jScrollPane4.setViewportView(taSql);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPrintSql)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFindXml))
                                    .addComponent(btnPrintXml)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFindSql))
                                .addComponent(jScrollPane4))))
                    .addComponent(jLabel3))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintXml))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintSql)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindXml)
                    .addComponent(btnFindSql))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintXmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintXmlMouseClicked
        xmlControllerInput();
        xmlControllerOutput();
    }//GEN-LAST:event_btnPrintXmlMouseClicked

    private void btnPrintSqlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintSqlMouseClicked
        StringBuilder sb = new StringBuilder();
        for (DictionaryWord word : wordService.words()) {
                sb.append(word.toString());
                sb.append("\n");
            }
            outputSql.setText(sb.toString());
    }//GEN-LAST:event_btnPrintSqlMouseClicked

    //FIXME
    private void btnFindXmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindXmlMouseClicked
        
    }//GEN-LAST:event_btnFindXmlMouseClicked

    //FIXME
    private void btnFindSqlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindSqlMouseClicked
        
    }//GEN-LAST:event_btnFindSqlMouseClicked

    
    
    private void xmlControllerInput(){
        try {
            DictionaryWords wordsMarsh = new DictionaryWords();
            wordsMarsh.setWords(wordService.words());
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);        
            m.marshal(wordsMarsh, new File(WORDS_XML));
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void xmlControllerOutput(){
        try {
            Unmarshaller um = context.createUnmarshaller();
            DictionaryWords dictionaryUnmarsh = (DictionaryWords) um.unmarshal(new FileReader(WORDS_XML));
            StringBuilder sb = new StringBuilder();
            for (DictionaryWord word : dictionaryUnmarsh.getWords()) {
                sb.append(word.toString());
                sb.append("\n");
            }
            outputXml.setText(sb.toString());
        } catch (JAXBException | FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindSql;
    private javax.swing.JButton btnFindXml;
    private javax.swing.JButton btnPrintSql;
    private javax.swing.JButton btnPrintXml;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea outputSql;
    private javax.swing.JTextArea outputXml;
    private javax.swing.JTextArea taSql;
    private javax.swing.JTextArea taXml;
    // End of variables declaration//GEN-END:variables
}