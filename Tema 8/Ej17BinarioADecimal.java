/**
 * Binario A Decimal
 * @author Moisés Rodríguez Naranjo
 */
public class Ej17BinarioADecimal {
  public static void main(String[] args) {
   
    //De binario a decimal
    System.out.print("Introduce el número que quieres pasar a decimal");
    String numeroBinario = System.console().readLine();
    int num = Integer.parseInt(numeroBinario,2);
    System.out.println(numeroBinario + " base 2 = " + num + " base 10");
  }
}
