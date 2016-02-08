/**
 * Binario A Decimal
 * @author Moisés Rodríguez 
 */
public class Ej18DecimalABinario {
  public static void main(String[] args) {
   
    //De decimal a binario
    System.out.print("Introduce el número que quieres pasar a binario: ");
    int numeroDecimal = Integer.parseInt(System.console().readLine());;
    String binario = Integer.toBinaryString(numeroDecimal); 
    System.out.println(numeroDecimal + " base 10 = " + binario + " base 2");
  }
}
