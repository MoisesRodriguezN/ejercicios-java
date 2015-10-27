/**
 * Escribe un programa que diga si un número introducido por teclado es o no primo. Un
 * número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej16DiceSiEsONoNumeroPrimo{
  
   public static void main(String[] args) {
           
    System.out.print("Introduce un número para comprobar si es primo ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    boolean esPrimo = true; 
    
    for (int i = 2; i < numeroIntroducido; i++) { //se declara i con valor 2
      // si número i es menor que numeroIntroducido, se incrementa en 1 i
      if ((numeroIntroducido % i)  == 0 ) { // El resto de dividir numeroIntroducido entre i
        //Si el resto es 0, no es primo
        esPrimo = false; 
      }
    }
        
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

    
  }
}
