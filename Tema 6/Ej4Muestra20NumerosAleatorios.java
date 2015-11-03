/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
 * espacios.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej4Muestra20NumerosAleatorios {
  public static void main(String[] args) {
    
    int numero = 0;
  
   
 
     
    for (int i = 1; i <= 21; i++) {
      numero = (int)(Math.random()*11 );
      System.out.print(numero + " ");
    }
  
  }
}
