package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.trozoDeNumero;

/**
 * Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente
 * @author Moisés
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    Scanner s = new Scanner(System.in);
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Introduce la posición inicial: ");
    int inicio = Integer.parseInt(s.nextLine());
    System.out.print("Introduce la posición final: ");
    int fin = Integer.parseInt(s.nextLine());
    trozoDeNumero(x, inicio, fin);
    System.out.print("Trozo de número: " + trozoDeNumero(x, inicio, fin));
  }
  
}
