/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
 * potencia.
 * @author Moisés Rodríguez 
 */
public class Ej4CalculaPotencias{
  
  public static void main(String[] args) {
    int base;
    int exponente;
    int potencia = 1;
    do {  //El bucle re repite mientras la base sea menor que 0
      System.out.println("Introduce una base");
      base = Integer.parseInt(System.console().readLine());
      if (base <= 0) {  //comprueba que sea menor que 0 para mostrar el mensaje
        System.out.println("No se admiten números negativos o base 0");
      }
    } while (base <=0);
    
    do {
      System.out.println("Introduce un exponente");
      exponente = Integer.parseInt(System.console().readLine());
    
      if ((base < 0) || (exponente <= 0)) {
        System.out.println("No se admiten números negativos o exponente 0");
      }
    } while (exponente <=0);
        
    
      for (int i = 0; i < exponente; i++) {   //se declara i como 0, i debe ser menor que el exponente.
        // mientras i sea menor al exponente, se sumará 1 a i hasta que sea igual o mayor al exponente.
        potencia = potencia * base;
        //potencia *= base;
      }
    System.out.println("El resultado de la potencia es " + potencia);
      
  }
}
