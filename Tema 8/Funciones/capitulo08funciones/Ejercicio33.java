package capitulo08funciones;

import java.util.Scanner;
import matematicas.ArraysBi;

/**
 * Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * @author Moisés
 */
public class Ejercicio33 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   
   
   int[][] a = {
     {4, 8, 5, 2}, 
     {4, 8, 5, 1}
   };
   System.out.println();
   
   ArraysBi.muestraArrayBiInt(a);
   
   if(ArraysBi.esPuntoDeSilla(a, 0, 3)){
      System.out.println("Es punto de silla: " + a[0][3]);
    }else{
       System.out.println("No es punto de silla: " + a[0][3]);
     }
  }
  
}
