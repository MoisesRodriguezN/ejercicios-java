/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej5Numerodedigitos {
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
      num = num /10; // va quitando cifras. Cada vez que quita una, suma +1 a cifra hasta que no queden cifras. 
                     // 134 /10 = 13 --> 1 cifra 13/10 = 1 --> 2 cifras 1 /10 = 0 --> 3 cifras.
                     // Como num no es mayor a 0, se sale del bucle y muestra el número de cifras.
      cifra ++;
      
    }
  
     System.out.println("El número de cifras es " + cifra);
     
    }
  }
}
