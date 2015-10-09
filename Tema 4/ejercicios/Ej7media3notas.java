/**
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej7media3notas {
  public static void main(String[] args) {
    System.out.println("Dime las notas obtenidas en esta asignatua");
    System.out.print("Recuerda que deben ser números entre 0 y 10. ");
    System.out.println("Puede contener decimales");
    
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
    
    if ((nota1 >=0) && (nota1 <=10) &&
        (nota2 >=0) && (nota2 <=10) &&
        (nota1 >=0) && (nota1 <=10)) {
    System.out.printf("%.2f", total2);
    
    }  else {
       System.out.print("Los datos introducidos no son correctos");
    }      
  }
}
