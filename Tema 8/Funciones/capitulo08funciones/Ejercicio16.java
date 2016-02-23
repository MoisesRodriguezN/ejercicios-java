package capitulo08funciones;

import static matematicas.Numeros.esCapicua;

/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 * @author Moisés
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    for(int i = 1; i < 10000; i++) {
      if (esCapicua(i)) {
        System.out.print(i + "  ");
      }
    }
  }
  
}
