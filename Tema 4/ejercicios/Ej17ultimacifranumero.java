/**
 * Sentencia Condicional
 *
 * Escribe un programa que diga cuál es la última cifra de un número
 *     entero introducido por teclado.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej17ultimacifranumero {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (n % 10));
  }
}
