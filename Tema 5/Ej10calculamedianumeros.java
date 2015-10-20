/**
 * Escribe un programa que calcule la media de un conjunto de números positivos introduci-
 *dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
 *indicará que ha terminado de introducir los datos cuando meta un número negativo.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej10calculamedianumeros {
  public static void main(String[] args) {
    
  int numerointroducido = 0;
  int cuentadigitos = 0;
  System.out.println("Introduce numeros y para acabar introduce uno negativo. ");

  while (numerointroducido >= 0)
    numerointroducido = Integer.parseInt(System.console().readLine());
    cuentadigitos ++;
    if (numerointroducido <0){
       System.out.println("calculando media");
    System.out.println(numerointroducido /cuentadigitos);
    }
  
  }
}
