package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.quitaPorDelante;

/**
 * Le quita a un número n dígitos por delante (por la
 * izquierda).
 * @author Moisés
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    Scanner s = new Scanner(System.in);
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Número de digitos que se le va a quitar: ");
    int n = Integer.parseInt(s.nextLine());
    quitaPorDelante(x, n);
    System.out.print("El número queda en: " + quitaPorDelante(x, n));
  }
  
}
