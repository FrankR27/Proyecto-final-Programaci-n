package Vistas;

import Conexion.ConexionBD;
import Metodos.Metodos_Empleados;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omarl
 */
public class vw_Empleados extends javax.swing.JFrame {

    private final Metodos_Empleados CP = new Metodos_Empleados();
    int nums = 0;

    DefaultTableModel model;

    public vw_Empleados() {
        initComponents();
        listar();
        
        this.setLocationRelativeTo(null);
    }

    Metodos_Empleados metodos = new Metodos_Empleados();

    private void listar() {
        jtb_Empleados.setModel(CP.getDatos());
        mirar();
    }

    private void limpiar() {
        txtId.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        jcb_Sexo.setSelectedIndex(0);
        txtCedula.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        txtSueldo.setText("");
        txtUsuario.setText("");
        txtClave.setText("");
        txtNombres.requestFocus();

    }

    void mirar() {
        txtId.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        jcb_Sexo.setEnabled(false);
        txtCedula.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtSueldo.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtClave.setEnabled(false);

        btnguardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btncancelar.setEnabled(false);
        btnRegresar.setEnabled(true);
    }

    void empleadoMirar() {
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        jcb_Sexo.setEnabled(true);
        txtCedula.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtSueldo.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtClave.setEnabled(true);
        btnguardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btncancelar.setEnabled(true);
        btnRegresar.setEnabled(false);
    }

    void nuevo() {
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        jcb_Sexo.setEnabled(true);
        txtCedula.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtSueldo.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtClave.setEnabled(true);

        btnguardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btncancelar.setEnabled(true);

        btnRegresar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtId = new jtextfieldround.JTextFieldRound();
        txtCedula = new jtextfieldround.JTextFieldRound();
        txtEmail = new jtextfieldround.JTextFieldRound();
        txtTelefono = new jtextfieldround.JTextFieldRound();
        txtSueldo = new jtextfieldround.JTextFieldRound();
        jLabel8 = new javax.swing.JLabel();
        txtClave = new jtextfieldround.JTextFieldRound();
        jcb_Sexo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new jtextfieldround.JTextFieldRound();
        txtApellidos = new jtextfieldround.JTextFieldRound();
        txtNombres = new jtextfieldround.JTextFieldRound();
        jPanel4 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtb_Empleados = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        txtBuscar = new jtextfieldround.JTextFieldRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(251, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(33, 150, 243))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 150, 243));
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 40, 40, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 150, 243));
        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 150, 243));
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 150, 243));
        jLabel4.setText("Cedula:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 100, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 150, 243));
        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 40, 50, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 150, 243));
        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(340, 170, 70, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 150, 243));
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(690, 47, 50, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(33, 150, 243));
        jLabel14.setText("Sueldo:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(470, 40, 52, 30);

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        jPanel1.add(txtId);
        txtId.setBounds(140, 40, 100, 28);

        txtCedula.setBackground(new java.awt.Color(204, 204, 204));
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula);
        txtCedula.setBounds(420, 100, 210, 28);

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(750, 40, 210, 28);

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(420, 170, 210, 28);

        txtSueldo.setBackground(new java.awt.Color(204, 204, 204));
        txtSueldo.setForeground(new java.awt.Color(0, 0, 0));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSueldoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSueldoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSueldo);
        txtSueldo.setBounds(530, 40, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(33, 150, 243));
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(670, 170, 85, 30);

        txtClave.setBackground(new java.awt.Color(204, 204, 204));
        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        jPanel1.add(txtClave);
        txtClave.setBounds(760, 170, 210, 28);

        jcb_Sexo.setBackground(new java.awt.Color(204, 204, 204));
        jcb_Sexo.setForeground(new java.awt.Color(0, 0, 0));
        jcb_Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "M", "F" }));
        jcb_Sexo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcb_Sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcb_SexoKeyPressed(evt);
            }
        });
        jPanel1.add(jcb_Sexo);
        jcb_Sexo.setBounds(400, 40, 50, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 150, 243));
        jLabel11.setText("Usuario:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(680, 100, 70, 30);

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(760, 100, 210, 28);

        txtApellidos.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(90, 170, 210, 28);

        txtNombres.setBackground(new java.awt.Color(204, 204, 204));
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombres);
        txtNombres.setBounds(90, 100, 210, 28);

        jPanel4.setBackground(new java.awt.Color(0, 55, 133));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setContentAreaFilled(false);
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnguardar.setFocusPainted(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        btnguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnguardarKeyPressed(evt);
            }
        });
        jPanel4.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setContentAreaFilled(false);
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncancelar.setFocusPainted(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 180, -1));

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/regresar.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 70, 60));

        jtb_Empleados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtb_Empleados.setBackground(new java.awt.Color(251, 248, 248));
        jtb_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtb_Empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtb_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_EmpleadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtb_Empleados);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 150, 243));
        jLabel10.setText("Buscar por Nombre:");

        jPanel3.setBackground(new java.awt.Color(0, 55, 133));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Registro de Empleados");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(342, 342, 342))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel28)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(0, 102, 102));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/escoba.png"))); // NOI18N
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnbuscar.setFocusPainted(false);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtNombres.requestFocus();

        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jcb_Sexo.requestFocus();

        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtEmail.requestFocus();

        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean guion = key == 45;
        boolean retroceso = key == 8;
        
        if (!(numeros || guion || retroceso)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo Números, Ej: 402-1234567-1  ");
        }
        if (txtCedula.getText().trim().length() == 13) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede tener más de 13 dígitos");
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {

        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {

        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean guion = key == 45;
        boolean retroceso = key == 8;

        if (!(numeros || guion || retroceso)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo Números, Ej: 849-123-4567");
        }

        if (txtTelefono.getText().trim().length() == 12) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede tener más de 12 dígitos");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtSueldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnguardar.requestFocus();

        }
    }//GEN-LAST:event_txtSueldoKeyPressed

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingrese solo Números");
        }
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();
        limpiar();

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        //VALIDAR CAMPOS PARA QUE TODOS ESTEN LLENOS

        if (txtNombres.getText().isEmpty()
                || txtApellidos.getText().isEmpty() || txtCedula.getText().isEmpty() || jcb_Sexo.getSelectedItem().toString().isEmpty()
                || txtEmail.getText().isEmpty() || txtTelefono.getText().isEmpty()
                || txtUsuario.getText().isEmpty() || txtClave.getText().isEmpty() || txtSueldo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos");
            /*----------------------------------------------------------------------------*/
        } else {
            String Id = txtId.getText();
            String Nombres = txtNombres.getText();
            String Apellidos = txtApellidos.getText();
            String Sexo = jcb_Sexo.getSelectedItem().toString();
            String Cedula = txtCedula.getText();
            String Email = txtEmail.getText();
            String Telefono = txtTelefono.getText();
            float Sueldo = Float.parseFloat(txtSueldo.getText());
            String Usuario = txtUsuario.getText();
            String Clave = txtClave.getText();

            if (nums == 0) {
                if (metodos.Email(txtEmail.getText())) {
                    if (metodos.EmpleadoExistente(txtCedula.getText()) == 0) {

                        int respuesta = metodos.guardarEmpleado(Nombres, Apellidos, Sexo, Cedula, Email, Telefono, Sueldo, Usuario, Clave);
                        if (respuesta > 0) {
                            listar();
                            limpiar();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El empleado ya esta registrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El correo electrónico no es valido");
                }
            }

            if (nums != 0) {
                if (metodos.Email(txtEmail.getText())) {
                    int respuesta = metodos.ActualizarEmpleado(Id, Nombres, Apellidos, Sexo, Cedula, Email, Telefono, Sueldo, Usuario, Clave);
                    if (respuesta > 0) {
                        listar();
                        limpiar();
                        nums = 0;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El correo electrónico no es valido");
                }
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = jtb_Empleados.getSelectedRowCount();
        if (fila < 1) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
        } else if (fila == 1) {
            int result = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro?", "Mensaje del Sistema", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                if (CP.EliminarEmpleado(jtb_Empleados.getValueAt(jtb_Empleados.getSelectedRow(), 0).toString()) > 0) {
                    limpiar();
                    listar();
                }
            }
            if (result == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Registro no Eliminado!");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        mirar();
        limpiar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        vw_Principal ventana = new vw_Principal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jtb_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_EmpleadosMouseClicked
        int row = jtb_Empleados.getSelectedRow();
        txtId.setText(jtb_Empleados.getValueAt(row, 0).toString());
        txtNombres.setText(jtb_Empleados.getValueAt(row, 1).toString());
        txtApellidos.setText(jtb_Empleados.getValueAt(row, 2).toString());
        jcb_Sexo.setSelectedItem(jtb_Empleados.getValueAt(row, 3).toString());
        txtCedula.setText(jtb_Empleados.getValueAt(row, 4).toString());
        txtEmail.setText(jtb_Empleados.getValueAt(row, 5).toString());
        txtTelefono.setText(jtb_Empleados.getValueAt(row, 6).toString());
        txtSueldo.setText(jtb_Empleados.getValueAt(row, 7).toString());
        txtUsuario.setText(jtb_Empleados.getValueAt(row, 8).toString());
        txtClave.setText(jtb_Empleados.getValueAt(row, 9).toString());
        nums = 1;
        empleadoMirar();


    }//GEN-LAST:event_jtb_EmpleadosMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        listar();
        txtBuscar.setText("");
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jcb_SexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcb_SexoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtCedula.requestFocus();

        }
    }//GEN-LAST:event_jcb_SexoKeyPressed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void btnguardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyPressed
        //VALIDAR CAMPOS PARA QUE TODOS ESTEN LLENOS
        if (txtNombres.getText().isEmpty()
                || txtApellidos.getText().isEmpty() || txtCedula.getText().isEmpty() || jcb_Sexo.getSelectedItem().toString().isEmpty()
                || txtEmail.getText().isEmpty() || txtTelefono.getText().isEmpty()
                || txtUsuario.getText().isEmpty() || txtClave.getText().isEmpty() || txtSueldo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos");
            /*----------------------------------------------------------------------------*/
        } else {
            String Id = txtId.getText();
            String Nombres = txtNombres.getText();
            String Apellidos = txtApellidos.getText();
            String Sexo = jcb_Sexo.getSelectedItem().toString();
            String Cedula = txtCedula.getText();
            String Email = txtEmail.getText();
            String Telefono = txtTelefono.getText();
            float Sueldo = Float.parseFloat(txtSueldo.getText());
            String Usuario = txtUsuario.getText();
            String Clave = txtClave.getText();

            if (nums == 0) {
                if (metodos.Email(txtEmail.getText())) {
                    if (metodos.EmpleadoExistente(txtCedula.getText()) == 0) {

                        int respuesta = metodos.guardarEmpleado(Nombres, Apellidos, Sexo, Cedula, Email, Telefono, Sueldo, Usuario, Clave);
                        if (respuesta > 0) {
                            listar();
                            limpiar();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El empleado ya esta registrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El correo electrónico no es valido");
                }
            }

            if (nums != 0) {
                if (metodos.Email(txtEmail.getText())) {
                    int respuesta = metodos.ActualizarEmpleado(Id, Nombres, Apellidos, Sexo, Cedula, Email, Telefono, Sueldo, Usuario, Clave);
                    if (respuesta > 0) {
                        listar();
                        limpiar();
                        nums = 0;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El correo electrónico no es valido");
                }
            }
        }
    }//GEN-LAST:event_btnguardarKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean retroceso = key == 8;

        if (!(minusculas || mayusculas || espacio || retroceso)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }

        if (txtApellidos.getText().trim().length() == 50) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede tener más de 50 dígitos");
        }

    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean retroceso = key == 8;

        if (!(minusculas || mayusculas || espacio || retroceso)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }

        if (txtNombres.getText().trim().length() == 50) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede tener más de 50 dígitos");
        }

    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        cargar(txtBuscar.getText());

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtSueldoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyReleased
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;

        if (!(numeros || punto)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo Números, 23.000");
        }

        if (txtTelefono.getText().trim().length() == 6) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede tener más de 5 dígitos");
        }
    }//GEN-LAST:event_txtSueldoKeyReleased

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased

    }//GEN-LAST:event_txtCedulaKeyReleased

    //METODO PARA BUSCAR REGISTROS
    //-------------------------------------------------------------------------------------------------------------------------------------------
    void cargar(String valor) {
        String mostrar = "SELECT * FROM empleado" + " where Nombres || Apellidos like '%" + valor + "%'";
        String[] titulos = {"idEmpleado", "Nombres", "Apellidos", "Sexo", "Cedula", "Email", "Telefono", "Sueldo", "Usuario", "Clave"};
        String[] Registros = new String[10];
        model = new DefaultTableModel(null, titulos);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registros[0] = rs.getString("idEmpleado");
                Registros[1] = rs.getString("Nombres");
                Registros[2] = rs.getString("Apellidos");
                Registros[3] = rs.getString("Sexo");
                Registros[4] = rs.getString("Cedula");
                Registros[5] = rs.getString("Email");
                Registros[6] = rs.getString("Telefono");
                Registros[7] = rs.getString("Sueldo");
                Registros[8] = rs.getString("Usuario");
                Registros[9] = rs.getString("Clave");
                model.addRow(Registros);
            }
            jtb_Empleados.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
    
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
            java.util.logging.Logger.getLogger(vw_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vw_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vw_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vw_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vw_Empleados().setVisible(true);
            }
        });
    }

    ConexionBD cc = new ConexionBD();
    Connection cn = cc.conectar();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcb_Sexo;
    private javax.swing.JTable jtb_Empleados;
    private jtextfieldround.JTextFieldRound txtApellidos;
    private jtextfieldround.JTextFieldRound txtBuscar;
    private jtextfieldround.JTextFieldRound txtCedula;
    private jtextfieldround.JTextFieldRound txtClave;
    private jtextfieldround.JTextFieldRound txtEmail;
    private jtextfieldround.JTextFieldRound txtId;
    private jtextfieldround.JTextFieldRound txtNombres;
    private jtextfieldround.JTextFieldRound txtSueldo;
    private jtextfieldround.JTextFieldRound txtTelefono;
    private jtextfieldround.JTextFieldRound txtUsuario;
    // End of variables declaration//GEN-END:variables
}
