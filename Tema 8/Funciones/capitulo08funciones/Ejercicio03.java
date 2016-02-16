/*
 * Da un número primo siguiente al introducido
 */
package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.siguientePrimo;

/**
 *
 * @author moises
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    System.out.print("Introduce un número para comprobar cual es el siguiente primo: ");
    Scanner s = new Scanner(System.in);
    int n = Integer.parseInt(s.nextLine());
    siguientePrimo(n);
    System.out.print(siguientePrimo(n));
  }
}
