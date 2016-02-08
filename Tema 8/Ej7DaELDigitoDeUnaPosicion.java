/**
 * Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando por el 0 y de izquierda a derecha.
 * @author Moisés Rodríguez 
 */
public class Ej7DaELDigitoDeUnaPosicion{
  
    public static void main(String[] args) {

    System.out.print("Introduce un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    System.out.print("Introduce la posición: ");
    int posicionintroducida = Integer.parseInt(System.console().readLine());
    int volteado = 0;;
    int posicion = 1;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // Se voltea el número 
        
    while (volteado > 0) {
      if (posicionintroducida == posicion){
        volteado %= 10;
        System.out.print("el digito es el: " + volteado);
        
      }
      volteado /= 10;
      posicion++;
    } // Se comprueba la posición del numero.
     //El numero volteado se le hace el modulo 10, resto de dividir entre 10
     //Si el resto es igual al digito introducido, se imprime la posicion
    
  }
}
