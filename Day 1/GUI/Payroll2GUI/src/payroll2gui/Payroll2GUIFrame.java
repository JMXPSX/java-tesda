/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll2gui;

/**
 *
 * @author autocad
 */
public class Payroll2GUIFrame extends javax.swing.JFrame {

    /**
     * Creates new form Payroll2GUIFrame
     */
    public Payroll2GUIFrame() {
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

        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        absent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDept = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtHourRate = new javax.swing.JTextField();
        txtWeekRate = new javax.swing.JTextField();
        txtDailyRate = new javax.swing.JTextField();
        txtMonthRate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSSS = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPbg = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPhl = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtWorkMonth = new javax.swing.JTextField();
        txtDeductionAbsent = new javax.swing.JTextField();
        txtBasicIncome = new javax.swing.JTextField();
        txtMonthDeduction = new javax.swing.JTextField();
        txtTotalWage = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        jLabel11.setText("Hourly Rate:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Salary Details:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Day 1");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Payroll2GUI"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        jLabel2.setText("Enter Age:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, -1, -1));

        jLabel3.setText("Enter Department:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 82, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 157, 576, 10));

        jLabel4.setText("Enter Days Absent:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 108, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 27, 120, -1));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 53, 120, -1));
        jPanel1.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 79, 120, -1));
        jPanel1.add(absent, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 105, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Employee Details:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 173, -1, -1));

        jLabel6.setText("Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 194, -1, -1));

        jLabel7.setText("Age:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 220, -1, -1));

        jLabel8.setText("Department:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 246, -1, -1));

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 191, 120, -1));

        txtAge.setEditable(false);
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 217, 120, -1));

        txtDept.setEditable(false);
        jPanel1.add(txtDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 243, 120, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 309, 576, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Salary Details:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 173, -1, -1));

        jLabel10.setText("Hourly Rate:                              Php");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 180, 20));

        jLabel12.setText("Daily Rate:                                 Php");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 180, -1));

        jLabel13.setText("Weekly Rate:                             Php");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 180, -1));

        jLabel14.setText("Monthly Rate:                            Php");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 180, -1));

        txtHourRate.setEditable(false);
        jPanel1.add(txtHourRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 120, -1));

        txtWeekRate.setEditable(false);
        jPanel1.add(txtWeekRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 120, -1));

        txtDailyRate.setEditable(false);
        jPanel1.add(txtDailyRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 120, -1));

        txtMonthRate.setEditable(false);
        jPanel1.add(txtMonthRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 120, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Deductions:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 325, -1, -1));

        jLabel17.setText("SSS:                       Php");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 348, 130, -1));

        txtSSS.setEditable(false);
        jPanel1.add(txtSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 345, 120, -1));

        jLabel18.setText("Pag-Ibig:                Php");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 374, 130, -1));

        txtTax.setEditable(false);
        jPanel1.add(txtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 397, 120, -1));

        jLabel19.setText("Witholding Tax:     Php");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 400, 130, -1));

        txtPbg.setEditable(false);
        jPanel1.add(txtPbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 371, 120, -1));

        jLabel20.setText("PhilHealth:             Php");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 426, 140, -1));

        txtPhl.setEditable(false);
        jPanel1.add(txtPhl, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 423, 120, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Salary Computation:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 325, -1, -1));

        jLabel22.setText("Total Workdays in a month: ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 180, -1));

        jLabel23.setText("Deduction from absences:    Php");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 180, -1));

        jLabel24.setText("Total Basic Income:                Php");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 180, 20));

        jLabel25.setText("Less Monthly Deductions:     Php");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 180, -1));

        jLabel26.setText("Total Wage:                              Php");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        txtWorkMonth.setEditable(false);
        jPanel1.add(txtWorkMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 120, -1));

        txtDeductionAbsent.setEditable(false);
        txtDeductionAbsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeductionAbsentActionPerformed(evt);
            }
        });
        jPanel1.add(txtDeductionAbsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 120, -1));

        txtBasicIncome.setEditable(false);
        jPanel1.add(txtBasicIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 120, -1));

        txtMonthDeduction.setEditable(false);
        jPanel1.add(txtMonthDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 120, -1));

        txtTotalWage.setEditable(false);
        jPanel1.add(txtTotalWage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 120, -1));

        jButton2.setText("CALCULATE");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 144, 40));

        jLabel27.setText("Amount added (SC):               Php");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 180, -1));

        jLabel28.setText("You have no absences!");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 170, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 600, 540);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-628)/2, (screenSize.height-595)/2, 628, 595);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        calculate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDeductionAbsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeductionAbsentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeductionAbsentActionPerformed

    private void calculate() {
        
        String name = (this.name.getText()); 
        Integer age = Integer.parseInt(this.age.getText());
        String dept = (this.dept.getText());
        Integer abs = Integer.parseInt(this.absent.getText());
        
        Double hour = 300.00;
	Double day = hour * 8;
	Double week = day * 5;
	Double month = week * 4;
	Double tabs = abs*day;
	Double wage = month - tabs;
        
        txtName.setText(name);
        txtAge.setText(age.toString()); 
        txtDept.setText(dept);
        txtHourRate.setText("300.00");
        txtDailyRate.setText(String.format("%.2f", day));
        txtWeekRate.setText(String.format("%.2f", week));
        txtMonthRate.setText(String.format("%.2f", wage));
        
        Double sss = wage * .10;
	Double pbg = wage * .10;
	Double phl = wage * .10;
	Double tax = ((20-abs) * day);
	Double ttax = tax * .20;
        Double asen= (day/2) * .20;
	Double tasen = asen * abs;
        
        txtSSS.setText(String.format("%.2f", sss));
        txtPbg.setText(String.format("%.2f", pbg));
        txtPhl.setText(String.format("%.2f", phl));
        txtTax.setText(String.format("%.2f", ttax));
        
        if (abs > 0 && age >= 60){
            
            Integer absx = 20 - abs;
            Double tbi = wage+tasen;
            Double lmd = pbg+sss+phl+ttax;
            Double twage1 = wage - (pbg+sss+phl+ttax);
	    Double twage2 = ((wage - (pbg+sss+phl+ttax))+tasen);
            
            txtWorkMonth.setText((absx).toString());
            jLabel23.setVisible(false);
            jLabel27.setVisible(true);
            txtDeductionAbsent.setText(String.format("%.2f", tasen));
            txtBasicIncome.setText(String.format("%.2f", tbi ));
            txtMonthDeduction.setText(String.format("%.2f", lmd ));
            txtTotalWage.setText(String.format("%.2f", twage2));           
                    
        }else if (abs > 0 && age < 60){
            
            Integer absx = 20 - abs;
            Double lmd = pbg+sss+phl+ttax;
            Double twage1 = wage - (pbg+sss+phl+ttax);
            
            txtWorkMonth.setText((absx).toString());
            txtDeductionAbsent.setText(String.format("%.2f", tabs));
            txtBasicIncome.setText(String.format("%.2f", wage ));
            txtMonthDeduction.setText(String.format("%.2f", lmd ));
            txtTotalWage.setText(String.format("%.2f", twage1));
            
        }else{
            
            Integer absx = 20 - abs;
            Double lmd = pbg+sss+phl+ttax;
            Double twage1 = wage - (pbg+sss+phl+ttax);
            
            txtWorkMonth.setText((absx).toString());
            jLabel23.setVisible(false);
            txtDeductionAbsent.setVisible(false);
            jLabel28.setVisible(true);
            txtBasicIncome.setText(String.format("%.2f", wage ));
            txtMonthDeduction.setText(String.format("%.2f", lmd ));
            txtTotalWage.setText(String.format("%.2f", twage1));
            
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
            java.util.logging.Logger.getLogger(Payroll2GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payroll2GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payroll2GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payroll2GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payroll2GUIFrame().setVisible(true);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absent;
    private javax.swing.JTextField age;
    private javax.swing.JTextField dept;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBasicIncome;
    private javax.swing.JTextField txtDailyRate;
    private javax.swing.JTextField txtDeductionAbsent;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtHourRate;
    private javax.swing.JTextField txtMonthDeduction;
    private javax.swing.JTextField txtMonthRate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPbg;
    private javax.swing.JTextField txtPhl;
    private javax.swing.JTextField txtSSS;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotalWage;
    private javax.swing.JTextField txtWeekRate;
    private javax.swing.JTextField txtWorkMonth;
    // End of variables declaration//GEN-END:variables
}
