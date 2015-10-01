/**
* Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 πr 2 h
* 
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej9volumendelcono {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el radio: ");
    linea = System.console().readLine(); 
    int radio;
    radio = Integer.parseInt( linea ); 

    System.out.print("Por favor, introduce la altura: ");
    linea = System.console().readLine(); 
    int altura;
    altura = Integer.parseInt( linea );
    
    double fraccion;
    fraccion = 1.0/3.0;
    
    double pi;
    pi = 3.14;

    double total;
    total = fraccion * pi * (radio * radio) * altura ;
    
    
    System.out.printf(".2%", total);
    
   
  } 
}
