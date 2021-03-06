/*
 *Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 *aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador
 *se queda “pensando” antes de mostrar los números.
 */


/**
 *
 * @author Moises Rodriguez
 */
public class Ej4Array4F5CaleatorioYSumaConRetardo {

  /**
   * @param args the command line arguments
   * 
   */
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
    
  int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
  int[] sumatotalfila = new int[4]; 
  int[] sumatotalcolumna = new int[5]; 
  
  
    int fila;
    int columna;
    int suma = 0;
    int sumatotalcolumnas = 0;
    int contador = 0;
    int sumatotal = 0;
    
    //lectura datos array
    for (fila = 0; fila <= 3; fila++) { //filas
   
      for (columna = 0; columna <= 4; columna++) { //clumnas
        num[fila][columna] = (int)(Math.random()*100 + 900 );
        suma += num[fila][columna]; //suma total de la fila
      }
      sumatotalfila[fila] = suma; //se guarda en array cada total de cada columna
      suma = 0; //se vuelve a poner a 0 la variable suma
      sumatotalcolumnas += sumatotalfila[fila]; //suma los totales de las filas
    }
    //muestra el array
        //Muestra la fila con los títulos
      System.out.print("           ");
    for (columna = 0; columna <= 4; columna++) {
      System.out.print("C" + columna + "    ");
    }
      System.out.print("C.Suma");
      System.out.println();
      System.out.println("-------------------------------------------------" );
    //---------------------------
    //Muestra los valores del array
    for (fila = 0; fila <= 3; fila++) {
     System.out.print ("fila nº " + fila + "|");
    for (columna = 0; columna <= 4; columna++) {
        System.out.printf("%4d |", num[fila][columna]);
    }
      //Por cada fila imprime el total
      System.out.println("  " + sumatotalfila[fila]);
      System.out.println("-------------------------------------------------" );
      sumatotal += sumatotalfila[fila]; //suma de los totales de las filas
    }
    System.out.print ("  Sumas  |");
    
  
    
   //Suma cada columna
  columna = 0;
  do {
      
    for (fila = 0; fila <= 3; fila++) {
    sumatotalcolumna[contador] += num[fila][columna];
    }
    
    columna++;
    System.out.printf("%4d |", sumatotalcolumna[contador]);
    contador++;
    
  }while(columna <5);
   
  //Imprime la suma de los totales de cada fila
  Thread.sleep(2200); //Retardo de 2 segundos
  System.out.print("  " + sumatotal);
  }
}
    
 

