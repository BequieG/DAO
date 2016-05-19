
package com.ranga;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bequie
 */
public class ABC extends javax.swing.JFrame {

    
    private StudentDAOImpl estudiante = new StudentDAOImpl();
    public ABC() throws Exception {

        initComponents();   
        cargarTablas();
        cargarCarreras();
        cargarFacultades();
        txtMatriculaC.setEditable(false);

    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpBaja = new javax.swing.JTabbedPane();
        jpAlta = new javax.swing.JPanel();
        btnAlta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApPaterno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApMaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbCarreras = new javax.swing.JComboBox();
        jcbFacultades = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jsSemestre = new javax.swing.JSpinner();
        jcbSexo = new javax.swing.JComboBox();
        jpBaja = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnBaja = new javax.swing.JButton();
        jpCambio = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlumnos1 = new javax.swing.JTable();
        btnCambio = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jsSemestreC = new javax.swing.JSpinner();
        jcbFacultadesC = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jcbSexoC = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtApMaternoC = new javax.swing.JTextField();
        txtApPaternoC = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtMatriculaC = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jcbCarrerasC = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtpBaja.setFocusable(false);
        jtpBaja.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        btnAlta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAlta.setText("Crear");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Matricula:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Sexo:");

        txtMatricula.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Apellido Paterno:");

        txtApPaterno.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPaternoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Apellido Materno:");

        txtApMaterno.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMaternoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Carrera:");

        jcbCarreras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carrera" }));

        jcbFacultades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facultad" }));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Facultad:");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Semestre:");

        jsSemestre.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sexo", "Hombre", "Mujer" }));

        javax.swing.GroupLayout jpAltaLayout = new javax.swing.GroupLayout(jpAlta);
        jpAlta.setLayout(jpAltaLayout);
        jpAltaLayout.setHorizontalGroup(
            jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlta)
                .addGap(63, 63, 63))
            .addGroup(jpAltaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpAltaLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpAltaLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpAltaLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpAltaLayout.createSequentialGroup()
                        .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbFacultades, 0, 176, Short.MAX_VALUE)
                            .addComponent(jsSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCarreras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(585, Short.MAX_VALUE))
        );
        jpAltaLayout.setVerticalGroup(
            jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jsSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnAlta)
                .addGap(28, 28, 28))
        );

        jtpBaja.addTab("Alta", jpAlta);

        tblAlumnos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Ap Paterno", "Ap Mateno", "Sexo", "Carrera", "Facultad", "Semestre"
            }
        ));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAlumnosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        btnBaja.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBaja.setText("Borrar");
        btnBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBajaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpBajaLayout = new javax.swing.GroupLayout(jpBaja);
        jpBaja.setLayout(jpBajaLayout);
        jpBajaLayout.setHorizontalGroup(
            jpBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBaja)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jpBajaLayout.setVerticalGroup(
            jpBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnBaja)
                .addGap(40, 40, 40))
        );

        jtpBaja.addTab("Baja", jpBaja);

        tblAlumnos1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblAlumnos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "ApPaterno", "ApMaterno", "Sexo", "Carrera", "Facultad", "Semestre"
            }
        ));
        tblAlumnos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAlumnos1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblAlumnos1);

        btnCambio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCambio.setText("Modificar");
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Semestre:");

        jcbFacultadesC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facultad" }));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Facultad:");

        jcbSexoC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sexo", "Hombre", "Mujer" }));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Sexo:");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setText("Apellido Materno:");

        txtApMaternoC.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtApMaternoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMaternoCKeyTyped(evt);
            }
        });

        txtApPaternoC.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtApPaternoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPaternoCKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setText("Apellido Paterno:");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setText("Nombre:");

        txtNombreC.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtNombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCKeyTyped(evt);
            }
        });

        txtMatriculaC.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setText("Matricula:");

        jcbCarrerasC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carrera" }));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Carrera:");

        javax.swing.GroupLayout jpCambioLayout = new javax.swing.GroupLayout(jpCambio);
        jpCambio.setLayout(jpCambioLayout);
        jpCambioLayout.setHorizontalGroup(
            jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCambioLayout.createSequentialGroup()
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCambioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jpCambioLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtApPaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpCambioLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCambioLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMatriculaC, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpCambioLayout.createSequentialGroup()
                                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsSemestreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApMaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbSexoC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbFacultadesC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCambioLayout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbCarrerasC, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
                        .addComponent(btnCambio))
                    .addGroup(jpCambioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jpCambioLayout.setVerticalGroup(
            jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCambioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCambio)
                .addGap(19, 19, 19))
            .addGroup(jpCambioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriculaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApPaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(4, 4, 4)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApMaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jcbSexoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcbCarrerasC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFacultadesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jsSemestreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jtpBaja.addTab("Cambio", jpCambio);
        jtpBaja.addTab("", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpBaja)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void cargarTablas() throws Exception{
          
        DefaultTableModel dtmAlumno =  (DefaultTableModel) tblAlumnos.getModel();
        ArrayList<Student> allStudents = estudiante.getAllStudents();
        Object[] fila = new Object[dtmAlumno.getColumnCount()];
        for (int i = 0; i < allStudents.size(); i++) {
            fila[0] = allStudents.get(i).getMatricula();
            fila[1] = allStudents.get(i).getNombre();
            fila[2] = allStudents.get(i).getApPaterno();
            fila[3] = allStudents.get(i).getApMaterno();
            fila[4] = allStudents.get(i).getSexo();
            fila[5] = allStudents.get(i).getCarrera();
            fila[6] = allStudents.get(i).getFacultad();
            fila[7] = allStudents.get(i).getSemestre();
            dtmAlumno.addRow(fila);
        }
        
        DefaultTableModel dtmAlumno1 = (DefaultTableModel) tblAlumnos1.getModel();
        ArrayList<Student> allStudents1 = estudiante.getAllStudents();
        Object[] fila1 = new Object[dtmAlumno1.getColumnCount()];
        for (int i = 0; i < allStudents1.size(); i++) {
            fila1[0] = allStudents1.get(i).getMatricula();
            fila1[1] = allStudents1.get(i).getNombre();
            fila1[2] = allStudents1.get(i).getApPaterno();
            fila1[3] = allStudents1.get(i).getApMaterno();
            fila1[4] = allStudents1.get(i).getSexo();
            fila1[5] = allStudents1.get(i).getCarrera();
            fila1[6] = allStudents1.get(i).getFacultad();
            fila1[7] = allStudents1.get(i).getSemestre();
            dtmAlumno1.addRow(fila1);
        }
    }
    
    private void limpiaTabla(JTable tblAlumnos, JTable tblAlumnos1){
       
        try{
            DefaultTableModel temp = (DefaultTableModel) tblAlumnos.getModel();
            int a =tblAlumnos.getRowCount();
            for(int i=0; a>i; i++)
                temp.removeRow(0);
            
            DefaultTableModel temp1 = (DefaultTableModel) tblAlumnos1.getModel();
            int a1 =tblAlumnos1.getRowCount();
            for(int i=0; a1>i; i++)
                temp1.removeRow(0);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void cargarCarreras() throws Exception{

        ArrayList<Carrera> allCarreras = estudiante.getAllCarreras();
        for (Carrera allCarrera : allCarreras) {
            jcbCarreras.addItem(allCarrera.getCarrera());
        }
        
        ArrayList<Carrera> allCarreras1 = estudiante.getAllCarreras();
        for (Carrera allCarrera1 : allCarreras1) {
            jcbCarrerasC.addItem(allCarrera1.getCarrera());
        }
    }
    
    private void cargarFacultades() throws Exception{

        ArrayList<Facultad> allFacultades = estudiante.getAllFacultades();
        for (Facultad allFacultad : allFacultades) {
            jcbFacultades.addItem(allFacultad.getFacultad());
        }
        
        ArrayList<Facultad> allFacultades1 = estudiante.getAllFacultades();
        for (Facultad allFacultad1 : allFacultades1) {
            jcbFacultadesC.addItem(allFacultad1.getFacultad());
        }
    }
    
    private void limpiar() {
     
     txtMatricula.setText("");
     txtNombre.setText("");
     txtApMaterno.setText("");
     txtApPaterno.setText("");
     jsSemestre.setValue(0);
     jcbSexo.setSelectedItem("Sexo");
     jcbCarreras.setSelectedItem("Carrera");
     jcbFacultades.setSelectedItem("Facultad");
   
    }
    
    private void limpiarC(){
        txtMatriculaC.setText("");
        txtNombreC.setText("");
        txtApMaternoC.setText("");
        txtApPaternoC.setText("");
        jsSemestreC.setValue(0);
        jcbSexoC.setSelectedItem("Sexo");
        jcbCarrerasC.setSelectedItem("Carrera");
        jcbFacultadesC.setSelectedItem("Facultad");
    }
    
    private void agregar() throws Exception{

        long matricula = Long.parseLong(txtMatricula.getText());
        String nombre = txtNombre.getText();
        String apPaterno = txtApPaterno.getText();
        String apMaterno = txtApMaterno.getText();
        String sexo = jcbSexo.getSelectedItem().toString();
        String carrera = jcbCarreras.getSelectedItem().toString();
        String facultad = jcbFacultades.getSelectedItem().toString();
        int semestre = Integer.parseInt(jsSemestre.getValue().toString());

        Student student = new Student(matricula, nombre, apPaterno, apMaterno, sexo, carrera, facultad, semestre);
        estudiante.createStudent(student);  
        JOptionPane.showMessageDialog(null, "Alumno Agregado!");
    }

    private void borrar() throws Exception {
   
        String matriculaTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 0).toString();
        String nombreTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 1).toString();
        String apPaternoTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 2).toString();
        String apMaternoTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 3).toString();
        String sexoTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 4).toString();
        String carreraTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 5).toString();
        String facultadTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 6).toString();
        String semestreTemp = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 7).toString();
       
        long matricula = Long.parseLong(matriculaTemp);
        String nombre = nombreTemp;
        String apPaterno = apPaternoTemp;
        String apMaterno = apMaternoTemp;
        String sexo = sexoTemp;
        String carrera = carreraTemp;
        String facultad = facultadTemp;
        int semestre = Integer.parseInt(semestreTemp);
        
        Student student = new Student(matricula, nombre, apPaterno, apMaterno, sexo, carrera, facultad, semestre);
        estudiante.deleteStudent(student);
        JOptionPane.showMessageDialog(null, "Alumno Borrado!");
        
    }
    
    private void mostrarDatos() throws Exception{
         
        txtMatriculaC.setText(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 0).toString());
        txtNombreC.setText(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 1).toString());
        txtApPaternoC.setText(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 2).toString());
        txtApMaternoC.setText(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 3).toString());
        jcbSexoC.setSelectedItem(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 4).toString());
        jcbCarrerasC.setSelectedItem(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 5).toString());
        jcbFacultadesC.setSelectedItem(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 6).toString());
        jsSemestreC.setValue(tblAlumnos1.getValueAt(tblAlumnos1.getSelectedRow(), 7));

    }

    private void Modificar() throws Exception{

        long matricula = Long.parseLong(txtMatriculaC.getText());
        String nombre = txtNombreC.getText();
        String apPaterno = txtApPaternoC.getText();
        String apMaterno = txtApMaternoC.getText();
        String sexo = jcbSexoC.getSelectedItem().toString();
        String carrera = jcbCarrerasC.getSelectedItem().toString();
        String facultad = jcbFacultadesC.getSelectedItem().toString();
        int semestre = Integer.parseInt(jsSemestreC.getValue().toString());
        
        Student student = new Student(matricula, nombre, apPaterno, apMaterno, sexo, carrera, facultad, semestre);
        estudiante.updateStudent(student); 
        JOptionPane.showMessageDialog(null, "Alumno Modificado!");
    }
    
    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        try {
            Modificar();
            limpiaTabla(tblAlumnos, tblAlumnos1);
            cargarTablas();
            limpiarC();
        } catch (Exception ex) {
            Logger.getLogger(ABC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCambioActionPerformed

    private void btnBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaMouseClicked

        try {
            borrar();
            limpiaTabla(tblAlumnos, tblAlumnos1);
            cargarTablas();
        } catch (Exception ex) {
            Logger.getLogger(ABC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBajaMouseClicked

    private void tblAlumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMousePressed

        String matricula = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tblAlumnosMousePressed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed

        try {
            limpiaTabla(tblAlumnos, tblAlumnos1);
            agregar();
            cargarTablas();

        } catch (Exception ex) {
            Logger.getLogger(ABC.class.getName()).log(Level.SEVERE, null, ex);
        }

        limpiar();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void tblAlumnos1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnos1MousePressed
        try {
            cargarCarreras();
            cargarFacultades();
            mostrarDatos();
        } catch (Exception ex) {
            Logger.getLogger(ABC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblAlumnos1MousePressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       char c = evt.getKeyChar();
        if( ( c < 'A' || c > 'Z' )  && ( c < 'a' || c > 'z' ) )
        evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPaternoKeyTyped
        char c = evt.getKeyChar();
        if( ( c < 'A' || c > 'Z' )  && ( c < 'a' || c > 'z' ) )
        evt.consume();
    }//GEN-LAST:event_txtApPaternoKeyTyped

    private void txtApMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMaternoKeyTyped
        char c = evt.getKeyChar();
        if( ( c < 'A' || c > 'Z' )  && ( c < 'a' || c > 'z' ) )
        evt.consume();
    }//GEN-LAST:event_txtApMaternoKeyTyped

    private void txtNombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCKeyTyped
        char c = evt.getKeyChar();
        if( ( c < 'A' || c > 'Z' )  && ( c < 'a' || c > 'z' ) )
        evt.consume();
    }//GEN-LAST:event_txtNombreCKeyTyped

    private void txtApPaternoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPaternoCKeyTyped
        char c = evt.getKeyChar();
        if( ( c < 'A' || c > 'Z' )  && ( c < 'a' || c > 'z' ) )
        evt.consume();
    }//GEN-LAST:event_txtApPaternoCKeyTyped

    private void txtApMaternoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMaternoCKeyTyped
       char c = evt.getKeyChar();
        if( ( c < 'A' || c > 'Z' )  && ( c < 'a' || c > 'z' ) )
        evt.consume();
    }//GEN-LAST:event_txtApMaternoCKeyTyped

    private void txtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyTyped
        char c = evt.getKeyChar();
        if( c < '0' || c > '9' )
        evt.consume();
    }//GEN-LAST:event_txtMatriculaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JComboBox jcbCarreras;
    private javax.swing.JComboBox jcbCarrerasC;
    private javax.swing.JComboBox jcbFacultades;
    private javax.swing.JComboBox jcbFacultadesC;
    private javax.swing.JComboBox jcbSexo;
    private javax.swing.JComboBox jcbSexoC;
    private javax.swing.JPanel jpAlta;
    private javax.swing.JPanel jpBaja;
    private javax.swing.JPanel jpCambio;
    private javax.swing.JSpinner jsSemestre;
    private javax.swing.JSpinner jsSemestreC;
    private javax.swing.JTabbedPane jtpBaja;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTable tblAlumnos1;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApMaternoC;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtApPaternoC;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMatriculaC;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreC;
    // End of variables declaration//GEN-END:variables

    
}
