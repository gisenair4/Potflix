package app;

public class App {
    public static void main(String[] args) throws Exception {

        Potflix miPotflix = new Potflix();

        System.out.println("Iniciando catalogo");

        miPotflix.inicializarCatalogo();

        Serie bb = miPotflix.buscarSerie("Breaking Bad");

        Temporada laMejorTemporada = bb.getTemporada(5);

        Episodio elTop;

        
        elTop = laMejorTemporada.getEpisodio(7);

        elTop.reproducir();
        

    }
}