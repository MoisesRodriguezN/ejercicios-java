/**
 *   @author Moisés
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 */
package Ejercicio9;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio09 {
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
   
    System.out.println("Cartas sin ordenar"); 
    System.out.println("-----------------");
    for (Carta ca: c) {
      System.out.println(ca);
    }
    
    // Ordenar
    System.out.println("-----------------");
    System.out.println("Cartas ordenadas");
    System.out.println("-----------------");
    Collections.sort(c);
    
    for (Carta ca: c) {
      System.out.println(ca);
    }
    
    
    /*Comprobaciones
    Carta c1 = new Carta();
    Carta c2 = new Carta();
    
    System.out.println("-----------------");
    System.out.println(c1);
    System.out.println(c2);
    
    if (c1.compareTo(c2) == 0) {
      System.out.println(c1 + " es igual que " + c2);
    } else if (c1.compareTo(c2) < 0) {
      System.out.println(c1 + " es menor que " + c2);
    } else {
      System.out.println(c1 + " es mayor que " + c2);
      
    }*/
  }
}
