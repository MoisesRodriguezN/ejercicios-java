/**
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej7media3notas {
  public static void main(String[] args) {
    System.out.print("Introduce la nota 1: ");
    String linea = System.console().readLine();
    double nota1 = Double.parseDouble( linea );
    
    System.out.print("Introduce la nota 2: ");
    String linea2 = System.console().readLine();
    double nota2 = Double.parseDouble( linea2 );
    
    System.out.print("Introduce la nota 3: ");
    String linea3 = System.console().readLine();
    double nota3 = Double.parseDouble( linea3 );
    
    double total1;
    double total2;
    total1 = nota1 + nota2 + nota3;
    total2 = total1 / 3;
    
    
    System.out.printf("%.2f", total2);
    
          
  }
}
