
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtContactDetails = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSelectUser = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18));
        jLabel1.setText("Edit User Account");

        jLabel2.setText("Username:");

        jLabel3.setText("Fullname:");

        jLabel4.setText("Position:");

        jLabel5.setText("Address:");

        jLabel6.setText("Contact Number:");

        jLabel7.setText("Last");

        jLabel8.setText("Middle");

        jLabel9.setText("First");

        jLabel10.setText("<select a user>");

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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
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
                        .addComponent(jLabel7)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        		.addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btnAccept)
                                        .addGap(5, 5, 5)
                                        .addComponent(btnCancel))
                            .addComponent(txtContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectUser))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        	contactDetails = txtContactDetails.getText();
        
        	control.editAccountController.editAccount(selectedUser.getUserId(), selectedUser.getUsername(), selectedUser.getPassword(), firstname, middlename, lastname, position, address, contactDetails, selectedUser.getType());
        	
        	 JOptionPane.showMessageDialog(null, selectedUser.getUsername() +  "'s information has been successfully updated.", "Edit Own Account", 1);
             
             mainform.reloadMainMenu();
             
             control.setCurrentSelectedUser(null);
             txtFname.setText("");
             txtMname.setText("");
             txtLname.setText("");
             txtPosition.setText("");
             txtAddress.setText("");
             txtContactDetails.setText("");
             jLabel10.setText("<select a user>");
             
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
        txtContactDetails.setText(selectedUser.getContactNo());
        txtFname.setText(selectedUser.getLastName());
        txtMname.setText(selectedUser.getMiddleName());
        txtLname.setText(selectedUser.getFirstName());
        txtPosition.setText(selectedUser.getPosition());
        jLabel10.setText(selectedUser.getUsername());
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
    	 control.setCurrentSelectedUser(null);
         txtFname.setText("");
         txtMname.setText("");
         txtLname.setText("");
         txtPosition.setText("");
         txtAddress.setText("");
         txtContactDetails.setText("");
         jLabel10.setText("<select a user>");
    	
    	//this.setVisible(false);
         mainform.reloadMainMenu();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactDetails;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMname;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables
}
