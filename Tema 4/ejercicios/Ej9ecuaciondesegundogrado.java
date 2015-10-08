/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax 2 + bx + c =
 * 0).
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej9ecuaciondesegundogrado {
  public static void main(String[] args) {
    System.out.print("Introduce el valor de A: ");
    String linea = System.console().readLine();
    double a = Double.parseDouble( linea );
    
    System.out.print("Introduce el valor de B: ");
    String linea2 = System.console().readLine();
    double b = Double.parseDouble( linea2 );
    
    System.out.print("Introduce el valor de C: ");
    String linea3 = System.console().readLine();
    double c = Double.parseDouble( linea3 );
    
    double x1; 
    double x2;
    double x11;
    double x12;
    x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
    x11 = (-b + ((b*b)-(4*a*c)));
    x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
    x12 = (-b - ((b*b)-(4*a*c)));
  
    if (x11 >=0) {
     System.out.println("La solución 1 es: " + x1);
     
    } else {
     System.out.println("X1 No tiene solucion");
    }
   
   if (x12 >=0) {
     System.out.println("La solución 2 es: " + x2);
     
    } else {
     System.out.println("X2 No tiene solucion");
    }
   

  
          
  }
}
