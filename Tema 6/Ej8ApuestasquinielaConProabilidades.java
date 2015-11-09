/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
 * probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
 * = 3/6 y 1/3 = 2/6.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej8ApuestasquinielaConProabilidades {
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
        apuesta = (int)(Math.random()*6 +1);  
      
       
        switch (apuesta){
          case 1: 
          case 2:
          case 3: System.out.print(" | 1 |   |   |   ");
          break;
          case 4:
          case 5: System.out.print(" |   | x |   |   ");
          break; 
          case 6: System.out.print(" |   |   | 2 |   ");
          break;
          default:
         
        }
       if (fila == 15){
       i = 3;
       }
      }
    System.out.println();
    } while(fila <15);
 
  }
}
