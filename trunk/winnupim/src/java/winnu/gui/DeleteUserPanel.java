
package winnu.gui;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import winnu.control.WinnuControl;
import winnu.dao.User;

@SuppressWarnings({ "serial", "unchecked" })
public class DeleteUserPanel extends javax.swing.JPanel {
    private WinnuControl control;
    private MainForm mainform;
    private List<User> usersInList = new ArrayList();
    
    public DeleteUserPanel(MainForm mainform) { 
    	this.mainform = mainform;
    	initComponents();
    }

    public void setControl(WinnuControl control){
        this.control = control;
    }
    
    private void initComponents() {
        dlgConfirmDeletion = new javax.swing.JDialog();
        lblUserToDelete = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        lblDeleteAccount = new javax.swing.JLabel();
        spaneSearchResults = new javax.swing.JScrollPane();
        lstUsers = new javax.swing.JList();
        lblUserList = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        lblUserToDelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblUserToDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserToDelete.setText("Delete <nameOfUser>?");
        lblUserToDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogConfirmDeletionLayout = new javax.swing.GroupLayout(dlgConfirmDeletion.getContentPane());
        dlgConfirmDeletion.getContentPane().setLayout(dialogConfirmDeletionLayout);
        dialogConfirmDeletionLayout.setHorizontalGroup(
            dialogConfirmDeletionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUserToDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addGroup(dialogConfirmDeletionLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dialogConfirmDeletionLayout.setVerticalGroup(
            dialogConfirmDeletionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogConfirmDeletionLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblUserToDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        lblDeleteAccount.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        lblDeleteAccount.setText("Delete Account");

        lstUsers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstUsers.setVisibleRowCount(10);
        spaneSearchResults.setViewportView(lstUsers);

        lblUserList.setText("User List:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
                        .addComponent(lblDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblUserList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spaneSearchResults, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnCancel)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeleteAccount)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserList)
                    .addComponent(spaneSearchResults, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                		.addComponent(btnDelete)
                        .addComponent(btnCancel))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    	if(control.getCurrentSelectedUser() != null) {
			control.setCurrentSelectedUser(usersInList.get(lstUsers.getSelectedIndex()));
			control.deleteAccountController.deleteAccount(control.getCurrentSelectedUser().getUsername());
			
			preloadList();
			
			JOptionPane.showMessageDialog(null, "SUCCESS: " + control.getCurrentSelectedUser().getUsername() +  " has been deleted.", "Delete User", JOptionPane.INFORMATION_MESSAGE);
    	}
    	else {
			JOptionPane.showMessageDialog(null, "ERROR: Select a User first.", "Delete User", JOptionPane.ERROR_MESSAGE);
    	}
	}
	
    @SuppressWarnings("static-access")
	public void preloadList(){
    	DefaultListModel listModel= new DefaultListModel();
    	
    	List<User> users = control.deleteAccountController.retrieveUsers();	  
    	
    	for(int i=0;i<users.size();i++){
    		if(!users.get(i).equals(control.getCurrentUser())){
    			listModel.addElement(users.get(i).getLastName() + " " + users.get(i).getMiddleName() + " " + users.get(i).getFirstName() +" ("+users.get(i).getUsername()+") ");
    			usersInList.add(users.get(i));
    		}
    	}
    	lstUsers.setModel(listModel);
    }
	
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
		mainform.reloadMainMenu();
	 }
	
	private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmActionPerformed
		dlgConfirmDeletion.setVisible(false);
		control.deleteAccountController.deleteAccount(control.getCurrentSelectedUser().getUsername());
	}
	
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JDialog dlgConfirmDeletion;
    private javax.swing.JScrollPane spaneSearchResults;
    private javax.swing.JLabel lblDeleteAccount;
    private javax.swing.JLabel lblUserList;
    private javax.swing.JLabel lblUserToDelete;
    private javax.swing.JList lstUsers;
}
