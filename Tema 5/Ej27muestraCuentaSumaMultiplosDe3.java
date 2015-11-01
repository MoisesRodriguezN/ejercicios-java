/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej27muestraCuentaSumaMultiplosDe3{
  
   public static void main(String[] args) {
      
   
    int numeroIntroducido = 0;
    int cuenta = 0;
    int suma = 0;
    
    do {
      System.out.print("Introduzca un número entero mayor que 1: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido <= 1){
        System.out.println("Número no valido");
      }
    }while (numeroIntroducido <=1);
    
    //Comprueba que el número introducido es mayor que 1
    
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
   //Módulo 3 para sacar los multiplos de 3.
   //Va sumando 1 a I por cada repetición hasta llegar el número introducido
   //De esos números que genera, se casa la suma de multiplos      
    System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cuenta);
    System.out.println(" múltiplos de 3 y suman " + suma);
  }
}
