
//package ColeccionesYDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    HashMap<String, String> m = new HashMap<>();
    Scanner s = new Scanner(System.in); 
    int opcion = 0;
    String palabra;
    
    m.put("ordenador", "computer");
    m.put("raton", "mouse");      
    m.put("blanco", "white");
    m.put("árbol", "tree");
    m.put("perro", "dog");
    m.put("gato", "cat");
    m.put("mesa", "table");
    m.put("musica", "music");      
    m.put("sonido", "sound");
    m.put("puerta", "door");
    m.put("piscina", "pool");
    m.put("caballo", "horse");
    m.put("ruido", "noise");
    m.put("figura", "figure");
    m.put("codigo", "code");
    m.put("cama", "bed");
    m.put("batalla", "battle");
    m.put("mar", "sea");
    m.put("lado", "side");
    m.put("sol", "sun");
  
    do{
      System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
      System.out.println("┃ Diccionario Español-Inglés    ┃"); 
      System.out.println("┃    ▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧       ┃");
      System.out.println("┃1.    Introducir una palabra   ┃");
      System.out.println("┃2.    Salir                    ┃");
      System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
      opcion = Integer.parseInt(s.nextLine());
      switch(opcion){

        case 1:
          System.out.print("Introduce una palabra en español: ");
          palabra= s.nextLine();
          if (m.containsKey(palabra)) {
            System.out.println(palabra + " en inglés es " + m.get(palabra));
          } else {
            System.out.println("Palabra no conocida.");
          }   
      }
   }while((opcion < 2) && (opcion != 0));
  }
  
}
