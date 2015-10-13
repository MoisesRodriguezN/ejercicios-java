/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido
 * por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej19numerodedigitos {

  public static void main(String[] args) {
    
 int n; 
 String digitos = "";
    
    System.out.print("Introduce un numero de máximo 5 cifras");
    System.out.print(": ");
    n = Integer.parseInt(System.console().readLine());
    
    if (n < 0) {
    } n = -1 * n;
    
    if ( n < 10 ) {
      digitos = "1 cifra" ;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = "2 cifras";
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      digitos = "3 cifras";
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = "4 cifras"; 
    }
    
    if ( n >= 10000 ) {
      digitos = "5 cifras";
    }
    
    System.out.println("El número de cifras es " + digitos);
  }
}
