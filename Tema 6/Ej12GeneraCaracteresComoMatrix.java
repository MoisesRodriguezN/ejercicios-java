/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
 * ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
 * carácter.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej12GeneraCaracteresComoMatrix{
  
 public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
    
    System.out.print("\033[32m"); //Pinta de verde los caracteres
    
    for(int i = 0; i < 8000; i++) { 
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      //Del 32 al 126
      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(100); //Retardo en milisegundos
        System.out.println();
      }
    }
  }
}
