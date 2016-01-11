/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 */


/**
 *
 * @author Moises Rodriguez
 */
public class Ej5Array4F5CaleatorioYPosicionMaximoMinimo {

  /**
   * @param args the command line arguments
   * 
   */
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
    
  int[][] num = new int[6][10]; // array de 6 filas por 10 columnas
  int[] sumatotalfila = new int[4]; 
  int[] sumatotalcolumna = new int[5]; 
  
  
    int fila;
    int columna;
    int maximo = 0;
    int minimo = 9999;
    int fmax = 0;
    int cmax = 0;
    int fmin = 0;
    int cmin = 0;
 
    
    //lectura datos array
    for (fila = 0; fila <= 5; fila++) { //filas
   
      for (columna = 0; columna <= 9; columna++) { //clumnas
        num[fila][columna] = (int)(Math.random()* + 1001 );
        if (num[fila][columna]> maximo){
          maximo = num[fila][columna]; //guarda el número mayor introducido
        }
        if (num[fila][columna] < minimo){
          minimo = num[fila][columna]; //guarda el número menor introducido
        }
      }
      
    } 
    //muestra el array
        //Muestra la fila con los títulos
        
      System.out.print("           ");
    for (columna = 0; columna <= 9; columna++) {
      System.out.print("C" + columna + "    ");
    }
      System.out.println();
      
    //---------------------------
    
    
    //Muestra los valores del array
    for (fila = 0; fila <= 5; fila++) {
     System.out.print ("fila nº " + fila + "|");
     
      for (columna = 0; columna <= 9; columna++) {
        System.out.printf("%4d |", num[fila][columna]);
        if (num[fila][columna] == maximo) {
       
          fmax = fila; //Posicion de la fila con el número máximo
          cmax = columna; //Posicion de la columna con el número máximo
        }
        if (num[fila][columna] == minimo ) {
        
          fmin = fila; //Posicion de la fila con el número mínimo
          cmin = columna; //Posicion de la columna con el número mínimo
        }
      } 
      System.out.println();
      
    }
 
      System.out.println("El número máximo está en la posición:  " + fmax + cmax + 
      "  Fila " + fmax + "  Columna " + cmax);
      System.out.print("El número mínimo está en la posición:  " + fmin + cmin + 
      "  Fila " + fmin + "  Columna " + cmin);
    
  }
}
    
 

