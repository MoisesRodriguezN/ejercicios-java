package capitulo08funciones;

import java.util.Scanner;
import matematicas.ArraysBi;

/**
 * Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}
 * @author Moisés
 */
public class Ejercicio31 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduce la columna a mostrar ");
   int i = Integer.parseInt(s.nextLine());
   
   int[][] a = ArraysBi.generaArrayBiInt(4, 4, 20, 80); //n (filas), m (columnas), minimo, maximo
   System.out.println();
   
   ArraysBi.muestraArrayBiInt(a);
   System.out.println();
   
   ArraysBi.columnaDeArrayBiInt(a, i); //a --> Array Bi, i--> Columna a mostrar
   
   
  }
  
}
