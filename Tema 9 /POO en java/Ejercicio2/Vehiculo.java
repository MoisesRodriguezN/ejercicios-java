package poo2;

/**
 *
 * @author Moisés
 */
public abstract class Vehiculo {
  
  // atributos de clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
  // atributos de instancia
  private int kilometrosRecorridos;
  
  //Constructor
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }
  
  //Getter
  //Devuelvo el contenido de kilometrosRecorridos
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
  //Método
  public void recorre(int k) {
    this.kilometrosRecorridos += k; //Recorrido para cada subclase de vehiculo
    Vehiculo.kilometrosTotales += k;//Recorrido total de todas las subclases
  }
}
