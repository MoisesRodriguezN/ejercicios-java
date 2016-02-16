/*
 * Comprueba si un número es capicua
 */
package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.esCapicua;

/**
 *
 * @author Moisés
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(num.nextLine());
    if(esCapicua(n)){
      System.out.print(n + " Es capicua");
    }else{
      System.out.print(n + " No es capicua");
    }
  }
  
}
