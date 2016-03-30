package view;

import employee.logic.Employee;
import employee.persistence.FlatFile;
import employee.persistence.MSAccess;
import employee.persistence.XMLFile;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Interfaz extends javax.swing.JFrame 
{
    private MSAccess dataFile;

    public MSAccess getDataFile() {
        return dataFile;
    }

    public void setDataFile(MSAccess dataFile) {
        this.dataFile = dataFile;
    }
    private List<Employee> employeeList;
    private int indexEmployee; 
    //final String fileName =  "employe.csv";
    final String fileName =  "employee.xml";
    final String separator = ",";
    final String path = "F:\\LOST.DIR\\EmployeeApp\\src\\employee\\view\\photo";
    /**
     * Creates new form Interfaz
     */
    public Interfaz() 
    {
        initComponents();
        labPath.setVisible(false);
        txtCalcularEdad.setEditable(false);
        txtCalcularAntiguedad.setEditable(false);
        txtCalcularPrestaciones.setEditable(false);
        setLocationRelativeTo(null);
        
        this.setDataFile(new MSAccess());
        this.selectEmployee();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getIndexEmployee() {
        return indexEmployee;
    }

    public void setIndexEmployee(int indexEmployee) {
        this.indexEmployee = indexEmployee;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupGenero = new javax.swing.ButtonGroup();
        panDatosPersonales = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        labPhoto = new javax.swing.JLabel();
        radFemenino = new javax.swing.JRadioButton();
        radMasculino = new javax.swing.JRadioButton();
        labId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        labPath = new javax.swing.JLabel();
        butPhoto = new javax.swing.JButton();
        dateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        dateFechaIngreso = new com.toedter.calendar.JDateChooser();
        panCalculos = new javax.swing.JPanel();
        txtCalcularEdad = new javax.swing.JTextField();
        txtCalcularAntiguedad = new javax.swing.JTextField();
        txtCalcularPrestaciones = new javax.swing.JTextField();
        panCrud = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Empleados Usta");
        setUndecorated(true);

        panDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        panDatosPersonales.setToolTipText("");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblApellido.setText("Apelliido:");

        lblSex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSex.setText("Sexo:");

        lblFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFechaNacimiento.setText("Fecha de Nacimiento:");

        lblFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFechaIngreso.setText("Fecha de Ingreso:");

        labPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/noPhoto.jpg"))); // NOI18N

        GroupGenero.add(radFemenino);
        radFemenino.setSelected(true);
        radFemenino.setText("Femenino");

        GroupGenero.add(radMasculino);
        radMasculino.setText("Masculino");

        labId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labId.setText("Id:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        labSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labSalario.setText("Salario");

        butPhoto.setText("Load Photo");
        butPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDatosPersonalesLayout = new javax.swing.GroupLayout(panDatosPersonales);
        panDatosPersonales.setLayout(panDatosPersonalesLayout);
        panDatosPersonalesLayout.setHorizontalGroup(
            panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(lblSex)
                            .addComponent(labId)
                            .addComponent(lblNombre))
                        .addGap(78, 78, 78)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(radFemenino)
                                .addGap(18, 18, 18)
                                .addComponent(radMasculino))
                            .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                    .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblFechaIngreso)
                            .addComponent(labSalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(labPath)
                        .addGap(32, 32, 32)
                        .addComponent(butPhoto)))
                .addGap(52, 52, 52))
        );
        panDatosPersonalesLayout.setVerticalGroup(
            panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSex)
                            .addComponent(radFemenino)
                            .addComponent(radMasculino)))
                    .addComponent(labPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaIngreso)
                            .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labPath)
                                    .addComponent(dateFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9)
                        .addGroup(panDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labSalario)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panDatosPersonalesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(butPhoto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panCalculos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cálculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout panCalculosLayout = new javax.swing.GroupLayout(panCalculos);
        panCalculos.setLayout(panCalculosLayout);
        panCalculosLayout.setHorizontalGroup(
            panCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalculosLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(txtCalcularEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCalcularAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCalcularPrestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panCalculosLayout.setVerticalGroup(
            panCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalcularEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalcularAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalcularPrestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        panCrud.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLast.setText(">|");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search ...");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCrudLayout = new javax.swing.GroupLayout(panCrud);
        panCrud.setLayout(panCrudLayout);
        panCrudLayout.setHorizontalGroup(
            panCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCrudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFirst)
                .addGap(18, 18, 18)
                .addComponent(btnPrevious)
                .addGap(16, 16, 16)
                .addComponent(btnNext)
                .addGap(18, 18, 18)
                .addComponent(btnLast)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(10, 10, 10)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panCrudLayout.setVerticalGroup(
            panCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCrudLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNew)
                    .addComponent(btnUpdate)))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/X_ico.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de Empleados Usta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(panDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panCalculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panCrud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * New Employee record 
     * @param evt 
     */
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
       if (btnNew.getText().equalsIgnoreCase("New")){
           newInterface();
       }
       else
           saveInterfaz(); 
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.setIndexEmployee(0);
        this.updateInterface();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if (this.getIndexEmployee() > 0) {
            this.setIndexEmployee(this.getIndexEmployee() - 1);
            this.updateInterface();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (this.getIndexEmployee() < this.getEmployeeList().size() - 1) {
            this.setIndexEmployee(this.getIndexEmployee() + 1);
            this.updateInterface();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        long id = Long.parseLong(JOptionPane.showInputDialog(
                "Please, write the employee id" , "Employee id"));
        if (id > 0) {
            int index = -1;
            boolean find = false;
            for (Employee employee : this.getEmployeeList()) {
                index++;
                if (employee.getId() == id) {
                    this.setIndexEmployee(index);
                    this.updateInterface();
                    find = true;
                    break;
                }
            }
            if (!find) {
                JOptionPane.showMessageDialog(this, "Employee " + id + " was not found!");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Employee employee = this.interface2Object();
        this.getEmployeeList().set(this.getIndexEmployee(), employee);
        
        //FlatFile dataFile = new FlatFile();
        //dataFile.writeFile(this.getEmployeeList(), this.fileName, this.separator);
        XMLFile dataFile = new XMLFile();
        dataFile.writeFile(this.fileName, this.getEmployeeList());
        
        JOptionPane.showMessageDialog(this, "Updated record!" , "Update record",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Are you sure to delete this record?",
                "Delete record", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            this.getEmployeeList().remove(this.getIndexEmployee());
            if (this.getIndexEmployee() > 0) {
                this.setIndexEmployee(this.getIndexEmployee() - 1);
            }
            
            //FlatFile dataFile = new FlatFile();
            //dataFile.writeFile(this.getEmployeeList(), this.fileName, this.separator);
            XMLFile dataFile = new XMLFile();
            dataFile.writeFile(this.fileName, this.getEmployeeList());
            
            this.updateInterface();
            JOptionPane.showMessageDialog(this, "Deleted record!" , "Delete record",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void butPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPhotoActionPerformed
        JFileChooser fc = new JFileChooser();
        int select = fc.showOpenDialog(this);
        if(select == JFileChooser.APPROVE_OPTION ){
            try {
                File photoFile = fc.getSelectedFile();
                labPath.setText(photoFile.getCanonicalPath());
                ImageIcon iconPhoto = new ImageIcon(labPath.getText());
                labPhoto.setIcon(iconPhoto);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }//GEN-LAST:event_butPhotoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupGenero;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton butPhoto;
    private com.toedter.calendar.JDateChooser dateFechaIngreso;
    private com.toedter.calendar.JDateChooser dateFechaNacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labPath;
    private javax.swing.JLabel labPhoto;
    private javax.swing.JLabel labSalario;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSex;
    private javax.swing.JPanel panCalculos;
    private javax.swing.JPanel panCrud;
    private javax.swing.JPanel panDatosPersonales;
    private javax.swing.JRadioButton radFemenino;
    private javax.swing.JRadioButton radMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalcularAntiguedad;
    private javax.swing.JTextField txtCalcularEdad;
    private javax.swing.JTextField txtCalcularPrestaciones;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables

    private void updateInterface() { 
       //if(this.getIndexEmployee() != -1){
        if (this.getDataFile().getResultSet() == null)
        {
            this.newInterface();
        }  
        else
        {
            this.object2Interface();
        }
       }
//       else{
//           this.newInterface();
//      }
    
    /**
     * You prepare the interface to enter a new item
     */

    private void newInterface() {
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        
        labPath.setText(this.path + "noPhoto.jpg");
        ImageIcon photo = new ImageIcon(labPath.getText());
        labPhoto.setIcon(photo);
        
        radFemenino.setSelected(true);
        radMasculino.setSelected(false);
        dateFechaNacimiento.setDate(new Date(95,0,6));
        dateFechaIngreso.setDate(new Date(105,0,2));
        txtSalario.setText("");
        txtCalcularEdad.setText("Age: ");
        txtCalcularAntiguedad.setText("Old: ");
        txtCalcularPrestaciones.setText("Benefits: ");
        
        btnNew.setText("save");
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnSearch.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }
    
    /**
     * You validate and store item 
     */

    private void saveInterfaz() {
       if (txtId.getText().equals("") 
               || txtNombre.getText().equals("") 
               || txtApellido.getText().equals("")
               || (dateFechaNacimiento.getDate() == null)
               || (dateFechaIngreso.getDate() == null)
               || txtSalario.getText().equals("")) {
           JOptionPane.showMessageDialog(this, "Plaese fill the requiered fields","Error",JOptionPane.ERROR_MESSAGE);
       }
       else{
           Employee employee = interface2Object();
           this.getEmployeeList().add(employee);
           this.setIndexEmployee(this.getIndexEmployee()+1);
           
           //FlatFile dataFile = new FlatFile();
           //dataFile.writeFile(this.getEmployeeList(),this.fileName,this.separator);
           XMLFile dataFile = new XMLFile();
           dataFile.writeFile(this.fileName, this.getEmployeeList());
           
           txtCalcularEdad.setText("Age: " + employee.getEdadEmpleado()/365 + " years ");
           txtCalcularAntiguedad.setText("Old: " + employee.getAntiguedad()/365 + " years ");
           NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
           txtCalcularPrestaciones.setText("Benefits " + nf.format(employee.getPrestaciones()));
           
        btnNew.setText("new");
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
        btnNext.setEnabled(true);
        btnLast.setEnabled(true);
        btnSearch.setEnabled(true);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
       }
    }

    /**
     * You obtain data from the interface and passes it to an object 
     * @return Employee object 
     */
    private Employee interface2Object() {
        Employee employee = new Employee();
        
        employee.setId(Long.parseLong(txtId.getText()));
        employee.setNombre(txtNombre.getText());
        employee.setApellido(txtApellido.getText());
        employee.setFoto(labPath.getText());
        employee.setGenero((char) (radFemenino.isSelected() ? 0 : 1));
        employee.setFechaNacimiento(dateFechaNacimiento.getDate());
        employee.setFechaIngreso(dateFechaIngreso.getDate());
        employee.setSalario(Integer.parseInt(txtSalario.getText()));
        
        return employee;
    }

    private void selectEmployee() 
    {
        String query = "SELECT * FROM Employee";
        if (this.getDataFile().execute(query))
        {
            try {
                this.getDataFile().getResultSet().next();
                this.updateInterface();
            } catch (SQLException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void object2Interface(Employee employee) 
    {
           txtId.setText("" + employee.getId());
           txtNombre.setText(employee.getNombre());
           txtApellido.setText(employee.getApellido());
           labPath.setText((employee.getFoto().equals("")) ?
                   this.path + "noPhoto.jpg" :
                   employee.getFoto());
            ImageIcon photo = new ImageIcon(labPath.getText());
            labPhoto.setIcon(photo);
           radFemenino.setSelected(employee.getGenero()==0);
           radMasculino.setSelected(employee.getGenero()==1);
           dateFechaNacimiento.setDate(employee.getFechaNacimiento());
           dateFechaIngreso.setDate(employee.getFechaIngreso());
           txtSalario.setText("" + employee.getSalario());
           txtCalcularEdad.setText("Age: " + employee.getEdadEmpleado()/365 + " years ");
           txtCalcularAntiguedad.setText("Old: " + employee.getAntiguedad()/365 + "     years ");
           NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
           txtCalcularPrestaciones.setText("Benefits " + nf.format(employee.getPrestaciones()));
    }

    private void object2Interface() 
    {
        Employee employee = new Employee();
        
        try {
            employee.setId(this.getDataFile().getResultSet().getLong("id"));
            employee.setNombre(this.getDataFile().getResultSet().getString("firstName"));
            employee.setApellido(this.getDataFile().getResultSet().getString("lastName"));
            employee.setFoto((String) ((this.getDataFile().getResultSet().getString("photo") == null) ?
                    "" : this.getDataFile().getResultSet().getInt("photo")));
            employee.setGenero(this.getDataFile().getResultSet().getInt("gender"));
            employee.setFechaNacimiento(this.getDataFile().getResultSet().getDate("bornDate"));
            employee.setFechaNacimiento(this.getDataFile().getResultSet().getDate("hiredDate"));
            employee.setSalario(this.getDataFile().getResultSet().getInt("salary"));
            
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
