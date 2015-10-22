/**
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
 * término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 * 144... El número n se debe introducir por teclado.
 */
public class Ej12PrimerosTerminosFIbonacci{
  
  public static void main(String[] args) {
    
    int contador;
    System.out.println("Introduce el número de elementos");
    contador = Integer.parseInt(System.console().readLine());
    int f1;
    int f2;
    int suma;

    f1 = 0;
    f2 = 1;
    
    System.out.println("Resultado:");
    
    do {
      System.out.print(f2 + "," );
      suma = f1 + f2;
      f1 = f2;
      f2 = suma;
      contador --;
    } while (contador >1);
  }
}
