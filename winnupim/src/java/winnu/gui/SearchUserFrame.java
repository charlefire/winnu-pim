package winnu.gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import winnu.control.WinnuControl;
import winnu.dao.User;

@SuppressWarnings({ "serial", "unchecked" })
public class SearchUserFrame extends javax.swing.JFrame {
	private WinnuControl control = new WinnuControl();
    private List<User> usersInList = new ArrayList();
		
	public SearchUserFrame(WinnuControl control) {
        this.control = control;
        initComponents();
	}

    private void initComponents() {
    	lstModel = null;
        spaneResults = new javax.swing.JScrollPane();
        lstResults = new javax.swing.JList();
        btnSelect = new javax.swing.JButton();
        txtSearchItem = new javax.swing.JTextField();
        btnSearchItems = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        spaneResults.setViewportView(lstResults);

        btnSelect.setText("Select a User");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnSearchItems.setText("Go!");
        btnSearchItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });

        lblSearch.setText("Search:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spaneResults, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchItems))
                    .addComponent(btnSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchItems)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addGap(18, 18, 18)
                .addComponent(spaneResults, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelect)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @SuppressWarnings("static-access")
	private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {
    	lstModel= new DefaultListModel();
    	List<User> users = control.deleteAccountController.retrieveUsers();
    	String currUsername = control.getCurrentUser().getUsername();
    	
    	for(int i=0; i<users.size(); i++){
    		if(!users.get(i).getUsername().equals(currUsername)) {
	    		lstModel.addElement(users.get(i).getLastName() + " " + users.get(i).getMiddleName() + " " + users.get(i).getFirstName() +" ("+users.get(i).getUsername()+") ");
	    		usersInList.add(users.get(i));
    		}
    	}
    	
    	lstResults.setModel(lstModel);
    }

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
		int selected = lstResults.getSelectedIndex();
		
		if(lstModel != null) {
			if(lstResults.getSelectedIndex() >= 0){
				control.setCurrentSelectedUser(usersInList.get(selected));
				this.dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "Select an User first.", "ERROR: Search Item", JOptionPane.ERROR_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Search an Item first.", "ERROR: Search Item", JOptionPane.ERROR_MESSAGE);
		}
	}
    
    private javax.swing.DefaultListModel lstModel;
    private javax.swing.JButton btnSearchItems;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JScrollPane spaneResults;
    private javax.swing.JList lstResults;
    private javax.swing.JTextField txtSearchItem;
}
