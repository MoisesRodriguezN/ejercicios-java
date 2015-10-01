/**
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
ser introducida por teclado.
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej2conversoreuropeseta {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el número de euros: ");
    linea = System.console().readLine(); //Introducir caracteres con el teclado
    int primerNumero;
    primerNumero = Integer.parseInt( linea ); //convierte en número entero

    double segundoNumero;
    segundoNumero = 166.386;

    double total;
    total = primerNumero * segundoNumero;
    System.out.println("El total es " + total + " pesetas");   
  } 
}
