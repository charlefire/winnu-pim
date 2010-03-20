package winnu.gui;
import winnu.control.WinnuControl;
import javax.swing.DefaultListModel;
import java.util.List;

import winnu.dao.Item;
import winnu.dao.WithdrawnItem;

@SuppressWarnings("serial")
public class ReplaceItemPanel extends javax.swing.JPanel {
	private WinnuControl control;
	private MainForm mainform;
	@SuppressWarnings("unused")
	private List<Item> lstItemBatch;
	@SuppressWarnings("unused")
	private DefaultListModel lstModel = new DefaultListModel();

    public ReplaceItemPanel(MainForm mainform) {
    	this.mainform = mainform;
    	initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }

    private void initComponents() {

    	withdrawnItems = new java.util.ArrayList<WithdrawnItem>();
        rbtnGroup = new javax.swing.ButtonGroup();
        labelReplaceItem = new javax.swing.JLabel();
        labelItemName = new javax.swing.JLabel();
        labelItemQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        labelReason = new javax.swing.JLabel();
        labelItemName1 = new javax.swing.JLabel();
        lblBrandName = new javax.swing.JLabel();
        lblGenericName = new javax.swing.JLabel();
        spaneSale = new javax.swing.JScrollPane();
        lstResults = new javax.swing.JList();
        btnConfirm = new javax.swing.JButton();
        btnSearchItem = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        labelItemQuantity1 = new javax.swing.JLabel();
        rbtnDamaged = new javax.swing.JRadioButton();
        rbtnExpired = new javax.swing.JRadioButton();


        labelReplaceItem.setFont(new java.awt.Font("Tahoma", 0, 18));
        labelReplaceItem.setText("Replacement of Item");

        labelItemName.setText("Brand Name: ");

        labelItemQuantity.setText("Quantity:");

        txtQuantity.setMaximumSize(null);
        txtQuantity.setMinimumSize(null);

        labelReason.setText("Reason:");

        labelItemName1.setText("Generic Name:");

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

        btnSearchItem.setText("Select Item");
        btnSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemActionPerformed(evt);
            }
        });
        
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        labelItemQuantity1.setText("Choose a batch:");

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
                        .addComponent(labelReplaceItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelItemName)
                                    .addComponent(labelItemName1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenericName)
                                    .addComponent(lblBrandName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(labelItemQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnDamaged)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnExpired)
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelItemQuantity1)
                            .addComponent(spaneSale, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelReason)))
                .addContainerGap(927, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelReplaceItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelItemName1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrandName)
                            .addComponent(labelItemName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGenericName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelItemQuantity1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneSale, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelItemQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelReason)
                    .addComponent(rbtnDamaged))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnExpired)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                //.addGap(18,18,18)
                .addComponent(btnCancel)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {
    	int selectedIndex = -1;
    	
    	//public static boolean updateWithdrawnItem(int withdrawnItemId, String dateWithdrawn, String reason, int doctorId, int saleId, int itemBatchId, int userId){

    	if(!lstResults.getSelectedValue().equals(null)) {
    		selectedIndex = lstResults.getSelectedIndex();
    		
    		control.replaceItemController.replaceItem(selectedIndex, Integer.parseInt(txtQuantity.getText()), rbtnDamaged.isSelected() ? rbtnDamaged.getText() : rbtnExpired.getText());
    	}
    }

    private void btnSearchItemActionPerformed(java.awt.event.ActionEvent evt) {
    	SearchItemFrame searchItemFrame = new SearchItemFrame(this.control);
		searchItemFrame.setVisible(true);
		
        control.setCurrentSelectedItem(null);
        
        searchItemFrame.addWindowListener(new java.awt.event.WindowAdapter(){
        	public void windowClosed(java.awt.event.WindowEvent e){
        		updateView();
        	}        	
        });
    }
    
    private void updateView(){
    	lstItemBatch = control.itemSearchController.searchItem(control.getCurrentSelectedItem().getBrandName());
    	DefaultListModel items;
		
    	if(!control.getCurrentSelectedItem().equals(null)){
			lblGenericName.setText(control.getCurrentSelectedItem().getGenericName());
			lblBrandName.setText(control.getCurrentSelectedItem().getBrandName());
			btnSearchItem.setText("Change Item");

			items = control.replaceItemController.getWithdrawnItems();
			
	    	lstResults.setModel(items);
    	}
    	
	}
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
    	//this.setVisible(false);
    	mainform.reloadMainMenu();
    }

    // Variables declaration - do not modify
    @SuppressWarnings("unused")
	private java.util.List<WithdrawnItem> withdrawnItems;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnSearchItem;
    private javax.swing.JButton btnCancel;
    private javax.swing.JScrollPane spaneSale;
    private javax.swing.JLabel labelItemName;
    private javax.swing.JLabel labelItemName1;
    private javax.swing.JLabel labelItemQuantity;
    private javax.swing.JLabel labelItemQuantity1;
    private javax.swing.JLabel labelReason;
    private javax.swing.JLabel labelReplaceItem;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblGenericName;
    private javax.swing.JList lstResults;
    private javax.swing.ButtonGroup rbtnGroup;
    private javax.swing.JRadioButton rbtnDamaged;
    private javax.swing.JRadioButton rbtnExpired;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration
}
