package winnu.gui;
import winnu.control.WinnuControl;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ReplaceItemPanel extends javax.swing.JPanel {
	private WinnuControl control;
	private MainForm mainform;

    public ReplaceItemPanel(MainForm mainform) {
    	this.mainform = mainform;
    	initComponents();
    }
    
	public void setControl(WinnuControl control){
        this.control = control;
    }
	
    private void initComponents() {
        rbtnGroup = new javax.swing.ButtonGroup();
        lblReplaceItem = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblItemQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblReason = new javax.swing.JLabel();
        lblItemName1 = new javax.swing.JLabel();
        lblBrandName = new javax.swing.JLabel();
        lblGenericName = new javax.swing.JLabel();
        spaneSale = new javax.swing.JScrollPane();
        lstResults = new javax.swing.JList();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSearchItem = new javax.swing.JButton();
        lblItemBatch = new javax.swing.JLabel();
        rbtnDamaged = new javax.swing.JRadioButton();
        rbtnExpired = new javax.swing.JRadioButton();
        
        lblReplaceItem.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblReplaceItem.setText("Replacement of Item");
        
        lblItemName.setText("Brand Name: ");

        lblItemQuantity.setText("Quantity:");

        txtQuantity.setMaximumSize(null);
        txtQuantity.setMinimumSize(null);

        lblReason.setText("Reason:");

        lblItemName1.setText("Generic Name:");

        lblBrandName.setText("<Select an Item>");

        lblGenericName.setText("<Select an Item>");

        lstResults.setMaximumSize(null);
        lstResults.setMinimumSize(null);
        spaneSale.setViewportView(lstResults);

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSearchItem.setText("Select Item");
        btnSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemActionPerformed(evt);
            }
        });

        lblItemBatch.setText("Choose a batch:");

        rbtnDamaged.setText("Damaged");
        rbtnExpired.setText("Expired");
        rbtnDamaged.setSelected(true);

        rbtnGroup.add(rbtnDamaged);
        rbtnGroup.add(rbtnExpired);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblReplaceItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblItemName)
                                    .addComponent(lblItemName1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenericName)
                                    .addComponent(lblBrandName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblItemQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnDamaged)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnExpired)
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemBatch)
                            .addComponent(spaneSale, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblReason)))
                .addContainerGap(927, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReplaceItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblItemName1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrandName)
                            .addComponent(lblItemName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGenericName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblItemBatch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneSale, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReason)
                    .addComponent(rbtnDamaged))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnExpired)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addGap(12, 12, 12)
                .addComponent(btnCancel)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {
    	int selectedIndex = lstResults.getSelectedIndex();
    	String quantity = txtQuantity.getText();
    	
    	if(selectedIndex >= 0) {
    		if(!quantity.equals("")) {
	    		if(control.replaceItemController.replaceItem(selectedIndex, Integer.parseInt(txtQuantity.getText()), rbtnDamaged.isSelected() ? rbtnDamaged.getText() : rbtnExpired.getText()))
		    		JOptionPane.showMessageDialog(null, txtQuantity.getText() + " unit/s of " + lblBrandName.getText() + " replacement successful.", "Replacement of Item", JOptionPane.INFORMATION_MESSAGE);
	    		else
	    			JOptionPane.showMessageDialog(null, "Quantity more/less than limit. Re-check input quantity.", "ERROR: Replace Item", JOptionPane.ERROR_MESSAGE);

    		}
    		else
    			JOptionPane.showMessageDialog(null, "Type in Quantity.", "ERROR: Replace Item", JOptionPane.ERROR_MESSAGE);
    	}
    	else
    		JOptionPane.showMessageDialog(null, "Select an Item first.", "ERROR: Replace Item", JOptionPane.ERROR_MESSAGE);
    	
    	updateView(selectedIndex);
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
    	lblGenericName.setText("<select an item>");
    	lblBrandName.setText("<select an item>");
    	txtQuantity.setText("");
    	btnSearchItem.setText("Select Item");
    	spaneSale.setViewport(null);
    	mainform.reloadMainMenu();
    }

    private void btnSearchItemActionPerformed(java.awt.event.ActionEvent evt) {
    	SearchItemFrame searchItemFrame = new SearchItemFrame(this.control);
		searchItemFrame.setVisible(true);
		
        control.setCurrentSelectedItem(null);
        
        searchItemFrame.addWindowListener(new java.awt.event.WindowAdapter(){
        	public void windowClosed(java.awt.event.WindowEvent e){
        		updateView(0);
        	}        	
        });
    }
    
    private void updateView(int index){
    	DefaultListModel items;
		
    	if(!control.getCurrentSelectedItem().equals(null)){
			lblGenericName.setText(control.getCurrentSelectedItem().getGenericName());
			lblBrandName.setText(control.getCurrentSelectedItem().getBrandName());
			btnSearchItem.setText("Change Item");
			
			if(!(items = control.replaceItemController.getWithdrawnItems(
					control.getCurrentSelectedItem().getBrandName())).equals(null)) {
		    	lstResults.setModel(items);
		    	lstResults.setSelectedIndex(index);
			}
    	}
    	else
    		JOptionPane.showMessageDialog(null, "Please select an item.", "Select Item", JOptionPane.WARNING_MESSAGE);
	}

    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnSearchItem;
    private javax.swing.JButton btnCancel;
    private javax.swing.JScrollPane spaneSale;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemName1;
    private javax.swing.JLabel lblItemQuantity;
    private javax.swing.JLabel lblItemBatch;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblReplaceItem;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblGenericName;
    private javax.swing.JList lstResults;
    private javax.swing.ButtonGroup rbtnGroup;
    private javax.swing.JRadioButton rbtnDamaged;
    private javax.swing.JRadioButton rbtnExpired;
    private javax.swing.JTextField txtQuantity;
}
