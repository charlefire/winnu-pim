
package winnu.gui;
import winnu.control.WinnuControl;

public class OverrideSalePanel extends javax.swing.JPanel {
	private WinnuControl control;

    /** Creates new form PanelOverrideSale */
    public OverrideSalePanel() {
        initComponents();
    }

	public void setControl(WinnuControl control){
        this.control = control;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSearch = new javax.swing.JButton();
        labelReplaceItem = new javax.swing.JLabel();
        textfieldItemQuantity = new javax.swing.JTextField();
        labelItemQuantity = new javax.swing.JLabel();
        labelItemPrice = new javax.swing.JLabel();
        textfieldItemPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLatestSale = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        labelReplaceItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelReplaceItem.setText("Override Sale");

        labelItemQuantity.setText("Quantity:");

        labelItemPrice.setText("Price:");

        listLatestSale.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listLatestSale);

        jLabel1.setText("Latest Sale:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReplaceItem)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelItemPrice)
                                    .addComponent(labelItemQuantity)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textfieldItemPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textfieldItemQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelReplaceItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelItemQuantity)
                    .addComponent(textfieldItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelItemPrice)
                    .addComponent(textfieldItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonSearch)
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
		Integer itemQuantity;
		Float itemPrice;
		Integer itemToOverride;

		itemQuantity = Integer.parseInt(textfieldItemQuantity.getText());
		itemPrice = Float.parseFloat(textfieldItemPrice.getText());
		itemToOverride = listLatestSale.getSelectedIndex();
	}//GEN-LAST:event_buttonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelItemPrice;
    private javax.swing.JLabel labelItemQuantity;
    private javax.swing.JLabel labelReplaceItem;
    private javax.swing.JList listLatestSale;
    private javax.swing.JTextField textfieldItemPrice;
    private javax.swing.JTextField textfieldItemQuantity;
    // End of variables declaration//GEN-END:variables

}
