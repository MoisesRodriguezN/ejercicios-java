/*
 * Calcula una potencia
 */
package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.Potencia;

/**
 *
 * @author moises
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    System.out.print("Introduce la base de la potencia: ");
    Scanner s = new Scanner(System.in);
    int base = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce el exponente de la potencia: ");
    int exponente = Integer.parseInt(s.nextLine());
    Potencia(base,exponente);
    System.out.print("EL resultado es: "+ Potencia(base, exponente));
  } 
}
