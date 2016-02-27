package capitulo08funciones;

import java.util.Scanner;
import matematicas.ArraysBi;

/**
 * Genera un array, pide un número a buscar y te da las coordernadas de donde está
 * @author Moisés
 */
public class Ejercicio32 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   
   
   int[][] a = ArraysBi.generaArrayBiInt(4, 4, 20, 80);
   System.out.println();
   
   ArraysBi.muestraArrayBiInt(a);
   
   System.out.print("Introduce el número a buscar: ");
   int num = Integer.parseInt(s.nextLine());
   
   System.out.println();
   int [] res = ArraysBi.coordenadasEnArrayBiInt(a, num);
   System.out.println("Posición [" + res[0] + "," + res[1] + "]" );
   
  }
  
}
