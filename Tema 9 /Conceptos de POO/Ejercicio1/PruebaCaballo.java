
package poo;

public class PruebaCaballo {

  public static void main(String[] args) {
   Caballo a = new Caballo("Rocinante", "Milla", "Marrón", 10, 200);
   
    System.out.println("Hola, me llamo " + a.getNombre() + " Soy un caballo de raza " +
                        a.getRaza());
    
    a.relincha();
    
    System.out.println("Mi peso eso " + a.getPeso()+ " kilos");
    
    a.trota();
  }
  
}
