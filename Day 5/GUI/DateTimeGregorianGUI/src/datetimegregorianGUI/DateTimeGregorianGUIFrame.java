/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimegregorianGUI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author JMX
 */
public class DateTimeGregorianGUIFrame extends javax.swing.JFrame {

    /**
     * Creates new form DateTimeGregorianFrame
     */
    public DateTimeGregorianGUIFrame() {
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
        btnDateTime = new javax.swing.JButton();
        btnDateTime2 = new javax.swing.JButton();
        btnDateTime6 = new javax.swing.JButton();
        btnDateTime3 = new javax.swing.JButton();
        btnDateTime4 = new javax.swing.JButton();
        btnDateTime5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Day 5");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DateTimeGregorianGUI"));

        btnDateTime.setText("DateTime");
        btnDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateTimeActionPerformed(evt);
            }
        });

        btnDateTime2.setText("DateTime2");
        btnDateTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateTime2ActionPerformed(evt);
            }
        });

        btnDateTime6.setText("Gregorian Calendar");
        btnDateTime6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateTime6ActionPerformed(evt);
            }
        });

        btnDateTime3.setText("DateTime3");
        btnDateTime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateTime3ActionPerformed(evt);
            }
        });

        btnDateTime4.setText("DateTime4");
        btnDateTime4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateTime4ActionPerformed(evt);
            }
        });

        btnDateTime5.setText("DateTime5");
        btnDateTime5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateTime5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDateTime6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDateTime4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDateTime5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDateTime3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDateTime2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDateTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDateTime2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDateTime3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDateTime4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDateTime5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDateTime6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-195)/2, (screenSize.height-297)/2, 195, 297);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateTimeActionPerformed
        
        Date date = new Date();
        
        JOptionPane.showMessageDialog(this, "DATE AND TIME IS : " +date.toString());
        
    }//GEN-LAST:event_btnDateTimeActionPerformed

    private void btnDateTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateTime2ActionPerformed
        
        Date date = new Date();

	SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd' at 'hh:mm:ss a zzz");
        
        JOptionPane.showMessageDialog(this, "Current Date: "+ft.format(date));
        
    }//GEN-LAST:event_btnDateTime2ActionPerformed

    private void btnDateTime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateTime3ActionPerformed
        
        Date date = new Date();
        
        JOptionPane.showMessageDialog(this, "The Current Time is: " +date);
        
    }//GEN-LAST:event_btnDateTime3ActionPerformed

    private void btnDateTime4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateTime4ActionPerformed
        
        Date date = new Date();
        
        JOptionPane.showMessageDialog(this, "Due Date : " + date);
        
    }//GEN-LAST:event_btnDateTime4ActionPerformed

    private void btnDateTime5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateTime5ActionPerformed
        
        try{
		Long start=System.currentTimeMillis();
		System.out.println(new Date()+"\n");
		Thread.sleep(5*60*10);
		System.out.println(new Date()+"\n");
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println("Difference is:" +diff);
                
                JOptionPane.showMessageDialog(this, new Date()+ "\n" + "\n" + new Date()+ "\n" + "\n" + "Difference is: " +diff);

	}catch (Exception e){
		System.out.print("Got an Exception!");
	}
        
        
        
    }//GEN-LAST:event_btnDateTime5ActionPerformed

    private void btnDateTime6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateTime6ActionPerformed
       
        String months[]= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int year = 0;
        GregorianCalendar gcalendar = new GregorianCalendar();
        
        if (gcalendar.isLeapYear(year)){
            
            JOptionPane.showMessageDialog(this, "Date: " + "\n" + (months[gcalendar.get(Calendar.MONTH)]) +  
                                       " "+gcalendar.get(Calendar.DATE)+", " + (year=gcalendar.get(Calendar.YEAR)) + "\n" + 
                                        "Time: " + "\n" + (gcalendar.get(Calendar.HOUR)+":") + (gcalendar.get(Calendar.MINUTE)+":") + (gcalendar.get(Calendar.SECOND)) + 
                                       "\n" + "The current year is not a leap year");
        
            
        }else{
            
            JOptionPane.showMessageDialog(this, "Date: " + "\n" + (months[gcalendar.get(Calendar.MONTH)]) +  
                                       " "+gcalendar.get(Calendar.DATE)+", " + (year=gcalendar.get(Calendar.YEAR)) + "\n" + 
                                        "Time: " + "\n" + (gcalendar.get(Calendar.HOUR)+":") + (gcalendar.get(Calendar.MINUTE)+":") + (gcalendar.get(Calendar.SECOND)) + 
                                       "\n" + "The current year is a leap year");
        
            
        }
        
    }//GEN-LAST:event_btnDateTime6ActionPerformed

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
            java.util.logging.Logger.getLogger(DateTimeGregorianGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DateTimeGregorianGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DateTimeGregorianGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DateTimeGregorianGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DateTimeGregorianGUIFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDateTime;
    private javax.swing.JButton btnDateTime2;
    private javax.swing.JButton btnDateTime3;
    private javax.swing.JButton btnDateTime4;
    private javax.swing.JButton btnDateTime5;
    private javax.swing.JButton btnDateTime6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
