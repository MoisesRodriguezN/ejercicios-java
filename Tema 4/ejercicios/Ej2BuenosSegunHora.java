/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
 *tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
 *a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
 *por teclado.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej2BuenosSegunHora {
  public static void main(String[] args) {
    System.out.print("Dime una hora: ");
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );

    if ((n >= 6) && (n <= 12)) {
      System.out.println("Buenos días");
      
    } 
  
    if ((n >= 13) && (n <= 20)) {
      System.out.println("Buenas tardes");
    }
    
    if ((n >= 21) && (n <=23)) {
      System.out.println("Buenas Noches");
    }
    
    if ((n >= 0) && (n <=5)) {
    System.out.println("Buenas Noches");
    
    }
          
  }
}
