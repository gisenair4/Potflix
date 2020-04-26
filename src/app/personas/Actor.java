package app.personas;
import app.INominable;

public class Actor extends Persona implements INominable {
    public String nivel;

    @Override
    public boolean ganoPreviamente(){
        if (this.nombre. equals("Leonardo Di Caprio"))
        return true;
        return false;

    }

    @Override
    public void reproducirTrailerNominacion() {
        // Todo auto-generated method stub
        System.out.println("Aca reproducimos todas las escenas donde este es el actor");

    }
    
    

}