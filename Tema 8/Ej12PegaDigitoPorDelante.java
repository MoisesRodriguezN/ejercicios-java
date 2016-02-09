/**
 * Añade un dígito a un número por detrás.
 * @author Moisés Rodríguez 
 */
public class Ej12PegaDigitoPorDelante{
  
    public static void main(String[] args) {

    System.out.print("Introduce un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce el dígito a añadir: ");
    int digitoañadir = Integer.parseInt(System.console().readLine());
    int digitofinal = 0;
    
    numeroIntroducido *=10;
    
    numeroIntroducido += digitoañadir;
    
    System.out.println("El resultado es: " + numeroIntroducido);
    
  }
}
