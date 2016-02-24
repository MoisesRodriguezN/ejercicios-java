package capitulo08funciones;


import java.util.Scanner;
import static matematicas.Arrays.mediaArrayInt;
import static matematicas.Arrays.muestraArrayInt;


/**
 * Muestra la media de un array
 * @author Moises
 */
public class Ejercicio23 {

 
  public static void main(String[] args) {
    int [] b = new int [6];
   
  System.out.print("Introduce números para el array: " );
    for(int i = 0; i < 6; i++){
      Scanner s = new Scanner(System.in);
      b[i] = Integer.parseInt(s.nextLine()); 
    }
   
  muestraArrayInt(b);
   
  // int[] a = {68, 33, 200, 150, 11};
  mediaArrayInt(b);
  System.out.print("Media: " + mediaArrayInt(b) + " ");
     
  }
  
}
