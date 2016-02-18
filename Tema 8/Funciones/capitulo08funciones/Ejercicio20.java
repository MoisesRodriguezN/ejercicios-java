package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Arrays.generaArrayInt;
import static matematicas.Arrays.muestraArrayInt;

/**
 * Genera un array dada la posicion, límite superior e inferior del númeo aleatorio 
 * @author Moises
 */
public class Ejercicio20 {

  public static void main(String[] args) {
   System.out.print("Introduce el tamaño del array: ");
   Scanner s = new Scanner(System.in);
   int n = Integer.parseInt(s.nextLine());
   
   System.out.print("Introduce el límite inferior: ");
   int minimo = Integer.parseInt(s.nextLine());
   
   System.out.print("Introduce el límite superior: ");
   int maximo = Integer.parseInt(s.nextLine());
   
   int[] a = generaArrayInt(n,minimo,maximo);
   System.out.print(" ");
   
   muestraArrayInt(a);
  }
  
}
