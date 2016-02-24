package matematicas;

import java.util.Arrays;

/**
 *
 * @author Moisés
 */
public class ArraysBi {
  
  /**
   * Imprime un array bidimensional de números enteros
   * @param x Array de dos dimensiones
   * 
   */
  
  public static void muestraArrayBiInt(int x[][]) {

    for (int[] x1 : x) {
      for (int[] x2 : x) {
        System.out.print(x + " ");
      } 
      System.out.println();
    }
  }
  
  /**
   * Genera un array bibimensional de números enteros
   * @param n Tamaño de la fila del array
   * @param m Tamaño de la columna del array
   * @param minimo Límite inferior del intervalo
   * @param maximo Límite superior del intervalo
   * @return Array bidimensional relleno de números aleatorios 
   * 
   */
  
  public static int [][] generaArrayBiInt (int n, int m, int minimo, int maximo) {
    int[][] x = new int[n][m];
    
    for(int i = 0; i < n; i++){
     for(int z = 0; z < m; z++){
      x[i][z] = (int)(Math.random()*(maximo-minimo +1) + minimo);
     }
    }
    
    return x;
 
  }
}
