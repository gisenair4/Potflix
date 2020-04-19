package app;

public class Websodio extends Episodio {
    public String url;

    public Websodio(int numero, String nombre){
        super(numero,nombre);
        this.url = "http://movies.com";
    }
    /**
     * hace un override del metodo re´producir que estaba en episodio
     */
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo websodio" + this.getNombre() + "de la url " + this.url);
        
    }



}