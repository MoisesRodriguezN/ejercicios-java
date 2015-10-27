/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por el
 * menor de los enteros introducidos e ir incrementando de 7 en 7.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej18ObtenerNumerosDeDosIntroducidos{
  
   public static void main(String[] args) {
     
    int numeroIntroducido1 = 0;
    int numeroIntroducido2 = 0;
    
    System.out.println("Introduce el primer número");
    numeroIntroducido1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo número");
    numeroIntroducido2 = Integer.parseInt(System.console().readLine());


   
    do {
      if (numeroIntroducido1 == numeroIntroducido2){
        System.out.println("No pueden ser números iguales");
        System.out.println("Introduce el primer número");
        numeroIntroducido1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el segundo número");
        numeroIntroducido2 = Integer.parseInt(System.console().readLine());
      }

    }while (numeroIntroducido1 == numeroIntroducido2);
      // Se comprueba que no sean números iguales, si son iguales,
      // se vuelve a pedir
  
    if (numeroIntroducido1<numeroIntroducido2){   
      System.out.println(numeroIntroducido1);
      do{
        numeroIntroducido1 += 7;
        System.out.print(numeroIntroducido1 + ",");
      } while (numeroIntroducido1<numeroIntroducido2);
      
     //si el número introducido 1 es menor al introducido 2, se empieza
     // a contar de 7 en 7 sobre el número introducido 1. 
     //Si no, contará de 7 en 7 sobre el numero introducido 2.
    
    } else {
    }

    do{
      numeroIntroducido2 += 7;
      System.out.print(numeroIntroducido2 + ",");
    } while (numeroIntroducido1>numeroIntroducido2);
    
  }
}
