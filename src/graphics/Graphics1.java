/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author momchil.ivanov
 */
public class Graphics1 extends javax.swing.JFrame {

    /**
     * Creates new form Graphics1
     */
    public Graphics1() {
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

        pnlOsnoven = new javax.swing.JPanel();
        pnlButon = new javax.swing.JPanel();
        btnDrawLine = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnlGrafiki = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDrawLine.setText("Draw line");
        btnDrawLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawLineActionPerformed(evt);
            }
        });

        btn2.setText("zad2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        jButton1.setText("zad3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButonLayout = new javax.swing.GroupLayout(pnlButon);
        pnlButon.setLayout(pnlButonLayout);
        pnlButonLayout.setHorizontalGroup(
            pnlButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn2))
                    .addGroup(pnlButonLayout.createSequentialGroup()
                        .addGroup(pnlButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDrawLine)
                            .addComponent(jButton1))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlButonLayout.setVerticalGroup(
            pnlButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnDrawLine)
                .addGap(45, 45, 45)
                .addComponent(btn2)
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pnlGrafiki.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlGrafiki.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlGrafikiLayout = new javax.swing.GroupLayout(pnlGrafiki);
        pnlGrafiki.setLayout(pnlGrafikiLayout);
        pnlGrafikiLayout.setHorizontalGroup(
            pnlGrafikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        pnlGrafikiLayout.setVerticalGroup(
            pnlGrafikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlOsnovenLayout = new javax.swing.GroupLayout(pnlOsnoven);
        pnlOsnoven.setLayout(pnlOsnovenLayout);
        pnlOsnovenLayout.setHorizontalGroup(
            pnlOsnovenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsnovenLayout.createSequentialGroup()
                .addComponent(pnlButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGrafiki, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );
        pnlOsnovenLayout.setVerticalGroup(
            pnlOsnovenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlGrafiki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOsnoven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOsnoven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDrawLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawLineActionPerformed
   int x = pnlGrafiki.getWidth();
    int y = pnlGrafiki.getHeight();
    pnlGrafiki.setBackground(Color.WHITE);
    Graphics g = pnlGrafiki.getGraphics();
    
    g.setColor(Color.red);
    g.drawLine(0, 0, 0, y);
    g.drawLine(0, 0, x, 0);
    g.drawLine(0, 0, x, y);
    g.drawLine(0, y, x, 0);
    g.drawLine(x-2, 0, x-2, y-2);
    g.drawLine(0, y-1, x-1, y-1);
    
    }//GEN-LAST:event_btnDrawLineActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        int x = pnlGrafiki.getWidth();
    int y = pnlGrafiki.getHeight();
    pnlGrafiki.setBackground(Color.YELLOW);
    Graphics g = pnlGrafiki.getGraphics();
    int n=1;
        for (int i = 0; i < x; i++) {
            
            if(n<=x){
          g.drawLine(0,0,n,y);
          n=i*50;
          
            }
            
       }
        int m=(x-2);
        for (int i = 0; i < x; i++) {
            
            if(m>=0){
          g.drawLine(x-2,0,m,y);
          m=i*50;
          
            }
            
       }
    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int x = pnlGrafiki.getWidth();
    int y = pnlGrafiki.getHeight();
    pnlGrafiki.setBackground(Color.WHITE);
    Graphics g = pnlGrafiki.getGraphics();
    Scanner scan = new Scanner(System.in);
double n = Double.parseDouble(JOptionPane.showInputDialog("Vuvedete broi na liniite"));
int diagonal = (int) Math.sqrt(x^2+y^2);
int n2 = (int) (diagonal/n);
double dx = x/n;
double dy = y/n;
System.out.println(dx+ "  " +dy);
        for (int i = 0; i <= n; i++) {
            g.setColor(Color.BLACK);
            g.drawLine(i*(int)dx, y-i*(int)dy, x, y-i*(int)dy);
            g.drawLine(i*(int)dx, y-i*(int)dy, i*(int)dx, y);
        }
        for (int i = 0; i <= n; i++) {
            g.drawLine(0, 0,i*(int)dx, y-i*(int)dy);
            g.setColor(Color.BLACK);
           try {
               Thread.sleep(200);
           } catch (InterruptedException ex) {
               Logger.getLogger(Graphics1.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Graphics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphics1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2;
    private javax.swing.JButton btnDrawLine;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pnlButon;
    private javax.swing.JPanel pnlGrafiki;
    private javax.swing.JPanel pnlOsnoven;
    // End of variables declaration//GEN-END:variables
}
