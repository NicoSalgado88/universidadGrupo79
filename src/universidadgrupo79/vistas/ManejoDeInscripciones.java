/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadgrupo79.vistas;

import javax.swing.table.DefaultTableModel;
import universidadgrupo79.accesoADatos.AlumnoData;
import universidadgrupo79.accesoADatos.InscripcionData;
import universidadgrupo79.entidades.Alumnos;
import universidadgrupo79.entidades.Materia;

/**
 *
 * @author Nicol
 */
public class ManejoDeInscripciones extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form ManejoDeInscripciones
     */
    public ManejoDeInscripciones() {
        initComponents();
        armarCabecera();
        cargarCombox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrInscripto = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jrNoInscripto = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFormulario = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione un Alumno");

        jbAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        jbAlumnos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbAlumnosPropertyChange(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Listado de Materias");

        jrInscripto.setBackground(new java.awt.Color(255, 255, 255));
        jrInscripto.setBorder(null);
        jrInscripto.setContentAreaFilled(false);
        jrInscripto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrInscriptoItemStateChanged(evt);
            }
        });
        jrInscripto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrInscriptoStateChanged(evt);
            }
        });
        jrInscripto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jrInscriptoPropertyChange(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Materias Inscriptas");

        jrNoInscripto.setBackground(new java.awt.Color(255, 255, 255));
        jrNoInscripto.setBorder(null);
        jrNoInscripto.setContentAreaFilled(false);
        jrNoInscripto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrNoInscriptoItemStateChanged(evt);
            }
        });
        jrNoInscripto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrNoInscriptoStateChanged(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Materias no inscriptas");

        jtFormulario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtFormulario);

        jbInscribir.setText("Inscribir");

        jbAnular.setText("Anular inscripcion");

        jbSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrInscripto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44)
                        .addComponent(jrNoInscripto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jbInscribir)
                .addGap(55, 55, 55)
                .addComponent(jbAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jrInscripto)
                    .addComponent(jrNoInscripto)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addGap(50, 50, 50))
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

    private void jbAlumnosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbAlumnosPropertyChange

//       for (Producto prod : DeTodoSA.listaProductos) {
//            if (prod.getDescripcion().startsWith(jtNombre.getText())) {
//                modelo.addRow(new Object[]{
//                    prod.getCodigo(),
//                    prod.getRubro(),
//                    prod.getDescripcion(),
//                    prod.getPrecio(),
//                    prod.getStock()
//                });
//            }
//        }
    }//GEN-LAST:event_jbAlumnosPropertyChange

    private void jrInscriptoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jrInscriptoPropertyChange
        
    }//GEN-LAST:event_jrInscriptoPropertyChange

    private void jrInscriptoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrInscriptoStateChanged
        
    }//GEN-LAST:event_jrInscriptoStateChanged

    private void jrNoInscriptoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrNoInscriptoStateChanged
        
    }//GEN-LAST:event_jrNoInscriptoStateChanged

    private void jrInscriptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrInscriptoItemStateChanged
        InscripcionData inD = new InscripcionData();
        Alumnos alu = (Alumnos) jbAlumnos.getSelectedItem();
        modelo.setRowCount(0);
        if (jrInscripto.isSelected()) {
            for (Materia mat : inD.obtenerMateriasCursadas(alu.getIdAlumno())) {
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAño()
                });
            }
        }
    }//GEN-LAST:event_jrInscriptoItemStateChanged

    private void jrNoInscriptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrNoInscriptoItemStateChanged
        InscripcionData inD = new InscripcionData();
        Alumnos alu = (Alumnos) jbAlumnos.getSelectedItem();
        modelo.setRowCount(0);
        if (jrNoInscripto.isSelected()) {
            for (Materia mat : inD.obtenerMateriasNOCursadas(alu.getIdAlumno())) {
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAño()
                });
            }
        }
    }//GEN-LAST:event_jrNoInscriptoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumnos> jbAlumnos;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrInscripto;
    private javax.swing.JRadioButton jrNoInscripto;
    private javax.swing.JTable jtFormulario;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtFormulario.setModel(modelo);
    }

    private void cargarCombox() {
        AlumnoData alu = new AlumnoData();
        for (Alumnos alus : alu.listarAlumnos()) {
            jbAlumnos.addItem(alus);
        }

    }
}
