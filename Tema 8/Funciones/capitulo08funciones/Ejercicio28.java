package capitulo08funciones;


import java.util.Scanner;
import static matematicas.Arrays.muestraArrayInt;
import static matematicas.Arrays.rotaIzquierdaArrayInt;

/**
 * Rota n posiciones a la izquierda los números de
 * un array
 * @author Moises
 */
public class Ejercicio28 {

 
  public static void main(String[] args) {
    int [] b = new int [6];
    int n; 
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce números para el array: " );
    for(int i = 0; i < 6; i++){
      b[i] = Integer.parseInt(s.nextLine()); 
    }
    
    System.out.print("Introduce el número de posiciones a rotar a la izquierda: " );
    n = Integer.parseInt(s.nextLine()); 
    System.out.print("Array original: ");
    muestraArrayInt(b);
    System.out.print("Array rotado: ");
    muestraArrayInt(rotaIzquierdaArrayInt(b,n));
  }
}
