package pantallas;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import principal.comparators.PeliculasComparator;
import principal.entidades.Pelicula;

public class VerPeliculas extends javax.swing.JFrame {
    int cantidadTotal = 0;

    public VerPeliculas() {
        initComponents();
        visualizador.setModel(this.listadoPeliculas("Default"));
        labelTotalVistas.setText(Integer.toString(this.getCantidadTotal()));
        labelTotalVistas1.setText(Integer.toString(this.getCantidadAnio()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVerPeliculas = new javax.swing.JPanel();
        labelTotalVistas = new javax.swing.JLabel();
        labelTotalVistas1 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        botonGooglear = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        listado = new javax.swing.JScrollPane();
        visualizador = new javax.swing.JList<>();
        botonAtras = new javax.swing.JButton();
        dropdownOrdenamiento = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
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
        panelVerPeliculas.add(labelTotalVistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 150, 50));

        labelTotalVistas1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        labelTotalVistas1.setForeground(new java.awt.Color(1, 1, 1));
        labelTotalVistas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalVistas1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelTotalVistas1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelVerPeliculas.add(labelTotalVistas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 150, 50));

        botonEliminar.setBackground(new java.awt.Color(1, 1, 1));
        botonEliminar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelVerPeliculas.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 360, 110, 40));

        botonGooglear.setBackground(new java.awt.Color(1, 1, 1));
        botonGooglear.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonGooglear.setForeground(new java.awt.Color(255, 255, 255));
        botonGooglear.setText("Googlear");
        botonGooglear.setActionCommand("Eliminar");
        botonGooglear.setBorder(null);
        botonGooglear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGooglearActionPerformed(evt);
            }
        });
        panelVerPeliculas.add(botonGooglear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 110, 40));
        botonGooglear.getAccessibleContext().setAccessibleName("Eliminar");

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

        botonEditar.setBackground(new java.awt.Color(1, 1, 1));
        botonEditar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("Editar");
        botonEditar.setBorder(null);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        panelVerPeliculas.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 260, 110, 40));

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
    
    public int getCantidadAnio() {
        DefaultListModel<String> listado = this.listadoPeliculas("Default");
        int cantidadAnio = 0;
        for(int i = 0; i < listado.size(); i++)
        {
            Pelicula pelicula = stringToPelicula(listado.get(i));
            if(pelicula.getFechaVisualizacion().getYear()==LocalDate.now().getYear())
            {
                cantidadAnio++;
            }
        }
        return cantidadAnio;
    }
    
    public Pelicula stringToPelicula(String elemento){
        String[] e1 = elemento.split(": ",2);
        String[] e2 = e1[1].split(" \\(");
        String anio = e2[1].replace(")", "");
        Pelicula pelicula = new Pelicula();
        pelicula.setNombrePelicula(e2[0]);
        pelicula.setAnioPelicula(Integer.parseInt(anio));
        pelicula.setFechaVisualizacion(LocalDate.parse(e1[0]));
        return pelicula;
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
            System.out.println("No se pudo generar el listado.");
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

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
        String pelicula = visualizador.getSelectedValue();
        System.out.print(pelicula); 
        
        List<Pelicula> peliculas = new ArrayList();
        try {
            peliculas = new CsvToBeanBuilder(new FileReader("moovist.csv")).withType(Pelicula.class).build().parse();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VerPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }

                Pelicula peliculaClase = stringToPelicula(pelicula);
                for(int i = 0; i < peliculas.size(); i++)
                {
                    if(peliculas.get(i).getNombrePelicula().equals(peliculaClase.getNombrePelicula()))
                    {
                        peliculas.remove(i);
                    }
                }
                System.out.print(peliculas.size());

        try {
            String archCSV = "moovist.csv";
            CSVWriter writer = new CSVWriter(new FileWriter(archCSV));
            if(peliculas.isEmpty()){}
            else
            {
                for(int i = 0; i < peliculas.size(); i++)
                {       
                    String[] nuevaPelicula = {peliculas.get(i).getNombrePelicula(),peliculas.get(i).getAnioPelicula(),peliculas.get(i).getFechaVisualizacion().toString()};
                    writer.writeNext(nuevaPelicula);    
                }
            }
            writer.close();
            }
            catch (IOException ex) {
                Logger.getLogger(VerPeliculas.class.getName()).log(Level.SEVERE, "No se pudo escribir el nuevo archivo.", ex);
        }
        visualizador.setModel(this.listadoPeliculas("Default"));
        labelTotalVistas.setText(Integer.toString(this.getCantidadTotal()));
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonGooglearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGooglearActionPerformed
        String pelicula = visualizador.getSelectedValue();
        Pelicula peliculaClase = stringToPelicula(pelicula);
        try {
            Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /K start www.google.com/search?q=" + peliculaClase.getNombrePelicula().replace(" ", "+") + "+" + peliculaClase.getAnioPelicula());
        } catch (IOException ex) {
            Logger.getLogger(VerPeliculas.class.getName()).log(Level.SEVERE, "No se pudo googlear.", ex);
        }
    }//GEN-LAST:event_botonGooglearActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        //TODO
    }//GEN-LAST:event_botonEditarActionPerformed

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
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGooglear;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> dropdownOrdenamiento;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel labelTotalVistas;
    private javax.swing.JLabel labelTotalVistas1;
    private javax.swing.JScrollPane listado;
    private javax.swing.JPanel panelVerPeliculas;
    private javax.swing.JList<String> visualizador;
    // End of variables declaration//GEN-END:variables
}
