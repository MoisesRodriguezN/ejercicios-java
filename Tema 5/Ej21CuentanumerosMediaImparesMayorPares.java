/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 * negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
 * de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
 * datos pero no se incluye en el cómputo.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej21CuentanumerosMediaImparesMayorPares{
  
   public static void main(String[] args) {
    int contador = 0;
    int contadorImpar = 0;
    int numeroIntroducido = 0;
    int sumaImpar = 0;
    
    do {  
     
      System.out.println("Introduce un número positivo");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido >= 0) {
        contador++;
        if (numeroIntroducido %2!=0){
          sumaImpar += numeroIntroducido;
          contadorImpar++;
        } 
        
      } else {
       break;
      }
    } while (numeroIntroducido >=0);
    
     System.out.println("Se han introducido " + contador + " números");
      System.out.println("La media de los números impares es: " + (sumaImpar/contadorImpar));
  
    
    
  }
}
