/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
 * espacios. Muestra también el máximo, el mínimo y la media de esos números.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej5NumerosAleatoriosMaximoMinimoYMedia {
  public static void main(String[] args) {
    
    int numero = 0;
    int maximo = 0;
    int minimo = 200;
    int suma = 0;

    for (int i = 1; i <= 50; i++) {
      numero = (int)(Math.random()*99 +100);
      System.out.print(numero + " ");
        if (numero > maximo){
          maximo = numero;
        }
        if (numero < minimo){
          minimo = numero;
        }
      suma += numero;
      
    }
   
    System.out.println("\nEl máximo es " + maximo);
    System.out.println("\nEl mínimo es " + minimo);
    System.out.println("\nLa media es " + suma/50);
  }
}
