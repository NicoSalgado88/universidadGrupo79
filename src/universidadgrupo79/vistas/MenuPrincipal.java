package universidadgrupo79.vistas;

/**
 *
 * @author Nicol
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormularioDeAlumno = new javax.swing.JMenuItem();
        menumat = new javax.swing.JMenu();
        jmFormularioDeMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmManejoDeInscipciones = new javax.swing.JMenuItem();
        jmManipulacionDeNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAlumnosPorMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmFormularioDeAlumno.setText("Formulario de Alumno");
        jmFormularioDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioDeAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormularioDeAlumno);

        jMenuBar1.add(jMenu1);

        menumat.setText("Materia");
        menumat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumatActionPerformed(evt);
            }
        });

        jmFormularioDeMateria.setText("Formulario de Materia");
        jmFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioDeMateriaActionPerformed(evt);
            }
        });
        menumat.add(jmFormularioDeMateria);

        jMenuBar1.add(menumat);

        jMenu3.setText("Administracion");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jmManejoDeInscipciones.setText("Manejo de Inscripciones");
        jmManejoDeInscipciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoDeInscipcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jmManejoDeInscipciones);

        jmManipulacionDeNotas.setText("Manipulacion de Notas");
        jmManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmManipulacionDeNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jmAlumnosPorMateria.setText("Alumnos por Materia");
        jmAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosPorMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmAlumnosPorMateria);

        jMenuBar1.add(jMenu4);

        jmSalir.setText("Salir");
        jmSalir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmSalirMenuSelected(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioDeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioDeAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeAlumnos fda = new FormularioDeAlumnos();
        fda.setVisible(true);
        escritorio.add(fda);
        escritorio.moveToFront(fda);

    }//GEN-LAST:event_jmFormularioDeAlumnoActionPerformed

    private void menumatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumatActionPerformed
    }//GEN-LAST:event_menumatActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jmManejoDeInscipcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoDeInscipcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ManejoDeInscripciones mdi = new ManejoDeInscripciones();
        mdi.setVisible(true);
        escritorio.add(mdi);
        escritorio.moveToFront(mdi);
    }//GEN-LAST:event_jmManejoDeInscipcionesActionPerformed

    private void jmManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulacionDeNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ManipulacionDeNotas mdn = new ManipulacionDeNotas();
        mdn.setVisible(true);
        escritorio.add(mdn);
        escritorio.moveToFront(mdn);
    }//GEN-LAST:event_jmManipulacionDeNotasActionPerformed

    private void jmFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioDeMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeMateria fdm = new FormularioDeMateria();
        fdm.setVisible(true);
        escritorio.add(fdm);
        escritorio.moveToFront(fdm);
    }//GEN-LAST:event_jmFormularioDeMateriaActionPerformed

    private void jmAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosPorMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosPorMateria apm = new AlumnosPorMateria();
        apm.setVisible(true);
        escritorio.add(apm);
        escritorio.moveToFront(apm);
    }//GEN-LAST:event_jmAlumnosPorMateriaActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmSalirMenuSelected
        System.exit(0);
    }//GEN-LAST:event_jmSalirMenuSelected

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAlumnosPorMateria;
    private javax.swing.JMenuItem jmFormularioDeAlumno;
    private javax.swing.JMenuItem jmFormularioDeMateria;
    private javax.swing.JMenuItem jmManejoDeInscipciones;
    private javax.swing.JMenuItem jmManipulacionDeNotas;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu menumat;
    // End of variables declaration//GEN-END:variables
}
