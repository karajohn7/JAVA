
package ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TicketListJFrame extends javax.swing.JFrame {

    
    public TicketListJFrame() {
        initComponents();
        
    }

    //δημιουργια κουμπιων ετικετων text areas κλπ με χρωματα και γραμματοσειρες
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NewTicketButton = new javax.swing.JToggleButton();
        RefreshButton = new javax.swing.JToggleButton();
        ExitButton = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        LoadFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 150, 193));

        NewTicketButton.setBackground(new java.awt.Color(153, 153, 153));
        NewTicketButton.setForeground(new java.awt.Color(0, 0, 0));
        NewTicketButton.setText("New Ticket");
        NewTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTicketButtonActionPerformed(evt);
            }
        });

        RefreshButton.setBackground(new java.awt.Color(153, 153, 153));
        RefreshButton.setForeground(new java.awt.Color(0, 0, 0));
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(153, 153, 153));
        ExitButton.setForeground(new java.awt.Color(0, 0, 0));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TextArea.setBackground(new java.awt.Color(153, 153, 153));
        TextArea.setColumns(20);
        TextArea.setForeground(new java.awt.Color(0, 0, 0));
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        LoadFile.setBackground(new java.awt.Color(153, 153, 153));
        LoadFile.setForeground(new java.awt.Color(0, 0, 0));
        LoadFile.setText("Load File");
        LoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(NewTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoadFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(LoadFile)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewTicketButton)
                    .addComponent(RefreshButton)
                    .addComponent(ExitButton))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        setVisible(false);  // close this frame and return back to main frame
        dispose();
           
    }//GEN-LAST:event_ExitButtonActionPerformed
    //πατωντας το κουμπι load εμφανιζεται το αρχειο στο textarea με ολες τις εγγραφες
    private void LoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileActionPerformed
        try {
            String textLine;
            FileReader fr = new FileReader("Stoixeia.txt");
            BufferedReader reader = new BufferedReader(fr);
            while ((textLine = reader.readLine()) != null) {
                textLine = reader.readLine();
                TextArea.read(reader, "TextArea");
            }
        } catch (IOException ioe) {

        }
    }//GEN-LAST:event_LoadFileActionPerformed
    //εμφανιση του παραθυρου New Ticket οταν ο χρηστης πατησει το κουμπι New Ticket
    private void NewTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTicketButtonActionPerformed
        new NewTicket().setVisible(true);
    }//GEN-LAST:event_NewTicketButtonActionPerformed
    // με το κουμπι refresh φορτωνεται παλι το αρχειο και εμφανιζει και τις νεες εγγραφες σε περιπτωση που υπαρχουν
    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        try {
            String textLine;
            FileReader fr = new FileReader("Stoixeia.txt");
            BufferedReader reader = new BufferedReader(fr);
            while ((textLine = reader.readLine()) != null) {
                textLine = reader.readLine();
                TextArea.read(reader, "TextArea");
            }
        } catch (IOException ioe) {

        }
    }//GEN-LAST:event_RefreshButtonActionPerformed

   
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketListJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ExitButton;
    private javax.swing.JButton LoadFile;
    private javax.swing.JToggleButton NewTicketButton;
    private javax.swing.JToggleButton RefreshButton;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
