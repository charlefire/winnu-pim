
package winnu.gui;
import javax.swing.JOptionPane;
import winnu.control.WinnuControl;

@SuppressWarnings("serial")
public class SpecialWithdrawalPanel extends javax.swing.JPanel {
	private WinnuControl control;
	private MainForm mainform;

    /** Creates new form PanelSpecialWithdrawal */
    public SpecialWithdrawalPanel(MainForm mainform) {
    	this.mainform = mainform;
        initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }
	
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonConfirm = new javax.swing.JButton();
        textfieldItemQuantity = new javax.swing.JTextField();
        labelItemName1 = new javax.swing.JLabel();
        labelItemName = new javax.swing.JLabel();
        labelSpecialWithdrawal = new javax.swing.JLabel();
        labelReason = new javax.swing.JLabel();
        btnSelectItem = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblGenericName = new javax.swing.JLabel();
        lblBrandName = new javax.swing.JLabel();
        labelItemName2 = new javax.swing.JLabel();
        rbtnItemDisposal = new javax.swing.JRadioButton();
        rbtnItemReturn = new javax.swing.JRadioButton();
        rbtnItemFree = new javax.swing.JRadioButton();
        rbtnGroup = new javax.swing.ButtonGroup();

        buttonConfirm.setText("Confirm");
        buttonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        
        labelItemName1.setText("Quantity:");

        labelItemName.setText("Generic Name:");

        labelSpecialWithdrawal.setFont(new java.awt.Font("Tahoma", 0, 18));
        labelSpecialWithdrawal.setText("Special Withdrawal");
        labelReason.setText("Reason/s:");

        btnSelectItem.setText("Select Item");
        btnSelectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectItemActionPerformed(evt);
            }
        });

        rbtnItemDisposal.setText("Disposal of damaged or expired items");
        rbtnItemReturn.setText("Return of items to supplier");
        rbtnItemFree.setText("Giving items for free");
        rbtnGroup.add(rbtnItemDisposal);
        rbtnGroup.add(rbtnItemReturn);
        rbtnGroup.add(rbtnItemFree);
        
        
        lblGenericName.setText("<select an item>");

        lblBrandName.setText("<select an item>");

        labelItemName2.setText("Brand Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelReason)
                            .addComponent(labelItemName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        		.addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(buttonConfirm)
                                        .addGap(5, 5, 5)
                                        .addComponent(btnCancel))
                            .addComponent(rbtnItemDisposal)
                            .addComponent(rbtnItemReturn)
                            .addComponent(rbtnItemFree)
                            .addComponent(textfieldItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelSpecialWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelItemName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblGenericName))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelItemName2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSelectItem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBrandName))))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSpecialWithdrawal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelItemName)
                    .addComponent(lblGenericName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrandName)
                    .addComponent(labelItemName2))
                .addGap(5, 5, 5)
                .addComponent(btnSelectItem)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelItemName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(rbtnItemDisposal)
                            .addComponent(rbtnItemReturn)
                            .addComponent(rbtnItemFree).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                		.addComponent(buttonConfirm)
	                        .addComponent(btnCancel))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelReason)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void buttonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
		@SuppressWarnings("unused")
		String genericName = lblGenericName.getText();
		String brandName = lblBrandName.getText();
		Integer quantity = Integer.parseInt(textfieldItemQuantity.getText());
		String reason = rbtnItemDisposal.isSelected() ? rbtnItemDisposal.getText() : (rbtnItemReturn.isSelected() ? rbtnItemReturn.getText() : (rbtnItemFree.isSelected() ? rbtnItemFree.getText() : ""));
		
		if(!(reason.equals("") || quantity.equals("") || quantity.equals("0") )) {	
			if(control.specialWithdrawalController.withdrawItem(brandName, quantity, reason)){
				JOptionPane.showMessageDialog(null, textfieldItemQuantity.getText() + " " + lblBrandName.getText() +  " has been successfully withdrawn.", "Special Withdrawal", 1);
				this.setVisible(false);
			}
		}
	}//GEN-LAST:event_buttonSearchActionPerformed

	private void btnSelectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectItemActionPerformed
		SearchItemFrame searchItemFrame = new SearchItemFrame(this.control);
		searchItemFrame.setVisible(true);

        control.setCurrentSelectedItem(null);
        
        searchItemFrame.addWindowListener(new java.awt.event.WindowAdapter(){
        	public void windowClosed(java.awt.event.WindowEvent e){
        		updateView();
        	}
        });        
	}//GEN-LAST:event_btnSelectItemActionPerformed
    	
	private void updateView(){		
		if(!control.getCurrentSelectedItem().equals(null)){
			lblGenericName.setText(control.getCurrentSelectedItem().getGenericName());
			lblBrandName.setText(control.getCurrentSelectedItem().getBrandName());
			btnSelectItem.setText("Change Item");
		}
	}
	
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
    	//this.setVisible(false);
		mainform.reloadMainMenu();
	}
    	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectItem;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton buttonConfirm;
    private javax.swing.JLabel labelItemName;
    private javax.swing.JLabel labelItemName1;
    private javax.swing.JLabel labelItemName2;
    private javax.swing.JLabel labelReason;
    private javax.swing.JLabel labelSpecialWithdrawal;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblGenericName;
    private javax.swing.JTextField textfieldItemQuantity;
    private javax.swing.ButtonGroup rbtnGroup;
    private javax.swing.JRadioButton rbtnItemDisposal;
    private javax.swing.JRadioButton rbtnItemReturn;
    private javax.swing.JRadioButton rbtnItemFree;
    // End of variables declaration//GEN-END:variables
}
