
package pooArray1;

import java.util.Scanner;

public class ArrayDeGatos {
  public static void main(String[] args) {
    
    Gato[] gato = new Gato[4];
    Scanner s = new Scanner(System.in);
    int i;
    
    System.out.println("Introduce los datos de los gatos");
    System.out.println();
    for (i = 0; i < 4; i++) {
      gato[i] = new Gato();
      System.out.println("Gato nº " + (i + 1));
      System.out.print("Nombre: ");
      gato[i].setNombre(s.nextLine());
      System.out.print("Color: ");
      gato[i].setColor(s.nextLine());
      System.out.print("Raza: ");
      gato[i].setRaza(s.nextLine());
      System.out.println();
    }

    System.out.println("Datos de los gatos.");
     System.out.println();

    for (i = 0; i < 4; i++) {
      System.out.println("Gato nº" + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
      System.out.println();
    }
  }
}
