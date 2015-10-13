/**
 * Sentencia Condicional
 *
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej13ordena3numeros {

  public static void main(String[] args) {
    
    int aux;
        
    System.out.println("Este programa ordena tres números introducidos por teclado.");
    System.out.println("Serán ordenados de menor a mayor");
    System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());

    // ordenación de los dos primeros números
    if (a > b) {
      aux = a; // guarda en la variable aux el valor de a
      a = b;   // almacena en a el valor de b
      b = aux; // en b almacena el valor de aux, hace un intercambio
    }
    
    // ordenación de los dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    // se vuelven a ordenar los dos primeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}
