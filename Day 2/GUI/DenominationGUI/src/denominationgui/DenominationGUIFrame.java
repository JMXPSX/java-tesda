/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package denominationgui;

import javax.swing.JOptionPane;

/**
 *
 * @author autocad
 */
public class DenominationGUIFrame extends javax.swing.JFrame {

    /**
     * Creates new form DenominationGUIFrame
     */
    public DenominationGUIFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Day 2");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DenominationGUI"));

        jLabel1.setText("Input Number in Peso:");

        jButton1.setText("COMPUTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(18, 18, 18)
                        .add(txtNum, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtNum, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-293)/2, (screenSize.height-168)/2, 293, 168);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        compute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        compute();
    }//GEN-LAST:event_jButton1KeyPressed

    private void compute(){
        
        double TWENTY_FIVE_CENTS = .25;
	double FIFTY_CENTS = .50;
	double ONE_PESO = 1;
	double FIVE_PESO = 5;
	double TEN_PESO = 10;
	double TWENTY_PESO = 20;
	double FIFTY_PESO = 50;
	double ONE_HUNDRED_PESO = 100;
	double FIVE_HUNDRED_PESO = 500;
	double ONE_THOUSAND_PESO = 1000;
        
        double Peso = Double.parseDouble(txtNum.getText());
        double a,b,c,d,e,f,g,h,i,j;
        
        a = (Peso / TWENTY_FIVE_CENTS);
	b = (Peso / FIFTY_CENTS);
	c = (Peso / ONE_PESO);
	d = (Peso / FIVE_PESO);
	e = (Peso / TEN_PESO);
	f = (Peso / TWENTY_PESO);
	g = (Peso / FIFTY_PESO);
	h = (Peso / ONE_HUNDRED_PESO);
	i = (Peso / FIVE_HUNDRED_PESO);
	j = (Peso / ONE_THOUSAND_PESO);
        
        JOptionPane.showMessageDialog(null, "SUMMARY:" + "\n" + "\n" + ".25 = There are " + String.format("%.2f", a) + " pieces of twenty five centavos in Php " + String.format("%.2f", Peso) + 
                                       "\n" + ".50 = There are " + String.format("%.2f", b) + " pieces of fifty centavos in Php " + String.format("%.2f", Peso) +
                                       "\n" + "1.00 = There are " + String.format("%.2f", c) + " pieces of one pesos in Php " + String.format("%.2f", Peso) +
                                       "\n" + "5.00 = There are " + String.format("%.2f", d) + " pieces of five pesos in Php " + String.format("%.2f", Peso) +
                                       "\n" + "10.00 = There are " + String.format("%.2f", e) + " pieces of ten pesos in Php " + String.format("%.2f", Peso) +
                                       "\n" + "20.00 = There are " + String.format("%.2f", f) + " pieces of twenty pesos in Php " + String.format("%.2f", Peso) +  
                                       "\n" + "50.00 = There are " + String.format("%.2f", g) + " pieces of fifty pesos in Php " + String.format("%.2f", Peso) +
                                       "\n" + "100.00 = There are " + String.format("%.2f", h) + " pieces of one hundred pesos in Php " + String.format("%.2f", Peso) + 
                                       "\n" + "500.00 = There are " + String.format("%.2f", i) + " pieces of five hundred pesos in Php " + String.format("%.2f", Peso)+ 
                                       "\n" + "1,000.00 = There are " + String.format("%.2f", j) + " pieces of one thousand pesos in Php " + String.format("%.2f", Peso) );  
                                               
        txtNum.setText(null);
        
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
            java.util.logging.Logger.getLogger(DenominationGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DenominationGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DenominationGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DenominationGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DenominationGUIFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
