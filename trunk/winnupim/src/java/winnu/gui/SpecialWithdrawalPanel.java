package winnu.gui;

import java.util.ArrayList;
import java.util.List;

import winnu.control.WinnuControl;
import winnu.dao.Item;

import javax.swing.JOptionPane;

public class SpecialWithdrawalPanel extends javax.swing.JPanel {
	private WinnuControl control;
	private MainForm mainform;
	public List<Item> itemList = null;

    public SpecialWithdrawalPanel(MainForm mainform) {
        this.mainform = mainform;
    	initComponents();
    }

	public void setControl(WinnuControl control) {
        this.control = control;
    }
	
    private void initComponents() {
        rbtnGroup = new javax.swing.ButtonGroup();
        lblSpecialWithdrawal = new javax.swing.JLabel();
        lblGenericName = new javax.swing.JLabel();
        lblBrandName = new javax.swing.JLabel();
        lblGenericName2 = new javax.swing.JLabel();
        lblBrandName2 = new javax.swing.JLabel();
        btnSelectItem = new javax.swing.JButton();
        spaneResults = new javax.swing.JScrollPane();
        lstResults = new javax.swing.JList();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JFormattedTextField();
        lblReason = new javax.swing.JLabel();
        rbtnItemDisposal = new javax.swing.JRadioButton();
        rbtnItemReturn = new javax.swing.JRadioButton();
        rbtnItemFree = new javax.swing.JRadioButton();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        items = new javax.swing.DefaultListModel();
        
        lblSpecialWithdrawal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSpecialWithdrawal.setText("Special Withdrawal");

        lblGenericName.setText("Generic Name:");

        lblBrandName.setText("Brand Name:");

        lblGenericName2.setText("<select an item>");

        lblBrandName2.setText("<select an item>");

        btnSelectItem.setText("Select Item");
        btnSelectItem.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectItemActionPerformed(evt);
            }
        });
        
        lstResults.setMaximumSize(null);
        lstResults.setMinimumSize(null);
        spaneResults.setViewportView(lstResults);

        lblQuantity.setText("Quantity:");
        
        lblReason.setText("Reason/s:");

        rbtnItemDisposal.setText("Disposal of damaged/expired");
        rbtnItemDisposal.setSelected(true);
        rbtnItemReturn.setText("Return to supplier");
        rbtnItemFree.setText("Giving items for free");
        rbtnGroup.add(rbtnItemDisposal);
        rbtnGroup.add(rbtnItemReturn);
        rbtnGroup.add(rbtnItemFree);
        
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblSpecialWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBrandName)
                            .addComponent(lblGenericName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenericName2)
                            .addComponent(lblBrandName2)
                            .addComponent(btnSelectItem)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnConfirm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(spaneResults, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQuantity)
                    .addComponent(lblReason))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnItemDisposal)
                    .addComponent(rbtnItemFree)
                    .addComponent(rbtnItemReturn)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSpecialWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenericName)
                    .addComponent(lblGenericName2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrandName)
                    .addComponent(lblBrandName2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneResults, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(rbtnItemReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnItemFree, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel)
                            .addComponent(btnConfirm)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblReason)
                        .addComponent(rbtnItemDisposal)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }

	private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {
		String brandName = lblBrandName2.getText();
		int quantity = -1;
		
		try {
			quantity = Integer.parseInt(txtQuantity.getText());
		}
		catch(NumberFormatException e) { e.printStackTrace(); }
		
		int selectedIndex = lstResults.getSelectedIndex();
		String reason = rbtnItemDisposal.isSelected() ? "Disposal": (rbtnItemReturn.isSelected() ? "Return" : (rbtnItemFree.isSelected() ? "Free" : "NULL"));
		
		if(selectedIndex >= 0) {
			if(!txtQuantity.equals("") && quantity > 0 && !Integer.toString(quantity).equals(null) && !reason.equals("NULL")) {	
				if(control.specialWithdrawalController.withdrawItem(brandName, selectedIndex, quantity, reason))
					JOptionPane.showMessageDialog(null, txtQuantity.getText() + " unit/s of " + lblBrandName2.getText() +  " has been successfully withdrawn.", "Special Withdrawal", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "Quantity exceeds minimum supply limit. Please re-check.", "ERROR: Special Withdrawal", JOptionPane.ERROR_MESSAGE);
			}
			else
    			JOptionPane.showMessageDialog(null, "Type in Quantity.", "ERROR: Special Withdrawal", JOptionPane.ERROR_MESSAGE);
		}
		else
    		JOptionPane.showMessageDialog(null, "Select an Item first.", "ERROR: Special Withdrawal", JOptionPane.ERROR_MESSAGE);
		
		updateView(selectedIndex);
	}

	private void btnSelectItemActionPerformed(java.awt.event.ActionEvent evt) {
		SearchItemFrame searchItemFrame = new SearchItemFrame(this.control);
		searchItemFrame.setVisible(true);

        control.setCurrentSelectedItem(null);
        searchItemFrame.addWindowListener(new java.awt.event.WindowAdapter() {
        	public void windowClosed(java.awt.event.WindowEvent e) {
        		updateView(0);
        	}
        });
	}
    
	private void updateView(int index) {
		if(!control.getCurrentSelectedItem().equals(null)){
			lblGenericName2.setText(control.getCurrentSelectedItem().getGenericName());
			lblBrandName2.setText(control.getCurrentSelectedItem().getBrandName());
			
			if(!(items = control.specialWithdrawalController
						.getItemDetails(control.getCurrentSelectedItem().getBrandName()))
					.equals(null)) {
				lstResults.setModel(items);
				lstResults.setSelectedIndex(index);
			}
		}
	}
	
	private void resetFields() {
		lblGenericName2.setText("<select an item>");
		lblBrandName2.setText("<select an item>");
		btnSelectItem.setText("Select Item");
		txtQuantity.setText("");
		rbtnItemDisposal.setSelected(true);
		items.clear();
		lstResults.setModel(items);
	}
	
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
    	resetFields();
		
    	mainform.reloadMainMenu();
	}

	private javax.swing.DefaultListModel items;
    private javax.swing.JButton btnSelectItem;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lblGenericName2;
    private javax.swing.JLabel lblBrandName2;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblSpecialWithdrawal;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblGenericName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JScrollPane spaneResults;
    private javax.swing.JList lstResults;
    private javax.swing.JFormattedTextField txtQuantity;
    private javax.swing.ButtonGroup rbtnGroup;
    private javax.swing.JRadioButton rbtnItemDisposal;
    private javax.swing.JRadioButton rbtnItemReturn;
    private javax.swing.JRadioButton rbtnItemFree;
}
