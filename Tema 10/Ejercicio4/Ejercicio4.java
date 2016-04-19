/*
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 */
package ColeccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Ejercicio4 {

  public static void main(String[] args) {
     ArrayList<String> a = new ArrayList<>();
     
     Scanner s = new Scanner(System.in);
     
     System.out.println("Introduce 10 palabras: ");
     for(int i = 0; i < 10; i++){
       a.add(s.nextLine());
     }
     
     Collections.sort(a);
     System.out.println("Palabras ordenadas: ");
     System.out.println(a);
     
  }
  
}
