
package erms;
import java.awt.Color;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class top5 extends javax.swing.JFrame {

    public top5() {
        initComponents();
        displayTop5Employees();

    }

     private void displayTop5Employees() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydata";
            String user = "root";
            String password = "password";
            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM emppro ORDER BY Salary DESC LIMIT 5";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            int count = 0;
            StringBuilder labelText = new StringBuilder();

            labelText.append("<html><table border='1'>");
        
            labelText.append("<tr>")
                .append("<th>Employee Name</th>")
                .append("<th>Father's Name</th>")
                .append("<th>Email ID</th>")
                .append("<th>Address</th>")
                .append("<th>Salary</th>")
                .append("<th>Phone Number</th>")
                .append("<th>Aadhar Number</th>")
                .append("<th>Highest Education</th>")
                .append("</tr>");
            
            while (resultSet.next()) {
                String employeeName = resultSet.getString("EmployeeName");
                String fatherName =  resultSet.getString("FathersName");
                String email = (resultSet.getString("EmailID"));
                String address = (resultSet.getString("Address"));
                String salary = (resultSet.getString("Salary"));
                String phoneno = (resultSet.getString("PhoneNo"));
                String aadharno = (resultSet.getString("AadharNo"));
                String edu = (resultSet.getString("HighestEducation"));

                labelText.append("<tr>")
                    .append("<td>").append(employeeName).append("</td>")
                    .append("<td>").append(fatherName).append("</td>")
                    .append("<td>").append(email).append("</td>")
                    .append("<td>").append(address).append("</td>")
                    .append("<td>").append(salary).append("</td>")
                    .append("<td>").append(phoneno).append("</td>")
                    .append("<td>").append(aadharno).append("</td>")
                    .append("<td>").append(edu).append("</td>")
                    .append("</tr>");

 
                count++;
            }

            resultSet.close();
            statement.close();
            connection.close();
            
            jLabel1.setText(labelText.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            jLabel1.setText("Error: Unable to retrieve top 5 employees.");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newEmployee = new javax.swing.JLabel();
        btntop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newEmployee.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        newEmployee.setText("top - 5 Employee Details");

        btntop.setText("Search Top 5");
        btntop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(newEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(btntop)))
                        .addGap(0, 214, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(newEmployee)
                .addGap(18, 18, 18)
                .addComponent(btntop)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntopActionPerformed
            displayTop5Employees();
    }//GEN-LAST:event_btntopActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new top5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel newEmployee;
    // End of variables declaration//GEN-END:variables
}
