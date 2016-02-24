package capitulo08funciones;


import java.util.Scanner;
import static matematicas.Arrays.muestraArrayInt;
import static matematicas.Arrays.posicionEnArrayInt;

/**
 * Dice si la posición del número introducido, el índice en el array
 * @author Moises
 */
public class Ejercicio25 {

 
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
    System.out.print("La posición del número " + n + " es: " + posicionEnArrayInt(b, n) );
  }
}
