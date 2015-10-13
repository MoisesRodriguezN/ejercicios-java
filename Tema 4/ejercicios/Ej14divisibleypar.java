/**
 * Sentencia Condicional
 *
 * Realiza un programa que diga si un número introducido por teclado
 *     es par y/o divisible entre 5.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej14divisibleypar{

  public static void main(String[] args) {
        
    System.out.print("Por favor, introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if (n == 0){
     System.out.println(" Número no válido");
     } else {
        if ((n % 2) == 0) { // %2 significa el resto de la división entera. 
      // Si el resto es igual a 0, el número es par
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
    }
   
  }
}
