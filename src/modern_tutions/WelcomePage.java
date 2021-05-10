
package modern_tutions;

public class WelcomePage extends javax.swing.JFrame
{
    public static int Student_flag =0;
    public static int teacher_flag =0;

    public WelcomePage() 
    {
        initComponents();
        setTitle("Welcome Page");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Student_Button = new javax.swing.JButton();
        About_Us = new javax.swing.JButton();
        EXIT_Button = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        Teacher_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(null);

        Student_Button.setBackground(new java.awt.Color(255, 204, 204));
        Student_Button.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        Student_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/studentIcon.png"))); // NOI18N
        Student_Button.setText("   STUDENT");
        Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Student_Button);
        Student_Button.setBounds(630, 300, 280, 100);

        About_Us.setBackground(new java.awt.Color(255, 204, 204));
        About_Us.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        About_Us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/AboutUsPic.png"))); // NOI18N
        About_Us.setText("ABOUT US ");
        About_Us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_UsActionPerformed(evt);
            }
        });
        getContentPane().add(About_Us);
        About_Us.setBounds(400, 520, 220, 50);

        EXIT_Button.setBackground(new java.awt.Color(255, 204, 204));
        EXIT_Button.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        EXIT_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/EXITpic.png"))); // NOI18N
        EXIT_Button.setText("  EXIT");
        EXIT_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT_Button);
        EXIT_Button.setBounds(400, 590, 220, 50);

        PaymentButton.setBackground(new java.awt.Color(255, 204, 204));
        PaymentButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        PaymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/tablesPic.png"))); // NOI18N
        PaymentButton.setText("PAYMENT TABLE ");
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PaymentButton);
        PaymentButton.setBounds(400, 440, 220, 60);

        Teacher_Button.setBackground(new java.awt.Color(255, 204, 255));
        Teacher_Button.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Teacher_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/school-learn-study-teacher-teaching-256.png"))); // NOI18N
        Teacher_Button.setText("TEACHER");
        Teacher_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teacher_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Teacher_Button);
        Teacher_Button.setBounds(120, 300, 290, 100);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/newsubtle-grunge-texture-packedited.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXIT_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXIT_ButtonActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_EXIT_ButtonActionPerformed

    private void About_UsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_UsActionPerformed
        
        About_Us obj = new About_Us();
        obj.show();
        this.setVisible(false);
    }//GEN-LAST:event_About_UsActionPerformed

    private void Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_ButtonActionPerformed

        Login_Page obj = new Login_Page();
        obj.show();
        Student_flag=1;
        this.setVisible(false);
        
    }//GEN-LAST:event_Student_ButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
       
        PaymentTable object1 = new PaymentTable();
        object1.show();
        this.setVisible(false);
        
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void Teacher_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teacher_ButtonActionPerformed
       
        Login_Page obj = new Login_Page();
        obj.show();
        teacher_flag=1;
        this.setVisible(false);
    }//GEN-LAST:event_Teacher_ButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new WelcomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_Us;
    private javax.swing.JButton EXIT_Button;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JButton Student_Button;
    private javax.swing.JButton Teacher_Button;
    public javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
