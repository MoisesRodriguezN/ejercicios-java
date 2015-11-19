/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
 * Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
 * almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
 * deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
 * contenido de los tres arrays dispuesto en tres columnas.
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class Ej4DefinirTresArrayNumeroCuadradoYCubo {
  public static void main(String[] args) {
        
    int[] numero = new int[20]; //define numero como array de enteros
    int[] cuadrado = new int[20]; //define cuadrado como array de enteros
    int[] cubo = new int[20]; //define cubo como array de enteros
    
    
    
    for (int indice1 = 0 ; indice1 < 20; indice1 ++){ 
      numero[indice1] = (int)(Math.random()*101); 
    }//Genera número aleatorios para el array
    
    for (int indice1 = 0 ; indice1 < 20; indice1 ++){
      cuadrado[indice1] = numero[indice1] * numero[indice1];
    }//Calcula el cuadrado a cada número almacenado en el array
    
    for (int indice1 = 0 ; indice1 < 20; indice1 ++){
      cubo[indice1] = numero[indice1] * numero[indice1] * numero[indice1];
    }//Calcula el cubo de los números almacenados en el array
    
    System.out.println("  Número  " + "Cuadrado   " + "Cubo");
  
    for (int indice1 = 0 ; indice1 < 20; indice1 ++){
      System.out.printf("\n%6S %8S %10S", numero[indice1], cuadrado[indice1], cubo[indice1] );
    }
    
  }
}
