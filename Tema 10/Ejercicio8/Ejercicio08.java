/**
 *   @author Moisés
 */
package Ejercicio8;
import java.util.ArrayList;

public class Ejercicio08 {
  public static void main(String[] args) {
    
    ArrayList<Carta> c = new ArrayList<>();

    Carta cartaAux = new Carta();
    c.add(cartaAux);
    
   for (int i = 0; i < 9; i++) {
      do {
        cartaAux = new Carta();      
      } while (c.contains(cartaAux));
      
      c.add(cartaAux);
    }
      
    for (Carta ca: c) {
      System.out.println(ca);
    }
  }
}
