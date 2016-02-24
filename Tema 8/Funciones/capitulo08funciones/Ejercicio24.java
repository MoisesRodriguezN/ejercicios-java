package capitulo08funciones;


import java.util.Scanner;
import static matematicas.Arrays.estaEnArrayInt;
import static matematicas.Arrays.muestraArrayInt;

/**
 * Dice si el número introducido está en el array
 * @author Moises
 */
public class Ejercicio24 {

 
  public static void main(String[] args) {
    int [] b = new int [6];
    int n; 
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce números para el array: " );
    for(int i = 0; i < 6; i++){
      b[i] = Integer.parseInt(s.nextLine()); 
    }
    
  System.out.print("Introduce el número a buscar en el array: " );
  
  n = Integer.parseInt(s.nextLine()); 
  muestraArrayInt(b);
   
  if (estaEnArrayInt(b, n)) {
      System.out.println("El " + n  + " está en el array.");
    } else {
      System.out.println("El " + n  + " no está en el array.");
    }
     
  }
  
}
