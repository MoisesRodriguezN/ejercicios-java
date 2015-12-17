/**
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class ExamenEj1 {
  public static void main(String[] args) {
        
    int[] numero = new int[10];  //numero = { 20, 5 , 7, 4, 37, 9 , 2, 17, 11, 6};
    int i = 0;
    int j = 0;
    int temp = 0;
    for(i = 0; i < 10; i++){ 
      System.out.print("Introduce el numero en la posicion " + i + ": ");
      numero[i] = Integer.parseInt(System.console().readLine());
    } //Recorre el array guardando números introducidos por consola
    
    for(i = 0; i < 10; i++){
      System.out.print(numero[i]);
      if (i != 9){
        System.out.print(", ");
      }//Muestra el array original separado por comas
    }
     System.out.println();
    for(i = 9; i >= 0; i--){
      if (numero[i] %10 == 7){ //Comprueba si el número acaba en 7
        //System.out.println(numero[i]);
        j = i;
        while ((j+1 < 10) && (numero[j+1] %10) !=7 ){
          temp = numero[j];
          numero[j] = numero[j+1];
          numero[j+1] = temp;
          j++;
        }//Hace un intercambio de números
      }  
    }
    for(i = 0; i < 10; i++){
      System.out.print(numero[i]);
      if (i != 9){
        System.out.print(", ");
      }
    }
  }
}
