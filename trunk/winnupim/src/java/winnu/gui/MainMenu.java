package winnu.gui;

import java.awt.Color;

@SuppressWarnings("serial")
public class MainMenu extends javax.swing.JPanel {
	MainForm mainform;
	
    public MainMenu(MainForm mainform) {
    	this.mainform = mainform;
        initComponents();
        this.setBackground(new Color(153,153,255));
        lblAddItem1.setVisible(false);
        lblAddItem2.setVisible(false);
        lblAddSupplies1.setVisible(false);
        lblAddSupplies2.setVisible(false);
        lblNewSale1.setVisible(false);
        lblNewSale2.setVisible(false);
        lblSummaryReports1.setVisible(false);
        lblSummaryReports2.setVisible(false);
        lblLogout1.setVisible(false);
        lblLogout2.setVisible(false);
        lblExit1.setVisible(false);
        lblExit2.setVisible(false);
        btnAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("addItem_focus.png")));
                lblAddItem1.setVisible(true);
                lblAddItem2.setVisible(true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("addItem.png")));
                lblAddItem1.setVisible(false);
                lblAddItem2.setVisible(false);
            }
        });
        btnAddSupply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnAddSupply.setIcon(new javax.swing.ImageIcon(getClass().getResource("addSupply_focus.png")));
                lblAddSupplies1.setVisible(true);
                lblAddSupplies2.setVisible(true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnAddSupply.setIcon(new javax.swing.ImageIcon(getClass().getResource("addSupply.png")));
                lblAddSupplies1.setVisible(false);
                lblAddSupplies2.setVisible(false);
            }
        });
        btnNewSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnNewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("saleButton_focus.png")));
                lblNewSale1.setVisible(true);
                lblNewSale2.setVisible(true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnNewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("saleButton.png")));
                lblNewSale1.setVisible(false);
                lblNewSale2.setVisible(false);
            }
        });
        btnViewSummaryReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnViewSummaryReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("summaryReports_focus.png")));
                lblSummaryReports1.setVisible(true);
                lblSummaryReports2.setVisible(true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnViewSummaryReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("summaryReports.png")));
                lblSummaryReports1.setVisible(false);
                lblSummaryReports2.setVisible(false);
            }
        });
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("logout_focus.png")));
                lblLogout1.setVisible(true);
                lblLogout2.setVisible(true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("logout.png")));
                lblLogout1.setVisible(false);
                lblLogout2.setVisible(false);
            }
        });
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("exitButton_focus.png")));
                lblExit1.setVisible(true);
                lblExit2.setVisible(true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("exitButton.png")));
                lblExit1.setVisible(false);
                lblExit2.setVisible(false);
            }
        });
    }

    private void initComponents() {

        btnAddItem = new javax.swing.JButton();
        btnAddSupply = new javax.swing.JButton();
        btnNewSale = new javax.swing.JButton();
        btnViewSummaryReports = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblAddItem1 = new javax.swing.JLabel();
        lblAddSupplies1 = new javax.swing.JLabel();
        lblNewSale1 = new javax.swing.JLabel();
        lblSummaryReports1 = new javax.swing.JLabel();
        lblLogout1 = new javax.swing.JLabel();
        lblExit1 = new javax.swing.JLabel();
        lblAddItem2 = new javax.swing.JLabel();
        lblAddSupplies2 = new javax.swing.JLabel();
        lblNewSale2 = new javax.swing.JLabel();
        lblSummaryReports2 = new javax.swing.JLabel();
        lblLogout2 = new javax.swing.JLabel();
        lblExit2 = new javax.swing.JLabel();

        btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("addItem.png"))); // NOI18N
        btnAddItem.setToolTipText("");
        btnAddItem.setBorderPainted(false);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnAddSupply.setIcon(new javax.swing.ImageIcon(getClass().getResource("addSupply.png"))); // NOI18N
        btnAddSupply.setBorder(null);
        btnAddSupply.setBorderPainted(false);
        btnAddSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplyActionPerformed(evt);
            }
        });

        btnNewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("saleButton.png"))); // NOI18N
        btnNewSale.setBorderPainted(false);
        btnNewSale.setOpaque(false);
        btnNewSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSaleActionPerformed(evt);
            }
        });

        btnViewSummaryReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("summaryReports.png"))); // NOI18N
        btnViewSummaryReports.setBorderPainted(false);
        btnViewSummaryReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSummaryReportsActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("logout.png"))); // NOI18N
        btnLogout.setBorderPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("exitButton.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblAddItem1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblAddItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddItem1.setText("Add Item");

        lblAddSupplies1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblAddSupplies1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddSupplies1.setText("Add Supplies");

        lblNewSale1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblNewSale1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewSale1.setText("New Sale");

        lblSummaryReports1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblSummaryReports1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSummaryReports1.setText("View Summary Reports");

        lblLogout1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblLogout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout1.setText("Logout");

        lblExit1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit1.setText("Exit");

        lblAddItem2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lblAddItem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddItem2.setText("Create a new item in the database.");

        lblAddSupplies2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lblAddSupplies2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddSupplies2.setText("Add stocks of an existing item.");

        lblNewSale2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lblNewSale2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewSale2.setText("Execute a sale.");

        lblSummaryReports2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lblSummaryReports2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSummaryReports2.setText("Check sales and item history.");

        lblLogout2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lblLogout2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout2.setText("End your session.");

        lblExit2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lblExit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit2.setText("Terminate the program.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddSupply, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnViewSummaryReports, javax.swing.GroupLayout.PREFERRED_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnNewSale, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItem, 0, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddItem1)
                                        .addComponent(lblAddItem2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblAddSupplies1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAddSupplies2))
                                    .addComponent(lblSummaryReports2)
                                    .addComponent(lblSummaryReports1))
                                .addContainerGap(22, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNewSale2)
                                    .addComponent(lblNewSale1))
                                .addContainerGap()))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLogout2)
                                .addComponent(lblLogout1))
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExit2)
                            .addComponent(lblExit1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddItem1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblAddItem2)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblAddSupplies1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddSupplies2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewSummaryReports, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblSummaryReports1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSummaryReports2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNewSale, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblNewSale1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNewSale2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(lblLogout1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogout2)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblExit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblExit2)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
    	mainform.menuitemNewItemActionPerformed(evt);
    }

    private void btnAddSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplyActionPerformed
    	mainform.menuitemAddStocksActionPerformed(evt);
    }//GEN-LAST:event_btnAddSupplyActionPerformed

    private void btnNewSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSaleActionPerformed
    	mainform.menuitemSaleActionPerformed(evt);
    }//GEN-LAST:event_btnNewSaleActionPerformed

    private void btnViewSummaryReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSummaryReportsActionPerformed
    	mainform.menuitemViewReportsActionPerformed(evt);
    }//GEN-LAST:event_btnViewSummaryReportsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
    	mainform.menuitemLogoutActionPerformed(evt);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    	mainform.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddSupply;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewSale;
    private javax.swing.JButton btnViewSummaryReports;
    private javax.swing.JLabel lblAddItem1;
    private javax.swing.JLabel lblAddItem2;
    private javax.swing.JLabel lblAddSupplies1;
    private javax.swing.JLabel lblAddSupplies2;
    private javax.swing.JLabel lblExit1;
    private javax.swing.JLabel lblExit2;
    private javax.swing.JLabel lblLogout1;
    private javax.swing.JLabel lblLogout2;
    private javax.swing.JLabel lblNewSale1;
    private javax.swing.JLabel lblNewSale2;
    private javax.swing.JLabel lblSummaryReports1;
    private javax.swing.JLabel lblSummaryReports2;
    // End of variables declaration//GEN-END:variables

}
