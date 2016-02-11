/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

/**
 *
 * @author moises
 */
public class numeros {

  /**
   * Comprueba que es capicua
   * @param n Un número entero introducido
   *
   * @return True si es capicua. False si no es capicua.
   * 
   */
  
  public static boolean esCapicua(long n) {
    return n == volteaNumero(n);
  }
  
  /**
   * Voltea un número
   * @param n Un número entero introducido
   *
   * @return True si es capicua. False si no es capicua.
   * 
   */

  public static long volteaNumero (long n) {

    
    long numero = n;
    long volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } 
   
    return  volteado;
  
  }
  
  /**
   * Comprueba si el número es primo.
   * @param x un número entero introducido
   * @return da verdadero si el número es primo o falso si el número no es primo.
   */
  
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
      return true;
  }
  
  /**
   * Comprueba si el número es primo y da el siguiente número mas chico que sea primo
   * @param n un número entero introducido
   * @return devuelve un número primo siguiente al número introducido
   */
  
  public static int siguientePrimo(int n) {
    boolean esPrimo = true; 
    int numeroPrimo = 0;
    n += 1;
    
    do{
      esPrimo = true;
      for (int i = 2; i < n; i++) { 
        if ((n % i)  == 0 ) { 
          esPrimo = false;
        }
      }
      n++;
    }while(!esPrimo);
    n--;
    return numeroPrimo = n;
        
  }
  
   /**
   * Calcula la potencia dada una base y un exponente
   * @param base la base de la potencia
   * @param exponente la base del exponente
   * @return devuelve la potencia calculada
   */
  
  public static int calculaPotencia(int base, int exponente) {
  
    int potencia = 1;
    
    for (int i = 0; i < exponente; i++) {   //se declara i como 0, i debe ser menor que el exponente.
      // mientras i sea menor al exponente, se sumará 1 a i hasta que sea igual o mayor al exponente.
      potencia = potencia * base;
      //potencia *= base;
      }
    return potencia;
      
        
  }
}