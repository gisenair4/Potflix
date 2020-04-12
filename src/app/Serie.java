package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
  
public List<Genero> generos = new ArrayList<>();
    

    
	public Temporada getTemporada(int numeroTemporada) {
    //Recorrer cada temporada
    //si el nro de temporada del ciclo es igual a "nro"
    //devolver esa temporada

    for (Temporada tempo : this.temporadas) {
      if(tempo.numero == numeroTemporada)
      {
        return tempo;
        
      }

    }
    return null;
    
    }

    public List<Temporada> temporadas = new ArrayList<>();
    public List<Episodio> episodios = new ArrayList<>();
	  
   
}