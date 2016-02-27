package matematicas;


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
      for (int x2 : x1) {
        System.out.print(x2 + " ");
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
   * @return Array bidimensional relleno de números aleatorios.
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
  
   /**
   * Imprime la fila de un array. Está se pasará como parámetro.
   * 
   * @param x Array bidimensional entero.
   * @param i Número de la fila a imprimir.
   */
  
  public static void filaDeArrayBiInt(int x[][], int i) {
    for(int e : x[i]){
      System.out.print(e + " ");
    }
      System.out.println();
  }
   
   /**
   * Imprime la columna de un array. Está se pasará como parámetro.
   * 
   * @param x Array bidimensional entero.
   * @param j Número de columna a imprimir.
   */
  public static void columnaDeArrayBiInt(int x[][], int j) {
    for(int[] fila : x){
      System.out.println(fila[j]);
    }
      System.out.println();
  }
    
   /**
   * Imprime la fila de un array. Está se pasará como parámetro.
   * 
   * @param x Array bidimensional entero.
   * @param num Número que se quiere buscar en el array.
   * @return Devuelve las coordenadas donde está situdado el número introducido como
   * parametro para la búsqueda en el array.
   */
  public static int[] coordenadasEnArrayBiInt(int x[][], int num) {
    int[] res = {-1,-1};
    for(int i = 0; i < x.length;i++){
      for(int j = 0; j < x[i].length;j++){
        if(x[i][j] == num){
          res[0] = i;
          res[1] = j;
          return res;
        }
      }
    }
    return res;

  }
  
  /**
   * Dice si un número es o no punto de silla, es decir,
   * mínimo en su fila y máximo en su columna
   * 
   * @param x Array bidimensional entero.
   * @param fila Número de la fila del array 
   * @param columna Número de la columna del array
   * @return Devuelve Verdadero si el número es Punto de Silla. Si no lo es, devuelve falso.
   */  
  public static boolean esPuntoDeSilla(int x[][], int fila, int columna) {
    boolean esPuntoDeSilla = true;

    for(int j = 0; j < x[fila].length && esPuntoDeSilla; j++){
      if(x[fila][j] < x[fila][columna] && j!=columna){
        esPuntoDeSilla = false;
      }
    }

    for(int i = 0; i < x.length && esPuntoDeSilla; i++){
      if(x[i][columna] > x[fila][columna] && i!=fila){
        esPuntoDeSilla = false;
      }
    }
    return esPuntoDeSilla;
  }
  
  /**
   *
   * Devuelve un array que contiene una de las diagonales del
   * array bidimensional que se pasa como parámetro. Se pasan como
   * parámetros fila, columna y dirección. La fila y la columna determinan
   * el número que marcará las dos posibles diagonales dentro del array. La
   * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
   * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
   * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
   * que va del noreste hacia el suroeste.
  
   * @param x Array bidimensional entero.
   * @param fila Número de la fila del array 
   * @param columna Número de la columna del array 
   * @param direccion Dirección de la diagonal, nose o neso
   * @return Array unidimensional con los valores de la diagonal.
   */
  public static int[] diagonal(int x[][], int fila, int columna, String direccion) {
    int[] res = null;

    int n = x.length-1;
    int m = x[fila].length-1;
    int i = fila;
    int j = columna;


    if(direccion.equals("nose")){

      // Se posiciona en el primer elemento de la diagonal
      while(i > 0 && j> 0){
        i--;
        j--;
      }

      // Cuenta el número de elems de la diagonal
      int numElems = 0;
      int iPrimero = i;
      int jPrimero = j;
      while(i <= n && j <= m){
        //System.out.println(x[i][j]);
        i++;
        j++;
        numElems++;

      }

      // Crea el array y guarda los elems de la diagonal
      res = new int[numElems];
      int pos = 0;
      i = iPrimero;
      j = jPrimero;
      while(i <= n && j <= m){
        res[pos] = x[i][j];
        i++;
        j++;
        pos++;

      }


    } else if (direccion.equals("neso")) {

      while(i > 0 && j < m){
        i--;
        j++;
      }

      // Cuenta el número de elems de la diagonal
      int numElems = 1;
      int iPrimero = i;
      int jPrimero = j;
      while(i <= n && j > 0){
        //System.out.println(x[i][j]);
        i++;
        j--;
        numElems++;

      }

      // Crea el array y guarda los elems de la diagonal
      res = new int[numElems];
      int pos = 0;
      i = iPrimero;
      j = jPrimero;
      while(i <= n && j >= 0){
        res[pos] = x[i][j];
        i++;
        j--;
        pos++;

      }
    }

    return res;
  }
}
