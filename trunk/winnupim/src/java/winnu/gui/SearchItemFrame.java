package winnu.gui;

import java.util.List;

import javax.swing.DefaultListModel;

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

        jScrollPane1 = new javax.swing.JScrollPane();
        listResults = new javax.swing.JList();
        btnSelect = new javax.swing.JButton();
        txtSearchItem = new javax.swing.JTextField();
        btnSearchItems = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(listResults);

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

        jLabel1.setText("Search:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
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
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelect)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        
        pack();
    }

    private void btnSearchItemsActionPerformed(java.awt.event.ActionEvent evt) {
    	DefaultListModel listModel= new DefaultListModel();
    	item = control.itemSearchController.searchItem(txtSearchItem.getText());	   
  	
    	for(int i=0;i<item.size();i++){
    		listModel.addElement(item.get(i).getBrandName() + " --- " + item.get(i).getGenericName());
    	}
    	
    	listResults.setModel(listModel);
    }
    
    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {
		
    	Item selected = null; 
		if(listResults.getSelectedIndex()==-1){
			System.out.println("no item selected");
		}else{
			selected = (Item) item.get(listResults.getSelectedIndex());
			control.setCurrentSelectedItem(selected);
			
			this.dispose();
		}		
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchItems;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listResults;
    private javax.swing.JTextField txtSearchItem;
    // End of variables declaration//GEN-END:variables

}
