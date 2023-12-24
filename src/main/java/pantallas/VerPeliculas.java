package pantallas;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.List;
import javax.swing.DefaultListModel;
import principal.Comparators.PeliculasComparator;
import principal.entidades.Pelicula;

public class VerPeliculas extends javax.swing.JFrame {
    int cantidadTotal = 0;

    public VerPeliculas() {
        initComponents();
        visualizador.setModel(this.listadoPeliculas("Default"));
        labelTotalVistas.setText(Integer.toString(this.getCantidadTotal()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVerPeliculas = new javax.swing.JPanel();
        labelTotalVistas = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        listado = new javax.swing.JScrollPane();
        visualizador = new javax.swing.JList<>();
        botonAtras = new javax.swing.JButton();
        dropdownOrdenamiento = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        panelVerPeliculas.setMaximumSize(new java.awt.Dimension(1366, 768));
        panelVerPeliculas.setMinimumSize(new java.awt.Dimension(1366, 768));
        panelVerPeliculas.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelVerPeliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTotalVistas.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        labelTotalVistas.setForeground(new java.awt.Color(1, 1, 1));
        labelTotalVistas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalVistas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelTotalVistas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelVerPeliculas.add(labelTotalVistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 150, 50));

        botonSalir.setBackground(new java.awt.Color(1, 1, 1));
        botonSalir.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelVerPeliculas.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 630, 120, 50));

        listado.setBorder(null);
        listado.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        visualizador.setBorder(null);
        visualizador.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        visualizador.setSelectionBackground(new java.awt.Color(1, 1, 1));
        listado.setViewportView(visualizador);

        panelVerPeliculas.add(listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 510, 620));

        botonAtras.setBackground(new java.awt.Color(1, 1, 1));
        botonAtras.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atras");
        botonAtras.setMaximumSize(new java.awt.Dimension(30, 20));
        botonAtras.setMinimumSize(new java.awt.Dimension(30, 20));
        botonAtras.setPreferredSize(new java.awt.Dimension(30, 20));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        panelVerPeliculas.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 120, 50));

        dropdownOrdenamiento.setBackground(new java.awt.Color(0, 0, 0));
        dropdownOrdenamiento.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        dropdownOrdenamiento.setForeground(new java.awt.Color(255, 255, 255));
        dropdownOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Fecha visualizacion", "Año", "Nombre" }));
        dropdownOrdenamiento.setBorder(null);
        dropdownOrdenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownOrdenamientoActionPerformed(evt);
            }
        });
        panelVerPeliculas.add(dropdownOrdenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 100, 170, -1));

        fondo.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verPeliculas.png"))); // NOI18N
        panelVerPeliculas.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            case("Fecha visualizacion"):
            {
                peliculas.sort(new PeliculasComparator());
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
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel labelTotalVistas;
    private javax.swing.JScrollPane listado;
    private javax.swing.JPanel panelVerPeliculas;
    private javax.swing.JList<String> visualizador;
    // End of variables declaration//GEN-END:variables
}
