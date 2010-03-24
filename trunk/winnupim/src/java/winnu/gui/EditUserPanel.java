
package winnu.gui;
import javax.swing.JOptionPane;

import winnu.control.WinnuControl;
import winnu.dao.User;

@SuppressWarnings("serial")
public class EditUserPanel extends javax.swing.JPanel {
	private WinnuControl control;
	private MainForm mainform;
	
    /** Creates new form EditUserPanel */
    public EditUserPanel(MainForm mainform) {
    	this.mainform = mainform;
        initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }

    private void initComponents() {
        lblEditUserAcct = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        lblMName = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        txtContacts = new javax.swing.JTextField();
        lblUsername0 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSelectUser = new javax.swing.JButton();

        lblEditUserAcct.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18));
        lblEditUserAcct.setText("Edit User Account");

        lblUsername.setText("Username:");

        lblFullName.setText("Full Name:");

        lblPosition.setText("Position:");

        lblAddress.setText("Address:");

        lblContactNo.setText("Contact Number:");

        lblLName.setText("Last");

        lblMName.setText("Middle");

        lblFName.setText("First");

        lblUsername0.setText("<select a user>");

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

        
        btnSelectUser.setText("Select User");
        btnSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditUserAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFullName)
                            .addComponent(lblAddress)
                            .addComponent(lblPosition))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblFName)
                        .addGap(78, 78, 78)
                        .addComponent(lblMName)
                        .addGap(72, 72, 72)
                        .addComponent(lblLName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContactNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        		.addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btnAccept)
                                        .addGap(5, 5, 5)
                                        .addComponent(btnCancel))
                            .addComponent(txtContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername0, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectUser))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditUserAcct)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblUsername0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullName)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName)
                    .addComponent(lblMName)
                    .addComponent(lblLName))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPosition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txtContacts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            		.addComponent(btnAccept)
                    .addComponent(btnCancel))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        String firstname;
        String middlename;
        String lastname;
        String position;
        String address;
        String contactDetails;
        User selectedUser=control.getCurrentSelectedUser();
        
        if(selectedUser != null){        
        	firstname = txtFname.getText();
        	middlename = txtMname.getText();
        	lastname = txtLname.getText();
        	position = txtPosition.getText();
        	address = txtAddress.getText();
        	contactDetails = txtContacts.getText();
        
        	control.editAccountController.editAccount(selectedUser.getUserId(), selectedUser.getUsername(), selectedUser.getPassword(), firstname, middlename, lastname, position, address, contactDetails, selectedUser.getType());
        	
        	 JOptionPane.showMessageDialog(null, selectedUser.getUsername() +  "'s information has been successfully updated.", "Edit Own Account", 1);
             
             mainform.reloadMainMenu();
             
             control.setCurrentSelectedUser(null);
             txtFname.setText("");
             txtMname.setText("");
             txtLname.setText("");
             txtPosition.setText("");
             txtAddress.setText("");
             txtContacts.setText("");
             lblUsername0.setText("<select a user>");
             
        }
        
        
    }

    private void btnSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectUserActionPerformed
        SearchUserFrame searchUserFrame = new SearchUserFrame(this.control);
        
        control.setCurrentSelectedUser(null);
        
        searchUserFrame.addWindowListener(new java.awt.event.WindowAdapter(){
        	public void windowClosed(java.awt.event.WindowEvent e){
        		if(control.getCurrentSelectedUser()!=null) updateView();
        	}        	
        });
        
        searchUserFrame.setVisible(true);        
    }
    
    private void updateView(){
    	User selectedUser = control.getCurrentSelectedUser();
        txtAddress.setText(selectedUser.getAddress());
        txtContacts.setText(selectedUser.getContactNo());
        txtFname.setText(selectedUser.getFirstName());
        txtMname.setText(selectedUser.getMiddleName());
        txtLname.setText(selectedUser.getLastName());
        txtPosition.setText(selectedUser.getPosition());
        lblUsername0.setText(selectedUser.getUsername());
    }

    public void clearFields() {
    	control.setCurrentSelectedUser(null);
        txtFname.setText("");
        txtMname.setText("");
        txtLname.setText("");
        txtPosition.setText("");
        txtAddress.setText("");
        txtContacts.setText("");
        lblUsername0.setText("<select a user>");
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
         mainform.reloadMainMenu();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JLabel lblEditUserAcct;
    private javax.swing.JLabel lblUsername0;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMName;
    private javax.swing.JLabel lblFName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContacts;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMname;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables
}
