/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle
 * while
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej6contar320a160dowhile {
  public static void main(String[] args) {
        
     int i = 320;   
        
     do {
      System.out.println(i);
      i -= 20;
    } while (i >159);
    
  }
}
