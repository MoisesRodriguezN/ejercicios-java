/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
 * los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
 * 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 * posición 0. Finalmente, muestra el contenido del array.
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class Ej6Arrayde15ROTAR1Posicion {
  public static void main(String[] args) {
        
    int[] numero = new int[15];
    int i;
    
    System.out.println("Introduce números enteros");
    
    //Almacena en el array 15 números 
    for (i = 0; i < 15; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }//guarda 15 números en el array
    
    System.out.println("Array original");
    for (int n : numero){ //Estilo foreach
      System.out.printf("|%2d ", n);
    }//muestra el arrray original
    
    // rotación derecha
    int ultimo = numero [14];

    for (i = 14; i > 0; i--){
      numero[i] = numero [i - 1];
    }
    System.out.println();
    System.out.println("Array rotado");
    
    numero [0] = ultimo;
    for (i = 0; i < 15; i++) {
      System.out.printf("|%2d ", numero [i]); 
    } //Muestra el array rotado
  }
}
