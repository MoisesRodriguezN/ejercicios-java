/**
* Escribe un programa que calcule el salario semanal de un empleado en base a las horas
*trabajadas, a razón de 12 euros la hora.
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej8salariotrabajadores {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce las horas trabajadas: ");
    linea = System.console().readLine(); 
    int horas;
    horas = Integer.parseInt( linea ); 

    int dias;
    dias = 7;

    int totalhoras;
    totalhoras = horas * dias;
    
    int salario;
    salario =12;
    
    System.out.print("El salario es de " + totalhoras * salario +" Euros");
    
   
  } 
}
