/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
 * otencia.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej14CalcularUnaPotencia{
  
  public static void main(String[] args) {
    int base;
    int exponente;
    int potencia = 1;
    System.out.println("Introduce una base");
    base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce un exponente");
    exponente = Integer.parseInt(System.console().readLine());
    
    
    for (int i = 0; i < exponente; i++) {   //se declara i como 0, i debe ser menor que el exponente.
      // mientras i sea menor al exponente, se sumará 1 a i hasta que sea igual o mayor al exponente.
        potencia *= base;
      }
    System.out.println("El resultado de la potencia es " + potencia);
  }
}
