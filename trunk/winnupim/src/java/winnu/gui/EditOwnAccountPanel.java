package winnu.gui;
import javax.swing.JOptionPane;

import winnu.control.WinnuControl;
import winnu.dao.User;
import winnu.dao.UserPeer;

@SuppressWarnings("serial")
public class EditOwnAccountPanel extends javax.swing.JPanel {
	private WinnuControl control;
	private MainForm mainform;

    public EditOwnAccountPanel(MainForm mainform) {
    	this.mainform = mainform;
        initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }
	
	

    private void initComponents() {
        lblUsername = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPword = new javax.swing.JLabel();
        lblEditOwnAcct = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblMName = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPosition = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtFname = new javax.swing.JTextField();
        txtMname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();

        lblUsername.setText("Username:");

        lblUsername1.setText("<username>");

        lblPassword.setText("Password:");

        lblConfirmPword.setText("Confirm Password:");

        lblEditOwnAcct.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18));
        lblEditOwnAcct.setText("Edit Own Account");

        lblFullName.setText("Full Name:");

        lblFName.setText("First");

        lblMName.setText("Middle");

        lblLName.setText("Last");

        lblPosition.setText("Position:");

        lblAddress.setText("Address:");

        lblContactNo.setText("Contact Number:");

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContactNo)
                                    .addComponent(lblAddress)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPassword)
                                            .addComponent(lblConfirmPword)
                                            .addComponent(lblFullName))
                                        .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblPosition))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtFname, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                                    .addComponent(txtContactNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                                    .addComponent(txtPosition, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btnAccept)
                                        .addGap(5, 5, 5)
                                        .addComponent(btnCancel))))
                            .addComponent(lblEditOwnAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblFName)
                        .addGap(97, 97, 97)
                        .addComponent(lblMName)
                        .addGap(88, 88, 88)
                        .addComponent(lblLName)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEditOwnAcct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername1)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConfirmPword)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFullName)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosition)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        	.addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    		.addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                		.addComponent(btnAccept)
	                        .addComponent(btnCancel)))
                    .addComponent(lblMName)
                    .addComponent(lblLName))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }

    @SuppressWarnings("deprecation")
	private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        String firstname = txtFname.getText();
        String middlename = txtMname.getText();
        String lastname = txtLname.getText();
        String position = txtPosition.getText();
        String address = txtAddress.getText();
        String contactNumber = txtContactNumber.getText();
        User currentUser = control.getCurrentUser();
    
        if((txtPassword.getText().equals("")) || (txtConfirmPassword.getText().equals("")) || (txtFname.getText().equals("")) || (txtMname.getText().equals("")) || (txtLname.getText().equals("")) || (txtPosition.getText().equals(""))){
        	JOptionPane.showMessageDialog(null, "Fields with ** should not be empty!", "Edit Own Account", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
	        if(txtPassword.getText().equals(txtConfirmPassword.getText())) {
	            control.editAccountController.editAccount(currentUser.getUserId(), 
	            		currentUser.getUsername(), txtPassword.getText(), 
	            		firstname, middlename, lastname, 
	            		position, address, contactNumber, currentUser.getType());
	            
	            control.setCurrentUser(UserPeer.retrieveUser(currentUser.getUserId()));
	            JOptionPane.showMessageDialog(null, currentUser.getUsername() +  "'s information has been successfully updated.", "Edit Own Account", 1);
	            
	            txtFname.setText("");
	            txtMname.setText("");
	            txtLname.setText("");
	            txtPosition.setText("");
	            txtAddress.setText("");
	            txtContactNumber.setText("");
	            txtPassword.setText("");
	            txtConfirmPassword.setText("");
	            
	            mainform.reloadMainMenu();
	            
	        } else {
	            System.out.println("Passwords do not match.");
	            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Edit Own Account", JOptionPane.ERROR_MESSAGE);
	        }
        }

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
    	mainform.reloadMainMenu();
    }

	public void setView(){
		User currentUser = control.getCurrentUser();
		lblUsername1.setText(currentUser.getUsername());
	    txtAddress.setText(currentUser.getAddress());
	    txtPassword.setText("");
	    txtFname.setText(currentUser.getFirstName());
	    txtMname.setText(currentUser.getMiddleName());
	    txtLname.setText(currentUser.getLastName());
	    txtConfirmPassword.setText("");
	    txtContactNumber.setText(currentUser.getContactNo());
	    txtPosition.setText(currentUser.getPosition());		
	}
	
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblConfirmPword;
    private javax.swing.JLabel lblEditOwnAcct;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblMName;
    private javax.swing.JLabel lblLName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPosition;
}
