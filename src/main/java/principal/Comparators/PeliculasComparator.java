package principal.Comparators;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import principal.entidades.Pelicula;

public class PeliculasComparator implements Comparator<Pelicula>{
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        long a = ChronoUnit.DAYS.between( p1.getFechaVisualizacion(), p2.getFechaVisualizacion());
        int salida = 0;
        if( a > 0 ) {
           salida = 1;
        }
        if( a < 0 ) {
           salida = -1;
        }
        return salida;
    } 
}
