/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej8Tablademultiplicar {
  public static void main(String[] args) {
   
  String linea;
  int numero;

  System.out.print("Introduce un número: ");
  linea = System.console().readLine();
  numero = Integer.parseInt( linea );
  
    
  for (int n = 1; n < 11; n++) {
  System.out.println( numero + " X " + n + " = " + (n * numero));
  }
  
  }
}
