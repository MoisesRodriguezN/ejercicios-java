/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
 * y cuántos son negativos.
 */
public class Ej13LeeNumerosYDiceNegativoOPositivo{
  
  public static void main(String[] args) {
    int positivo = 0;
    int negativo = 0;
    
     System.out.println("Introduce 10 números");
  
    for (int i =0; i < 10; i++){
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativo ++;
      } else {
        positivo++;
      }
     
    }
    System.out.println("Has introducido " + positivo + " números positivos " + " y " + negativo + " números negativos");
  }
}
