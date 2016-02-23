package capitulo08funciones;

import static matematicas.Numeros.esPrimo;

/**
 * Muestra los números primos que hay entre 1 y 1000.
 * @author Moisés
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    for(int i = 1; i < 1001; i++) {
      if (esPrimo(i)) {
        System.out.print(i + "  ");
      }
    }
  }
  
}
