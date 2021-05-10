
package modern_tutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TeacherForm extends javax.swing.JFrame 
{

    private static Connection myConnectObj=null;
    private static Statement myStatObj=null;
    private static ResultSet myResObj=null;
    
    
    public TeacherForm() 
    {
        initComponents();
        selectionall();
        setTitle("Teacher Form" );
    }
    private void selectionall()
    {
        try
        {
            myConnectObj=DriverManager.getConnection("jdbc:derby://localhost:1527/PaymentDatabase","Include101","Include101");
            myStatObj=myConnectObj.createStatement();
            myResObj=myStatObj.executeQuery("SELECT * FROM INCLUDE101.LOGINDATABASE");
            myResObj=myStatObj.executeQuery("SELECT * FROM INCLUDE101.TEACHERTABLE");
            
        }
        
       catch(SQLException e )
       {
           e.printStackTrace();
       }
    }
    private static boolean validate(String password) {
  // Check for null, then a length less then 6 
  // > 10 check & space.
        if (password == null || password.length() < 6 || password.length() > 10) {
            return false;
        }
        boolean containsChar = false;
        boolean containsDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                containsChar = true;
            } 
            else if (Character.isDigit(c)) {
                containsDigit = true;
            }
            if (containsChar && containsDigit) {
                return true;
            }
            if (password.contains(" ")) {
                return false;
            }

        }
        return false;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubjectTextField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        jTextField_username_teacher = new javax.swing.JTextField();
        jPasswordField_password_teacher = new javax.swing.JPasswordField();
        AddressLabel = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        TeacherNameTextField = new javax.swing.JTextField();
        DateOfBirthLabel = new javax.swing.JLabel();
        SexLabel = new javax.swing.JLabel();
        PhoneNoLabel = new javax.swing.JLabel();
        PhoneNoTextField = new javax.swing.JTextField();
        EmailNoLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        UniversityLabel = new javax.swing.JLabel();
        UniversityTextField = new javax.swing.JTextField();
        SubjectLabel = new javax.swing.JLabel();
        AreaPreferenceLabel = new javax.swing.JLabel();
        AreaPreferenceTextField = new javax.swing.JTextField();
        SubjectPreferenceLabel = new javax.swing.JLabel();
        SubjectPreferenceComboBox = new javax.swing.JComboBox<>();
        ClassPreferenceLabel = new javax.swing.JLabel();
        ClassPreferenceComboBox = new javax.swing.JComboBox<>();
        SubmitButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        StartingLabel = new javax.swing.JLabel();
        SexCombo = new javax.swing.JComboBox<>();
        DOBChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1040, 750));
        setMinimumSize(new java.awt.Dimension(1040, 750));
        getContentPane().setLayout(null);

        SubjectTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SubjectTextField);
        SubjectTextField.setBounds(140, 510, 450, 26);

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UsernameLabel.setText("Username:");
        getContentPane().add(UsernameLabel);
        UsernameLabel.setBounds(40, 40, 90, 20);

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PasswordLabel.setText("Password:");
        getContentPane().add(PasswordLabel);
        PasswordLabel.setBounds(40, 90, 90, 30);

        jTextField_username_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_username_teacherActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_username_teacher);
        jTextField_username_teacher.setBounds(140, 40, 450, 26);
        getContentPane().add(jPasswordField_password_teacher);
        jPasswordField_password_teacher.setBounds(140, 100, 450, 26);

        AddressLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AddressLabel.setText("Address:");
        getContentPane().add(AddressLabel);
        AddressLabel.setBounds(40, 200, 80, 20);
        getContentPane().add(AddressTextField);
        AddressTextField.setBounds(140, 200, 460, 26);

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        NameLabel.setText("Teacher Name:");
        getContentPane().add(NameLabel);
        NameLabel.setBounds(10, 150, 130, 20);
        getContentPane().add(TeacherNameTextField);
        TeacherNameTextField.setBounds(140, 150, 460, 26);

        DateOfBirthLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DateOfBirthLabel.setText("Date of Birth:");
        getContentPane().add(DateOfBirthLabel);
        DateOfBirthLabel.setBounds(10, 250, 120, 20);

        SexLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SexLabel.setText("Sex:");
        getContentPane().add(SexLabel);
        SexLabel.setBounds(80, 300, 60, 20);

        PhoneNoLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PhoneNoLabel.setText("Phone no:");
        getContentPane().add(PhoneNoLabel);
        PhoneNoLabel.setBounds(40, 360, 90, 20);
        getContentPane().add(PhoneNoTextField);
        PhoneNoTextField.setBounds(140, 360, 450, 26);

        EmailNoLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EmailNoLabel.setText("Email no:");
        getContentPane().add(EmailNoLabel);
        EmailNoLabel.setBounds(40, 410, 80, 20);
        getContentPane().add(EmailTextField);
        EmailTextField.setBounds(140, 410, 450, 26);

        UniversityLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UniversityLabel.setText("University:");
        getContentPane().add(UniversityLabel);
        UniversityLabel.setBounds(30, 460, 90, 20);
        getContentPane().add(UniversityTextField);
        UniversityTextField.setBounds(140, 460, 450, 26);

        SubjectLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SubjectLabel.setText("Subject:");
        getContentPane().add(SubjectLabel);
        SubjectLabel.setBounds(50, 510, 70, 20);

        AreaPreferenceLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AreaPreferenceLabel.setText("Area preference:");
        getContentPane().add(AreaPreferenceLabel);
        AreaPreferenceLabel.setBounds(10, 550, 150, 20);
        getContentPane().add(AreaPreferenceTextField);
        AreaPreferenceTextField.setBounds(190, 550, 400, 26);

        SubjectPreferenceLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SubjectPreferenceLabel.setText("Subject preference:");
        getContentPane().add(SubjectPreferenceLabel);
        SubjectPreferenceLabel.setBounds(10, 590, 170, 20);

        SubjectPreferenceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math,Chemistry", "Physics,Math", "Chemistry,Physics", "ICT,English","Biology","Bangla,English","Bangla","English","Religion","Social Science","All subjects" }));
        getContentPane().add(SubjectPreferenceComboBox);
        SubjectPreferenceComboBox.setBounds(190, 590, 400, 26);

        ClassPreferenceLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ClassPreferenceLabel.setText("Class preference:");
        getContentPane().add(ClassPreferenceLabel);
        ClassPreferenceLabel.setBounds(10, 640, 150, 20);

        ClassPreferenceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8","9","10","11","12" }));
        ClassPreferenceComboBox.setMaximumSize(new java.awt.Dimension(1040, 750));
        ClassPreferenceComboBox.setMinimumSize(new java.awt.Dimension(1040, 750));
        getContentPane().add(ClassPreferenceComboBox);
        ClassPreferenceComboBox.setBounds(190, 630, 400, 26);

        SubmitButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        SubmitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/Submit.png"))); // NOI18N
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitButton);
        SubmitButton.setBounds(630, 619, 170, 50);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/backBUtton.png"))); // NOI18N
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(840, 619, 130, 50);

        StartingLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        StartingLabel.setText("Please fill up the given Teacher form :");
        getContentPane().add(StartingLabel);
        StartingLabel.setBounds(40, 10, 550, 20);

        SexCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(SexCombo);
        SexCombo.setBounds(140, 300, 450, 26);
        getContentPane().add(DOBChooser);
        DOBChooser.setBounds(140, 250, 460, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/depositphotos_45920955-stock-photo-pastel-purple-background-texture.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_username_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_username_teacherActionPerformed
      
    }//GEN-LAST:event_jTextField_username_teacherActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
   
        Login_Page object= new Login_Page();
        object.show();
        this.setVisible(false);
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
   
        String Password_v = new String (jPasswordField_password_teacher.getPassword());
        if(validate(Password_v) == true)
        {
            StudentTable object = new StudentTable();
            object.show();
            this.setVisible(false);
        }
        else
        {
            String msg = "Invalid Password please enter again";
            JOptionPane.showMessageDialog(this, msg);
        }
        
        try
        {
            String TeacherName = TeacherNameTextField.getText();
            String Address = AddressTextField.getText();
            String Sex = (String) SexCombo.getSelectedItem();
            String PhoneNo = PhoneNoTextField.getText();
            String EmailAddress = EmailTextField.getText();
            String University = UniversityTextField.getText();
            String Subject = SubjectTextField.getText();
            String AreaPreference = AreaPreferenceTextField.getText();
            String SubjectPrefernce=(String) SubjectPreferenceComboBox.getSelectedItem();
            String ClassPreference=(String) ClassPreferenceComboBox.getSelectedItem();
            
            PreparedStatement add = myConnectObj.prepareStatement("Insert into INCLUDE101.TEACHERTABLE values (?,?,?,?,?,?,?,?,?,?)");
            add.setString(1, TeacherName);
            add.setString(2,Address); 
            add.setString(3, Sex);
            add.setString(4, PhoneNo);
            add.setString(5, EmailAddress);
            add.setString(6,University);
            add.setString(7,Subject);
            add.setString(8,AreaPreference);
            add.setString(9,SubjectPrefernce);
            add.setString(10,ClassPreference);
            
            int row3 = add.executeUpdate();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        selectionall();
                   
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void SubjectTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectTextFieldActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JLabel AreaPreferenceLabel;
    private javax.swing.JTextField AreaPreferenceTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> ClassPreferenceComboBox;
    private javax.swing.JLabel ClassPreferenceLabel;
    private com.toedter.calendar.JDateChooser DOBChooser;
    private javax.swing.JLabel DateOfBirthLabel;
    private javax.swing.JLabel EmailNoLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhoneNoLabel;
    private javax.swing.JTextField PhoneNoTextField;
    private javax.swing.JComboBox<String> SexCombo;
    private javax.swing.JLabel SexLabel;
    private javax.swing.JLabel StartingLabel;
    private javax.swing.JLabel SubjectLabel;
    private javax.swing.JComboBox<String> SubjectPreferenceComboBox;
    private javax.swing.JLabel SubjectPreferenceLabel;
    private javax.swing.JTextField SubjectTextField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField TeacherNameTextField;
    private javax.swing.JLabel UniversityLabel;
    private javax.swing.JTextField UniversityTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField_password_teacher;
    private javax.swing.JTextField jTextField_username_teacher;
    // End of variables declaration//GEN-END:variables
}
