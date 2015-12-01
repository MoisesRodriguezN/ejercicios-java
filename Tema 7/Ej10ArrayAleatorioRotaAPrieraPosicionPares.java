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
        
    int[] numero = new int[20];
    int i;
    int indicePar = 0;
    int indiceImpar = 0;
    int[] numero2 = new int[20];
    int[] arraypar = new int[20];
    int[] arrayimpar = new int[20];
   
    System.out.println("Introduce números enteros");
    
    //guarda 20 números aleatorios en el array
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101); 
    }
    
    //muestra el array original
    System.out.println("Array original");
    for (int n : numero){ //Estilo foreach
      System.out.printf("|%2d ", n);
    }
  
    for (i = 0; i < 20; i++) {
      if ((numero[i] % 2) == 0){
        arraypar[indicePar++] = numero[i];
        //Guarda en un array los pares y crea un indice de números pares
      }else{
       arrayimpar[i] = numero[i]; 
       //Guarda en un array los impares
      }
    } 
    
    for (i = 0; i < indicePar; i++) {
      numero[i] = arraypar[i] ;
    }
    //Guarda en las primeras posiciones del array original los números pares
     System.out.println("Array de pares e impares");
   
    for (i = 0; i < 20; i++) {
      if (arrayimpar[i] !=0){ //Los que estan vacio no los muestra
        numero[indicePar++] = arrayimpar[i] ;
      } //Guarda en el array original los impares, despues de las posiciones pares
    }
    
    for (i = 0; i < 20; i++) {
    System.out.printf("|%2d ", numero [i]); 
    } //Muestra el array oiriginal rotado.
  }
}
