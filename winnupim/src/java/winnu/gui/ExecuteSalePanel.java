package winnu.gui;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import winnu.control.WinnuControl;
import winnu.dao.Item;
import winnu.dao.ItemPeer;

@SuppressWarnings("serial")
public class ExecuteSalePanel extends javax.swing.JPanel {
	private WinnuControl control;
	private MainForm mainform;
	private List<Item> itemSearchResult;
	ArrayList<String> items = new ArrayList<String>();
	String item;
	
    public ExecuteSalePanel(MainForm mainform) {
    	this.mainform = mainform;
        initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }

    private void initComponents() {
        txtPatientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSelectedItems = new javax.swing.JList();
        txtDoctorLicenseNo = new javax.swing.JTextField();
        txtDoctorS2No = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtSearchBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSearchResults = new javax.swing.JList();
        txtSearch = new javax.swing.JButton();
        btnAddItemToSale = new javax.swing.JButton();
        btnOverrideSale = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
//added button
        btnCancel = new javax.swing.JButton();
        
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Name of Patient:");

        jLabel2.setText("Prescribing Doctor:");

        jScrollPane1.setViewportView(lstSelectedItems);

        jLabel4.setText("Doctor's License No.:");

        jLabel5.setText("Doctor's S2 No.:");

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24));
        jLabel6.setText("Sale");

        btnSubmit.setText("Confirm!");
        btnSubmit.setEnabled(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        
        btnOverrideSale.setEnabled(false);
        btnOverrideSale.setText("Override Sale!");
        btnOverrideSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverrideSaleActionPerformed(evt);
            }
        });
//added button
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel3.setText("Search:");

        lstSearchResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(lstSearchResults);

        txtSearch.setText("Go!");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnAddItemToSale.setText("Add To List");
        btnAddItemToSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemToSaleActionPerformed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorName3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Quantity:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddItemToSale))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItemToSale))                    
                .addContainerGap())
        );

        jLabel8.setText("Items to Purchase:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                        .addGap(610, 610, 610))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                                .addGap(692, 692, 692))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDoctorLicenseNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(txtDoctorS2No))
                                .addContainerGap(1049, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(1387, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                           .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnSubmit)
                                .addGap(10, 10, 10)
                                .addComponent(btnOverrideSale)
                                .addGap(5, 5, 5)
                                .addComponent(btnCancel)
                                ))
                        .addGap(615, 615, 615))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDoctorS2No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(btnSubmit)
                	.addComponent(btnOverrideSale)
                	.addComponent(btnCancel))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void txtDoctorName3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

	private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {       

        String doctorName = txtDoctorName.getText();
        String doctorLicenseNo = txtDoctorLicenseNo.getText();
        String doctorS2No = txtDoctorS2No.getText();
        String patientName = txtPatientName.getText();
        
        control.saleController.executeSale(patientName,"Sale", doctorName,doctorLicenseNo,doctorS2No);
		control.saleController.newSale();
		lstSelectedItems.setModel(new DefaultListModel());
		JOptionPane.showMessageDialog(null, "Transaction: Succesful!!", "Sale Item", 1);
		txtDoctorName.setText("");
        txtDoctorLicenseNo.setText("");
        txtDoctorS2No.setText("");
        txtPatientName.setText("");
        txtQuantity.setText("");
        lstSearchResults.setModel(new DefaultListModel());
        this.setVisible(false);
    }
    
    private void btnOverrideSaleActionPerformed(java.awt.event.ActionEvent evt) {    	
		overrideSaleForm = new OverrideSaleForm(control, this, lstSelectedItems.getSelectedValue().toString(), lstSelectedItems.getSelectedIndex());
		
		overrideSaleForm.getAdminInfo();
    }
    
//event for new button cancel
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
    	txtDoctorName.setText("");
        txtDoctorLicenseNo.setText("");
        txtDoctorS2No.setText("");
        txtPatientName.setText("");
        txtQuantity.setText("");
        lstSearchResults.setModel(new DefaultListModel());
        lstSelectedItems.setModel(new DefaultListModel());
        btnOverrideSale.setEnabled(false);
        btnSubmit.setEnabled(false);
        
        mainform.reloadMainMenu();
    }
    
	public void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {
    	DefaultListModel listModel= new DefaultListModel();
    	itemSearchResult = control.itemSearchController.searchItem(txtSearchBox.getText());	   
  	
    	for(int i=0;i<itemSearchResult.size();i++){
   			listModel.addElement(itemSearchResult.get(i).getBrandName() + " --- " + itemSearchResult.get(i).getGenericName()+ " ("+ItemPeer.getTotalQuantity(itemSearchResult.get(i).getBrandName())+" left) ");
    	}    	
        
    	txtQuantity.setText("1");
    	lstSearchResults.setModel(listModel);
    }

	public void updateItemList(){
    	DefaultListModel listModel= new DefaultListModel();
  	
    	for(int i=0;i<control.saleController.itemList.size();i++){
    		listModel.addElement(control.saleController.itemList.get(i).getBrandName() + " --- " + control.saleController.quantityList.get(i) + " pcs");
    	}
        
    	if(listModel.isEmpty()==false){
    		btnSubmit.setEnabled(true);
    		btnOverrideSale.setEnabled(true);
    	}
    	else{}
    	lstSelectedItems.setModel(listModel);
	}
	
	private void btnAddItemToSaleActionPerformed(java.awt.event.ActionEvent evt) {
		if( ItemPeer.getTotalQuantity(itemSearchResult.get(lstSearchResults.getSelectedIndex()).getBrandName()) >= Integer.parseInt(txtQuantity.getText())){
			btnOverrideSale.setEnabled(true);
			control.addItemToSaleController.addItemToSale(itemSearchResult.get(lstSearchResults.getSelectedIndex()),Integer.parseInt(txtQuantity.getText()));
			updateItemList();
		}
		else{
			JOptionPane.showMessageDialog(null, "Quantity exceeds stock! Enter lesser value", "ERROR", 1);
		}
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private winnu.gui.OverrideSaleForm overrideSaleForm;
	private javax.swing.JButton btnAddItemToSale;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnOverrideSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstSearchResults;
    private javax.swing.JList lstSelectedItems;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorLicenseNo;
    private javax.swing.JTextField txtDoctorS2No;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JButton txtSearch;
    private javax.swing.JTextField txtSearchBox;
//added buttons
    private javax.swing.JButton btnCancel;
    // End of variables declaration//GEN-END:variabless
}
