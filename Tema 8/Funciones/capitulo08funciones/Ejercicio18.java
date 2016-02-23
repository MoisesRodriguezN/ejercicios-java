package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.decimalABinario;
import static matematicas.Numeros.decimalABinario2;

/**
 * Escribe un programa que pase de decimal a binario.
 * @author Moisés
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    
    //método 1
    System.out.print("Introduzca un número en base diez para pasarlo a binario: ");
    Scanner s = new Scanner(System.in);
    int decimal = Integer.parseInt(s.nextLine());
    
    System.out.println(decimal + " en decimal es " + decimalABinario(decimal) + " en binario.");
    
    //método 2
    System.out.println();
    System.out.print("Método 2: ");
    System.out.println();
    decimalABinario2(decimal);
    System.out.println(decimal + " en decimal es " + decimalABinario2(decimal) + " en binario.");
   
  }
 
}
