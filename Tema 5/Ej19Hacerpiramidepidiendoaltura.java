/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
 * teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej19Hacerpiramidepidiendoaltura{
  
   public static void main(String[] args) {
     
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1; //-1 Para que la ultima fila se pegue a la izquierda
    //El número de espacios es el mismo que la altura introducida para darle X número de
    //espacios al primer caracter dibujado. Se irá restando 1 en cada línea.
    
    while (altura <= alturaIntroducida) {
      
      // inserta los espacios introducido
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // Dibuja los caracteres
      for (i = 1; i < altura / 2; i++) {
        System.out.print(relleno);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    }
    
  }
}
