/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import domain.Professor;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logic.Controller;
import session.Session;
import tableModels.ProfessorTableModel;
import validatorGUI.ValidatorGUI;

/**
 *
 * @author Ivan
 */
public class FProfessor extends javax.swing.JDialog {

    /**
     * Creates new form jdProfessor
     */
    public FProfessor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populateTableProfessorModel();
        prepareForSort();
        enableUpdateDeleteButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProfessors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooserProfDateOfBirth = new com.toedter.calendar.JDateChooser();
        jtxtProfID = new javax.swing.JTextField();
        jtxtProfName = new javax.swing.JTextField();
        jtxtProfSurname = new javax.swing.JTextField();
        jtxtProfInstrument = new javax.swing.JTextField();
        jtxtProfEmail = new javax.swing.JTextField();
        jbtnInsertProfessor = new javax.swing.JButton();
        jbtnUpdateProfessor = new javax.swing.JButton();
        jbtnDeleteProfessor = new javax.swing.JButton();
        jbtnProfessorDetails = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtNameSearchProf = new javax.swing.JTextField();
        jlblErrorName = new javax.swing.JLabel();
        jlblErrorSurname = new javax.swing.JLabel();
        jlblErrorInstrument = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Professor form");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtblProfessors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblProfessors);

        jLabel1.setText("ID:");

        jLabel2.setText("Name:");

        jLabel3.setText("Surname:");

        jLabel4.setText("Date of birth:");

        jLabel5.setText("Instrument:");

        jLabel6.setText("E-mail:");

        jDateChooserProfDateOfBirth.setDateFormatString("yyyy-MM-dd");

        jtxtProfID.setEnabled(false);

        jtxtProfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtProfNameFocusLost(evt);
            }
        });

        jtxtProfSurname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtProfSurnameFocusLost(evt);
            }
        });

        jtxtProfInstrument.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtProfInstrumentFocusLost(evt);
            }
        });

        jtxtProfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtProfEmailFocusLost(evt);
            }
        });

        jbtnInsertProfessor.setText("INSERT");
        jbtnInsertProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertProfessorActionPerformed(evt);
            }
        });

        jbtnUpdateProfessor.setText("UPDATE");
        jbtnUpdateProfessor.setEnabled(false);
        jbtnUpdateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateProfessorActionPerformed(evt);
            }
        });

        jbtnDeleteProfessor.setText("DELETE");
        jbtnDeleteProfessor.setEnabled(false);
        jbtnDeleteProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteProfessorActionPerformed(evt);
            }
        });

        jbtnProfessorDetails.setText("DETAILS");
        jbtnProfessorDetails.setEnabled(false);
        jbtnProfessorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProfessorDetailsActionPerformed(evt);
            }
        });

        jLabel7.setText("Search professors:");

        jlblErrorName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jlblErrorName.setForeground(new java.awt.Color(204, 0, 0));
        jlblErrorName.setText("jLabel8");

        jlblErrorSurname.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jlblErrorSurname.setForeground(new java.awt.Color(204, 0, 0));
        jlblErrorSurname.setText("jLabel9");

        jlblErrorInstrument.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jlblErrorInstrument.setForeground(new java.awt.Color(204, 0, 0));
        jlblErrorInstrument.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblErrorName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblErrorSurname))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblErrorInstrument))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtProfInstrument, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserProfDateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtProfSurname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtProfName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtProfID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtProfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(jtxtNameSearchProf, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jbtnInsertProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jbtnUpdateProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(jbtnDeleteProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(jbtnProfessorDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtProfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jtxtNameSearchProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblErrorName)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtProfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblErrorSurname)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addComponent(jDateChooserProfDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtProfInstrument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblErrorInstrument)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jtxtProfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnInsertProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnUpdateProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDeleteProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnProfessorDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInsertProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertProfessorActionPerformed
        if (validateAllFields()) {
            // Uzimanje vrednosti svakog polja nakon validacije
            String name = jtxtProfName.getText().trim();
            String surname = jtxtProfSurname.getText().trim();
            Date dateOfBirth = jDateChooserProfDateOfBirth.getDate();
            String instrument = jtxtProfInstrument.getText().trim();
            String email = jtxtProfEmail.getText().trim();
            // Kreiranje profesora od odgovarajucih polja, bez ID-a
            Professor prof = new Professor(name, surname, dateOfBirth, instrument, email);
            try {
                // Kreiranje novog profesora da bi mogao da se lako izvuce iz baze, zbog izmena u tabeli
                Professor profInDB;
                profInDB = Controller.getInstance().insertProfessor(prof);
                JOptionPane.showMessageDialog(this, "Successful insertion of professor! Assigned ID: " + profInDB.getProfessorID());
                ProfessorTableModel ptm = (ProfessorTableModel) jtblProfessors.getModel();
                ptm.addRow(profInDB);
                clearTextFields();
//                return;
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(FProfessor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Slanje profesora kroz soket do servera da se i tamo unese
            // Slanje profesora kroz soket do servera da se i tamo unese
        } else {
            return;
        }
    }//GEN-LAST:event_jbtnInsertProfessorActionPerformed

    private void jbtnUpdateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateProfessorActionPerformed
        if (validateAllFields()) {
            // Kreiranje profesora od polja, i update-ovanje u bazi
            int profId = Integer.parseInt(jtxtProfID.getText());
            String name = jtxtProfName.getText().trim();
            String surname = jtxtProfSurname.getText().trim();
            Date dateOfBirth = jDateChooserProfDateOfBirth.getDate();
            String instrument = jtxtProfInstrument.getText().trim();
            String email = jtxtProfEmail.getText().trim();
            Professor prof = new Professor(profId, name, surname, dateOfBirth, instrument, email);
            // Sam poziv update-a
            Controller.getInstance().updateProfessor(prof);
            JOptionPane.showMessageDialog(this, "Successful update of professor with ID: " + prof.getProfessorID());
            // Ispravljanje u tabeli
            int selectedRow = jtblProfessors.getSelectedRow();
            ProfessorTableModel ptm = (ProfessorTableModel) jtblProfessors.getModel();
            ptm.updateRow(selectedRow, prof);
            // Resetovanje elemenata forme
            resetAllInputFields();
            jbtnDeleteProfessor.setEnabled(false);
            jbtnUpdateProfessor.setEnabled(false);
            jbtnInsertProfessor.setEnabled(true);
        }

    }//GEN-LAST:event_jbtnUpdateProfessorActionPerformed

    private void jbtnDeleteProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteProfessorActionPerformed
        // Uzimanje ID-a i brisanje profesora iz baze
        int profID = Integer.parseInt(jtxtProfID.getText());
        Controller.getInstance().deleteProfessorByID(profID);
        JOptionPane.showMessageDialog(this, "Successful deletion of professor with ID: " + profID);
        // Brisanje iz tabele
        ProfessorTableModel ptm = (ProfessorTableModel) jtblProfessors.getModel();
        int selectedRow = jtblProfessors.getSelectedRow();
        ptm.removeRow(selectedRow);
        // Resetovanje elemenata forme
        resetAllInputFields();
        jbtnDeleteProfessor.setEnabled(false);
        jbtnUpdateProfessor.setEnabled(false);
        jbtnInsertProfessor.setEnabled(true);
    }//GEN-LAST:event_jbtnDeleteProfessorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jbtnProfessorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProfessorDetailsActionPerformed
        int index = jtblProfessors.getSelectedRow();
        int profID = (int) jtblProfessors.getValueAt(index, 0);

        try {
            Professor selectedProf = Controller.getInstance().getProfessorByID(profID);
            if (selectedProf != null) {
                Session.getInstance().getMap().put("selected_prof", selectedProf);
                JDialog profDetails = new FProfessorDetails(null, true);
                profDetails.setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jbtnProfessorDetailsActionPerformed

    private void jtxtProfNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtProfNameFocusLost
        if (!ValidatorGUI.getInstance().validateAlpha(jtxtProfName.getText().trim())) {
            jlblErrorName.setText("Invalid");
            jlblErrorName.setVisible(true);
        } else {
            jlblErrorName.setText("");
            jlblErrorName.setVisible(true);
        }
    }//GEN-LAST:event_jtxtProfNameFocusLost

    private void jtxtProfSurnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtProfSurnameFocusLost
        if (!ValidatorGUI.getInstance().validateAlpha(jtxtProfSurname.getText().trim())) {
            jlblErrorSurname.setText("Invalid");
            jlblErrorSurname.setVisible(true);
        } else {
            jlblErrorSurname.setText("");
            jlblErrorSurname.setVisible(true);
        }
    }//GEN-LAST:event_jtxtProfSurnameFocusLost

    private void jtxtProfInstrumentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtProfInstrumentFocusLost
        if (!ValidatorGUI.getInstance().validateAlpha(jtxtProfInstrument.getText().trim())) {
            jlblErrorInstrument.setText("Invalid");
            jlblErrorInstrument.setVisible(true);
        } else {
            jlblErrorInstrument.setText("");
            jlblErrorInstrument.setVisible(true);
        }
    }//GEN-LAST:event_jtxtProfInstrumentFocusLost

    private void jtxtProfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtProfEmailFocusLost
//        if (!ValidatorGUI.getInstance().validateEmail(jtxtProfInstrument.getText().trim())) {
//            jlblErrorEmail.setText("Invalid");
//            jlblErrorEmail.setVisible(true);
//        } else {
//            jlblErrorEmail.setText("");
//            jlblErrorEmail.setVisible(true);
//        }
    }//GEN-LAST:event_jtxtProfEmailFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooserProfDateOfBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDeleteProfessor;
    private javax.swing.JButton jbtnInsertProfessor;
    private javax.swing.JButton jbtnProfessorDetails;
    private javax.swing.JButton jbtnUpdateProfessor;
    private javax.swing.JLabel jlblErrorInstrument;
    private javax.swing.JLabel jlblErrorName;
    private javax.swing.JLabel jlblErrorSurname;
    private javax.swing.JTable jtblProfessors;
    private javax.swing.JTextField jtxtNameSearchProf;
    private javax.swing.JTextField jtxtProfEmail;
    private javax.swing.JTextField jtxtProfID;
    private javax.swing.JTextField jtxtProfInstrument;
    private javax.swing.JTextField jtxtProfName;
    private javax.swing.JTextField jtxtProfSurname;
    // End of variables declaration//GEN-END:variables

    public void populateTableProfessorModel() {
        List<Professor> professors = Controller.getInstance().getAllProfessors();
        System.out.println("Skupio sam profesore");
        ProfessorTableModel ptm = new ProfessorTableModel(professors);
        jtblProfessors.setModel(ptm);

        jlblErrorInstrument.setVisible(false);
        jlblErrorSurname.setVisible(false);
    }

    public void enableUpdateDeleteButtons() {
        ListSelectionModel model = jtblProfessors.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!model.isSelectionEmpty()) {
                    // Enable-ovanje update-a i delete-a kada je izabran neki od profesora
                    jbtnDeleteProfessor.setEnabled(true);
                    jbtnUpdateProfessor.setEnabled(true);
                    jbtnProfessorDetails.setEnabled(true);
                    jbtnInsertProfessor.setEnabled(false);

                    // Nalazenje izabranog profesora
                    int index = jtblProfessors.getSelectedRow();
                    int profID = (int) jtblProfessors.getValueAt(index, 0);
                    try {
                        // Izvlacenje profesora iz baze i popunjavanje polja sa podacima izabranog profesora
                        Professor prof = Controller.getInstance().getProfessorByID(profID);
                        jtxtProfID.setText(prof.getProfessorID() + "");
                        jtxtProfName.setText(prof.getName());
                        jtxtProfSurname.setText(prof.getSurname());
                        jDateChooserProfDateOfBirth.setDate(prof.getDateOfBirth());
                        jtxtProfInstrument.setText(prof.getInstrument());
                        jtxtProfEmail.setText(prof.getEmail());
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }

    private boolean validateAllFields() {
        if (jtxtProfName.getText() == null || jtxtProfName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please insert name!");
            return false;
        }
        if (jtxtProfSurname.getText() == null || jtxtProfSurname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please insert surname!");
            return false;
        }
        if (jtxtProfInstrument.getText() == null || jtxtProfInstrument.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please insert insutrment!");
            return false;
        }
        if (jtxtProfEmail.getText() == null || jtxtProfEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please insert e-mail!");
            return false;
        }
        if (jDateChooserProfDateOfBirth.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please choose date!");
            return false;
        }
        return true;
    }

    private void resetAllInputFields() {
        jtxtProfID.setText(null);
        jtxtProfName.setText(null);
        jtxtProfSurname.setText(null);
        jDateChooserProfDateOfBirth.setDate(null);
        jtxtProfInstrument.setText(null);
        jtxtProfEmail.setText(null);
    }

    private void clearTextFields() {
        jtxtProfID.setText(null);
        jtxtProfName.setText(null);
        jtxtProfSurname.setText(null);
        jtxtProfEmail.setText(null);
        jtxtProfInstrument.setText(null);
        jDateChooserProfDateOfBirth.setDate(null);
    }

    private void prepareForSort() {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jtblProfessors.getModel());
        jtblProfessors.setRowSorter(rowSorter);

        jtxtNameSearchProf.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String filterPurchase = jtxtNameSearchProf.getText();
                if (filterPurchase.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + filterPurchase));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String text = jtxtNameSearchProf.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

}
