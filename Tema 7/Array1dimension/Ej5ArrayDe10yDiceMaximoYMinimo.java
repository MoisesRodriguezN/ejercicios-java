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
      //guarda 10 númerosen el array
      if (numero[i] > maximo){
          maximo = numero[i]; //guarda el número mayor introducido
      }
      if (numero[i] < minimo){
        minimo = numero[i]; //guarda el número menor introducido
      }
    }
    
    System.out.println();
      
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]); //muestra todos los números del array
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      } //Si elnúmero mostrado es el máximo, se muestra  a la derecha "maximo"
      
      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      } //Si elnúmero mostrado es el mínimo, se muestra  a la derecha "mínimo"
      System.out.println();
    }
	}
}
