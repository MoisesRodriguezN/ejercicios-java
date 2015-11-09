/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
 * intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
 * ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
 * estás pensando es mayor o menor que el que te acaba de decir.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej14ElProgramaAdivinaElNumeroQuePienso{
  
 public static void main(String[] args) {

    int dado1;
    int dado2;
    
    do {
      dado1 = (int)(Math.random() * 6) + 1; //Tirada dado 1
      dado2 = (int)(Math.random() * 6) + 1; //Tirada dado 2
      System.out.println(dado1 + " " + dado2); 
    } while (dado1 != dado2); //Mientras los dos dados sean diferentes
  }
}
