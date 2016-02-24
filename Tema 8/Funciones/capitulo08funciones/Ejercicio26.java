package capitulo08funciones;


import java.util.Scanner;
import static matematicas.Arrays.muestraArrayInt;
import static matematicas.Arrays.volteaArrayInt;

/**
 * Le da la vuelta al array introducido.
 * @author Moises
 */
public class Ejercicio26 {

 
  public static void main(String[] args) {
    int [] b = new int [6];
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce números para el array: " );
    for(int i = 0; i < 6; i++){
      b[i] = Integer.parseInt(s.nextLine()); 
    }
    
    System.out.print("Array original: ");
    muestraArrayInt(b);
    System.out.print("Array volteado: ");
    muestraArrayInt(volteaArrayInt(b));
  }
}
