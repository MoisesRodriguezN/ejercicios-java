/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al
 * revés.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej25VolteaNumeros{
  
    public static void main(String[] args) {

 System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int volteado = 0;
   
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } 
    
    System.out.println("El número introducido " + numeroIntroducido + " Al revés queda " + volteado);
  }
}