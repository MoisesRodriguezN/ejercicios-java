

import java.util.Scanner;

/**
 *
 * @author Moises Rodriguez
 */
public class Ejercicio3T8 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.print("Introduce un número para comprobar si es primo: ");
    Scanner s = new Scanner(System.in);
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    boolean esPrimo = true; 
    
    do{
      esPrimo = true;
      for (int i = 2; i < numeroIntroducido; i++) { 
        if ((numeroIntroducido % i)  == 0 ) { 
          esPrimo = false;
        }
      }
      numeroIntroducido++;
    }while(!esPrimo);
     numeroIntroducido--;
    System.out.println("El siguiente número primo es: " + numeroIntroducido);    
  }
  
}
