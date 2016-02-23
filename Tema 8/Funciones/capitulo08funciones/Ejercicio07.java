package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.digitoN;

/**
 * Devuevle el dígito que está en la posición n de un número
 * entero, Se empieza contando por el 0 y de izquierda a derecha.
 * @author Moisés
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    Scanner s = new Scanner(System.in);
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Introduce la posición del dígito: ");
    int n = Integer.parseInt(s.nextLine());
    digitoN(x, n);
    System.out.print("El dígito es: "+ digitoN(x, n));
  }
  
}
