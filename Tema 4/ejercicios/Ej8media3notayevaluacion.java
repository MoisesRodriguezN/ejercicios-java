/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
 * notable o sobresaliente).
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej8media3notayevaluacion {
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
    double media;
    total1 = nota1 + nota2 + nota3;
    media = total1 / 3;
    System.out.printf("La nota media es %.2f: " , media);
    
    if ((media >= 0.00) && (media < 5.00)) {
      System.out.println("insuficiente");
    }
    
    if ((media >= 5.00) && (media < 6.00)) {
      System.out.println("suficiente");
    }
    
    if ((media >= 6.00) && (media < 7.00)) {
      System.out.println("bien");
      
    }
    
    if ((media >= 7.00) && (media < 9.00)) {
      System.out.println("notable");
    } 
    
    if ((media >= 9.00) && (media <= 10.00)) {
      System.out.println("sobresaliente");
    }
          
  }
}
