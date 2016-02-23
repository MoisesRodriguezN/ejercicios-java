package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.pegaPorDetras;

/**
 * Añade un dígito a un número por detrás.
 * @author Moisés
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    Scanner s = new Scanner(System.in);
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el digito a añadir por detrás: ");
    int n = Integer.parseInt(s.nextLine());
    pegaPorDetras(x, n);
    System.out.print("El número queda en: " + pegaPorDetras(x, n));
  }
  
}
