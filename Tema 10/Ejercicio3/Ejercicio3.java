/*
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 */
package ColeccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Ejercicio3 {

  public static void main(String[] args) {
     ArrayList<Integer> a = new ArrayList<>();
     
     Scanner s = new Scanner(System.in);
     
     System.out.println("Introduce 10 números enteros: ");
     for(int i = 0; i < 10; i++){
       a.add(Integer.parseInt(s.nextLine()));
     }
     
     Collections.sort(a);
     System.out.println("Numeros ordenados: ");
     System.out.println(a);
     
  }
  
}
