package com.myproject.project;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishi
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        DisplayShop();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Shop_Name_TextField = new javax.swing.JTextField();
        Shop_Owner_TextField = new javax.swing.JTextField();
        Shop_Phone_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Delete_Shop_Button = new javax.swing.JButton();
        Edit_Shop_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Add_Shop_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Shop_Table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Shop_No_TextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Shop_Username_TextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Shop_Password_TextField = new javax.swing.JTextField();
        Back_jButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Register_Shop_jLabel = new javax.swing.JLabel();
        Logout_jPanel = new javax.swing.JPanel();
        Logout_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Register Shop");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Shop Owner:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Phone:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Shop Name:");

        Delete_Shop_Button.setIcon(new javax.swing.ImageIcon("E:\\Project\\4th Sem\\Project I\\Project\\src\\main\\java\\img\\delete-user.png")); // NOI18N
        Delete_Shop_Button.setText("Delete");
        Delete_Shop_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Shop_ButtonActionPerformed(evt);
            }
        });

        Edit_Shop_Button.setIcon(new javax.swing.ImageIcon("E:\\Project\\4th Sem\\Project I\\Project\\src\\main\\java\\img\\edit-user.png")); // NOI18N
        Edit_Shop_Button.setText("Edit");
        Edit_Shop_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Shop_ButtonActionPerformed(evt);
            }
        });

        Clear_Button.setIcon(new javax.swing.ImageIcon("E:\\Project\\4th Sem\\Project I\\Project\\src\\main\\java\\img\\clear.png")); // NOI18N
        Clear_Button.setText("Clear");
        Clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_ButtonActionPerformed(evt);
            }
        });

        Add_Shop_Button.setIcon(new javax.swing.ImageIcon("E:\\Project\\4th Sem\\Project I\\Project\\src\\main\\java\\img\\add-user.png")); // NOI18N
        Add_Shop_Button.setText("Add");
        Add_Shop_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Shop_ButtonActionPerformed(evt);
            }
        });

        Shop_Table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Shop_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Shop id", "Shop name", "Shop owner", "Phone"
            }
        ));
        Shop_Table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Shop_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Shop_Table);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("List of Current Shop");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Shop No:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Username:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Password:");

        Back_jButton.setIcon(new javax.swing.ImageIcon("E:\\Project\\4th Sem\\Project I\\Project\\src\\main\\java\\img\\back-button.png")); // NOI18N
        Back_jButton.setText("Back");
        Back_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Add_Shop_Button)
                                .addGap(50, 50, 50)
                                .addComponent(Edit_Shop_Button)
                                .addGap(48, 48, 48)
                                .addComponent(Delete_Shop_Button))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Shop_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Shop_Owner_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Shop_Username_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(Clear_Button)))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Shop_No_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Shop_Phone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Shop_Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Back_jButton)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Shop_No_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Shop_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Shop_Owner_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Shop_Phone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Shop_Username_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Shop_Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Shop_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Shop_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Shop_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\Project\\4th Sem\\Project I\\Project\\src\\main\\java\\img\\admin.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel7.setText("Admin");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        Register_Shop_jLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Register_Shop_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register_Shop_jLabel.setText("Register Shop");
        Register_Shop_jLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Register_Shop_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Register_Shop_jLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Register_Shop_jLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Register_Shop_jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Register_Shop_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Logout_jPanel.setBackground(new java.awt.Color(204, 204, 255));

        Logout_jLabel.setIcon(new javax.swing.ImageIcon("E:\\Project\\4th Sem\\Project I\\Project\\src\\main\\java\\img\\logout.png")); // NOI18N
        Logout_jLabel.setText("Logout");
        Logout_jLabel.setAlignmentX(0.5F);
        Logout_jLabel.setFocusable(false);
        Logout_jLabel.setIconTextGap(6);
        Logout_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout_jLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Logout_jLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Logout_jLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Logout_jPanelLayout = new javax.swing.GroupLayout(Logout_jPanel);
        Logout_jPanel.setLayout(Logout_jPanelLayout);
        Logout_jPanelLayout.setHorizontalGroup(
            Logout_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logout_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );
        Logout_jPanelLayout.setVerticalGroup(
            Logout_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logout_jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Logout_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addGap(203, 203, 203)
                .addComponent(Logout_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

           public void DisplayShop()
    {
        try
        {
            Connection con=DatabaseConnection.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Shop_Id,Shop_Name,Shop_Owner,Shop_No,Shop_Phone,Username,Password from Shops ");
            Shop_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
    }
        
    }
    private void Edit_Shop_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Shop_ButtonActionPerformed
        // TODO add your handling code here:
        if(Shop_Name_TextField.getText().isEmpty()||Shop_No_TextField.getText().isEmpty()||Shop_Owner_TextField.getText().isEmpty()||Shop_Owner_TextField.getText().isEmpty()||Shop_Username_TextField.getText().isEmpty()||Shop_Password_TextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Missing Data");
        }
        else{
        DefaultTableModel model = (DefaultTableModel)Shop_Table.getModel();
        int Myindex=Shop_Table.getSelectedRow();
        String shopid=model.getValueAt(Myindex, 0).toString();
        String shop_name=Shop_Name_TextField.getText();
        String shop_no=Shop_No_TextField.getText();
        String shop_owner=Shop_Owner_TextField.getText();
        String shop_phone=Shop_Phone_TextField.getText();
        String shop_username=Shop_Username_TextField.getText();
        String shop_password=Shop_Password_TextField.getText();

        
        try {
            
            Connection con=DatabaseConnection.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update Shops set Shop_Name='"+shop_name+"'"+",Shop_Owner='"+shop_owner+"'"+",Shop_No='"+shop_no+"'"+",Shop_Phone='"+shop_phone+"'"+",Username='"+shop_username+"'"+",Password='"+shop_password+"'  where Shop_Id="+shopid);
            JOptionPane.showMessageDialog(null, "Data Sucessfully Updated");
            con.close();
            DisplayShop();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_Edit_Shop_ButtonActionPerformed

    private void Add_Shop_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Shop_ButtonActionPerformed
        // TODO add your handling code here:
        if(Shop_Name_TextField.getText().isEmpty()||Shop_No_TextField.getText().isEmpty()||Shop_Owner_TextField.getText().isEmpty()||Shop_Owner_TextField.getText().isEmpty()||Shop_Username_TextField.getText().isEmpty()||Shop_Password_TextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Missing Data");
        }
        else{       
        String shop_name=Shop_Name_TextField.getText();
        String shop_no=Shop_No_TextField.getText();
        String shop_owner=Shop_Owner_TextField.getText();
        String shop_phone=Shop_Phone_TextField.getText();
        String shop_username=Shop_Username_TextField.getText();
        String shop_password=Shop_Password_TextField.getText();

        try {
            Connection con=DatabaseConnection.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into Shops(Shop_Name,Shop_Owner,Shop_No,Shop_Phone,Username,Password) values('"+shop_name+"','"+shop_owner+"','"+shop_no+"','"+shop_phone+"','"+shop_username+"','"+shop_password+"')");
            JOptionPane.showMessageDialog(null, "Data Sucessfully Inserted");
            con.close();
            DisplayShop();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_Add_Shop_ButtonActionPerformed

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
        // TODO add your handling code here:
        Shop_Name_TextField.setText("");
        Shop_No_TextField.setText("");
        Shop_Owner_TextField.setText("");
        Shop_Phone_TextField.setText("");
        Shop_Username_TextField.setText("");
        Shop_Password_TextField.setText("");
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void Delete_Shop_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Shop_ButtonActionPerformed
        // TODO add your handling code here:
        if (Shop_Name_TextField.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Select Data to be deleted");
        }
        else{
        DefaultTableModel model = (DefaultTableModel)Shop_Table.getModel();
        int Myindex=Shop_Table.getSelectedRow();
        String shopid=model.getValueAt(Myindex, 0).toString();
        try {
            Connection con=DatabaseConnection.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("delete from Shops where Shop_Id="+shopid);
            JOptionPane.showMessageDialog(null, "Data Sucessfully Deleted");
            con.close();
            DisplayShop();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_Delete_Shop_ButtonActionPerformed

    private void Shop_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_TableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)Shop_Table.getModel();
        int Myindex=Shop_Table.getSelectedRow();
//        Product_Id_jLabel.setText(model.getValueAt(Myindex, 0).toString());
        Shop_Name_TextField.setText(model.getValueAt(Myindex, 1).toString());
        Shop_Owner_TextField.setText(model.getValueAt(Myindex, 2).toString());
        Shop_No_TextField.setText(model.getValueAt(Myindex, 3).toString());
        
        Shop_Phone_TextField.setText(model.getValueAt(Myindex, 4).toString());
        Shop_Username_TextField.setText(model.getValueAt(Myindex, 5).toString());
        Shop_Password_TextField.setText(model.getValueAt(Myindex, 6).toString());



    }//GEN-LAST:event_Shop_TableMouseClicked

    private void Register_Shop_jLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_Shop_jLabelMouseEntered
        // TODO add your handling code here:
         Register_Shop_jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_Register_Shop_jLabelMouseEntered

    private void Register_Shop_jLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_Shop_jLabelMouseExited
        // TODO add your handling code here:
                Register_Shop_jLabel.setBorder(null);

    }//GEN-LAST:event_Register_Shop_jLabelMouseExited

    private void Back_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_jButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Admin_login().setVisible(true);
    }//GEN-LAST:event_Back_jButtonActionPerformed

    private void Logout_jLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_jLabelMouseEntered
        // TODO add your handling code here:
        Logout_jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_Logout_jLabelMouseEntered

    private void Logout_jLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_jLabelMouseExited
        // TODO add your handling code here:
        Logout_jLabel.setBorder(null);
    }//GEN-LAST:event_Logout_jLabelMouseExited

    private void Logout_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_jLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Welcome().setVisible(true);
    }//GEN-LAST:event_Logout_jLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Shop_Button;
    private javax.swing.JButton Back_jButton;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JButton Delete_Shop_Button;
    private javax.swing.JButton Edit_Shop_Button;
    private javax.swing.JLabel Logout_jLabel;
    private javax.swing.JPanel Logout_jPanel;
    private javax.swing.JLabel Register_Shop_jLabel;
    private javax.swing.JTextField Shop_Name_TextField;
    private javax.swing.JTextField Shop_No_TextField;
    private javax.swing.JTextField Shop_Owner_TextField;
    private javax.swing.JTextField Shop_Password_TextField;
    private javax.swing.JTextField Shop_Phone_TextField;
    private javax.swing.JTable Shop_Table;
    private javax.swing.JTextField Shop_Username_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
