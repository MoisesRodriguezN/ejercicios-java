/*
 * Voltea un número
 */
package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.voltea;

/**
 *
 * @author moises
 */
public class Ejercicio06 {


  public static void main(String[] args) {
   System.out.print("Introduce un número para voltearlo: ");
   Scanner s = new Scanner(System.in);
   int n = Integer.parseInt(s.nextLine());
   voltea(n);
   System.out.print("Número volteado: " + voltea(n));
  }
  
}
