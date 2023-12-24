package pantallas;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultListModel;
import principal.entidades.Pelicula;

/**
 *
 * @author Maru
 */
public class VerPeliculas extends javax.swing.JFrame {
    int cantidadTotal = 0;
    int cantidadAnio = 0;

    public VerPeliculas() {
        initComponents();
        visualizador.setModel(this.listadoPeliculas("Default"));
        labelTotalVistas.setText(Integer.toString(this.getCantidadTotal()));
        labelVistasAnio.setText(Integer.toString(this.getCantidadAnio()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTotalVistas = new javax.swing.JLabel();
        labelVistasAnio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visualizador = new javax.swing.JList<>();
        botonAtras = new javax.swing.JButton();
        dropdownOrdenamiento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1350, 720));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(labelTotalVistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 120, 20));
        jPanel1.add(labelVistasAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 120, 20));

        jLabel3.setText("Cantidad de peliculas vistas este año: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel5.setText("Cantidad total de peliculas vistas: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 640, -1, -1));

        jLabel1.setText("Ordenar por:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        visualizador.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(visualizador);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 480, 600));

        botonAtras.setText("Atras");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        dropdownOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Fecha visualizacion", "Año", "Nombre" }));
        dropdownOrdenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownOrdenamientoActionPerformed(evt);
            }
        });
        jPanel1.add(dropdownOrdenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Proyectos\\moovist\\src\\main\\java\\resources\\verPeliculas.png")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1350, 720));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public int getCantidadAnio() {
        return cantidadAnio;
    }

    public void setCantidadAnio(int cantidadAnio) {
        this.cantidadAnio = cantidadAnio;
    }
    
    private DefaultListModel<String> listadoPeliculas(String ordenamiento)
    {
        String stringPelicula = null;
        DefaultListModel<String> lista =  new DefaultListModel<>();
        int i=0;
        try {
            List<Pelicula> peliculas = new CsvToBeanBuilder(new FileReader("moovist.csv")).withType(Pelicula.class).build().parse();

        switch(ordenamiento){
            case("Nombre"):
            {
                peliculas.sort((x, y) -> x.getNombrePelicula().compareToIgnoreCase(y.getNombrePelicula()));
                System.out.print("soy un nombre");
            }
            break;
            case("Fecha de visualizacion"):
            {
                Comparator<Pelicula> comparator = (c1, c2) -> {return c1.getFechaVisualizacion().compareTo(c2.getFechaVisualizacion());};
                Collections.sort(peliculas,comparator);
                System.out.print("soy una fecha");
            }
            break;
            case("Año"):
            {
                peliculas.sort((x, y) -> x.getAnioPeliculaInt().compareTo(y.getAnioPeliculaInt()));
                System.out.print("soy un anio");
            }
            break;
        }   
            
            this.setCantidadTotal(peliculas.size());
            
            for(Pelicula pelicula : peliculas)
            {
                stringPelicula = pelicula.getFechaVisualizacion()+": "+ pelicula.getNombrePelicula() + " (" + pelicula.getAnioPelicula() + ")";
                lista.add(i,stringPelicula);
                i++;
            }
        } 
        catch (Exception e) {
            System.out.println("No se pudo generar el listado. Por favor contecte a Maru.");
        }
        
        return lista;
    }
    
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        Presentacion ventana = new Presentacion();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void dropdownOrdenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownOrdenamientoActionPerformed
        String ordenamiento = dropdownOrdenamiento.getSelectedItem().toString();
        visualizador.setModel(this.listadoPeliculas(ordenamiento));
        
    }//GEN-LAST:event_dropdownOrdenamientoActionPerformed

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
            java.util.logging.Logger.getLogger(VerPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> dropdownOrdenamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotalVistas;
    private javax.swing.JLabel labelVistasAnio;
    private javax.swing.JList<String> visualizador;
    // End of variables declaration//GEN-END:variables
}
