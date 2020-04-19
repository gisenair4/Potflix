package app;

public class Episodio{

  public Episodio(){
      this.duracion = 40;

  }

    public Episodio( int numero, String nombre, double duracion) {

        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion; 
    }
    public Episodio(int numero, String nombre) {

        this();
        this.numero = numero;
        this.nombre = nombre;
    }

    //declaro atributos de manera privada.
    private int numero;

    //getter: obtener
    public int getNumero(){
        return numero;
    }
    //setter: poner
    public void setNumero(int numero){
        if (numero > 0)
        this.numero = numero;

    }

    private String nombre;

    public String getNombre(){
        return this.nombre;


    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private double duracion;
    public double getDuracion(){
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

	public void reproducir() {
        
    System.out.println("Reproduciendo episodio" + this.numero + "" +this.nombre);

	}

}
