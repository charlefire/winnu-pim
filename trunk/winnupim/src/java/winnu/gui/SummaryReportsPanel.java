
package winnu.gui;

import org.apache.torque.TorqueException;

import winnu.control.ReportController;
import winnu.control.WinnuControl;


@SuppressWarnings("serial")
public class SummaryReportsPanel extends javax.swing.JPanel {
	@SuppressWarnings("unused")
	private WinnuControl control;
	private MainForm mainform;
	
	private String selectedGenericName = "";
	private String selectedDoctor = "";
	private String selectedPatientRegulatedDrugs = "";
	private String selectedPatient = "";
	
    /** Creates new form SummaryReportsPanel */
    public SummaryReportsPanel(MainForm mainform) {
    	this.mainform = mainform;
        initComponents();
    }
    
    public void setControl(WinnuControl control){
    	this.control = control;    	
    }

    private void initComponents() {
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AITable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AIGNTable = new javax.swing.JTable();
        AIgenName = new javax.swing.JLabel();
        txtAvailableInventoryByGenericName = new javax.swing.JTextField();
        btnAvailableInventoruByGenericName = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DETable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        DPTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        DSTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        IRTable = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        STable = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        SPTable = new javax.swing.JTable();
        SPpatient = new javax.swing.JLabel();
        txtSalePerPatient = new javax.swing.JTextField();
        btnSalePerPatient = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        SRDDTable = new javax.swing.JTable();
        SRDDdoctor = new javax.swing.JLabel();
        txtSalesOfRegulatedDrugsPerDoctor = new javax.swing.JTextField();
        SRDDbutton = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        SRDPTable = new javax.swing.JTable();
        SRDPpatient = new javax.swing.JLabel();
        txtSalesOfRegulatedDrugsByPatient = new javax.swing.JTextField();
        SRDPbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AISTable = new javax.swing.JTable();
        AIStextfield = new javax.swing.JTextField();
        AISsupplier = new javax.swing.JLabel();
        AISbutton = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18));
        jLabel5.setText("Summary Reports");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        
        AITable.setEnabled(false);
        AITable.setModel(new javax.swing.table.DefaultTableModel(
            null,
            new String [] {
                "Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"
            }
        ));
        
        jScrollPane1.setViewportView(AITable);

        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1816, Short.MAX_VALUE))
        );
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        
        jTabbedPane1.addTab("Available Inventory ", jPanel1);

        AIGNTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {            	
            },            
            new String [] {
                "Item No.", "Item", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"
            }
        ));
        jScrollPane3.setViewportView(AIGNTable);

        AIgenName.setText("Generic Name: ");
        
        txtAvailableInventoryByGenericName.setText("<Enter the Generic Name Here>");
        btnAvailableInventoruByGenericName.setText("Go!");
        btnAvailableInventoruByGenericName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableInventoruByGnameButtonActionPerformed(evt);
            }
        });
        
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AIgenName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAvailableInventoryByGenericName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvailableInventoruByGenericName))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1930, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIgenName)
                    .addComponent(txtAvailableInventoryByGenericName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvailableInventoruByGenericName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Available Inventory by Generic Name ", jPanel3);
        DETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"
            }
        ));
        jScrollPane4.setViewportView(DETable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1930, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Drugs Expiring in 3 Months ", jPanel4);
     
         DPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"
            }
        ));
        jScrollPane8.setViewportView(DPTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2660, Short.MAX_VALUE)
            .addGap(0, 2660, Short.MAX_VALUE)
            .addGap(0, 2660, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1930, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Drugs Purchased ", jPanel7);

        DSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Patient", "Quantity", "Unit", "Unit Cost", "Value"
            }
        ));
        jScrollPane9.setViewportView(DSTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1930, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Drugs Sold ", jPanel8);       

        IRTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Item", "Generic Name", "Supplier", "Remaining Quantity", "Unit", "Unit Cost", "Value"
            }
        ));
        jScrollPane12.setViewportView(IRTable);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1816, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Items for Reorder ", jPanel11);

        STable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Patient", "Quantity", "Unit", "Price", "Amount", "Remarks"
            }
        ));
        jScrollPane13.setViewportView(STable);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1686, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Sales", jPanel12);

        SPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Price", "Amount", "Remarks"
            }
        ));
        jScrollPane14.setViewportView(SPTable);

        SPpatient.setText("Patient:");

        txtSalePerPatient.setText("<Enter Name of Patient Here>");

        btnSalePerPatient.setText("Go!");
        btnSalePerPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(SPpatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalePerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalePerPatient)))
                .addContainerGap(1686, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPpatient)
                    .addComponent(txtSalePerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalePerPatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Sales per Patient ", jPanel13);

        SRDDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Patient", "Quantity", "Unit", "Price", "Amount", "Remarks"
            }
        ));
        jScrollPane15.setViewportView(SRDDTable);

        SRDDdoctor.setText("Doctor:");

        txtSalesOfRegulatedDrugsPerDoctor.setText("<Enter Name of Doctor Here>");

        SRDDbutton.setText("Go!");
        SRDDbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRDDbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(SRDDdoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalesOfRegulatedDrugsPerDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SRDDbutton)))
                .addContainerGap(1686, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SRDDdoctor)
                    .addComponent(txtSalesOfRegulatedDrugsPerDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SRDDbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Sale of Regulated Drugs per Doctor ", jPanel14);

        SRDPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Physician", "Quantity", "Unit", "Price", "Amount", "Remarks"
            }
        ));
        jScrollPane16.setViewportView(SRDPTable);

        SRDPpatient.setText("Patient:");

        txtSalesOfRegulatedDrugsByPatient.setText("<Enter name of Patient Here>");

        SRDPbutton.setText("Go!");
        SRDPbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRDPbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(SRDPpatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalesOfRegulatedDrugsByPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SRDPbutton)))
                .addContainerGap(1686, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SRDPpatient)
                    .addComponent(txtSalesOfRegulatedDrugsByPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SRDPbutton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Sale of Regulated Drugs per Patient ", jPanel15);

        AISTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Item", "Generic Name", "Quantity", "Unit", "Unit Cost", "Value"
            }
        ));
        jScrollPane2.setViewportView(AISTable);

        AIStextfield.setText("jTextField1");

        AISsupplier.setText("Supplier:");

        AISbutton.setText("Go!");
        AISbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AISbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AISsupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AIStextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AISbutton)))
                .addContainerGap(1816, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AISsupplier)
                    .addComponent(AIStextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AISbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );

        jTabbedPane1.addTab("Available Inventory by Supplier ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2862, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 2037, Short.MAX_VALUE)
                        .addGap(835, 835, 835))))
                 .addGroup(layout.createSequentialGroup()
	                .addGap(600, 600, 600)
	                .addComponent(btnCancel)
	                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnCancel)
                .addContainerGap(183, Short.MAX_VALUE))
        );
    
    }

    private void availableInventoruByGnameButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	this.selectedGenericName = txtAvailableInventoryByGenericName.getText();
    	try {
			refreshReports();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (TorqueException e) {
			e.printStackTrace();
		}    	
		
    }
    private void SPbuttonActionPerformed(java.awt.event.ActionEvent evt) {
    	selectedPatient = txtSalePerPatient.getText();
    	try {
			this.refreshReports();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (TorqueException e) {
			e.printStackTrace();
		}
    }
    
    private void SRDDbuttonActionPerformed(java.awt.event.ActionEvent evt) {
    	selectedDoctor = txtSalesOfRegulatedDrugsPerDoctor.getText();
    	try {
			this.refreshReports();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (TorqueException e) {
			e.printStackTrace();
		}
    }

    private void SRDPbuttonActionPerformed(java.awt.event.ActionEvent evt) {
    	selectedPatientRegulatedDrugs = txtSalesOfRegulatedDrugsByPatient.getText();
    	
    	try {
			this.refreshReports();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (TorqueException e) {
			e.printStackTrace();
		}    	
    }

    private void AISbuttonActionPerformed(java.awt.event.ActionEvent evt) {
  
    }

    public void refreshReports() throws NumberFormatException, TorqueException{
        Object[][] modelObject;        
        
        //AVAILABLE INVENTORY
        modelObject= ReportController.retrieveAvailableInventory();    
        AITable.setEnabled(false);
        AITable.setModel(new javax.swing.table.DefaultTableModel(
            modelObject,
            new String [] {"Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"}
        ));
        
        
        modelObject = ReportController.retrieveAvailableInventoryByGenericName(this.selectedGenericName);            
        //AVAILABLE INVENTORY BY GENERIC NAME
        AIGNTable.setEnabled(false);
        AIGNTable.setModel(new javax.swing.table.DefaultTableModel(
        	modelObject,
            new String [] { 
            	"Item No.", "Item", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"            
            }
        ));
        
        modelObject = ReportController.retrieveAvailableInventoryBySupplier();    
        
        //AVAILABLE INVENTORY BY SUPPLIER
        AISTable.setEnabled(false);
        AISTable.setModel(new javax.swing.table.DefaultTableModel(
        	modelObject,
            new String [] { 
            	"Item No.", "Item", "Generic Name", "Quantity", "Unit", "Unit Cost", "Value"            
            }
        ));
        
        // ITEMS FOR REORDER
        modelObject = ReportController.retrieveItemsForReorder();    
        IRTable.setEnabled(false);
        IRTable.setModel(new javax.swing.table.DefaultTableModel(
        	modelObject,
            new String [] { 
            	"Item No.", "Item", "Generic Name", "Supplier", "Remaining Quantity", "Unit", "Unit Cost", "Value"            
            }
        ));
        

        // DRUGS SOLD
        modelObject = ReportController.retrieveSales();    
        DSTable.setEnabled(false);
        DSTable.setModel(new javax.swing.table.DefaultTableModel(
        	modelObject,
            new String [] { 
            		"Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Patient", "Quantity", "Unit", "Unit Cost", "Value"          
            }
        ));
        
        // SALES
        modelObject = ReportController.retrieveSales();   
        STable.setModel(new javax.swing.table.DefaultTableModel(
        		modelObject,
                new String [] {
                    "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Patient", "Quantity", "Unit", "Price", "Amount", "Remarks"
                }
            ));
        
        // SALES PER PATIENT
        modelObject = ReportController.retrieveSalesPerPatient(this.selectedPatient); 
        SPTable.setModel(new javax.swing.table.DefaultTableModel(
        		modelObject,
                new String [] {
                    "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Price", "Amount", "Remarks"
                }
            ));
        

        // REGULATED DRUGS PER DOCTOR
        modelObject = ReportController.retrieveSalesOfRegulatedDrugsPerDoctor(selectedDoctor);  
        SRDDTable.setModel(new javax.swing.table.DefaultTableModel(
        		modelObject,
                new String [] {
                    "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Patient", "Quantity", "Unit", "Price", "Amount", "Remarks"
                }
            ));

        // REGULATED DRUGS PER PATIENT
        modelObject = ReportController.retrieveSalesOfRegulatedDrugsPerPatient(selectedPatientRegulatedDrugs);  
        SRDPTable.setModel(new javax.swing.table.DefaultTableModel(
        		modelObject,
                new String [] {
                    "Date", "OR No.", "Item No.", "Item", "Generic Name", "Supplier", "Physician", "Quantity", "Unit", "Price", "Amount", "Remarks"
                }
            ));
        
        // DRUGS PURCHASED
        modelObject = ReportController.retrieveDrugsPurchased(); 
        DPTable.setModel(new javax.swing.table.DefaultTableModel(
        		modelObject,
                new String [] {
                    "Date", "Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"
                }
            ));
        
        // DRUGS EXPIRING IN 3 MONTHS
        modelObject = ReportController.retrieveDrugsExpiring(); 
        DETable.setModel(new javax.swing.table.DefaultTableModel(
        		modelObject,
                new String [] {
                    "Item No.", "Item", "Generic Name", "Supplier", "Quantity", "Unit", "Unit Cost", "Value"
                }
            ));

        
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt){
    	mainform.reloadMainMenu();
    }
    
    private javax.swing.JTable AIGNTable;
    private javax.swing.JTable AISTable;
    private javax.swing.JButton AISbutton;
    private javax.swing.JLabel AISsupplier;
    private javax.swing.JTextField AIStextfield;
    private javax.swing.JTable AITable;
    private javax.swing.JButton btnAvailableInventoruByGenericName;
    private javax.swing.JLabel AIgenName;
    private javax.swing.JTextField txtAvailableInventoryByGenericName;
    private javax.swing.JTable DETable;
    private javax.swing.JTable DPTable;
    private javax.swing.JTable DSTable;
    private javax.swing.JTable IRTable;
    private javax.swing.JTable SPTable;
    private javax.swing.JButton btnSalePerPatient;
    private javax.swing.JLabel SPpatient;
    private javax.swing.JTextField txtSalePerPatient;
    private javax.swing.JTable SRDDTable;
    private javax.swing.JButton SRDDbutton;
    private javax.swing.JLabel SRDDdoctor;
    private javax.swing.JTextField txtSalesOfRegulatedDrugsPerDoctor;
    private javax.swing.JTable SRDPTable;
    private javax.swing.JButton SRDPbutton;
    private javax.swing.JLabel SRDPpatient;
    private javax.swing.JTextField txtSalesOfRegulatedDrugsByPatient;
    private javax.swing.JTable STable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    @SuppressWarnings("unused")
	private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    @SuppressWarnings("unused")
	private javax.swing.JPanel jPanel5;
    @SuppressWarnings("unused")
	private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    @SuppressWarnings("unused")
	private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    @SuppressWarnings("unused")
	private javax.swing.JScrollPane jScrollPane10;
    @SuppressWarnings("unused")
	private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    @SuppressWarnings("unused")
	private javax.swing.JScrollPane jScrollPane6;
    @SuppressWarnings("unused")
	private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton btnCancel;

}
