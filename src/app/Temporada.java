package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public int numero;

    public List<Episodio> episodios = new ArrayList<>();

    /**
     * Obtiene un episodio en base a su numero de episodio
     * 
     * @param numeroEpisodio
     * @return
     */
    
	public Episodio getEpisodio(int numeroEpisodio) {
        //Recorrer cada episodio 
        //si el nro de episodio del ciclo es igual a "nro
        //devolver ese episodio
        
        for (Episodio epi : this.episodios) {
            if (epi.getNumero() == numeroEpisodio){
            
                return epi;
            }
        }
        return null;
	}
    
    /**
     * Obtiene un episodio en base al nombre (es una sobrecarga del metodo
     * getEpisodio(int nro))
     * 
     * @param nombre
     * @return 
     */
   
public Episodio getEpisoddio(String nombre) {
    for (Episodio epi : this.episodios) {
        if (epi.getNombre().equalsIgnoreCase(nombre)) {
            return epi;
        }
    }
    return null;
}
public int getEpisodioPosition(int nro) {
    int pos = 0; 
    for (Episodio epi : this.episodios) {
        if (epi.getNumero() == nro) {
            return pos;
        }
        pos++;
}
if (this.episodios.size() == pos)
    return -1;
return pos;
}
}