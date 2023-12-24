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

        panelAgregarPelicula = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        textoFecha = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        textoNombre = new javax.swing.JTextField();
        textoAnio = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        panelAgregarPelicula.setMaximumSize(new java.awt.Dimension(1366, 768));
        panelAgregarPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensaje.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        mensaje.setForeground(new java.awt.Color(0, 0, 0));
        panelAgregarPelicula.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 430, 50));

        textoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaActionPerformed(evt);
            }
        });
        panelAgregarPelicula.add(textoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 490, 30));

        botonAtras.setBackground(new java.awt.Color(0, 0, 0));
        botonAtras.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atras");
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtras.setMaximumSize(new java.awt.Dimension(30, 20));
        botonAtras.setMinimumSize(new java.awt.Dimension(30, 20));
        botonAtras.setPreferredSize(new java.awt.Dimension(30, 20));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        panelAgregarPelicula.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 120, 50));

        botonSalir.setBackground(new java.awt.Color(0, 0, 0));
        botonSalir.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        botonSalir.setBorderPainted(false);
        botonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelAgregarPelicula.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 630, 120, 50));

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        panelAgregarPelicula.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 490, 30));

        textoAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAnioActionPerformed(evt);
            }
        });
        panelAgregarPelicula.add(textoAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 490, 30));

        botonAgregar.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("Agregar");
        botonAgregar.setAlignmentY(0.0F);
        botonAgregar.setBorder(null);
        botonAgregar.setBorderPainted(false);
        botonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregar.setMaximumSize(new java.awt.Dimension(85, 20));
        botonAgregar.setMinimumSize(new java.awt.Dimension(85, 20));
        botonAgregar.setPreferredSize(new java.awt.Dimension(85, 20));
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        panelAgregarPelicula.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 230, 50));

        fondo.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon("D:\\Proyectos\\moovist\\src\\main\\resources\\agregarPelicula.png")); // NOI18N
        panelAgregarPelicula.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(panelAgregarPelicula);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean valido=true;
        if(textoNombre.getText().equals("")||textoAnio.getText().equals("")||textoFecha.getText().equals(""))    
            this.mensaje.setText("Faltan parametros necesarios.");
        else
        {
            this.pelicula.setNombrePelicula(textoNombre.getText().toUpperCase().charAt(0) + textoNombre.getText().substring(1, textoNombre.getText().length()).toLowerCase());
            if(Integer.parseInt(textoAnio.getText())>LocalDate.now().getYear())
            {
                this.mensaje.setText("Bienvenido viajero del futuro. Ingrese un año valido.");
                valido=false;
            }
            else
                this.pelicula.setAnioPelicula(Integer.parseInt(textoAnio.getText()));
            if(LocalDate.parse(textoFecha.getText(), formatter).equals(LocalDate.now())||LocalDate.parse(textoFecha.getText(), formatter).isBefore(LocalDate.now()))
                this.pelicula.setFechaVisualizacion(LocalDate.parse(textoFecha.getText(), formatter));
            else
            {
                this.mensaje.setText("Debe ingresar una fecha valida. No estamos en el futuro. ¿O si?");
                valido=false;
            }
            if(valido)
            {
                agregarPelicula(this.pelicula);
                this.mensaje.setText("Se ha agregado correctamente.");
                textoNombre.setText(null);
                textoAnio.setText(null);
                textoFecha.setText(null);
            }
        }
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
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel panelAgregarPelicula;
    private javax.swing.JTextField textoAnio;
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables

}
