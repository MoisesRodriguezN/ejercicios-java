/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna
 * los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
 * dispuestos en forma de tabla como se muestra en la figura.
 */
package ej1array3fila6columna;

/**
 *
 * @author Moisés Rodríguez
 */
public class Ej1Array3Fila6Columna {

  public static void main(String[] args) 
    
    throws InterruptedException { // Se añade esta línea para poder usar sleep
    
  int[][] num = new int[3][6]; // array de 3 filas por 6 columnas
  num[0][0]=0;
  num[0][1]=30;
  num[0][2]=2;
  num[0][5]=5;
  num[1][0]=75;
  num[1][4]=0;
  num[2][2]=-2;
  num[2][3]=9;
  num[2][5]=11;
 
    int fila;
    int columna;
    
    for (fila = 0; fila <= 2; fila++) {
      System.out.print ("Fila: " + fila);
   
      for (columna = 0; columna <= 5; columna++) {
        System.out.printf("%10d ", num[fila][columna]);
        Thread.sleep(200); // retardo de un segundo
      }
      System.out.println("");
    }
    
    }
  
}
