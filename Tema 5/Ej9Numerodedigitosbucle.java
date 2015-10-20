/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej9Numerodedigitosbucle {
  public static void main(String[] args) {
   
   
  int num = 0; 
  int cifra = 0; 

    System.out.print("Introduce un numero");
    System.out.print(": ");
    num = Integer.parseInt(System.console().readLine());
    
    if (num < 0) {
      num = -1 * num;
    
    } else {
    
    while (num > 0) {
      num = num /10;
      cifra ++;
      
    }
  
     System.out.println("El número de cifras es " + cifra);
     
    }
  }
}
