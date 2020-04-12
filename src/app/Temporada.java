package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public int numero;

    public List<Episodio> episodios = new ArrayList<>();
    
	public Episodio getEpisodio(int numeroEpisodio) {
        //Recorrer cada episodio 
        //si el nro de episodio del ciclo es igual a "nro
        //devolver ese episodio
        
        for (Episodio epi : this.episodios) {
            if (epi.numero == numeroEpisodio){
            
                return epi;
            }
        }
        return null;
	}
    

}