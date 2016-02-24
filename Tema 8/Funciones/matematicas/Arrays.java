package matematicas;

/**
 *
 * @author Moisés
 */
public class Arrays {
  
  public static int mediaArrayInt(int x[]) {
    int media;
    int contador = 0;
    int suma = 0;
    
    for (int n : x) {
      contador++;
      suma += n;
    }
    
    media = suma / contador;
    return media;
  }
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
  
   /**
   * Comprueba si un número está o no dentro de un array
   * @param x Array de una dimensión
   * @param n Número a buscar en el array
   * @return Verdadero si el número está en el array. Falso si no está.
   * 
   */
  public static boolean estaEnArrayInt(int[] x, int n) {
    for (int numero : x) {
      if (numero == n) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Busca un número en un array y muestra la posición
   * @param x Array de una dimensión
   * @param n Número a buscar en el array
   * @return Devuelve la posición (Índice) en la que está el número buscado
   * 
   */
  public static int posicionEnArrayInt(int[] x, int n) {
    for(int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        return i;
      }
    }
    return -1;
  }
  
    /**
   * Le da la vuelta a un array. Los primeros números estarán al final y
   * viceversa.
   *
   * @param x array unidimiensional de números enteros
   * @return  array volteada con los primeros números al final y viceversa
   */
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];
    int indice = 0;
    for(int i = x.length-1; i >= 0 ; i--) {
      a[indice] = x[i];
      indice ++;
    }   
    return a;
  }
  
  /**
   * Devuelve un array rotada n posiciones a la derecha tomando
   * como referencia el array que se pasa como parámetro. Los números que van
   * saliendo por la derecha vuelven a entrar por la izquierda.
   *
   * @param x array unidimiensional 
   * @param n número de movimientos a realizar
   * @return  array rotado n posiciones a la derecha
   */
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); 
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
      
    return a;
  }
  
  /**
   * Devuelve un array rotada n posiciones a la izquierda tomando
   * como referencia el array que se pasa como parámetro. Los números que van
   * saliendo por la izquierda vuelven a entrar por la derecha.
   *
   * @param x array unidimiensional de números enteros
   * @param n número de movimientos a realizar
   * @return  array rotado n posiciones a la izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
    int[] a = x.clone();
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
 
}
