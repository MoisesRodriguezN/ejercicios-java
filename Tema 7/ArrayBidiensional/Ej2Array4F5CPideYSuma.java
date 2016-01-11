/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
 * un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
 * columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
 * esquina inferior derecha.
 */


/**
 *
 * @author moises
 */
public class Ej2Array4F5CPideYSuma {

  /**
   * @param args the command line arguments
   * 
   */
  public static void main(String[] args) {
   
    
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
      System.out.print ("Introduce números para la fila: " + fila);
      System.out.println (); 
   
      for (columna = 0; columna <= 4; columna++) { //clumnas
        System.out.print ("columna nº: " + columna + "  ---> ");
        num[fila][columna] = Integer.parseInt(System.console().readLine());
        suma += num[fila][columna]; //suma total de la fila
      }
      sumatotalfila[fila] = suma; //se guarda en array cada total de cada columna
      suma = 0; //se vuelve a poner a 0 la variable suma
      sumatotalcolumnas += sumatotalfila[fila]; //suma los totales de las filas
    }
    //muestra el array
    for (fila = 0; fila <= 3; fila++) {
     System.out.print ("fila nº " + fila + "|");
    for (columna = 0; columna <= 4; columna++) {
        System.out.printf("%4d |", num[fila][columna]);
       
    }
      
      //Por cada fila imprime el total
      System.out.println("     " + sumatotalfila[fila]);
      System.out.println("-------------------------------------------------" );
      sumatotal += sumatotalfila[fila]; //imprime la suma de los totales de las filas
    }
    System.out.print("          " );
    columna = 0;
    
   //Suma cada columna
   do {
      
    for (fila = 0; fila <= 3; fila++) {
    sumatotalcolumna[contador] += num[fila][columna];
    }
    
    columna++;
    System.out.printf("%4d |", sumatotalcolumna[contador]);
    contador++;
    
   }while(columna <5);
   
  System.out.print("     " + sumatotal);
  }
}
    
 

