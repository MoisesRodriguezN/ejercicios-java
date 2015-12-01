
/**
 * Describe un programa que lea 10 números por teclado y que luego los muestre en orden
 * inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class Ej3ArrayLee10NumerosYMuestraEnOrdenInverso {
  public static void main(String[] args) {
        
    int[] n = new int[10]; //define n como array de enteros
    //Lee 10 números y los guarda en el array
    System.out.println("Introduce 10 numeros: ");
    for (int i = 0 ; i < 10; i++){ 
      n[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.print("Numeros mostrados en orden inverso: ");
    //Muestra los números guardados en orden inverso
    for (int i = 9 ; i > -1; i--){ //contador descendente
      System.out.print(n[i] + " ");
    }
    
  }
}
