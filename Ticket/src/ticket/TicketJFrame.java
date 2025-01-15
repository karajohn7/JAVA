/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TicketJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TicketJFrame
     */
    public TicketJFrame() {
        initComponents();
        //Με αυτον τον windowlistner εμφανιζεται μηνυμα οταν ο πελατης πατησει το χ ωστε να τον προειδοποιησει για την εξοδο του απο την εφαρμογη
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int y = JOptionPane.showConfirmDialog(null, "Do you want to exit app?",
                        "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (y == JOptionPane.YES_NO_OPTION) {
                    e.getWindow().dispose();
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    ////δημιουργια κουμπιων ετικετων text areas κλπ με χρωματα και γραμματοσειρες
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Newticket = new javax.swing.JButton();
        TicketList = new javax.swing.JButton();
        About = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        TicketMenu = new javax.swing.JMenu();
        NewTicketMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        TicketListMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ExitMenuItem = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        AboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket Booking");

        jPanel1.setBackground(new java.awt.Color(84, 150, 193));

        Newticket.setBackground(new java.awt.Color(198, 198, 198));
        Newticket.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Newticket.setForeground(new java.awt.Color(0, 0, 0));
        Newticket.setText("New Ticket");
        Newticket.setToolTipText("Tap here for a ticket issuation");
        Newticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewticketActionPerformed(evt);
            }
        });

        TicketList.setBackground(new java.awt.Color(198, 198, 198));
        TicketList.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TicketList.setForeground(new java.awt.Color(0, 0, 0));
        TicketList.setText("Ticket List");
        TicketList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketListActionPerformed(evt);
            }
        });

        About.setBackground(new java.awt.Color(198, 198, 198));
        About.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        About.setForeground(new java.awt.Color(0, 0, 0));
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(198, 198, 198));
        Exit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 0, 0));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOK YOUR TICKET NOW");
        jLabel2.setToolTipText("C");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Ticket\\23592.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Newticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TicketList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Newticket)
                        .addGap(51, 51, 51)
                        .addComponent(TicketList)
                        .addGap(48, 48, 48)
                        .addComponent(About)
                        .addGap(60, 60, 60)
                        .addComponent(Exit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jLabel3.setText("jLabel3");

        jMenuBar2.setBackground(new java.awt.Color(198, 198, 198));
        jMenuBar2.setForeground(new java.awt.Color(0, 0, 0));

        TicketMenu.setBackground(new java.awt.Color(198, 198, 198));
        TicketMenu.setForeground(new java.awt.Color(0, 0, 0));
        TicketMenu.setText("Tickets");
        TicketMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketMenuActionPerformed(evt);
            }
        });

        NewTicketMenuItem.setBackground(new java.awt.Color(198, 198, 198));
        NewTicketMenuItem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        NewTicketMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        NewTicketMenuItem.setText("New Ticket");
        NewTicketMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTicketMenuItemActionPerformed(evt);
            }
        });
        TicketMenu.add(NewTicketMenuItem);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        TicketMenu.add(jSeparator1);

        TicketListMenuItem.setBackground(new java.awt.Color(198, 198, 198));
        TicketListMenuItem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TicketListMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        TicketListMenuItem.setText("Ticket List");
        TicketListMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketListMenuItemActionPerformed(evt);
            }
        });
        TicketMenu.add(TicketListMenuItem);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        TicketMenu.add(jSeparator3);

        ExitMenuItem.setBackground(new java.awt.Color(198, 198, 198));
        ExitMenuItem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ExitMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        TicketMenu.add(ExitMenuItem);

        jMenuBar2.add(TicketMenu);

        HelpMenu.setBackground(new java.awt.Color(198, 198, 198));
        HelpMenu.setForeground(new java.awt.Color(0, 0, 0));
        HelpMenu.setText("Help");
        HelpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuActionPerformed(evt);
            }
        });

        AboutMenuItem.setBackground(new java.awt.Color(198, 198, 198));
        AboutMenuItem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AboutMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        AboutMenuItem.setText("About");
        AboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutMenuItem);

        jMenuBar2.add(HelpMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void HelpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuActionPerformed

    }//GEN-LAST:event_HelpMenuActionPerformed
    //Οταν ο χρηστης παταει το κουμπι New Ticket εμφανιζεται το παραθυρο για την εισαγωγη στοιχειων
    private void NewticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewticketActionPerformed
        new NewTicket().setVisible(true);
    }//GEN-LAST:event_NewticketActionPerformed
    //αντιστοιχα να εμφανιζεται το παραθυρο About
    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed
    // εμφανιση μηνυματος οταν ο χρηστης πατησει το κουμπι exit
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame exitFrame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(exitFrame, "Confirm if you want to exit", "Exit",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void TicketMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketMenuActionPerformed

    }//GEN-LAST:event_TicketMenuActionPerformed
    //εμφανιση του παραθυρου New Ticket οταν ο χρηστης πατησει το κουμπι New Ticket απο το menubar 
    private void NewTicketMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTicketMenuItemActionPerformed
        new NewTicket().setVisible(true);
    }//GEN-LAST:event_NewTicketMenuItemActionPerformed
    //εμφανιση του παραθυρου about οταν ο χρηστης πατησει το κουμπι απο το menubar
    private void AboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuItemActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_AboutMenuItemActionPerformed
    // εμφανιση μηνυματος οταν ο χρηστης πατησει το κουμπι exit απο το menubar
    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        Component exitFrame = null;
        if (JOptionPane.showConfirmDialog(exitFrame, "Confirm if you want to exit", "Exit",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitMenuItemActionPerformed
    //εμφανιση του παραθυρου TicketListJFrame
    private void TicketListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketListActionPerformed
        new TicketListJFrame().setVisible(true);
        
    }//GEN-LAST:event_TicketListActionPerformed
    //εμφανιση του παραθυρου TicketListJFrame οταν ο χρηστης πατησει το κουμπι απο το menubar
    private void TicketListMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketListMenuItemActionPerformed
        new TicketListJFrame().setVisible(true);
    }//GEN-LAST:event_TicketListMenuItemActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JButton Exit;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem NewTicketMenuItem;
    private javax.swing.JButton Newticket;
    private javax.swing.JButton TicketList;
    private javax.swing.JMenuItem TicketListMenuItem;
    private javax.swing.JMenu TicketMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
