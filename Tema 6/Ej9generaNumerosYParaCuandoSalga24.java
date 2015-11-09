/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
 * termine de generar números hasta que no saque el 24. El programa deberá decir al final
 * cuántos números se han generado.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej9generaNumerosYParaCuandoSalga24{
  public static void main(String[] args) {
    
    int numero = 0;
    int contador= 0;
   
      do { 
        numero = (int)(Math.random() * 51) * 2;  //numeros aleatorios del 0 al 100 pares
        contador ++;;
        System.out.print(" " + numero);
      } while (numero != 24);
      
       System.out.println("\nSe han contado: " + contador + " Números");
  }
}
