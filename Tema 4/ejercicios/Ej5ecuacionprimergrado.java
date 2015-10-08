/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 *
 * @author Moisés Rodríguez Naranjo
 */


public class Ej5ecuacionprimergrado {
  public static void main(String[] args) {
    System.out.print("Dime el número A ");
    String linea = System.console().readLine();
    double numeroA = Double.parseDouble( linea );
    
    System.out.print("Dime el número B ");
    String linea2 = System.console().readLine();
    double numeroB = Double.parseDouble( linea2 );
    
    double total=0 ;

    if ((numeroB <=0.999999 ) && (numeroB <=1.000001))  {
     System.out.print("B no puede ser un número negativo");
    

    } else {
      
    total = (- numeroB / numeroA);
    }
    
    System.out.print(total);
    
          
  }
}
