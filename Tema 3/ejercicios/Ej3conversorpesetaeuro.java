/**
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
debe ser introducida por teclado
*
* @author Moisés Rodríguez Naranjo
*/

public class Ej3conversorpesetaeuro {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el número de pesetas: ");
    linea = System.console().readLine(); 
    double primerNumero;
    primerNumero = Double.parseDouble( linea ); 

    double segundoNumero;
    segundoNumero = 166.386;

    double total;
    total = primerNumero / segundoNumero;
    System.out.printf("%.0f Euros", total);
      
  } 
}
