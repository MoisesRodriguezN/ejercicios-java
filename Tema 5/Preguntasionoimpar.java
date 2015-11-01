/**
 * Bucle do-while que termina cuando se introduce por teclado un
 * número impar.
 *
 * @author Luis José Sánchez
 */

public class Preguntasionoimpar {
    
  public static void main(String[] args) {
        
    int numero;
    String respuesta ="";  
    do {
      
     
      
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {// comprueba si el número introducido es par
        System.out.println(numero + "Es par");
      } else {
        System.out.println("Es impar");
      }
      
      System.out.print("¿Quieres continuar? S , N ");
      respuesta = (System.console().readLine()).toLowerCase();
      
    } while (respuesta.equals ("s"));
  }
}
