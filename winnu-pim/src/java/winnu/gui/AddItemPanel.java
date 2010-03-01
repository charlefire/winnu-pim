
package winnu.gui;
import java.sql.Date;
import java.util.Calendar;

import winnu.control.WinnuControl;

@SuppressWarnings("serial")
public class AddItemPanel extends javax.swing.JPanel {
    private WinnuControl control;
    private boolean supplierExists=false;

    /** Creates new form thePanel */
    public AddItemPanel() {
        initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtGenericName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        eDate_Month = new javax.swing.JComboBox();
        eDate_Day = new javax.swing.JComboBox();
        eDate_Year = new javax.swing.JComboBox();
        txtSupplierName = new javax.swing.JTextField();
        btnRegulated = new javax.swing.JRadioButton();
        btnNonRegulated = new javax.swing.JRadioButton();
        btnSyrup = new javax.swing.JRadioButton();
        btnTablet = new javax.swing.JRadioButton();
        btnCapsule = new javax.swing.JRadioButton();
        txtOtherType = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtInitialQuantity = new javax.swing.JTextField();
        txtSellingPrice = new javax.swing.JTextField();
        txtAcquisitionCost = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSupplierAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSupplierContactNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMinimumSupplyLimit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        buttonGroup1.add(btnRegulated);
        buttonGroup1.add(btnNonRegulated);

        txtGenericName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenericNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Brand Name:");

        jLabel3.setText("Expiration Date:");

        jLabel4.setText("Supplier:");

        jLabel5.setText("Classification:");

        jLabel6.setText("Type:");

        jLabel7.setText("Initial Quantity:");

        jLabel8.setText("Selling Price:");

        jLabel9.setText("Acquisition Cost:");

        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });

        eDate_Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        eDate_Day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        eDate_Year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012" }));

        txtSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierNameActionPerformed(evt);
            }
        });
        txtSupplierName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSupplierNameFocusLost(evt);
            }
        });

        btnRegulated.setText("Regulated");
        btnRegulated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegulatedActionPerformed(evt);
            }
        });

        btnNonRegulated.setText("Non-Regulated");

        btnSyrup.setText("Syrup");

        btnTablet.setText("Tablet");

        btnCapsule.setText("Capsule");

        txtOtherType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtherTypeActionPerformed(evt);
            }
        });

        jLabel10.setText("Others: Pls. Specify");

        btnSubmit.setText("Accept");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        
        jLabel11.setText("Generic Name:");

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18));
        jLabel1.setText("Add New Item");

        jLabel12.setText("Name:");

        txtSupplierAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierAddressActionPerformed(evt);
            }
        });

        jLabel13.setText("Address:");

        txtSupplierContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierContactNoActionPerformed(evt);
            }
        });

        jLabel14.setText("Contact No:");

        jLabel15.setText("Minimum Supply Limit:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(btnSubmit)
                                .addGap(5, 5, 5)
                                .addComponent(btnCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGenericName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eDate_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eDate_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eDate_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInitialQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMinimumSupplyLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAcquisitionCost, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegulated)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNonRegulated))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTablet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSyrup)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCapsule))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOtherType, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtSupplierContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(494, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenericName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eDate_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eDate_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eDate_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSupplierContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegulated)
                            .addComponent(btnNonRegulated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSyrup)
                            .addComponent(btnTablet)
                            .addComponent(btnCapsule))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOtherType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtInitialQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtMinimumSupplyLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAcquisitionCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                    	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addGap(64, 64, 64)
	                        .addComponent(btnSubmit)
	                        .addComponent(btnCancel)))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenericNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenericNameActionPerformed
        
    }//GEN-LAST:event_txtGenericNameActionPerformed

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierNameActionPerformed
        
    }//GEN-LAST:event_txtSupplierNameActionPerformed

    private void btnRegulatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegulatedActionPerformed
        
    }//GEN-LAST:event_btnRegulatedActionPerformed

    private void txtOtherTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtherTypeActionPerformed
    }//GEN-LAST:event_txtOtherTypeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String genericName;
        String brandName;
        Date expirationDate;
        String supplierName;
        String supplierAddress;
        String supplierContactNo;
        String classification;
        String type;
        Integer initialQuantity;
        Float salesPrice;
        Float acquisitionCost;
        Integer minimumSupplyLimit;
        Integer supplierId;
      
        
        genericName = txtGenericName.getText();
        brandName = txtBrandName.getText();
        expirationDate = new Date(0,0,0);
        supplierName = txtSupplierName.getText();
        supplierAddress = txtSupplierAddress.getText();
        supplierContactNo = txtSupplierContactNo.getText();
        
        minimumSupplyLimit = Integer.parseInt(txtMinimumSupplyLimit.getText());
        expirationDate.setDate(Integer.parseInt(eDate_Day.getSelectedItem().toString()));
        expirationDate.setMonth(eDate_Month.getSelectedIndex());
        expirationDate.setYear(Integer.parseInt((eDate_Year.getSelectedItem()).toString())-1900);
        
        classification = btnRegulated.isSelected() ? "regulated" : (btnNonRegulated.isSelected() ? "non-regulated" : "no_selection");
        type = btnTablet.isSelected() ? "tablet" : (btnSyrup.isSelected() ? "syrup" : (btnCapsule.isSelected() ? "capsule" : "no_selection"));
        initialQuantity = Integer.parseInt(txtInitialQuantity.getText());
        salesPrice = Float.parseFloat(txtSellingPrice.getText());
        acquisitionCost = Float.parseFloat(txtAcquisitionCost.getText());
	

        control.addItemController.addItem(genericName, brandName, expirationDate, supplierName, supplierAddress, supplierContactNo, classification, type, initialQuantity, salesPrice, acquisitionCost,minimumSupplyLimit);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtSupplierAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierAddressActionPerformed

    private void txtSupplierContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierContactNoActionPerformed

    private void txtSupplierNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSupplierNameFocusLost
        if (control.addItemController.isExistingSupplier(txtSupplierName.getText())){
            this.supplierExists = true;
            
            //txtSupplierAddress.setText(); //yung address nung existitng
            //txtSupplierContactNo.setText(""); //yung contact no ng address nung exsisting
            
        }else{
            this.supplierExists = false;
            txtSupplierAddress.setText("");
            txtSupplierContactNo.setText("");
        }
    }//GEN-LAST:event_txtSupplierNameFocusLost
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
    	this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnCapsule;
    private javax.swing.JRadioButton btnNonRegulated;
    private javax.swing.JRadioButton btnRegulated;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnCancel;
    private javax.swing.JRadioButton btnSyrup;
    private javax.swing.JRadioButton btnTablet;
    private javax.swing.ButtonGroup buttonGroup1;
    @SuppressWarnings("unused")
	private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox eDate_Day;
    private javax.swing.JComboBox eDate_Month;
    private javax.swing.JComboBox eDate_Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAcquisitionCost;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtGenericName;
    private javax.swing.JTextField txtInitialQuantity;
    private javax.swing.JTextField txtMinimumSupplyLimit;
    private javax.swing.JTextField txtOtherType;
    private javax.swing.JTextField txtSellingPrice;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextField txtSupplierContactNo;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables

}
