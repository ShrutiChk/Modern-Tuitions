
package modern_tutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Login_Page extends javax.swing.JFrame {

   
    private static Connection myConnectObj=null;
    private static Statement myStatObj=null;
    private static ResultSet myResObj=null;
    
    private void selectionall(){
        
      
        try{
            myConnectObj=DriverManager.getConnection("jdbc:derby://localhost:1527/PaymentDatabase","Include101","Include101");
            myStatObj=myConnectObj.createStatement();
            myResObj=myStatObj.executeQuery("SELECT * FROM INCLUDE101.LOGINDATABASE");
            
        }
        
       catch(SQLException e )
       {
           e.printStackTrace();
       }
    }
    public Login_Page() {
        initComponents();
        selectionall();
        setTitle("Login_Page");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UsernameLogin = new javax.swing.JTextField();
        PasswordLogin = new javax.swing.JPasswordField();
        LOGIN_SYSTEM_NAME_JLABEL = new javax.swing.JLabel();
        BackBUtton = new javax.swing.JButton();
        SignUP_Button = new javax.swing.JButton();
        LOGIN_BUTTON = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1025, 690));
        setMinimumSize(new java.awt.Dimension(1025, 690));
        setPreferredSize(new java.awt.Dimension(1040, 700));
        getContentPane().setLayout(null);

        Username.setBackground(new java.awt.Color(255, 255, 255));
        Username.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        Username.setText("Username ");
        getContentPane().add(Username);
        Username.setBounds(270, 340, 190, 50);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("Password ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 420, 140, 60);
        getContentPane().add(UsernameLogin);
        UsernameLogin.setBounds(460, 330, 240, 60);

        PasswordLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordLoginMouseClicked(evt);
            }
        });
        PasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordLoginActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordLogin);
        PasswordLogin.setBounds(460, 420, 240, 60);

        LOGIN_SYSTEM_NAME_JLABEL.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        LOGIN_SYSTEM_NAME_JLABEL.setText("     LOGIN SYSTEM");
        getContentPane().add(LOGIN_SYSTEM_NAME_JLABEL);
        LOGIN_SYSTEM_NAME_JLABEL.setBounds(280, 150, 590, 60);

        BackBUtton.setBackground(new java.awt.Color(255, 204, 204));
        BackBUtton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackBUtton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/backBUtton.png"))); // NOI18N
        BackBUtton.setText("BACK");
        BackBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBUttonActionPerformed(evt);
            }
        });
        getContentPane().add(BackBUtton);
        BackBUtton.setBounds(860, 590, 130, 40);

        SignUP_Button.setBackground(new java.awt.Color(255, 204, 255));
        SignUP_Button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SignUP_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/SignUp_Pic.png"))); // NOI18N
        SignUP_Button.setText("SIGN UP");
        SignUP_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUP_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUP_Button);
        SignUP_Button.setBounds(490, 580, 180, 50);

        LOGIN_BUTTON.setBackground(new java.awt.Color(255, 204, 255));
        LOGIN_BUTTON.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LOGIN_BUTTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/LOGIN_PIC.png"))); // NOI18N
        LOGIN_BUTTON.setText("  LOGIN ");
        LOGIN_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_BUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN_BUTTON);
        LOGIN_BUTTON.setBounds(490, 490, 180, 60);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setText("or");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 550, 60, 27);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/cloudPic.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, -10, 640, 340);

        LoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/depositphotos_45920955-stock-photo-pastel-purple-background-texture.jpg"))); // NOI18N
        LoginLabel.setMaximumSize(new java.awt.Dimension(1066, 690));
        LoginLabel.setMinimumSize(new java.awt.Dimension(1000, 690));
        LoginLabel.setPreferredSize(new java.awt.Dimension(1025, 690));
        getContentPane().add(LoginLabel);
        LoginLabel.setBounds(-10, -70, 1025, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void LOGIN_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_BUTTONActionPerformed
    
        try
        {
            
            PreparedStatement add = myConnectObj.prepareStatement("SELECT USERNAME, PASSWORD FROM LOGINDATABASE WHERE USERNAME= ? AND PASSWORD= ?");
            add.setString(1, UsernameLogin.getText());
            add.setString(2, String.valueOf(PasswordLogin.getPassword()));  
            myResObj = add.executeQuery();
            
            if(myResObj.next()){  
                
                if(WelcomePage.Student_flag == 1)
                {

                    Teacher_table object =new Teacher_table();
                    object.show();
                    this.setVisible(false);
                }
                else if(WelcomePage.teacher_flag == 1)
                {

                    StudentTable object=new StudentTable();
                    object.show();
                    this.setVisible(false);
                }
                WelcomePage.Student_flag = 0;
                WelcomePage.teacher_flag = 0;
                
            
            }
            else
            {
               
                String msg = "Invalid Username Or Password";
                JOptionPane.showMessageDialog(this, msg);
            }
            
        } 
        catch (SQLException ex)
        {
            
            ex.printStackTrace();
        }
         selectionall();
                                                 


    
    }//GEN-LAST:event_LOGIN_BUTTONActionPerformed

    private void BackBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBUttonActionPerformed

        WelcomePage obj = new WelcomePage();
        obj.show();
        this.setVisible(false);
        WelcomePage.Student_flag = 0;
        WelcomePage.teacher_flag = 0;
    }//GEN-LAST:event_BackBUttonActionPerformed

    private void SignUP_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUP_ButtonActionPerformed

        if(WelcomePage.Student_flag == 1)
        {
            Student_form object=new Student_form();
            object.show();
            this.setVisible(false);
            
        }
        else if(WelcomePage.teacher_flag == 1)
        {
            TeacherForm object=new TeacherForm();
            object.show();
            this.setVisible(false);
        }
        WelcomePage.Student_flag = 0;
        WelcomePage.teacher_flag = 0;
        
    }//GEN-LAST:event_SignUP_ButtonActionPerformed

    private void PasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordLoginActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_PasswordLoginActionPerformed

    private void PasswordLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLoginMouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Please enter your password.\n"+ "Your password must have 6-10 characters\n" + "Your password must contain at least one letter and one digit");
    }//GEN-LAST:event_PasswordLoginMouseClicked

   
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBUtton;
    private javax.swing.JButton LOGIN_BUTTON;
    private javax.swing.JLabel LOGIN_SYSTEM_NAME_JLABEL;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField PasswordLogin;
    private javax.swing.JButton SignUP_Button;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField UsernameLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
