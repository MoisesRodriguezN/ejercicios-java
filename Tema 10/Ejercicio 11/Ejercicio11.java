/**
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
del ejercicio anterior. El programa irá pidiendo que el usuario
teclee la traducción al inglés de cada una de las palabras y comprobará si
son correctas. Al final, el programa deberá mostrar cuántas respuestas son
válidas y cuántas erróneas.
 */
package ColeccionesYDiccionarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Moisés
 */
public class Ejercicio11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    HashMap<String, String> m = new HashMap<>();
    ArrayList<String> claves = new ArrayList<>();
    ArrayList<String> valores = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    int indiceRandom = 0;
    int tamaño = 20;
    int cuentaValidas = 0;
    int cuentaNoValidas = 0;
    String respuesta = "";
    
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
  
    for (Map.Entry parejaValor: m.entrySet()) {
      claves.add((String)(parejaValor.getKey()));
    }
    
    for(int i = 0; i < 5; i++){
      indiceRandom = (int)(Math.random()*tamaño);
      System.out.println("Introduce la traducción de la palabra: ");
      System.out.print(claves.get(indiceRandom) + ": ");
      respuesta = s.nextLine();
      
      if(m.get(claves.get(indiceRandom)).equals(respuesta)){
        cuentaValidas++;
      }else{
        cuentaNoValidas++;
      }
 
      //Elimina palabra del diccionario para no preguntar palabras repetida
      claves.remove(claves.get(indiceRandom));
      tamaño--;
    }
    
    System.out.println("Correctas: " + cuentaValidas + "\n Erroneas: " + cuentaNoValidas);
     
  }
  
}
