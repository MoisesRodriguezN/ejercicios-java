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
    int contador = 1;
  
    do {
      fila ++;
      for (int i = 1; i <= 3; i++) {
        System.out.print( "      " + fila );
        apuesta = (int)(Math.random()*3 +1);  
        switch (apuesta){
          case 1: System.out.println("| 1 |   |   |       ");
          break;
          case 2: System.out.println("|   | x |   |       ");
          break;
          case 3: System.out.println("|   |   | 2 |       ");
          break;
          default:
          break;
        }
      }
      contador ++;
     
    } while(contador <16);
    
  }
}
