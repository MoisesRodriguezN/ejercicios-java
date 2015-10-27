
/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej22MuestraNumerosPrimosentre2y100{
  
   public static void main(String[] args) {
         
    boolean esPrimo = true; 
    int n;
    System.out.print("Se van a comprobar numeros entre 2 y 100 ");
   
    for (n = 2; n <= 100; n++) {
    
      // comprueba si n es primo
      for (int i = 2; i < n; i++) { 
        if ((n % i)  == 0 ) {
          esPrimo = false; 
        }  
      }
        
      if (esPrimo) {
        System.out.println(n);
      }      
      
      
    }
        

  

    
  }
}
