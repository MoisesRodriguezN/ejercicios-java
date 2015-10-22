/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
 *números enteros a partir de uno que se introduce por teclado
 * @author Moisés Rodríguez Naranjo
 */
public class Ej11CuadradoYCuboDeNumeros{
  
  public static void main(String[] args) {
    
    int numeroIntroducido;
    System.out.print("Introduce un número: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.println("número\tCuadrado\tCubo");
    for (int i=numeroIntroducido; i<numeroIntroducido+5; i++){
      //System.out.println(i + "\t" + i*i + "\t\t" + i*i*i);
      System.out.println(i + "\t" + Math.pow(i,2) + "\t\t" + Math.pow(i,3));
    }
  
   
  }

}
