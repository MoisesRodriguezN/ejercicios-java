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
    System.out.print("Dime el numero de horas trabajadas ");
    String linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt( linea );
    
    int salarioBase =0;
    
    int salarioExtra =0;
   

    if ((horasTrabajadas > 0) && (horasTrabajadas <= 40)) {
     salarioBase = horasTrabajadas * 12;
    } else {
     salarioBase = 40 * 12;
     salarioExtra = (horasTrabajadas - 40) * 16 ;
    
    }
    
        System.out.print("El salario total es: " + (salarioBase + salarioExtra) + " euros");
  }
}
