package capitulo08funciones;

import java.util.Scanner;
import static matematicas.ArraysBi.generaArrayBiInt;
import static matematicas.ArraysBi.muestraArrayBiInt;

/**
 * Genera un array dada la posicion, límite superior e inferior del númeo aleatorio 
 * @author Moisés
 */
public class Ejercicio29 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.print("Introduce el tamaño de la fila del array: ");
   int n = Integer.parseInt(s.nextLine());
   System.out.print("Introduce el tamaño de la columna del array: ");
   int m = Integer.parseInt(s.nextLine());
   
   System.out.print("Introduce el límite inferior: ");
   int minimo = Integer.parseInt(s.nextLine());
   
   System.out.print("Introduce el límite superior: ");
   int maximo = Integer.parseInt(s.nextLine());
   
   int[][] a = generaArrayBiInt(n, m, minimo, maximo);
   System.out.print(" ");
   
   muestraArrayBiInt(a);
  }
  
}
