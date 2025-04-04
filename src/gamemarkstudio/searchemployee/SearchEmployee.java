package gamemarkstudio.searchemployee;

import gamemarkstudio.newemployeepane.PersonalHandling;
import gamemarkstudio.newemployeepane.PersonalInfo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class SearchEmployee extends javax.swing.JPanel {

    /**
     * Creates new form SearchEmployee
     */
    DefaultTableModel model;
    public SearchEmployee() {
        initComponents();
        PersonalHandling.Load();
        updateTable(PersonalHandling.getArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateEmployeeTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Search Employee");
        jLabel1.setToolTipText("");

        searchTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTextField.setText("Search");
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        updateEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Phone", "Address", "Cnic", "Emergency Name", "Emergency Phone", "Date of Birth", "Email", "Position", "Date of Hiring", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        updateEmployeeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(updateEmployeeTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                    .addComponent(searchTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        if(searchTextField.getText().equals("Search"))
            searchTextField.setText("");
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if(searchTextField.getText().equals(""))
            searchTextField.setText("Search");
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        updateTable(PersonalHandling.search(searchTextField.getText()));
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void updateTable(ArrayList<PersonalInfo> pi1)
    {        
        model = (DefaultTableModel)updateEmployeeTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < pi1.size(); i++){
        model.insertRow(model.getRowCount(), new Object[]{pi1.get(i).getId(),pi1.get(i).getName(),
                            pi1.get(i).getPhone(), pi1.get(i).getAddress(), pi1.get(i).getCnic(),
                            pi1.get(i).geteName(), pi1.get(i).getePhone(), pi1.get(i).getDob(), 
                            pi1.get(i).getEmail(), pi1.get(i).getPost(), pi1.get(i).getTiming(),
                            pi1.get(i).getSalary()});
                            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable updateEmployeeTable;
    // End of variables declaration//GEN-END:variables
}
