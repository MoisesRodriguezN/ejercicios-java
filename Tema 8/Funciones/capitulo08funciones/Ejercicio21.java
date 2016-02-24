package capitulo08funciones;


import java.util.Scanner;
import static matematicas.Arrays.minimoArrayInt;
import static matematicas.Arrays.muestraArrayInt;

//import static matematicas.Arrays.generaArrayInt;
//import static matematicas.Arrays.minimoArrayInt;

/**
 * Muestra el mínimo de un array
 * @author Moises
 */
public class Ejercicio21 {

  
  public static void main(String[] args) {
   int [] b = new int [6];
   
   System.out.print("Introduce números para el array: " );
   for(int i = 0; i < 6; i++){
    Scanner s = new Scanner(System.in);
    b[i] = Integer.parseInt(s.nextLine()); 
   }
   
    muestraArrayInt(b);
   
  // int[] a = {68, 33, 200, 150, 11};
   minimoArrayInt(b);
   System.out.print("Minimo: " + minimoArrayInt(b) + " ");
   
   
  }
  
}
