package capitulo08funciones;

import java.util.Scanner;
import matematicas.ArraysBi;

/**
 * Devuelve un array que contiene una de las diagonales del
 * array bidimensional que se pasa como parámetro. Se pasan como
 * parámetros fila, columna y dirección. La fila y la columna determinan
 * el número que marcará las dos posibles diagonales dentro del array. La
 * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
 * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
 * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
 * que va del noreste hacia el suroeste.
 * @author Moisés
 */
public class Ejercicio34 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   
   
   int[][] a = {
     {4, 8, 5, 2}, 
     {12, 28, 45, 21},
     {44, 82, 55, 71},
     {45, 88, 59, 16}
   };
   System.out.println();
   
   ArraysBi.muestraArrayBiInt(a);
   
   int[] res = ArraysBi.diagonal(a, 1,2, "neso");
   
   for(int i = 0; i < res.length; i++){
      System.out.println(res[i]);
   }
  }
  
}
