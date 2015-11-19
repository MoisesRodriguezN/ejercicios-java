/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
 * y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
 * la lista generada anteriormente. Los números que se han cambiado deben aparecer
 * entrecomillados
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class Ej7Arrayde100PideNumeroYLoCambiaEnDondeAparezca {
  public static void main(String[] args) {
        
    int[] numero = new int[100];
    int i;
  
    
    // Rellena el array con números aleatórios del 0 al 20
    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + "  ");
    }
    //Pide introducir un número de los mostrados y el valor sustituto
    System.out.print("\nIntroduzca un número de los que se han mostrado: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
    int valor2 = Integer.parseInt(System.console().readLine());

    System.out.println();
    //El bucle recorre todo el array para comprobar la condición
    for (i = 0; i < 100; i++) {
      if (numero[i] == valor1) { //si el número es igual al valor introducido
        numero[i] = valor2; //ese número será igual al valor sustituto introducido
        System.out.print("\"" + numero[i] + "\" ");
      } else { //si no se cumple que el número sera igual al valor introducido..
        System.out.print(numero[i] + "  ");//..se muestra el número sin modificar
      }
    }

  }
}
