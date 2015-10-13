/**
* Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
la suma, la resta, la división y la multiplicación.
*
* @author Moisés Rodríguez Narnajo
*/
public class Ej1VariablesSumaResta {
  public static void main(String[] args) {
    int x; // Se declaran las variables x e y
    int y; 
    x = 144;
    y = 999;
    System.out.println(" x vale " + x);
    System.out.println(" y vale " + y);
    System.out.println("La suma es  " + (x + y ));
    System.out.println("La resta es  " + (x - y ));
  }
}
