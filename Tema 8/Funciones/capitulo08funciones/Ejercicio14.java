package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.juntaNumeros;

/**
 * Pega dos números para formar uno.
 * @author Moisés
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    System.out.print("Introduce el trozo de número que se pegara por la izquierda: ");
    Scanner s = new Scanner(System.in);
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el trozo de número que se pegara por la derecha: ");
    int y = Integer.parseInt(s.nextLine());
    juntaNumeros(x,y);
    System.out.print("El número queda en: " + juntaNumeros(x, y));
  }
  
}
