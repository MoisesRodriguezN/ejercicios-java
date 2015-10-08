/**
 * Realiza un programa que √
 *calcule el tiempo que tardará en caer un objeto desde una altura
 * h. Aplica la fórmula t =2h g siendo g = 9.81m/s 2
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej6tiempotardaencaer {
  public static void main(String[] args) {
    System.out.print("Dime la altura ");
    String linea = System.console().readLine();
    double altura = Double.parseDouble( linea );
    
    double g;
    g = 9.81;
    
    if (altura > 0) {
      double total1;
      total1 = 2 * altura / g;
    
    double total2;
      total2 = Math.sqrt(total1);
      System.out.printf("El tiempo que tarda en caer es %.2f " ,total2);
      }else{
      System.out.print("Altura no valida");
  }

    
          
  }
}
