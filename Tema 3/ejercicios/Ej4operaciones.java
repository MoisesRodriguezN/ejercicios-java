/**
* Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
teclado.
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej4operaciones {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine(); //Introducir caracteres con el teclado
    int primerNumero;
    primerNumero = Integer.parseInt( linea ); //convierte en número entero

    System.out.print("Introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int total1;
    total1 = primerNumero + segundoNumero;
    
    int total2;
    total2 = primerNumero - segundoNumero;
    
    int total3;
    total3 = primerNumero * segundoNumero;
    
    double total4;
    total4 = (double)primerNumero / (double)segundoNumero;

    System.out.print("El primer número mas el segundo número es ");
    System.out.println(total1);   
    
    System.out.print("El primer número menos el segundo número es ");
    System.out.println(total2);
    
    System.out.print("El primer número por el segundo número es ");
    System.out.println(total3);
    
    System.out.print("El primer número dividido entre el segundo número es ");
    System.out.println(total4);
  } 
}
