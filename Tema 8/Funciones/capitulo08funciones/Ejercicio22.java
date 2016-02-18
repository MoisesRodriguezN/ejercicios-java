package capitulo08funciones;

//import java.util.Scanner;

import java.util.Scanner;
import matematicas.Arrays;
import static matematicas.Arrays.maximoArrayInt;


/**
 * Muestra el máximo de un array
 * @author Moises
 */
public class Ejercicio22 {

 
  public static void main(String[] args) {
    int [] b = new int [6];
   
   System.out.print("Introduce números para el array: " );
   for(int i = 0; i < 6; i++){
    Scanner s = new Scanner(System.in);
    b[i] = Integer.parseInt(s.nextLine()); 
   }
   
    Arrays.muestraArrayInt(b);
   
  // int[] a = {68, 33, 200, 150, 11};
   maximoArrayInt(b);
   System.out.print("Máximo: " + maximoArrayInt(b) + " ");
   
   
  }
  
}
