
package modern_tutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class Teacher_table extends javax.swing.JFrame 
{
    private static Connection myConnectObj=null;
    private static Statement myStatObj=null;
    private static ResultSet myResObj=null;
    public static int row_select;
    public static String teacherName_selected;
    
    public Teacher_table() {
        initComponents();
        selectionall();
        setTitle("Teacher Table");
        Teacher_Table.setAutoCreateRowSorter(true);
    }
     private void selectionall()
    {
        try{
                 myConnectObj=DriverManager.getConnection("jdbc:derby://localhost:1527/PaymentDatabase","Include101","Include101");
                 myStatObj=myConnectObj.createStatement(); 
                 myResObj=myStatObj.executeQuery("SELECT * FROM INCLUDE101.TEACHERTABLE");
                 Teacher_Table.setModel(DbUtils.resultSetToTableModel(myResObj));
            }
        
       catch(SQLException e )
            {
                e.printStackTrace();
            }
    }
       public boolean CellNotEditable()
        {
            Teacher_Table.setEnabled(false);
            return false;
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Teacher_Table = new javax.swing.JTable();
        jtextfield_search = new javax.swing.JTextField();
        jComboBox_search = new javax.swing.JComboBox<>();
        search = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();
        jLabel_teacher_table = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DeleteButtonTeacher = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Teacher_Table.setBackground(new java.awt.Color(255, 204, 204));
        Teacher_Table.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Teacher_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher's Name", "Adress", "Sex", "Contact No", "Email address", "Name of University", "Subject ", "Area Preference", "Subject Preference", "Class Preference"
            }
        ));
        Teacher_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Teacher_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Teacher_Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 1070, 360);

        jtextfield_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfield_searchActionPerformed(evt);
            }
        });
        jtextfield_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtextfield_searchKeyReleased(evt);
            }
        });
        jPanel1.add(jtextfield_search);
        jtextfield_search.setBounds(360, 540, 240, 30);

        jComboBox_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "University", "Sex", "Area Prefernce" ,"Subject","Subject Prefence","Class Prefence"}));
        jComboBox_search.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_searchItemStateChanged(evt);
            }
        });
        jComboBox_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_searchActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_search);
        jComboBox_search.setBounds(140, 540, 170, 30);

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("SEARCH:");
        jPanel1.add(search);
        search.setBounds(20, 540, 90, 30);

        Back_button.setBackground(new java.awt.Color(255, 204, 204));
        Back_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/backBUtton.png"))); // NOI18N
        Back_button.setText("BACK");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_button);
        Back_button.setBounds(940, 620, 130, 50);

        jLabel_teacher_table.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_teacher_table.setText("Teacher Table");
        jPanel1.add(jLabel_teacher_table);
        jLabel_teacher_table.setBounds(410, 40, 270, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sort By");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 610, 70, 22);

        DeleteButtonTeacher.setBackground(new java.awt.Color(255, 204, 204));
        DeleteButtonTeacher.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        DeleteButtonTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/DeleteIcon.png"))); // NOI18N
        DeleteButtonTeacher.setText("DELETE");
        DeleteButtonTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonTeacherActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButtonTeacher);
        DeleteButtonTeacher.setBounds(780, 620, 140, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "University Name", "Subject", "Area preference", "Class preference" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 610, 160, 26);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/teacher_student_pic.jpg"))); // NOI18N
        jPanel1.add(image);
        image.setBounds(0, 0, 1080, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
      
        WelcomePage object = new WelcomePage();
        object.show();
        this.setVisible(false);
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void jComboBox_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_searchActionPerformed

    }//GEN-LAST:event_jComboBox_searchActionPerformed

    private void jComboBox_searchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_searchItemStateChanged
      
    }//GEN-LAST:event_jComboBox_searchItemStateChanged

    private void jtextfield_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfield_searchActionPerformed
       
    }//GEN-LAST:event_jtextfield_searchActionPerformed

    
    private void jtextfield_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfield_searchKeyReleased
        // TODO add your handling code here:
        
        String searchStudent = (String) jComboBox_search.getSelectedItem();
        
        if(searchStudent == "Name")
        {
            String query1 =jtextfield_search.getText();
            filter(query1);
        }
        else if(searchStudent ==  "University")
        {
            String query1 =jtextfield_search.getText();
            filter(query1);
        }
        else if(searchStudent == "Sex")
        {
            String query2 =jtextfield_search.getText();
            filter(query2);
        }
        else if(searchStudent == "Area Prefernce")
        {
            String query3 =jtextfield_search.getText();
            filter(query3);
        }
        else if(searchStudent == "Subject")
        {
            String query4 =jtextfield_search.getText();
            filter(query4);
        }
        else if(searchStudent == "Subject Prefence")
        {
            String query4 =jtextfield_search.getText();
            filter(query4);
        }
        else if(searchStudent == "Class Prefence")
        {
            String query4 =jtextfield_search.getText();
            filter(query4);
        }
    }//GEN-LAST:event_jtextfield_searchKeyReleased

    private void DeleteButtonTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonTeacherActionPerformed
      
        try 
        {
            String sql="Delete from INCLUDE101.TEACHERTABLE where NAME ='"+teacherName_selected+"'" ;
            Statement add=myConnectObj.createStatement();
            add.executeUpdate(sql);
             
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            selectionall();
    }//GEN-LAST:event_DeleteButtonTeacherActionPerformed

    private void Teacher_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teacher_TableMouseClicked

        row_select = Teacher_Table.getSelectedRow();
        teacherName_selected = Teacher_Table.getModel().getValueAt(row_select,0).toString();
    }//GEN-LAST:event_Teacher_TableMouseClicked

    private void filter(String Query)
    {
        DefaultTableModel model = (DefaultTableModel) Teacher_Table.getModel();
        TableRowSorter<DefaultTableModel> tr= new  TableRowSorter<DefaultTableModel>(model);
        Teacher_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Query));
        
        
    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton DeleteButtonTeacher;
    public static javax.swing.JTable Teacher_Table;
    private javax.swing.JLabel image;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_teacher_table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtextfield_search;
    private javax.swing.JLabel search;
    // End of variables declaration//GEN-END:variables
}
