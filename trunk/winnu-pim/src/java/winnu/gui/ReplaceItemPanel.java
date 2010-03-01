
package winnu.gui;
import winnu.control.WinnuControl;

public class ReplaceItemPanel extends javax.swing.JPanel {
	private WinnuControl control;

    /** Creates new form PanelReplaceItem */
    public ReplaceItemPanel() {
        initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        labelReplaceItem = new javax.swing.JLabel();
        labelItemName = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        textfieldItemName = new javax.swing.JTextField();
        labelItemQuantity = new javax.swing.JLabel();
        textfieldItemQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaReasonReplacement = new javax.swing.JTextArea();
        labelReason = new javax.swing.JLabel();

        labelReplaceItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelReplaceItem.setText("Replacement of Item");

        labelItemName.setText("Item Name:");

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        
        labelItemQuantity.setText("Quantity:");

        textareaReasonReplacement.setColumns(20);
        textareaReasonReplacement.setRows(5);
        jScrollPane1.setViewportView(textareaReasonReplacement);

        labelReason.setText("Reason/s:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelReplaceItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelReason)
                            .addComponent(labelItemName)
                            .addComponent(labelItemQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(buttonSearch)
                                .addGap(5, 5, 5)
                                .addComponent(btnCancel))
                            .addComponent(textfieldItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelReplaceItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelItemName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelItemQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                		.addComponent(buttonSearch)
                        .addComponent(btnCancel)))
                    .addComponent(labelReason))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
    	this.setVisible(false);
    }

	private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
		String itemName;
		Integer itemQuantity;
		String reasonReplacement;

		itemName = textfieldItemName.getText();
		itemQuantity = Integer.parseInt(textfieldItemQuantity.getText());
		reasonReplacement = textareaReasonReplacement.getText();
	}//GEN-LAST:event_buttonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton btnCancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelItemName;
    private javax.swing.JLabel labelItemQuantity;
    private javax.swing.JLabel labelReason;
    private javax.swing.JLabel labelReplaceItem;
    private javax.swing.JTextArea textareaReasonReplacement;
    private javax.swing.JTextField textfieldItemName;
    private javax.swing.JTextField textfieldItemQuantity;
    // End of variables declaration//GEN-END:variables
}
