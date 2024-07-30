package erms;

import javax.swing.JFrame;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUpdateEmployee = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        btnDeleteEmployee = new javax.swing.JButton();
        btnViewEmployee = new javax.swing.JButton();
        btntop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/demo.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnUpdateEmployee.setText("Update Employee");
        btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateEmployee);
        btnUpdateEmployee.setBounds(170, 100, 140, 40);

        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEmployee);
        btnAddEmployee.setBounds(20, 100, 120, 39);

        btnDeleteEmployee.setText("Delete Employee");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteEmployee);
        btnDeleteEmployee.setBounds(170, 170, 140, 39);

        btnViewEmployee.setText("View Employee");
        btnViewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEmployee);
        btnViewEmployee.setBounds(20, 170, 120, 39);

        btntop.setText("Top 5");
        btntop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntopActionPerformed(evt);
            }
        });
        getContentPane().add(btntop);
        btntop.setBounds(100, 40, 90, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1_1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
            UpdateEmployee updateEmployeeFrame = new UpdateEmployee();
            
            updateEmployeeFrame.setVisible(true);
            
            updateEmployeeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
            AddEmployee addEmployeeFrame = new AddEmployee();

            addEmployeeFrame.setVisible(true);

            addEmployeeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
            DeleteEmployee deleteEmployeeFrame = new DeleteEmployee();

            deleteEmployeeFrame.setVisible(true);

            deleteEmployeeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnViewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEmployeeActionPerformed
            ViewEmployee viewEmployeeFrame = new ViewEmployee();

            viewEmployeeFrame.setVisible(true);

            viewEmployeeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnViewEmployeeActionPerformed

    private void btntopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntopActionPerformed
            top5 topemployee = new top5();

            topemployee.setVisible(true);

            topemployee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    }//GEN-LAST:event_btntopActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JButton btnViewEmployee;
    private javax.swing.JButton btntop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
