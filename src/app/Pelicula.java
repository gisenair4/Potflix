package app;

public class Pelicula extends Contenido implements INominable {

    public boolean filmadaEnImax;
    
    @ Override 

    public boolean ganoPreviamente(){
        //acá va la lógica

        return true;
    }

    @ Override 
    public void  reproducirTrailerNominacion(){

        System.out.println("Aca van los avances de la pelicula");

    }

    

}