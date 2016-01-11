/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 * No se puede repetir ningún número en el array
 */


/**
 *
 * @author Moises Rodriguez
 */
public class Ej6Array4F5CaleatorioYPosicionMaximoMinimoNúmerosSinRepetir {

  /**
   * @param args the command line arguments
   * 
   */
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
    
  int[][] num = new int[6][10]; // array de 6 filas por 10 columnas

    int fila;
    int columna;
  
    boolean existeNumero;
    int contador = 60;
    int[] lineal = new int [60]; 
    int numero = 0;
    int numcomprobar = 0;


    int contador2 = 0;
    boolean verdad;
    for (int x = 0; x < 60; x++) { 
      lineal[x] = (int)(Math.random()* + 10 );
    }
   
   do{
    verdad = false;
    numero = (int)(Math.random()* + 10); 
    for( int i = 0 ; i < contador ; i++){
      contador--;
      if (numero == lineal[i]){
        verdad = true;
        System.out.println(numero);
      }else{
        lineal[i] = numero;
      }
    }
     }while(verdad);
     
   

  

  
  
    for (int x = 0; x < 60; x++) { 
      System.out.print(" " +lineal[x]); 
    } 
 }
}
   
      
    
        
      
    
     // }
    //  if(lineal[contador1] == ){
     // }
    
    
       /* do {
          existeNumero = false;
          numero = (int)(Math.random()* + 1001 );
          for( int i = 0 ; i < contador ; i++){
            contador--;
            System.out.println(numero);
            if (numero == lineal[i]){
              existeNumero = true;
              System.out.println(numero);
            }
          }
        }while(existeNumero);
        
        contador = 0;
        if (existeNumero){
          contador++;
          lineal[contador]=numero;
        }
    */
   
  

    
 

