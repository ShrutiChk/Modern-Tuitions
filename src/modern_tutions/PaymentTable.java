
package modern_tutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class PaymentTable extends javax.swing.JFrame{
    Connection myConnectObj=null;
    Statement myStatObj=null;
    ResultSet myResObj=null;
    public static int id ;
         
    public void selectionall(){
        
      
        try{
            myConnectObj=DriverManager.getConnection("jdbc:derby://localhost:1527/PaymentDatabase","Include101","Include101");
            myStatObj=myConnectObj.createStatement();
            myResObj=myStatObj.executeQuery("SELECT * FROM INCLUDE101.PAYMENTTABLE");
            Payment_TableDesign.setModel(DbUtils.resultSetToTableModel(myResObj));
            
        }
        
       catch(SQLException e )
       {
           e.printStackTrace();
       }
    }
    public boolean CellNotEditable()
    {
        Payment_TableDesign.setEnabled(false);
        return false;
    }
  
    public PaymentTable() {
        initComponents();
        selectionall();
        setTitle("Payment Table");
    }
    public void MakeNull()
    {
             CustomerNameTextField.setText("");
             TypeComboBox.setSelectedItem(""); 
             DueDateCalender.setCalendar(null);
             PaymentDateCalender.setCalendar(null);
             SalaryTextField.setText("");
             PaidStateComboBox.setSelectedItem("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Payment_TableDesign = new javax.swing.JTable();
        CustomerNameLabel = new javax.swing.JLabel();
        CustomerNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddBUtton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Salary_label = new javax.swing.JLabel();
        SalaryTextField = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        PaidStateComboBox = new javax.swing.JComboBox<>();
        TypeComboBox = new javax.swing.JComboBox<>();
        DueDateCalender = new com.toedter.calendar.JDateChooser();
        PaymentDateCalender = new com.toedter.calendar.JDateChooser();
        IdTextField = new javax.swing.JTextField();
        Id_label = new javax.swing.JLabel();
        PayMentTable = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        CustomerNameLabel1 = new javax.swing.JLabel();
        CustomerNameLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 750));
        getContentPane().setLayout(null);

        Payment_TableDesign.setBackground(new java.awt.Color(204, 204, 255));
        Payment_TableDesign.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Payment_TableDesign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Payment_TableDesign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Payment_TableDesign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Payment_TableDesignMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Payment_TableDesign);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1090, 440);

        CustomerNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        CustomerNameLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        CustomerNameLabel.setText("Customer Name");
        getContentPane().add(CustomerNameLabel);
        CustomerNameLabel.setBounds(80, 470, 160, 40);
        getContentPane().add(CustomerNameTextField);
        CustomerNameTextField.setBounds(260, 480, 200, 20);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("Choose");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 520, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Due Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 570, 80, 14);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Payment Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 610, 140, 21);

        AddBUtton.setBackground(new java.awt.Color(255, 204, 255));
        AddBUtton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddBUtton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/add11.png"))); // NOI18N
        AddBUtton.setText("ADD");
        AddBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBUttonActionPerformed(evt);
            }
        });
        getContentPane().add(AddBUtton);
        AddBUtton.setBounds(740, 600, 120, 40);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/backBUtton.png"))); // NOI18N
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(930, 650, 130, 30);

        Salary_label.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Salary_label.setText("Salary");
        Salary_label.setMaximumSize(new java.awt.Dimension(1030, 690));
        Salary_label.setMinimumSize(new java.awt.Dimension(1030, 690));
        getContentPane().add(Salary_label);
        Salary_label.setBounds(650, 480, 70, 20);
        getContentPane().add(SalaryTextField);
        SalaryTextField.setBounds(790, 480, 140, 20);

        DeleteButton.setBackground(new java.awt.Color(255, 204, 255));
        DeleteButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/DeleteIcon.png"))); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(590, 600, 140, 40);

        UpdateButton.setBackground(new java.awt.Color(255, 204, 255));
        UpdateButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/UpdateIcon.png"))); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(870, 600, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("PaidState ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(650, 520, 100, 30);

        PaidStateComboBox.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        PaidStateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOT PAID", "PAID ", " " }));
        getContentPane().add(PaidStateComboBox);
        PaidStateComboBox.setBounds(790, 530, 130, 27);

        TypeComboBox.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher", "Student" }));
        getContentPane().add(TypeComboBox);
        TypeComboBox.setBounds(260, 520, 200, 30);
        getContentPane().add(DueDateCalender);
        DueDateCalender.setBounds(260, 570, 200, 20);
        getContentPane().add(PaymentDateCalender);
        PaymentDateCalender.setBounds(260, 610, 200, 20);

        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(IdTextField);
        IdTextField.setBounds(260, 450, 200, 26);

        Id_label.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Id_label.setText("ID");
        getContentPane().add(Id_label);
        Id_label.setBounds(80, 450, 110, 20);
        getContentPane().add(PayMentTable);
        PayMentTable.setBounds(0, 0, 0, 690);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 450, 84, 26);

        CustomerNameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        CustomerNameLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        CustomerNameLabel1.setText("Customer Name");
        getContentPane().add(CustomerNameLabel1);
        CustomerNameLabel1.setBounds(80, 470, 160, 40);

        CustomerNameLabel2.setBackground(new java.awt.Color(255, 255, 255));
        CustomerNameLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        CustomerNameLabel2.setText("Customer Name");
        getContentPane().add(CustomerNameLabel2);
        CustomerNameLabel2.setBounds(80, 470, 160, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modern_tutions/PAyemt.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1080, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBUttonActionPerformed
       
    try
    {
        //id++;
        id = Payment_TableDesign.getRowCount();
        id++;
        String Id=Integer.toString(id); 
        String CustomerName = CustomerNameTextField.getText();
        String Type =(String) TypeComboBox.getSelectedItem();   
        String DueDate=((JTextField)DueDateCalender.getDateEditor().getUiComponent()).getText();
        String PaidDate=((JTextField)PaymentDateCalender.getDateEditor().getUiComponent()).getText();
        String salary = SalaryTextField.getText();
        String AmountToBePaid="1000";
        String Paid_state = (String) PaidStateComboBox.getSelectedItem();
            
        PreparedStatement add = myConnectObj.prepareStatement("Insert into Include101.PAYMENTTABLE  values (?,?,?,?,?,?,?,?)");
        add.setString(1, Id);
        add.setString(2, CustomerName);
        add.setString(3, Type);
        add.setString(4, DueDate);
        add.setString(5, PaidDate);
        add.setString(6, salary);
        add.setString(7, AmountToBePaid);
        add.setString(8, Paid_state);     
        int row4 = add.executeUpdate();
            
        MakeNull();
       
    }
    catch(SQLException e)
    {
        e.printStackTrace();
            
    }
        selectionall();
    }//GEN-LAST:event_AddBUttonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       
        String Id=IdTextField.getText();
        try{
            String sql="Delete from INCLUDE101.PAYMENTTABLE where ID ='"+Id+"'" ;
            Statement add=myConnectObj.createStatement();
            add.executeUpdate(sql);
            MakeNull();
            id--;
             
        }catch (SQLException e) {
            e.printStackTrace();
        }
        selectionall();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        String Id =IdTextField.getText();
        String CustomerName = CustomerNameTextField.getText();
        String Type =(String) TypeComboBox.getSelectedItem();   
        String DueDate=((JTextField)DueDateCalender.getDateEditor().getUiComponent()).getText();
        String PaidDate=((JTextField)PaymentDateCalender.getDateEditor().getUiComponent()).getText();
        String salary = SalaryTextField.getText();
        String AmountToBePaid="1000";
        String Paid_state = (String) PaidStateComboBox.getSelectedItem();
            
        try{
            
            String sql="update Include101.PAYMENTTABLE set CUSTOMER_NAME ='"+CustomerName+"',TYPE ='"+Type+"',DUE_DATE='"+DueDate+"',PAID_DATE='"+PaidDate+"',SALARY= '"+salary+"',AMOUNT_TO_BE_PAID='"+AmountToBePaid+"',PAID_STATE='"+Paid_state+"'where ID='"+Id+"'";
            Statement update =myConnectObj.createStatement();
            update.executeUpdate(sql);
            MakeNull();
            
        }
        catch(SQLException e )
        {
            e.printStackTrace();
        }
        selectionall();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        WelcomePage obj = new WelcomePage();
        obj.show();
        this.setVisible(false);
     
    }//GEN-LAST:event_BackButtonActionPerformed

    private void Payment_TableDesignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payment_TableDesignMouseClicked
   
        
        try {
            
            int r = Payment_TableDesign.getSelectedRow();
            String id1= Payment_TableDesign.getModel().getValueAt(r,0).toString();
            IdTextField.setText(id1);
            String cName= Payment_TableDesign.getModel().getValueAt(r,1).toString();
            CustomerNameTextField.setText(cName);
            String choose= Payment_TableDesign.getModel().getValueAt(r,2).toString();
            TypeComboBox.setSelectedItem(choose);
            String salary1= Payment_TableDesign.getModel().getValueAt(r,5).toString();
            SalaryTextField.setText(salary1);
            String state1 = Payment_TableDesign.getModel().getValueAt(r,7).toString();
            PaidStateComboBox.setSelectedItem(state1);
            DefaultTableModel model = (DefaultTableModel)Payment_TableDesign.getModel();
            int index_d =  Payment_TableDesign.getSelectedRow();
            Date date_d = new SimpleDateFormat("MMM d, yyyy").parse((String)model.getValueAt(index_d, 4));
            DueDateCalender.setDate(date_d);
            int index_p =  Payment_TableDesign.getSelectedRow();
            Date date_p = new SimpleDateFormat("MMM d, yyyy").parse((String)model.getValueAt(index_p, 4));
            PaymentDateCalender.setDate(date_p);
            
        } catch (ParseException ex) {
            Logger.getLogger(PaymentTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
         
       
    }//GEN-LAST:event_Payment_TableDesignMouseClicked

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
   
    }//GEN-LAST:event_IdTextFieldActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new PaymentTable().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddBUtton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JLabel CustomerNameLabel1;
    private javax.swing.JLabel CustomerNameLabel2;
    public javax.swing.JTextField CustomerNameTextField;
    private javax.swing.JButton DeleteButton;
    private com.toedter.calendar.JDateChooser DueDateCalender;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JLabel Id_label;
    public javax.swing.JComboBox<String> PaidStateComboBox;
    private javax.swing.JLabel PayMentTable;
    private com.toedter.calendar.JDateChooser PaymentDateCalender;
    public javax.swing.JTable Payment_TableDesign;
    public javax.swing.JTextField SalaryTextField;
    private javax.swing.JLabel Salary_label;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
