/*
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 */
package ColeccionesYDiccionarios;

import java.util.ArrayList;

/**
 *
 * @author Moisés
 */
public class Ejercicio1 {
  
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    
    a.add("Nombre1");
    a.add("Nombre2");
    a.add("Nombre3");
    a.add("Nombre4");
    a.add("Nombre5");
    a.add("Nombre6");
      
    for(String nombre : a){
      System.out.println(nombre);
    } 
  }
  
}
