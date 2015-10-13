/**
 * Escribe un programa que calcule el total de una factura a partir de la base imponible.
 *
 * @author David Bernal Guerrero
 */

  public class Ej7facturabaseimponible {			
    public static void main(String[] args) {
      
    String baseimponible;
    
    System.out.print("Por favor, introduce la base imponible: ");
    baseimponible = System.console().readLine();
    double base1;
    base1 = Double.parseDouble( baseimponible );

    
    int iva = 21;
    double total;
    
    


    total = base1 + (base1 * iva/100);
    
     System.out.println(" ____________________________________________________");
    System.out.println("|                                   ______________  |");
    System.out.printf("| Base Imponible.................. |     %4.2f  €| |\n"
      ,base1);
    System.out.printf("| I.V.A. ......................... |         %d  " 
      ,iva);
    System.out.println("%| |");                      
    System.out.println("|                                  |--------------| |");
    System.out.printf("|                     TOTAL....... |      %.2f €| |\n"
      ,total);
    System.out.println("|                                  |______________| |");
    System.out.println("|___________________________________________________|");

    }
  }
