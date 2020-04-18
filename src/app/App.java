package app;

public class App {
    public static void main(String[] args) throws Exception {

        Potflix miPotflix = new Potflix();

        System.out.println("Iniciando catalogo");

        miPotflix.inicializarCatalogo();

        Serie bb = miPotflix.buscarSerie("The Walking Dead");

        Temporada laMejorTemporada = bb.getTemporada(5);

        Episodio elTop;
 
        elTop = laMejorTemporada.getEpisodio(2);

        elTop.reproducir();

        Episodio otroEpi;

        otroEpi = laMejorTemporada.getEpisodio(9);

        otroEpi.reproducir();
        
        

    }
}