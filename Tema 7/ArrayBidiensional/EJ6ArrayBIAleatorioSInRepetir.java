/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 * No se puede repetir ningún número en el array
 */

 
  public class EJ6ArrayBIAleatorioSInRepetir {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int numero = 0;
    int [] arraynumeros = new int [60]; 
    boolean repetido = false;
    int [][] arraybidimensional = new int [6][10]; //array de 6 filas por 10 columnas
    int fila = 0;
    int columna = 0;
    int contador = 0;
    int maximo = 0;     //Integer.MAX_VALUE;
    int minimo = 9999;  //Integer.MIN_VALUE;
    int fmax = 0; //Máximo filas
    int cmax = 0; //Maximo columnas
    int fmin = 0; //Mínimo filas
    int cmin = 0; //Mínimo columnas
    
    //Genera números para array y comprueba que no se repitan
      arraynumeros[0]  = (int)(Math.random()* + 1000 ); //primer número aleatorio del array
      for(int z = 1; z < 60; z++){
        do{   
         repetido = false; 

          numero = (int)(Math.random()* + 1000 ); //genera un número aleatorio

            for (int x = 0; x < 60; x++){
              if (numero == arraynumeros[x]){ //comprueba si el número esta en
                                              //alguna posición del array
                repetido = true;   
              }
            }
           
        }while(repetido); 
        arraynumeros[z]=numero;
      }
     //Guardo los valores del array de una dimensión en uno bidimensional
      for (fila = 0; fila <= 5; fila++) {
        for (columna = 0; columna <= 9; columna++) {
          arraybidimensional[fila][columna] = arraynumeros[contador];
          contador++;
        } 
      }
      //Muestra los valores del array
      
    for (fila = 0; fila <= 5; fila++) {
      System.out.print ("fila nº " + fila + "|");
     
      for (columna = 0; columna <= 9; columna++) {
        System.out.printf("%4d |", arraybidimensional[fila][columna]);
        if (arraybidimensional[fila][columna] > maximo) {
          fmax = fila; //Posicion de la fila con el número máximo
          cmax = columna; //Posicion de la columna con el número máximo
          maximo = arraybidimensional[fila][columna];
        }
        if (arraybidimensional[fila][columna] < minimo ) {
        
          fmin = fila; //Posicion de la fila con el número mínimo
          cmin = columna; //Posicion de la columna con el número mínimo
          minimo = arraybidimensional[fila][columna];
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
  
