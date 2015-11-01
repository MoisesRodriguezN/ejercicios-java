/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números
 * mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
 * total acumulado, el contador de los números introducidos y la media.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej23SumaNumerosMientrasNoSeaMayorA1000MediaYContador{
  
   public static void main(String[] args) {
    int contador = 0;
    int numeroIntroducido = 0;
    int suma = 0;
    
    System.out.println("Introduce números");
    System.out.println("Cuando se supere el valor 10000 en la suma, de mostrará");
    System.out.println("El total acmulado, la cuenta de numeros y la media");
    do {  
     
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      contador++;  //Se cuenta la cantidad de números introducidos 
      suma += numeroIntroducido; //total acumulado
       
  
    } while (suma <=10000);
    
    System.out.println("EL total acumulado es " + suma);
    System.out.println("Se han introducido " + contador + " números");
    System.out.println("La media de los números  es: " + (suma/contador));
  
  }
}
