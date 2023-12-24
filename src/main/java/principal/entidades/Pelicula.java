package principal.entidades;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import java.time.LocalDate;


public class Pelicula {
    @CsvBindByPosition(position = 0)
    private String nombrePelicula;
    @CsvBindByPosition(position = 1)
    private Integer anioPelicula;
    @CsvBindByPosition(position = 2)
    @CsvDate(value = "yyyy-MM-dd")
    private LocalDate fechaVisualizacion;
    
    public Pelicula() {
        
    }

    public String getNombrePelicula() {
        return this.nombrePelicula;
    }

    public void setNombrePelicula(String nombre) {
        this.nombrePelicula = nombre;
    }

    public String getAnioPelicula() {
        return Integer.toString(this.anioPelicula);
    }
    
    public Integer getAnioPeliculaInt() {
        return this.anioPelicula;
    }


    public void setAnioPelicula(int anio) {
        this.anioPelicula = anio;
    } 

    public void setFechaVisualizacion(LocalDate fecha) {
        this.fechaVisualizacion = fecha;
    }

    public LocalDate getFechaVisualizacion() {
        return fechaVisualizacion;
    }
    
}
