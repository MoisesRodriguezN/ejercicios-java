/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra “par” o “impar” según proceda.
 * @author Moisés Rodríguez Naranjo
 */

public class Ej9Pide8NumerosYDiceImparPar {
  public static void main(String[] args) {
    
   
        
    int[] numero = new int[8];
    int i;
    int t;
    
    System.out.println("Introduce 8 números enteros");
    
    for (i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.print("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"); 
    
    for (i = 0; i < 8; i++) {
      if ((numero[i] % 2) == 0){
        System.out.print(numero[i]);
        System.out.println(" Par");
      }else{
        System.out.print(numero[i]);
        System.out.println(" Impar");
      }
    }
  }
}
