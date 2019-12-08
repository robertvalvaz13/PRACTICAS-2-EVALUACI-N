
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez
 */
public class Principal extends javax.swing.JFrame {
    Graphics gpsMiLienzo;
    Point coord =null;
    int x;
    int y;
    public Principal() {
        initComponents();
        gpsMiLienzo = LIENZO.getGraphics();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LIENZO = new java.awt.Canvas();
        btnFigura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LIENZO.setBackground(new java.awt.Color(255, 255, 255));
        LIENZO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LIENZOMouseClicked(evt);
            }
        });

        btnFigura.setText("Unir Figura");
        btnFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiguraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnFigura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LIENZO, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LIENZO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFigura)
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LIENZOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIENZOMouseClicked
        // TODO add your handling code here:
        LIENZO.getGraphics();
        gpsMiLienzo.setColor(Color.DARK_GRAY);
        gpsMiLienzo.drawOval(evt.getX()-2,evt.getY()-2, 5, 5);
       if(coord!=null){
        gpsMiLienzo.drawLine(coord.x, coord.y, evt.getX(), evt.getY());
        coord.y = evt.getY();
        coord.x = evt.getX();
    }  else{ 
            coord = new Point(evt.getX(), evt.getY());
            x = evt.getX();
            y = evt.getY();
            
            }
        
            
 
    
    
            
        
    }//GEN-LAST:event_LIENZOMouseClicked

    private void btnFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiguraActionPerformed
        // TODO add your handling code here:
        gpsMiLienzo.drawLine(x, y, coord.x, coord.y);
    }//GEN-LAST:event_btnFiguraActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas LIENZO;
    private javax.swing.JButton btnFigura;
    // End of variables declaration//GEN-END:variables
}
