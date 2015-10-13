/**
* Realiza un programa que pida dos números y que luego muestre el resultado de su
multiplicación.
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej1multiplicanumeros {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine(); //Introducir caracteres con el teclado
    int primerNumero;
    primerNumero = Integer.parseInt( linea ); //convierte en número entero

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int total;
    total = primerNumero * segundoNumero;

    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El primer número por el segundo número es ");
    System.out.print(total);   
  } 
}
