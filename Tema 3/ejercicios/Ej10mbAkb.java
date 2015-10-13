/**
* Escribe un programa que calcule el área de un rectángulo.
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej10mbAkb {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el número de Mb: ");
    linea = System.console().readLine(); //Introducir caracteres con el teclado
    int primerNumero;
    primerNumero = Integer.parseInt( linea ); //convierte en número entero
    
    long total;
    total = primerNumero * 1000;
    
    System.out.print("En Kb es ");
    System.out.println(total + " Kb");

    

    
   
  } 
}
