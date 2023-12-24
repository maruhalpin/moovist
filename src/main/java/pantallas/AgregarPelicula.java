package pantallas;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import principal.entidades.Pelicula;

public class AgregarPelicula extends javax.swing.JFrame {
    private Pelicula pelicula;
    
    public AgregarPelicula() {
        initComponents();
        this.pelicula = new Pelicula();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        textoFecha = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        textoNombre = new javax.swing.JTextField();
        anio = new javax.swing.JLabel();
        textoAnio = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1350, 720));
        setPreferredSize(new java.awt.Dimension(1350, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1350, 720));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("Fecha");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        textoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaActionPerformed(evt);
            }
        });
        jPanel1.add(textoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 470, 30));

        botonAtras.setBackground(new java.awt.Color(0, 0, 0));
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atras");
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 110, 50));

        botonSalir.setBackground(new java.awt.Color(0, 0, 0));
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        botonSalir.setBorderPainted(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 610, 110, 50));

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 470, 30));

        anio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        anio.setForeground(new java.awt.Color(0, 0, 0));
        anio.setText("Año:");
        jPanel1.add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        textoAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAnioActionPerformed(evt);
            }
        });
        jPanel1.add(textoAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 470, 30));

        botonAgregar.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("Agregar");
        botonAgregar.setBorder(null);
        botonAgregar.setBorderPainted(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 120, 50));

        nombre.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 140, 50));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Proyectos\\moovist\\src\\main\\java\\resources\\agregarPelicula.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1350, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1350, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1350, 720));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        this.pelicula.setNombrePelicula(textoNombre.getText().toUpperCase().charAt(0) + textoNombre.getText().substring(1, textoNombre.getText().length()).toLowerCase());
        this.pelicula.setAnioPelicula(Integer.parseInt(textoAnio.getText()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.pelicula.setFechaVisualizacion(LocalDate.parse(textoFecha.getText(), formatter));
        agregarPelicula(this.pelicula);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void textoAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAnioActionPerformed

    }//GEN-LAST:event_textoAnioActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed

    }//GEN-LAST:event_textoNombreActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        Presentacion ventana = new Presentacion();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void textoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaActionPerformed
                
    }//GEN-LAST:event_textoFechaActionPerformed

    private void agregarPelicula(Pelicula pelicula) {
        try {
            
            String[] nuevaPelicula = {pelicula.getNombrePelicula(),pelicula.getAnioPelicula(),pelicula.getFechaVisualizacion().toString()};

            String archCSV = "moovist.csv";
            CSVWriter writer = new CSVWriter(new FileWriter(archCSV, true));

            writer.writeNext(nuevaPelicula);

            writer.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
 
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
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anio;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField textoAnio;
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables

}
