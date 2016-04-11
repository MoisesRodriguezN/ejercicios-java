package pooArray2;
public class ArrayDeGatos02 {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];

    int i;

    gato[0] = new Gato("Garfield", "naranja", "mestizo");
    gato[1] = new Gato("Isidoro", "gris", "persa");
    gato[2] = new Gato("Blanca", "blanco", "angora");
    gato[3] = new Gato("Luigi", "marrón", "persa");

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

