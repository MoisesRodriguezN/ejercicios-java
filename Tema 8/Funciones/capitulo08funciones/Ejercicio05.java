package capitulo08funciones;


import java.util.Scanner;
import static matematicas.Numeros.digitos;

/*
 *  Cuenta el número de digitos de un número
package capitulo08funciones;

/**
 *
 * @author moises
 */
public class Ejercicio05 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.print("Introduce un numero: ");
    Scanner s = new Scanner(System.in);
    int n = Integer.parseInt(s.nextLine());
    digitos(n);
    System.out.print("El número introducido tine : " + digitos(n) + " Dígitos");
  }
  
}
