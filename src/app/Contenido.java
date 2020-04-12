package app;

import java.util.List;

public class Contenido {
    public String titulo;
    public List < String > premios;
    public Director director;
    public double TiempoVisto;
    public List< Genero > generos;
    public List< Actor> actores;
    public int calificacion;
    

    public boolean visto(){ 
        System.out.println("Ok, comencemos a ver esto" + this.titulo);
        return true;
    }

    public void reproducir(){
        System.out.println("Shh, que comienza la peli" + titulo);
        
    }



}