
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import librarysystem.DBEngine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo
 */
public class adminLogin extends javax.swing.JFrame {
    String name2;
    String returnBook;

    /**
     * Creates new form adminLogin
     */
    
    public adminLogin(String name) {
        name2 = name;
     
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txttempuser = new javax.swing.JTextField();
        txttemppass = new javax.swing.JPasswordField();
        txttemp = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(0, 0, 247, 140));
        setMinimumSize(new java.awt.Dimension(247, 140));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), null, null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN LOG-IN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 80, -1));

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        txtUsername.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 51, 102));
        jPanel4.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, -1));

        txtPassword.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 51, 102));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, -1));
        jPanel4.add(txttempuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 10));

        txttemppass.setEnabled(false);
        txttemppass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttemppassActionPerformed(evt);
            }
        });
        jPanel4.add(txttemppass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, 11));

        txttemp.setEnabled(false);
        jPanel4.add(txttemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 10, 10));

        btnLogin.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 51, 102));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 100, -1));

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(0, 51, 102));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("The Library System");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-284)/2, (screenSize.height-305)/2, 284, 305);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                 txttemp.setText(name2);
                
    }//GEN-LAST:event_formWindowOpened

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txttemppassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttemppassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttemppassActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
            DBEngine dbengine = new DBEngine();
            Connection con = dbengine.dbCon();
            Statement st = con.createStatement();

            String usrname = (String) txtUsername.getText();
            String usrpass = (String) txtPassword.getText();

            ResultSet rs = st.executeQuery("select * from adminUser where userName like '"+usrname+"' and userPassword like '"+usrpass+"'");

            while(rs.next()){

                txttempuser.setText(rs.getString("userName"));
                txttemppass.setText(rs.getString("userPassword"));

            }
            if(txtUsername.getText().equals("") && txtPassword.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Username/Password field is empty!");
                txtPassword.setText("");
                txtUsername.setText("");
                txttemppass.setText("");
                txttempuser.setText("");
            }
            else if(txttempuser.getText().equals(txtUsername.getText()) &&
                txttemppass.getText().equals(txtPassword.getText())){

                if(txttemp.getText().equals("A")){
                    new AddBookInfoForm().setVisible(true);
                }
                else if(txttemp.getText().equals("B")){
                    new EditBookInfo().setVisible(true);
                }
                else if(txttemp.getText().equals("C")){
                    new BorrowReturn().setVisible(true);
                }
                else if(txttemp.getText().equals("D")){
                    returnBook = JOptionPane.showInputDialog("Enter ISBN: ");
                    int a = Integer.parseInt(returnBook);
                    new BorrowBook(returnBook).setVisible(true);
                }

                txtPassword.setText("");
                txtUsername.setText("");
                txttemppass.setText("");
                txttempuser.setText("");
                setVisible(false);
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Username/Password incorrect!");
                txtPassword.setText("");
                txtUsername.setText("");
                txttemppass.setText("");
                txttempuser.setText("");
            }

            con.close();

        }catch(Exception e )
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            public void run() {
               new adminLogin(null).setVisible(true);
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txttemp;
    private javax.swing.JPasswordField txttemppass;
    private javax.swing.JTextField txttempuser;
    // End of variables declaration//GEN-END:variables
}
