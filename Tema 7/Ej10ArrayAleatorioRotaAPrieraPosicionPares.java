/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 * almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
 * primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
 * restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class Ej10ArrayAleatorioRotaAPrieraPosicionPares {
  public static void main(String[] args) {
        
    int[] numero = new int[100];
    int i;
    int[] numero2 = new int[100];
    int[] arraypar = new int[100];
    int[] arrayimpar = new int[100];
   
    System.out.println("Introduce números enteros");
    
    //guarda 100 números aleatorios en el array
    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()*101); 
    }
    
    //muestra el array original
    System.out.println("Array original");
    for (int n : numero){ //Estilo foreach
      System.out.printf("|%2d ", n);
    }
    
    //Pasa a las primeras posiciones los números pares
    for (i = 99; i > 0; i--){
      if ((numero[i] % 2) == 0){
        numero2[i] = numero [i - 1];
      }
    }
    System.out.println();
    System.out.println("Array rotado");
    
 
    for (i = 0; i < 100; i++) {
      if ((numero[i] % 2) == 0){
        arraypar[i] = numero[i];
        System.out.printf("|%2d ", arraypar [i]); 
        //Guarda en un array los pares y los muestra
      }else{
       arrayimpar[i] = numero[i]; 
       //Guarda en un array los impares
      }
    } //Muestra el array de pares en primeras posiciones
    
    for (i = 0; i < 100; i++) { 
      if (arrayimpar [i] != 0){
        System.out.printf("|%2d ", arrayimpar [i]); 
    //Muestra array de impares en las posiciones restantes
      }
    }
  }
}
