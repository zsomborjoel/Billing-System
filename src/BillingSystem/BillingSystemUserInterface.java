package BillingSystem;

import java.sql.ResultSet;
import javax.swing.JComboBox;

public class BillingSystemUserInterface extends javax.swing.JFrame {
    private int mealPrice;
    private int subTotal;
    private int taxPaid;
    private int totalCost;
    private String firstName;
    private String surName;
    private String address;
    private String postCode;
    private String mobile;
    private String email;
    private String nationality;
    private String dateOfBirth;
    private String idType;
    private String gender;
    private String checkInDate;
    private String checkOutDate;
    private String roomName;
    private String mealName;
    private String sqlStatement;

    private BillingSystemUserInterface() {
        initComponents();
        initComboBoxesData();
    }
    
    private void initComboBoxesData() {   
        /**
         * Call sql statements to initialize database values into ComboBoxes
         */
        String[] sqlStatements = {"select roomname from hotel.room order by roomname asc", "select mealname from hotel.meal order by mealname asc"};         
        itemAddComboBox(sqlStatements[0], roomNameComboBox);
        itemAddComboBox(sqlStatements[1], mealNameCombobox);   
    }
    
    private void itemAddComboBox(String sql, JComboBox comboBox) {
        /**
         * Add database values into ComboBoxes 
         */
        ResultSet initResultSet;
        initResultSet = executeSql(sql);  
        try {
            while(initResultSet.next()){
                comboBox.addItem(initResultSet.getString(1));                
            }
        } catch (Exception e) {
            System.out.println(e);
        }    
    }
    
    private String dateFormatter(String date) {
        /**
         * Format DataComboBOx output to sql compatible date 
        */
        String newDateFormat = date.replace(".", "-").substring(0, 10);
        return newDateFormat;
    }
    
    private ResultSet executeSql(String sql) {
        /**
         * Reduce unecessary object creation to execute Sql codes
         */
        DbUtils dbUtils = new DbUtils();
        return dbUtils.execute(sql);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        printBillArea = new javax.swing.JTextArea();
        printBill = new javax.swing.JButton();
        mealPriceField = new javax.swing.JTextField();
        addMealButton = new javax.swing.JButton();
        removeMealButton = new javax.swing.JButton();
        mealNameCombobox = new javax.swing.JComboBox();
        firstNameField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        idTypeField = new javax.swing.JTextField();
        surNameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        postCodeField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        nationalityField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        nationalityLabel = new javax.swing.JLabel();
        idTypeLabel = new javax.swing.JLabel();
        dateOfBirthLabel = new javax.swing.JLabel();
        checkOutDateLabel = new javax.swing.JLabel();
        checkInDateLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        surNameLabel = new javax.swing.JLabel();
        postCodeLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        roomTypeLabel = new javax.swing.JLabel();
        roomNameComboBox = new javax.swing.JComboBox();
        taxPaidField = new javax.swing.JTextField();
        subTotalField = new javax.swing.JTextField();
        totalCostField = new javax.swing.JTextField();
        taxPaidLabel = new javax.swing.JLabel();
        subTotalLabel = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        dateOfBirthChooser = new datechooser.beans.DateChooserCombo();
        checkInDateChooser = new datechooser.beans.DateChooserCombo();
        checkOutDateChooser = new datechooser.beans.DateChooserCombo();
        addPersonButton = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        printBillArea.setColumns(20);
        printBillArea.setRows(5);
        jScrollPane1.setViewportView(printBillArea);

        printBill.setText("Print");
        printBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillActionPerformed(evt);
            }
        });

        addMealButton.setText("Add");
        addMealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMealButtonActionPerformed(evt);
            }
        });

        removeMealButton.setText("Remove");
        removeMealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMealButtonActionPerformed(evt);
            }
        });

        mealNameCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealNameComboboxActionPerformed(evt);
            }
        });

        firstNameLabel.setText("Firstname");

        nationalityLabel.setText("Nationality");

        idTypeLabel.setText("ID Type");

        dateOfBirthLabel.setText("Date of Birth");

        checkOutDateLabel.setText("Check Out Date");

        checkInDateLabel.setText("Check In Date");

        addressLabel.setText("Address");

        mobileLabel.setText("Mobile");

        emailLabel.setText("Email");

        surNameLabel.setText("Surname");

        postCodeLabel.setText("Post Code");

        genderLabel.setText("Gender");

        roomTypeLabel.setText("Room Type");

        taxPaidLabel.setText("Tax Paid");

        subTotalLabel.setText("Sub Total");

        totalCostLabel.setText("Total Cost");

        addPersonButton.setText("Add");
        addPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(postCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mobileLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(surNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkInDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkOutDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nationalityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(surNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mealNameCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addMealButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(removeMealButton)))
                                    .addComponent(taxPaidLabel)
                                    .addComponent(subTotalLabel)
                                    .addComponent(totalCostLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mealPriceField)
                                    .addComponent(totalCostField)
                                    .addComponent(subTotalField)
                                    .addComponent(taxPaidField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateOfBirthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkInDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOutDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(printBill, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addMealButton, removeMealButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressField, addressLabel, checkInDateLabel, checkOutDateLabel, dateOfBirthLabel, emailField, emailLabel, firstNameField, firstNameLabel, genderField, genderLabel, idTypeField, idTypeLabel, mobileField, mobileLabel, nationalityField, nationalityLabel, postCodeField, postCodeLabel, roomNameComboBox, roomTypeLabel, surNameField, surNameLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {subTotalLabel, taxPaidLabel, totalCostLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printBill)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(surNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(surNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postCodeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mealNameCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mealPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addMealButton)
                                    .addComponent(removeMealButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(taxPaidLabel)
                                    .addComponent(taxPaidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(subTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subTotalLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalCostLabel)
                                    .addComponent(totalCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nationalityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateOfBirthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTypeLabel)
                            .addComponent(idTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkInDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(checkInDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkOutDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(checkOutDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addPersonButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printBillActionPerformed

    private void addPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonButtonActionPerformed
        /**
         * Add new customer to database
         */
        firstName       = firstNameField.getText();
        surName         = surNameField.getText();
        address         = addressField.getText();
        postCode        = postCodeField.getText();
        mobile          = mobileField.getText();
        email           = emailField.getText();
        nationality     = nationalityField.getText();
        dateOfBirth     = dateFormatter(dateOfBirthChooser.getText());
        idType          = idTypeField.getText();
        gender          = genderField.getText();
        checkInDate     = dateFormatter(checkInDateChooser.getText());
        checkOutDate    = dateFormatter(checkOutDateChooser.getText());
        roomName        = roomNameComboBox.getSelectedItem().toString();
        
        sqlStatement = "insert into hotel.person("
                + "firstname, surname, address, postcode, mobile, email, nationality, birthdate, idtype, gender, checkin, checkout, roomid"
                + ") values('"
                + firstName + "', '" 
                + surName + "', '" 
                + address + "', '"
                + postCode + "', '"
                + mobile + "', '"
                + email + "', '"
                + nationality + "', '"
                + dateOfBirth + "', '"
                + idType + "', '"
                + gender + "', '"
                + checkInDate + "', '"
                + checkOutDate + "', ("
                + "select roomid from hotel.room where roomname = '" 
                + roomName 
                + "'));";
        executeSql(sqlStatement);
    }//GEN-LAST:event_addPersonButtonActionPerformed

    private void addMealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMealButtonActionPerformed
        /**
         * Add requested meal by customer
         */
        mealName    = mealNameCombobox.getSelectedItem().toString();       
        mealPrice   = Integer.parseInt(mealPriceField.getText());
        
        subTotal    = mealPrice;
        taxPaid     = (subTotal / 100) * 10;
        totalCost   = totalCost + subTotal + taxPaid;
        
        taxPaidField.setText(String.valueOf(taxPaid));
        subTotalField.setText(String.valueOf(subTotal));
        totalCostField.setText(String.valueOf(totalCost));
        
        sqlStatement = "insert into hotel.personmeal("
                + "personid, mealid"
                + ") values (("
                + "select personid from hotel.person where firstname || surname = " 
                + firstName.concat(surName) 
                + "order by personid desc"
                + "), ("
                + "select mealid from hotel.meail where mealname = " 
                + mealName 
                + "));";
        executeSql(sqlStatement);
    }//GEN-LAST:event_addMealButtonActionPerformed

    private void mealNameComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealNameComboboxActionPerformed
        /**
         * Set price for selected meal
         */
        ResultSet mealTypeResultSet;
        String currentMeal  = mealNameCombobox.getSelectedItem().toString();
        sqlStatement        = "select price from hotel.meal where mealname = '" + currentMeal + "';";
        mealTypeResultSet   = executeSql(sqlStatement);
        try { 
            while(mealTypeResultSet.next()) {
                mealPriceField.setText(mealTypeResultSet.getString(1));
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_mealNameComboboxActionPerformed

    private void removeMealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMealButtonActionPerformed
        /**
         * Remove unwanted meal
         */
        mealName    = mealNameCombobox.getSelectedItem().toString();
        mealPrice   = Integer.parseInt(mealPriceField.getText());  
        if (totalCost <= 0) totalCost = totalCost - mealPrice;
        totalCostField.setText(String.valueOf(totalCost));

        sqlStatement = "delete from hotel.personmeal where mealid = "
                + "(select mealid from hotel.meal where mealname = " 
                + mealName;
        executeSql(sqlStatement);        
    }//GEN-LAST:event_removeMealButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillingSystemUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystemUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystemUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystemUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystemUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMealButton;
    private javax.swing.JButton addPersonButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private datechooser.beans.DateChooserCombo checkInDateChooser;
    private javax.swing.JLabel checkInDateLabel;
    private datechooser.beans.DateChooserCombo checkOutDateChooser;
    private javax.swing.JLabel checkOutDateLabel;
    private datechooser.beans.DateChooserCombo dateOfBirthChooser;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField idTypeField;
    private javax.swing.JLabel idTypeLabel;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox mealNameCombobox;
    private javax.swing.JTextField mealPriceField;
    private javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField nationalityField;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JTextField postCodeField;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JButton printBill;
    private javax.swing.JTextArea printBillArea;
    private javax.swing.JButton removeMealButton;
    private javax.swing.JComboBox roomNameComboBox;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JTextField subTotalField;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JTextField surNameField;
    private javax.swing.JLabel surNameLabel;
    private javax.swing.JTextField taxPaidField;
    private javax.swing.JLabel taxPaidLabel;
    private javax.swing.JTextField totalCostField;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration//GEN-END:variables
}
