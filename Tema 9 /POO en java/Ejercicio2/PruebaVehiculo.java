package poo2;

import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class PruebaVehiculo {

  public static void main(String[] args) {
    int opcion = 0;
    int km;
    
    Bicicleta powerCanion = new Bicicleta();
    Coche opelInsignia = new Coche();
    
    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      Scanner s = new Scanner(System.in);
      System.out.print("Introduce una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(s.nextLine());
          powerCanion.recorre(km);
          break;
        case 2:
          powerCanion.hazCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(s.nextLine());
          opelInsignia.recorre(km);
          break;
        case 4:
          opelInsignia.quemaRueda();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(powerCanion.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(opelInsignia.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      }  
    }
  }
}
