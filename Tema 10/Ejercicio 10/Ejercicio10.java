
package ColeccionesYDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    HashMap<String, String> m = new HashMap<>();
    HashMap<String, String> m2 = new HashMap<>();
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
    
     
    m2.put("computer", "ordenador");
    m2.put("mouse", "ratón");      
    m2.put("white", "blanco");
    m2.put("tree", "árbol");
    m2.put("dog", "perro");
    m2.put("cat", "gato");
    m2.put("table", "mesa");
    m2.put("music", "musica");      
    m2.put("sound", "sonido");
    m2.put("door", "puerta");
    m2.put("pool", "piscina");
    m2.put("horse", "caballo");
    m2.put("noise", "ruido");
    m2.put("figure", "figura");
    m2.put("code", "codigo");
    m2.put("bed", "cama");
    m2.put("battle", "batalla");
    m2.put("sea", "mar");
    m2.put("side", "lado");
    m2.put("sun", "sol");
   
    do{
     System.out.println("Elige una opción:");
     System.out.println("-----------------------");
     System.out.println("1.   Español-Inglés");
     System.out.println("2.   Inglés-Español");
     System.out.println("3.   Salir");
     opcion= Integer.parseInt(s.nextLine());
     switch(opcion){
        case 1://Español-Inglés
          System.out.print("Introduce una palabra en español: ");
          palabra= s.nextLine();
          if (m.containsKey(palabra)) {
            System.out.println(palabra + " en inglés es " + m.get(palabra));
          } else {
            System.out.print("Palabra no conocida.");
          }
        break;
        
        case 2://Ingles-Español
          System.out.print("Introduce una palabra en Inglés: ");
          palabra= s.nextLine();

          if (m2.containsKey(palabra)) {
            System.out.println(palabra + " en español es " + m2.get(palabra));
          } else {
            System.out.print("Palabra no conocida.");
          }
       
     }
   }while((opcion < 3) && (opcion != 0));
  }
  
}
/* */