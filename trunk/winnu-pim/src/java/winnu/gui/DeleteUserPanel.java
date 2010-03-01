
package winnu.gui;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import winnu.control.WinnuControl;
import winnu.dao.User;

@SuppressWarnings("serial")
public class DeleteUserPanel extends javax.swing.JPanel {
    private WinnuControl control;
    private List<User> usersInList = new ArrayList();
    
    public DeleteUserPanel() { 
    	initComponents();
    }

    public void setControl(WinnuControl control){
        this.control = control;
    }

    public void preloadList(){
    	DefaultListModel listModel= new DefaultListModel();
    	
    	List<User> users = control.deleteAccountController.retrieveUsers();	  
    	
    	for(int i=0;i<users.size();i++){
    		if(!users.get(i).equals(control.getCurrentUser())){
    			listModel.addElement(users.get(i).getLastName() + " " + users.get(i).getMiddleName() + " " + users.get(i).getFirstName() +" ("+users.get(i).getUsername()+") ");
    			usersInList.add(users.get(i));
    		}
    	}
    	listUsers.setModel(listModel);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogConfirmDeletion = new javax.swing.JDialog();
        labelUserToDelete = new javax.swing.JLabel();
        buttonConfirm = new javax.swing.JButton();
        labelDeleteAccount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listUsers = new javax.swing.JList();
        labelUserList = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        labelUserToDelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelUserToDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserToDelete.setText("Delete <nameOfUser>?");
        labelUserToDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonConfirm.setText("Confirm");
        buttonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogConfirmDeletionLayout = new javax.swing.GroupLayout(dialogConfirmDeletion.getContentPane());
        dialogConfirmDeletion.getContentPane().setLayout(dialogConfirmDeletionLayout);
        dialogConfirmDeletionLayout.setHorizontalGroup(
            dialogConfirmDeletionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUserToDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addGroup(dialogConfirmDeletionLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(buttonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dialogConfirmDeletionLayout.setVerticalGroup(
            dialogConfirmDeletionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogConfirmDeletionLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(labelUserToDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        labelDeleteAccount.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        labelDeleteAccount.setText("Delete Account");

        listUsers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listUsers.setVisibleRowCount(10);
        jScrollPane1.setViewportView(listUsers);

        labelUserList.setText("User List:");

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
                        .addComponent(labelDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelUserList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(labelDeleteAccount)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUserList)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                		.addComponent(btnDelete)
                        .addComponent(btnCancel))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    	int selected = listUsers.getSelectedIndex();
		control.setCurrentSelectedUser(usersInList.get(selected));
		control.deleteAccountController.deleteAccount(control.getCurrentSelectedUser().getUsername());
		
		preloadList();
		
		JOptionPane.showMessageDialog(null, control.getCurrentSelectedUser().getUsername() +  " has been successfully deleted.", "Delete User", 1);
	}//GEN-LAST:event_btnDeleteActionPerformed
	
	 private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
	    	this.setVisible(false);
	 }

	private void buttonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmActionPerformed
		//dialogConfirmDeletion.setVisible(false);
		control.deleteAccountController.deleteAccount(control.getCurrentSelectedUser().getUsername());
		
	}//GEN-LAST:event_buttonConfirmActionPerformed

	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton buttonConfirm;
    private javax.swing.JDialog dialogConfirmDeletion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDeleteAccount;
    private javax.swing.JLabel labelUserList;
    private javax.swing.JLabel labelUserToDelete;
    private javax.swing.JList listUsers;
    // End of variables declaration//GEN-END:variables

}
