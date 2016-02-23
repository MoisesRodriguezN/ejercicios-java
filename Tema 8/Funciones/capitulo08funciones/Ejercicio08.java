package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.posicionDeDigito;

/**
 *Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero, Si no se encuentra, devuelve -1.
 * @author Moisés
 */
public class Ejercicio08 {
  
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    Scanner s = new Scanner(System.in);
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el dígito a buscar: ");
    int d = Integer.parseInt(s.nextLine());
    posicionDeDigito(x, d);
    System.out.print("El dígito es: " + posicionDeDigito(x, d));
  }
  
}
