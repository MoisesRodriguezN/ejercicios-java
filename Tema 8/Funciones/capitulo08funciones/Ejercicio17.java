package capitulo08funciones;

import java.util.Scanner;
import static matematicas.Numeros.binarioADecimal;
import static matematicas.Numeros.digitoN;
import static matematicas.Numeros.digitos;
import static matematicas.Numeros.potencia;

/**
 * Escribe un programa que pase de binario a decimal.
 * @author Moisés
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    long decimal = 0;
    
    System.out.print("Introduzca un número binario: ");
    Scanner s = new Scanner(System.in);
    int binario = Integer.parseInt(s.nextLine());
    
    int bits = digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += digitoN(binario, bits - i - 1) * potencia(2, i);
    }
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
    
    //Método 2
    System.out.println();
    System.out.print("Método 2: ");
    System.out.println();
    String binario2 = s.nextLine();
    System.out.print("Introduzca un número binario: ");
    binarioADecimal(binario2);
    System.out.println(binario + " en binario es " +  binarioADecimal(binario2) + " en decimal.");
  }
  
}
