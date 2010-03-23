package winnu.gui;

import java.awt.event.KeyEvent;
import winnu.control.WinnuControl;

@SuppressWarnings("serial")
public class OverrideSaleForm extends javax.swing.JFrame {
    public OverrideSaleForm(WinnuControl control, ExecuteSalePanel parent, String selectedItem, int selectedIndex) {
        this.control = control;
        this.parent = parent;
        this.index = selectedIndex;
        this.item = selectedItem;
    	initComponents();
    }

    private void initComponents() {
        lblEnableOverrideSale = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEnableOverrideSale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEnableOverrideSale.setText("Enable Override Sale");

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        btnConfirm.setText("Confirm");
        btnConfirm.setEnabled(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        
        txtPassword.addKeyListener(new java.awt.event.KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyTyped(KeyEvent e) {	
				btnConfirm.setEnabled(control.overrideSaleController.isValid(txtUsername, txtPassword));
			}
        });
        
        txtUsername.addKeyListener(new java.awt.event.KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyTyped(KeyEvent e) {	
				btnConfirm.setEnabled(control.overrideSaleController.isValid(txtUsername, txtPassword));
			}
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEnableOverrideSale))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername)
                                    .addComponent(lblPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnableOverrideSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }
    
	public void getAdminInfo() {
		if(control.getCurrentUser().getType().toUpperCase().equals("ADMIN")) {
			confirmOverrideSale();
			parent.updateItemList();
		}
		else {
			this.setLocation(500, 250);
			this.setResizable(false);
			this.setEnabled(true);
			this.setVisible(true);
		}
	}

	@SuppressWarnings("deprecation")
	private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {
		if(control.overrideSaleController.authenticateUser(txtUsername.getText(), txtPassword.getText())){
            confirmOverrideSale();
    		parent.updateItemList();
			control.overrideSaleController.displaySuccessMessage(this.item);
			this.setVisible(false);
    	}
		else{
    		txtPassword.setText("");
    	}
	}
	
	private void confirmOverrideSale() {
		if(control.overrideSaleController.displaySaleInfo(this.item)) {
			control.overrideSaleController.overrideSale(this.index);
			control.overrideSaleController.displaySuccessMessage(this.item);
		}
	}
	
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
	}

	private WinnuControl control;
	private ExecuteSalePanel parent;
	private int index;
	private String item;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lblEnableOverrideSale;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
}
