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
    int mayorPar = 0;
    
    do {  
     
      System.out.println("Introduce un número positivo");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido >= 0) {
        contador++;  //Se cuenta la cantidad de números introducidos 
        if (numeroIntroducido %2!=0){
          sumaImpar += numeroIntroducido;
          contadorImpar++;
      //Se suman en "sumaImpar" los numeros introducidos impares
      //Se cuentan los números impares para desues hacer la media
       
      } else {
        if (numeroIntroducido > mayorPar)
        mayorPar = numeroIntroducido;
        }
      }
      
      // si no es impar, es par, 
    } while (numeroIntroducido >=0);
    
    System.out.println("El mayor de los pares es" + mayorPar);
    System.out.println("Se han introducido " + contador + " números");
    System.out.println("La media de los números impares es: " + (sumaImpar/contadorImpar));
  
  }
}
