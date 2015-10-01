/**
* Escribe un programa que calcule el área de un triángulo.
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej6areatriangulo {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la base del triangulo: ");
    linea = System.console().readLine(); //Introducir caracteres con el teclado
    int primerNumero;
    primerNumero = Integer.parseInt( linea ); //convierte en número entero

    System.out.print("Introduce la altura, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int total1;
    total1 = primerNumero * segundoNumero;
    
    System.out.print("El area del triangulo  es ");
    System.out.println(total1 / 2);   
    
   
  } 
}
