package winnu.gui;
import javax.swing.JFrame;
import winnu.control.WinnuControl;
import winnu.dao.UserPeer;

@SuppressWarnings("serial")
public class MainForm extends javax.swing.JFrame {
    WinnuControl control;
    
    public MainForm(WinnuControl control) {
        this.control = control;
        
        initComponents();
        
        addNewUserPanel.setControl(this.control);
        addItemPanel.setControl(this.control);
        addSupplyPanel.setControl(this.control);
        deleteUserPanel.setControl(this.control);
        editOwnAccountPanel.setControl(this.control);
		editUserPanel.setControl(this.control);
		executeSalePanel.setControl(this.control);
		replaceItemPanel.setControl(this.control);
		specialWithdrawalPanel.setControl(this.control);
		summaryReportsPanel.setControl(this.control);
	

        clearLayeredPane();
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        
        if(UserPeer.retrieveAllUsers().size() == 0){
        	this.setEnabled(true);    	
            clearLayeredPane();
            addNewUserPanel.setVisible(true); 
        }else{        
        	showLogin();
        }
    }

    private void showLogin(){
        LoginForm login = new LoginForm(control,this);
        
        login.setLocation(500, 250);
        login.setResizable(false);
        login.setVisible(true);
         
        login.addWindowListener(new java.awt.event.WindowAdapter(){
        	public void windowClosed(java.awt.event.WindowEvent e){
        		if(!control.getCurrentUser().getType().toUpperCase().equals("ADMIN")){
        			disableAdminFunctions();
        		}else{
        			enableAdminFunctions();
        		}
        	}        	
        });
        this.setEnabled(false);
    }
    
    private void disableAdminFunctions(){
    	menuitemAddStocks.setVisible(false);
    	menuitemDeleteUser.setVisible(false);
    	menuitemEditUser.setVisible(false);
    	menuitemNewItem.setVisible(false);
    	menuitemNewUser.setVisible(false);
    	menuitemReplaceItem.setVisible(false);
    	menuitemSpecialWithdrawal.setVisible(false);   	    	
    }
    
    private void enableAdminFunctions(){
    	menuitemAddStocks.setVisible(true);
    	menuitemDeleteUser.setVisible(true);
    	menuitemEditUser.setVisible(true);
    	menuitemNewItem.setVisible(true);
    	menuitemNewUser.setVisible(true);
    	menuitemReplaceItem.setVisible(true);
    	menuitemSpecialWithdrawal.setVisible(true);   	     	    	
    }
    
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        layeredPane = new javax.swing.JLayeredPane();
        addNewUserPanel = new winnu.gui.AddNewUserPanel(this);
        addItemPanel = new winnu.gui.AddItemPanel(this);
        executeSalePanel = new winnu.gui.ExecuteSalePanel(this);
        deleteUserPanel = new winnu.gui.DeleteUserPanel(this);
        editUserPanel = new winnu.gui.EditUserPanel(this);
        replaceItemPanel = new winnu.gui.ReplaceItemPanel(this);
        specialWithdrawalPanel = new winnu.gui.SpecialWithdrawalPanel(this);
        addSupplyPanel = new winnu.gui.AddSupplyPanel(this);
        editOwnAccountPanel = new winnu.gui.EditOwnAccountPanel(this);
        summaryReportsPanel = new winnu.gui.SummaryReportsPanel(this);
        mainMenu = new winnu.gui.MainMenu(this);
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
        menuitemViewReports = new javax.swing.JMenuItem();
        mnuSale = new javax.swing.JMenu();
        menuitemSale = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        bgImage = new javax.swing.JLabel();

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
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("pim.png"))); // NOI18N
        bgImage.setBounds(880, 240, 340, 380);
        layeredPane.add(bgImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setOpaque(true);
        addNewUserPanel.setBounds(30, 30, 550, 500);
        layeredPane.add(addNewUserPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        addItemPanel.setBounds(30, 30, 1000, 500);
        layeredPane.add(addItemPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        executeSalePanel.setBounds(30, 30, 1000, 600);
        layeredPane.add(executeSalePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deleteUserPanel.setBounds(30, 30, 1000, 1000);
        layeredPane.add(deleteUserPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        editUserPanel.setBounds(30, 30, 473, 344);
        layeredPane.add(editUserPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        replaceItemPanel.setBounds(30, 30, 700, 620);
        layeredPane.add(replaceItemPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        specialWithdrawalPanel.setBounds(30, 30, 500, 500);
        layeredPane.add(specialWithdrawalPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        addSupplyPanel.setBounds(30, 30, 650, 480);
        layeredPane.add(addSupplyPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        editOwnAccountPanel.setBounds(30, 30, 565, 328);
        layeredPane.add(editOwnAccountPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        summaryReportsPanel.setBounds(30, 30, 1240, 600);
        layeredPane.add(summaryReportsPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainMenu.setBounds(30,30,320,600);
        layeredPane.add(mainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        menuitemSale.setText("New Sale");
        menuitemSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSaleActionPerformed(evt);
            }
        });
        mnuSale.add(menuitemSale);

        mainMenuBar.add(mnuSale);

        menuitemViewReports.setText("View Reports");
        menuitemViewReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemViewReportsActionPerformed(evt);
            }
        });
		
        jMenu6.setBackground(new java.awt.Color(153, 153, 255));
        jMenu6.setForeground(new java.awt.Color(153, 153, 255));
        
		jMenu6.add(menuitemViewReports);
        jMenu6.setText("Reports");
        mainMenuBar.add(jMenu6);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1223, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUserActionPerformed
        
    }//GEN-LAST:event_mnuUserActionPerformed

    protected void menuitemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemLogoutActionPerformed
        clearLayeredPane();
    	control.loginController.logout();
        showLogin();
    }//GEN-LAST:event_menuitemLogoutActionPerformed

    protected void menuitemAddStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemAddStocksActionPerformed
        clearLayeredPane();
        addSupplyPanel.setVisible(true);
    }//GEN-LAST:event_menuitemAddStocksActionPerformed

    protected void menuitemSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSaleActionPerformed
        clearLayeredPane();
        executeSalePanel.setVisible(true);
    }//GEN-LAST:event_menuitemSaleActionPerformed

    private void menuitemNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemNewUserActionPerformed
        clearLayeredPane();
        addNewUserPanel.setVisible(true);     
    }//GEN-LAST:event_menuitemNewUserActionPerformed

      void menuitemViewReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSaleActionPerformed
        clearLayeredPane();
        summaryReportsPanel.setVisible(true);     
        summaryReportsPanel.refreshReports();
    }//GEN-LAST:event_menuitemSaleActionPerformed
    
      void menuitemNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemNewItemActionPerformed
        clearLayeredPane();
        addItemPanel.setVisible(true);
    }//GEN-LAST:event_menuitemNewItemActionPerformed

    private void menuitemDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemDeleteUserActionPerformed
        clearLayeredPane();
    	deleteUserPanel.preloadList();
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
        editOwnAccountPanel.setView();
        editOwnAccountPanel.setVisible(true);
    }//GEN-LAST:event_menuitemEditOwnAccountActionPerformed

    private void clearLayeredPane(){
        for(int i=0;i<layeredPane.getComponentCount();i++) layeredPane.getComponent(i).setVisible(false);
        bgImage.setVisible(true);
       }
    
    protected void reloadMainMenu(){
    	clearLayeredPane();
    	System.out.println("na-call ako");
    	if(control.getCurrentUser()!=null)mainMenu.setVisible(true);
    	   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private winnu.gui.AddItemPanel addItemPanel;
    private winnu.gui.AddNewUserPanel addNewUserPanel;
    private winnu.gui.AddSupplyPanel addSupplyPanel;
    private winnu.gui.DeleteUserPanel deleteUserPanel;
    private winnu.gui.EditOwnAccountPanel editOwnAccountPanel;
    private winnu.gui.EditUserPanel editUserPanel;
    private winnu.gui.ExecuteSalePanel executeSalePanel;
    private winnu.gui.SummaryReportsPanel summaryReportsPanel;
    private winnu.gui.MainMenu mainMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JMenuBar mainMenuBar;
      javax.swing.JMenuItem menuitemAddStocks;
    private javax.swing.JMenuItem menuitemDeleteUser;
    private javax.swing.JMenuItem menuitemEditOwnAccount;
    private javax.swing.JMenuItem menuitemEditUser;
      javax.swing.JMenuItem menuitemLogout;
      javax.swing.JMenuItem menuitemNewItem;
    private javax.swing.JMenuItem menuitemNewUser;
    private javax.swing.JMenuItem menuitemReplaceItem;
      javax.swing.JMenuItem menuitemSale;
    private javax.swing.JMenuItem menuitemSpecialWithdrawal;
      javax.swing.JMenuItem menuitemViewReports;
    private javax.swing.JMenu mnuSale;
    private javax.swing.JMenu mnuSupplies;
    private javax.swing.JMenu mnuUser;
    private winnu.gui.ReplaceItemPanel replaceItemPanel;
    private winnu.gui.SpecialWithdrawalPanel specialWithdrawalPanel;
    private javax.swing.JLabel bgImage;
    // End of variables declaration//GEN-END:variables

}
