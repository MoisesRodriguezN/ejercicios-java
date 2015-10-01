/**
* Lectura de datos desde teclado
*
* @author Luis J. Sánchez
*/

public class LeeNumerosdecimales {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine(); //Introducir caracteres con el teclado
    double primerNumero;
    primerNumero = Double.parseDouble( linea ); //convierte en número entero

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );

    double total;
    total = (2 * primerNumero) + segundoNumero;

    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El doble del primer número más el segundo es ");
    System.out.print(total);   
  } 
}
