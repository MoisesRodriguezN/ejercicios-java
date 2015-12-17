/**
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class ExamenEj2 {
  public static void main(String[] args) {
        
    int[] numero = { 20, 5 , 7, 4, 37, 9 , 2, 17, 11, 6}; //new int[10];
    int i = 0;
    int j = 0;
    int temp = 0;
  
    
     // Muestra el array.  
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", numero[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

     System.out.println();
     int posMin = 0;
     
    for(i = 0; i < 10; i++){
      if (numero[i] < numero [posMin]){
        posMin = i;
      } //Comprueba cual es el mínimo
    }
    
    System.out.println("EL mínimo del array es el número " +numero[posMin] + " y está en la posición " + posMin); 
    //Numero de valores del array menos (-) la posición mínima
    int rotaciones = 10 - posMin;
    System.out.println("Tenemos que rotar a la derecha " + rotaciones + " veces"); 
    
    
    for (i = 0; i < rotaciones; i++){
      //rotamos una vez a la derecha
      int ultimo = numero[9]; 
      for (j = 9; j>0; j--){
        numero[j] = numero[j-1];
      }
      numero[0] = ultimo; //Primera rotación, ultimo número del array al primero
    } 
    
    for(i = 0; i < 10; i++){
      System.out.print(numero[i]); //Imprime el array rotado
      if (i != 9){
        System.out.print(", "); //Sepera por coma los números ecepto el último
      }
    }
  }
}
