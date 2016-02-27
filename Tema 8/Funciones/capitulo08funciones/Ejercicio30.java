package capitulo08funciones;

import java.util.Scanner;
import matematicas.ArraysBi;

/**
 * Devuelve la fila i-ésima del array que se pasa como
 * parámetro.
 * @author Moisés
 */
public class Ejercicio30 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduce la fila a mostrar ");
   int i = Integer.parseInt(s.nextLine());
   
   int[][] a = ArraysBi.generaArrayBiInt(4, 4, 20, 80); //n (filas), m (columnas), minimo, maximo
   System.out.println();
   
   ArraysBi.muestraArrayBiInt(a);
   System.out.println();
   ArraysBi.filaDeArrayBiInt(a, i); //a --> Array Bi, i--> Fila a mostrar
   System.out.println();
   ArraysBi.columnaDeArrayBiInt(a, 2);
   
   
  }
  
}
