/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
 *extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
 *cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 *A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej4Salariotrabajador {
  public static void main(String[] args) {
    System.out.print("Dime el numero de horas trabajadas");
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );
    int x;
    x = n * 12;

    if ((n > 0) && (n <= 40)) {
    System.out.print();
      
    } 
  
    if ((n >= 13) && (n <= 20)) {
      System.out.println("Buenas tardes");
    }
    
    if ((n >= 21) && (n <=23)) {
      System.out.println("Buenas Noches");
    }
    
    if ((n >= 0) && (n <=5)) {
    System.out.println("Buenas Noches");
    
    }
          
  }
}
