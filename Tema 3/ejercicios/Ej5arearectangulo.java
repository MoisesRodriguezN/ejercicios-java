/**
* Escribe un programa que calcule el área de un rectángulo.
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej5arearectangulo {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la base del rectangulo: ");
    linea = System.console().readLine(); //Introducir caracteres con el teclado
    double primerNumero;
    primerNumero = Double.parseDouble( linea ); //convierte en número entero

    System.out.print("Introduce la altura, por favor: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );
    
    String medida4;
    System.out.print("Por favor, introduce el la unidad de medida");
    medida4 = System.console().readLine();
   
    

    double total1;
    total1 = primerNumero * segundoNumero;
    
    System.out.print("El area del rectangulo es ");
    System.out.println(total1 + medida4);   
    
   
  } 
}
