package winnu.gui;

import javax.swing.JFrame;
import winnu.control.WinnuControl;

public class MainForm extends javax.swing.JFrame {
    WinnuControl control;
    
    public MainForm(WinnuControl control) {
        this.control = control;
        System.out.println(control.getCurrentUser());

        initComponents();
        clearLayeredPane();
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        showLogin();
    }

    private void showLogin(){
        LoginForm login = new LoginForm(control,this);
        login.setVisible(true);
        this.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        layeredPane = new javax.swing.JLayeredPane();
        addNewUserPanel = new winnu.gui.AddNewUserPanel();
        addItemPanel = new winnu.gui.AddItemPanel();
        executeSalePanel = new winnu.gui.ExecuteSalePanel();
        deleteUserPanel = new winnu.gui.DeleteUserPanel();
        editUserPanel = new winnu.gui.EditUserPanel();
        replaceItemPanel = new winnu.gui.ReplaceItemPanel();
        specialWithdrawalPanel = new winnu.gui.SpecialWithdrawalPanel();
        editOwnAccount = new winnu.gui.EditOwnAccount();
        mainMenuBar = new javax.swing.JMenuBar();
        mnuUser = new javax.swing.JMenu();
        menuitemLogout = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuitemEditOwnAccount = new javax.swing.JMenuItem();
        menuitemNewUser = new javax.swing.JMenuItem();
        menuitemEditUser = new javax.swing.JMenuItem();
        menuitemDeleteUser = new javax.swing.JMenuItem();
        mnuSupplies = new javax.swing.JMenu();
        menuitemNewItem = new javax.swing.JMenuItem();
        menuitemAddStocks = new javax.swing.JMenuItem();
        menuitemSpecialWithdrawal = new javax.swing.JMenuItem();
        menuitemReplaceItem = new javax.swing.JMenuItem();
        mnuSale = new javax.swing.JMenu();
        menuitemSale = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        layeredPane.setBackground(new java.awt.Color(153, 153, 255));
        layeredPane.setOpaque(true);
        addNewUserPanel.setBounds(30, 30, 550, 500);
        layeredPane.add(addNewUserPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        addItemPanel.setBounds(30, 30, 949, 440);
        layeredPane.add(addItemPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        executeSalePanel.setBounds(30, 30, 950, 500);
        layeredPane.add(executeSalePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deleteUserPanel.setBounds(30, 30, 650, 430);
        layeredPane.add(deleteUserPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        editUserPanel.setBounds(30, 30, 473, 345);
        layeredPane.add(editUserPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        replaceItemPanel.setBounds(30, 30, 740, 440);
        layeredPane.add(replaceItemPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        specialWithdrawalPanel.setBounds(30, 30, 698, 436);
        layeredPane.add(specialWithdrawalPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        editOwnAccount.setBounds(30, 30, 565, 328);
        layeredPane.add(editOwnAccount, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mainMenuBar.setBackground(new java.awt.Color(51, 51, 51));

        mnuUser.setBackground(new java.awt.Color(153, 153, 255));
        mnuUser.setForeground(new java.awt.Color(153, 153, 255));
        mnuUser.setText("User");
        mnuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUserActionPerformed(evt);
            }
        });

        menuitemLogout.setText("Logout");
        menuitemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemLogoutActionPerformed(evt);
            }
        });
        mnuUser.add(menuitemLogout);

        jMenu1.setText("Account Management");

        menuitemEditOwnAccount.setText("Edit Own Account");
        menuitemEditOwnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemEditOwnAccountActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemEditOwnAccount);

        menuitemNewUser.setText("Create a New User Account");
        menuitemNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemNewUserActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemNewUser);

        menuitemEditUser.setText("Edit an Existing User Account");
        menuitemEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemEditUserActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemEditUser);

        menuitemDeleteUser.setText("Delete a User Account");
        menuitemDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemDeleteUserActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemDeleteUser);

        mnuUser.add(jMenu1);

        mainMenuBar.add(mnuUser);

        mnuSupplies.setBackground(new java.awt.Color(153, 153, 255));
        mnuSupplies.setForeground(new java.awt.Color(153, 153, 255));
        mnuSupplies.setText("Supplies");

        menuitemNewItem.setText("New Item");
        menuitemNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemNewItemActionPerformed(evt);
            }
        });
        mnuSupplies.add(menuitemNewItem);

        menuitemAddStocks.setText("Add new Stocks");
        menuitemAddStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemAddStocksActionPerformed(evt);
            }
        });
        mnuSupplies.add(menuitemAddStocks);

        menuitemSpecialWithdrawal.setText("Special Withdrawal");
        menuitemSpecialWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSpecialWithdrawalActionPerformed(evt);
            }
        });
        mnuSupplies.add(menuitemSpecialWithdrawal);

        menuitemReplaceItem.setText("Replace Item");
        menuitemReplaceItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemReplaceItemActionPerformed(evt);
            }
        });
        mnuSupplies.add(menuitemReplaceItem);

        mainMenuBar.add(mnuSupplies);

        mnuSale.setBackground(new java.awt.Color(153, 153, 255));
        mnuSale.setForeground(new java.awt.Color(153, 153, 255));
        mnuSale.setText("Sale");

        menuitemSale.setText("Sell Items");
        menuitemSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSaleActionPerformed(evt);
            }
        });
        mnuSale.add(menuitemSale);

        mainMenuBar.add(mnuSale);

        jMenu6.setBackground(new java.awt.Color(153, 153, 255));
        jMenu6.setForeground(new java.awt.Color(153, 153, 255));
        jMenu6.setText("Reports");
        mainMenuBar.add(jMenu6);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1223, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUserActionPerformed
        
    }//GEN-LAST:event_mnuUserActionPerformed

    private void menuitemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemLogoutActionPerformed
        control.setCurrentUser(null);
        showLogin();
    }//GEN-LAST:event_menuitemLogoutActionPerformed

    private void menuitemAddStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemAddStocksActionPerformed
        clearLayeredPane();
    }//GEN-LAST:event_menuitemAddStocksActionPerformed

    private void menuitemSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSaleActionPerformed
        clearLayeredPane();
        executeSalePanel.setVisible(true);
    }//GEN-LAST:event_menuitemSaleActionPerformed

    private void menuitemNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemNewUserActionPerformed
        clearLayeredPane();
        addNewUserPanel.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_menuitemNewUserActionPerformed

    private void menuitemNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemNewItemActionPerformed
        clearLayeredPane();
        addItemPanel.setVisible(true);
    }//GEN-LAST:event_menuitemNewItemActionPerformed

    private void menuitemDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemDeleteUserActionPerformed
        clearLayeredPane();
        deleteUserPanel.setVisible(true);
    }//GEN-LAST:event_menuitemDeleteUserActionPerformed

    private void menuitemEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemEditUserActionPerformed
        clearLayeredPane();
        editUserPanel.setVisible(true);
    }//GEN-LAST:event_menuitemEditUserActionPerformed

    private void menuitemReplaceItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemReplaceItemActionPerformed
        clearLayeredPane();
        replaceItemPanel.setVisible(true);
    }//GEN-LAST:event_menuitemReplaceItemActionPerformed

    private void menuitemSpecialWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSpecialWithdrawalActionPerformed
        clearLayeredPane();
        specialWithdrawalPanel.setVisible(true);
    }//GEN-LAST:event_menuitemSpecialWithdrawalActionPerformed

    private void menuitemEditOwnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemEditOwnAccountActionPerformed
        clearLayeredPane();
        editOwnAccount.setVisible(true);
    }//GEN-LAST:event_menuitemEditOwnAccountActionPerformed

    private void clearLayeredPane(){
        for(int i=0;i<layeredPane.getComponentCount();i++) layeredPane.getComponent(i).setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private winnu.gui.AddItemPanel addItemPanel;
    private winnu.gui.AddNewUserPanel addNewUserPanel;
    private winnu.gui.DeleteUserPanel deleteUserPanel;
    private winnu.gui.EditOwnAccount editOwnAccount;
    private winnu.gui.EditUserPanel editUserPanel;
    private winnu.gui.ExecuteSalePanel executeSalePanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenuItem menuitemAddStocks;
    private javax.swing.JMenuItem menuitemDeleteUser;
    private javax.swing.JMenuItem menuitemEditOwnAccount;
    private javax.swing.JMenuItem menuitemEditUser;
    private javax.swing.JMenuItem menuitemLogout;
    private javax.swing.JMenuItem menuitemNewItem;
    private javax.swing.JMenuItem menuitemNewUser;
    private javax.swing.JMenuItem menuitemReplaceItem;
    private javax.swing.JMenuItem menuitemSale;
    private javax.swing.JMenuItem menuitemSpecialWithdrawal;
    private javax.swing.JMenu mnuSale;
    private javax.swing.JMenu mnuSupplies;
    private javax.swing.JMenu mnuUser;
    private winnu.gui.ReplaceItemPanel replaceItemPanel;
    private winnu.gui.SpecialWithdrawalPanel specialWithdrawalPanel;
    // End of variables declaration//GEN-END:variables

}
