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
        lblPatientName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        lblDoctorName = new javax.swing.JLabel();
        spaneSelectedItems = new javax.swing.JScrollPane();
        lstSelectedItems = new javax.swing.JList();
        txtDoctorLicenseNo = new javax.swing.JTextField();
        txtDoctorS2No = new javax.swing.JTextField();
        lblDoctorLicenseNo = new javax.swing.JLabel();
        lblDoctorS2No = new javax.swing.JLabel();
        lblSale = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        pnlExecuteSale = new javax.swing.JPanel();
        txtSearchBox = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        spaneSearchResults = new javax.swing.JScrollPane();
        lstSearchResults = new javax.swing.JList();
        btnSearch = new javax.swing.JButton();
        btnAddItemToSale = new javax.swing.JButton();
        btnOverrideSale = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        lblPurchaseItems = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        
        lblPatientName.setText("Name of Patient:");

        lblDoctorName.setText("Prescribing Doctor:");

        spaneSelectedItems.setViewportView(lstSelectedItems);

        lblDoctorLicenseNo.setText("Doctor's License No.:");

        lblDoctorS2No.setText("Doctor's S2 No.:");

        lblSale.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24));
        lblSale.setText("Sale");

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

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlExecuteSale.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblSearch.setText("Search:");

        lstSearchResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        spaneSearchResults.setViewportView(lstSearchResults);

        btnSearch.setText("Go!");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
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

        lblQuantity.setText("Quantity:");
        
        lblPurchaseItems.setText("Items to Purchase:");
        
        javax.swing.GroupLayout pnlExecuteSaleLayout = new javax.swing.GroupLayout(pnlExecuteSale);
        pnlExecuteSale.setLayout(pnlExecuteSaleLayout);
        pnlExecuteSaleLayout.setHorizontalGroup(
            pnlExecuteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExecuteSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExecuteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spaneSearchResults, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addGroup(pnlExecuteSaleLayout.createSequentialGroup()
                        .addGroup(pnlExecuteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlExecuteSaleLayout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddItemToSale))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlExecuteSaleLayout.createSequentialGroup()
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlExecuteSaleLayout.setVerticalGroup(
            pnlExecuteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExecuteSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExecuteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneSearchResults, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlExecuteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItemToSale))                    
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSale, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                        .addGap(610, 610, 610))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDoctorS2No)
                            .addComponent(lblDoctorLicenseNo)
                            .addComponent(lblDoctorName)
                            .addComponent(lblPatientName))
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
                        .addComponent(lblPurchaseItems)
                        .addContainerGap(1387, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(spaneSelectedItems, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pnlExecuteSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(lblSale, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorLicenseNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorS2No)
                    .addComponent(txtDoctorS2No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPurchaseItems)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlExecuteSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spaneSelectedItems, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(btnSubmit)
                	.addComponent(btnOverrideSale)
                	.addComponent(btnCancel))
                .addContainerGap(83, Short.MAX_VALUE))
        );
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
        mainform.reloadMainMenu();
    }
    
    private void btnOverrideSaleActionPerformed(java.awt.event.ActionEvent evt) {
		overrideSaleForm = new OverrideSaleForm(control, this, lstSelectedItems.getSelectedValue().toString(), lstSelectedItems.getSelectedIndex());
		
		overrideSaleForm.getAdminInfo();
    }

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
		if(ItemPeer.getTotalQuantity(itemSearchResult.get(lstSearchResults.getSelectedIndex()).getBrandName()) >= Integer.parseInt(txtQuantity.getText())){
			btnOverrideSale.setEnabled(true);
			control.addItemToSaleController.addItemToSale(itemSearchResult.get(lstSearchResults.getSelectedIndex()),Integer.parseInt(txtQuantity.getText()));
			updateItemList();
		}
		else{
			JOptionPane.showMessageDialog(null, "Quantity exceeds stock! Enter lesser value", "ERROR", 1);
		}
		
	}
	
	public void clearFields() {
		txtDoctorName.setText("");
		txtDoctorLicenseNo.setText("");
		txtDoctorS2No.setText("");
		txtQuantity.setText("");
		txtPatientName.setText("");
		txtSearchBox.setText("");
		btnSubmit.setEnabled(false);
		btnOverrideSale.setEnabled(false);
		items.clear();
		item = "";
		itemSearchResult.clear();
		spaneSelectedItems.setViewportView(lstSelectedItems = new javax.swing.JList());
		spaneSearchResults.setViewportView(lstSearchResults = new javax.swing.JList());
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private winnu.gui.OverrideSaleForm overrideSaleForm;
	private javax.swing.JButton btnAddItemToSale;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnOverrideSale;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblDoctorLicenseNo;
    private javax.swing.JLabel lblDoctorS2No;
    private javax.swing.JLabel lblSale;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblPurchaseItems;
    private javax.swing.JPanel pnlExecuteSale;
    private javax.swing.JScrollPane spaneSelectedItems;
    private javax.swing.JScrollPane spaneSearchResults;
    private javax.swing.JList lstSearchResults;
    private javax.swing.JList lstSelectedItems;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorLicenseNo;
    private javax.swing.JTextField txtDoctorS2No;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField txtSearchBox;
//added buttons
    private javax.swing.JButton btnCancel;
    // End of variables declaration//GEN-END:variabless
}
