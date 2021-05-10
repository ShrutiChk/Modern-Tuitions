package modern_tutions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modern_tutions.WelcomePage;
import net.proteanit.sql.DbUtils;
public class StudentTable extends javax.swing.JFrame
{
    private static Connection myConnectObj=null;
    private static Statement myStatObj=null;
    private static ResultSet myResObj=null;
    DefaultTableModel model;
    public static int row_select;
    public static String studentName_selected;
    
    public StudentTable() 
    {
        initComponents();
        setTitle("Student Table");
        selectionall();
        StudentTable.setAutoCreateRowSorter(true);
    }
 
    private void selectionall()
    {
        try
        {
            myConnectObj=DriverManager.getConnection("jdbc:derby://localhost:1527/PaymentDatabase","Include101","Include101");
            myStatObj=myConnectObj.createStatement();
            myResObj=myStatObj.executeQuery("SELECT * FROM INCLUDE101.STUDENTTABLE");
            StudentTable.setModel(DbUtils.resultSetToTableModel(myResObj));
        }
        
        catch(SQLException e )
        {
            e.printStackTrace();
        }
    }   
     public boolean CellNotEditable()
    {
        StudentTable.setEnabled(false);
        return false;
    }
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        StudentTableBack = new javax.swing.JButton();
        StudentTableSearchLabel = new javax.swing.JLabel();
        StudentTableSearchBox = new javax.swing.JComboBox<>();
        StudentTableSortLabel = new javax.swing.JLabel();
        StudentTableSortBox = new javax.swing.JComboBox<>();
        SearchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DeleteButtonStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 750));
        getContentPane().setLayout(null);

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Class", "Subject", "Student Phone no.", "Email", "Student Area", "Payment Range", "Preference"
            }
        ));
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 1000, 510);

        StudentTableBack.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        StudentTableBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/backBUtton.png"))); // NOI18N
        StudentTableBack.setText("BACK");
        StudentTableBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentTableBackActionPerformed(evt);
            }
        });
        getContentPane().add(StudentTableBack);
        StudentTableBack.setBounds(860, 640, 140, 40);

        StudentTableSearchLabel.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        StudentTableSearchLabel.setText("Search By");
        getContentPane().add(StudentTableSearchLabel);
        StudentTableSearchLabel.setBounds(20, 10, 120, 30);

        StudentTableSearchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Area", "Payment Range", "Subject Prefernce","Class" }));
        StudentTableSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentTableSearchBoxActionPerformed(evt);
            }
        });
        getContentPane().add(StudentTableSearchBox);
        StudentTableSearchBox.setBounds(140, 10, 320, 30);

        StudentTableSortLabel.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        StudentTableSortLabel.setText("Sort");
        getContentPane().add(StudentTableSortLabel);
        StudentTableSortLabel.setBounds(570, 30, 150, 30);

        StudentTableSortBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Payment Range","Class","Subject","Area","University prefenrence" }));
        StudentTableSortBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableSortBoxMouseClicked(evt);
            }
        });
        StudentTableSortBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentTableSortBoxActionPerformed(evt);
            }
        });
        getContentPane().add(StudentTableSortBox);
        StudentTableSortBox.setBounds(670, 30, 270, 30);

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(SearchField);
        SearchField.setBounds(140, 50, 320, 30);

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel2.setText("Search");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 90, 25);

        DeleteButtonStudent.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        DeleteButtonStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/DeleteIcon.png"))); // NOI18N
        DeleteButtonStudent.setText("DELETE");
        DeleteButtonStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonStudentActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButtonStudent);
        DeleteButtonStudent.setBounds(680, 640, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/purple-parchment-paper-texture.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentTableSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentTableSearchBoxActionPerformed

    }//GEN-LAST:event_StudentTableSearchBoxActionPerformed
   
    private void StudentTableSortBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentTableSortBoxActionPerformed

    }//GEN-LAST:event_StudentTableSortBoxActionPerformed

    private void StudentTableBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentTableBackActionPerformed
        
        WelcomePage object = new WelcomePage();
        object.show();
        this.setVisible(false);
    }//GEN-LAST:event_StudentTableBackActionPerformed

    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableMouseClicked
       
        row_select = StudentTable.getSelectedRow();
        studentName_selected = StudentTable.getModel().getValueAt(row_select,0).toString();
        
    }//GEN-LAST:event_StudentTableMouseClicked

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyReleased
       
        String searchStudent = (String) StudentTableSearchBox.getSelectedItem();
        if(searchStudent == "Student Area")
        {
            String query1 =SearchField.getText();
            filter(query1);
        }
        else if(searchStudent == "Payment Range")
        {
            String query2 =SearchField.getText();
            filter(query2);
        }
        else if(searchStudent == "Subject Prefernce")
        {
            String query3 =SearchField.getText();
            filter(query3);
        }
        else if(searchStudent == "Class")
        {
            String query4 =SearchField.getText();
            filter(query4);
        }
        
        String query5 =SearchField.getText();
        filter(query5);
      

    }//GEN-LAST:event_SearchFieldKeyReleased

    private void DeleteButtonStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonStudentActionPerformed
        
        try 
        {
             String sql="Delete from INCLUDE101.STUDENTTABLE where STUDENT_NAME ='"+studentName_selected+"'" ;
             Statement add=myConnectObj.createStatement();
             add.executeUpdate(sql);
        }
         catch (SQLException e)
         {
             e.printStackTrace();
         }
          selectionall();
    }//GEN-LAST:event_DeleteButtonStudentActionPerformed

    private void StudentTableSortBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableSortBoxMouseClicked
   
    }//GEN-LAST:event_StudentTableSortBoxMouseClicked

    private void filter(String Query)
    {
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        TableRowSorter<DefaultTableModel> tr= new  TableRowSorter<DefaultTableModel>(model);
        StudentTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Query));
        
        
    }

     
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTable().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButtonStudent;
    private javax.swing.JTextField SearchField;
    public static javax.swing.JTable StudentTable;
    private javax.swing.JButton StudentTableBack;
    private javax.swing.JComboBox<String> StudentTableSearchBox;
    private javax.swing.JLabel StudentTableSearchLabel;
    private javax.swing.JComboBox<String> StudentTableSortBox;
    private javax.swing.JLabel StudentTableSortLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
