package matematicas;

/**
 *
 * @author moises
 */
public class Arrays {
  
  
  /**
   * Muestra el mínimo de un array
   * @param x Array de una dimensión
   * @return Devuelve el mínimo
   * 
   */
  public static int maximoArrayInt(int x[]) {
      
    int maximo = Integer.MIN_VALUE;
    
    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }
  
   /**
   * Muestra el mínimo de un array
   * @param x Array de una dimensión
   * @return Devuelve el mínimo
   * 
   */
  public static int minimoArrayInt(int x[]) {
      
    int minimo = Integer.MAX_VALUE;
    
    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }
    
  
   /**
   * Imprime un array de números enteros
   * @param x Array de una dimensión
   * 
   */
  public static void muestraArrayInt(int x[]) {
    
    for(int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
  /**
   * Genera un array de números enteros
   * @param n Tamaño del array
   * @param minimo Límite inferior del intervalo
   * @param maximo Límite superior del intervalo
   * @return Array relleno de números aleatorios 
   * 
   */
  
  public static int [] generaArrayInt (int n, int minimo, int maximo) {
    int[] x = new int[n];
    
    for(int i = 0; i < n; i++){
      x[i] = (int)(Math.random()*(maximo-minimo +1) + minimo);
    }
    
    return x;
 
  }
  
}
