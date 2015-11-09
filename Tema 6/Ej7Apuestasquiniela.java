/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
 * partidos y el pleno al quince (15 filas).
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej7Apuestasquiniela {
  public static void main(String[] args) {
    
    int columnas = 0;
    int apuesta = 0;
    int fila = 0;
    int i = 1;
    String pleno = "";
    do {
      fila ++;
      if (fila == 15){
       pleno = "\nPleno al";
       }
      System.out.print(pleno);
      for (i = 1; i <= 3; i++) {
        System.out.print( "  " + fila );
        apuesta = (int)(Math.random()*3 +1);  
      
       
        switch (apuesta){
          case 1: System.out.print(" | 1 |   |   |   ");
          break;
          case 2: System.out.print(" |   | x |   |   ");
          break; 
          case 3: System.out.print(" |   |   | 2 |   ");
          break;
          default:
          break;
        }
       if (fila == 15){
       i = 3;
       }
      }
    System.out.println();
    } while(fila <15);
 
  }
}
