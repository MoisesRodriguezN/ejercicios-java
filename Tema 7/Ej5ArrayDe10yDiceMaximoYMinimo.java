/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
 * introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
 * respectivamente.
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class Ej5ArrayDe10yDiceMaximoYMinimo {
  public static void main(String[] args) {
        
   int[] numero = new int[10];
    int maximo = 0;
    int minimo = 999999;
    int i;
    
    System.out.println("Introduce números enteros");
    
    
    for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());

      if (numero[i] > maximo){
          maximo = numero[i];
      }
      if (numero[i] < minimo){
        minimo = numero[i];
      }
    }
    
    System.out.println();
      
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }
      
      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
	}
}
