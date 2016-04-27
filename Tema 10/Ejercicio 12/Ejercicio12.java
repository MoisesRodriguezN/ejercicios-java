/**
 *   @author Moisés
 */
package Ejercicio12;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio12 {
  public static void main(String[] args) {
    
    ArrayList<Carta> cartas = new ArrayList();
    HashMap<String, Integer> valorCarta = new HashMap();
    
    valorCarta.put("as", 11);
    valorCarta.put("tres", 10);
    valorCarta.put("sota", 2);
    valorCarta.put("caballo", 3);
    valorCarta.put("rey", 4);
    
    Carta cartaAux = new Carta();
    cartas.add(cartaAux);
    
   for (int i = 0; i < 4; i++) {
      do {
        cartaAux = new Carta();      
      } while (cartas.contains(cartaAux));
      
      cartas.add(cartaAux);
    }
    
   // Calcula el valor total de las cartas
    int valorTotal = 0;
    for (Carta c: cartas) {
      int valor = 0;
      if(valorCarta.containsKey(c.getNumero())){
        valor = valorCarta.get(c.getNumero());
      }
      valorTotal += valor;
    }
    
    // Muestra las cartas
    for (Carta c: cartas) {
      System.out.println(c);
    }
    System.out.println("Tienes: " + valorTotal + " puntos");
    
  }
}
