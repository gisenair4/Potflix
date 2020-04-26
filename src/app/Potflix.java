package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;
/**
 * Potflix
 */

public class Potflix {

    String buscarPorTitulo;
    String titulo;
    String buscarSerie;
    String buscarPelicula;
    String actor;

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> serie = new ArrayList<>();
    public List<INominable> nominables = new ArrayList<>();
    public Contenido buscarPorTitulo(String titulo) {
        return null;

    }

    public Serie buscarActor(String actor) {
        return null;
        }
        

    public Pelicula buscarPelicula(String titulo) {
        return null;
    }

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.serie){
            if (s.titulo.equals(titulo))
            return s;
    }
         return null;
}
    public void inicializarCatalogo() {
    
        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Actor actor1 = new Actor();
        actor1.nombre = "Brian Crasnton";

        this.nominables.add(actor1);


        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.generos.add(genero);

        Temporada t5 = new Temporada();
        t5.numero = 5;
        Episodio ep = new Episodio();
        ep.setNumero(7);
        ep.setNombre("Di mi nombre");
        ep.setDuracion(43);
        t5.episodios.add(ep);
        Episodio epOtro = new Episodio();
        epOtro.setNumero(5);
        epOtro.setNombre("Ozymandias");
        epOtro.setDuracion(41);
        t5.episodios.add(epOtro);
        breakingB.temporadas.add(t5);
        this.serie.add(breakingB);
    }
    public void agregarWalkingDead() {
    
        Serie theWalkingDead = new Serie();
        theWalkingDead.titulo = "The Walking Dead";
    

        //theWD2.titulo = "hola manotas";

         Genero genero = new Genero();
        genero.nombre = "Ficcion, Drama, Apocaliptico";

        theWalkingDead.generos.add(genero);

        Temporada t2 = new Temporada();
        t2.numero = 2;
        Episodio epi = new Episodio();
        epi.setNumero (1);
        epi.setNombre("What lies ahead");
        epi.setDuracion(45);
        t2.episodios.add(epi);

        Episodio epiOtro = new Episodio();

        epiOtro.setNumero(2);
        epiOtro.setNombre("Bloodletting");
        epiOtro.setDuracion(48);
        

        t2.episodios.add(epiOtro);

        theWalkingDead.temporadas.add(t2);

        this.serie.add(theWalkingDead);

        Temporada t3 = new Temporada();
        t3.numero = 3;

        Episodio epii = new Episodio(8, "Made to suffer", 40);

       
        t3.episodios.add(epii);
        theWalkingDead.temporadas.add(t3);

        Episodio epiii = new Episodio(9, "The suicide king");
        //epiii.numero = 9;
        //epiii.nombre = "The suicide king";
        epiii.setDuracion(48);
        t3.episodios.add(epiii);

        theWalkingDead.temporadas.add(t3);

        // agrego un Websodio
        Websodio websodio = new Websodio(1, "A new day");

        //websodio.numero = 1;
        //websodio.nombre = "A new day";
        websodio.setDuracion(20);
        websodio.url = "http://fdjfd.com";
        
        t3.episodios.add(websodio);

        websodio = new Websodio(2, "Alone");

        //websodio.numero = 2;
        //websodio.nombre = "Alone";
        websodio.setDuracion(20);
        websodio.url = "http://fdjfd.com";
        
        t3.episodios.add(websodio);

    }
        

        

    }

