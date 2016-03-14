

/**
 *
 * @author Moisés
 */
public class Caballo {
  //Atributos
  
  String nombre;
  String raza;
  String color;
  int edad;
  int peso;
  
  //Constructor
  public Caballo(String nombre, String raza, String color, int edad, int peso) {
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
    this.edad = edad;
    this.peso = peso;
  }
  
  //Getter
  public String getNombre() {
    return nombre;
  }
  
  public String getRaza() {
    return raza;
  }
  
   public int getPeso() {
    return peso;
  }
  
  void relincha(){
    System.out.println("Hieeeeeeee");
  }
  
  void trota(){
    System.out.println("Tocotoc Tocotoc Tocotoc");
  }
}
