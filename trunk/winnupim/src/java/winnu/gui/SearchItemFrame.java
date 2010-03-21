package winnu.gui;

import java.util.List;
import javax.swing.JOptionPane;

import winnu.control.WinnuControl;
import winnu.dao.Item;

@SuppressWarnings("serial")
public class SearchItemFrame extends javax.swing.JFrame {
	WinnuControl control = new WinnuControl();
	List<Item> item;
	
	public SearchItemFrame(WinnuControl control) {
        this.control = control;
        initComponents();
    }
	
    private void initComponents() {
    	lstModel= null;
        spaneResults = new javax.swing.JScrollPane();
        lstResults = new javax.swing.JList();
        btnSelect = new javax.swing.JButton();
        txtSearchItem = new javax.swing.JTextField();
        btnSearchItems = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        spaneResults.setViewportView(lstResults);

        btnSelect.setText("Select an Item");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnSearchItems.setText("Go!");
        btnSearchItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemsActionPerformed(evt);
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
    }

    private void btnSearchItemsActionPerformed(java.awt.event.ActionEvent evt) {
    	lstModel = new javax.swing.DefaultListModel();
    	
    	item = control.itemSearchController.searchItem(txtSearchItem.getText());	   
  	
    	for(int i=0;i<item.size();i++){
    		lstModel.addElement(item.get(i).getBrandName() + " --- " + item.get(i).getGenericName());
    	}
    	
    	lstResults.setModel(lstModel);
    }
    
    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {
    	if(lstModel != null) {
	    	if(lstResults.getSelectedIndex() >= 0) {
				control.setCurrentSelectedItem((Item)item.get(lstResults.getSelectedIndex()));
				this.dispose();
			}
	    	else {
	    		JOptionPane.showMessageDialog(null, "Select an Item first.", "ERROR: Search Item", JOptionPane.ERROR_MESSAGE);
			}
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Search an Item first.", "ERROR: Search Item", JOptionPane.ERROR_MESSAGE);
    	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.DefaultListModel lstModel;
    private javax.swing.JButton btnSearchItems;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JScrollPane spaneResults;
    private javax.swing.JList lstResults;
    private javax.swing.JTextField txtSearchItem;
    // End of variables declaration//GEN-END:variables

}
