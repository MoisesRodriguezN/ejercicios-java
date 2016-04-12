/*
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 */
package ColeccionesYDiccionarios;

import java.util.ArrayList;

/**
 *
 * @author Moisés
 */
public class Ejercicio2 {

  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    int suma = 0;
    int media = 0;
    int minimo = 100;
    int maximo = 0;
    int tamano = (int)(Math.random() * 11 + 10);
    
    for(int i = 0; i < tamano; i++){
      a.add((int)(Math.random()*101));
    }
    
    for(int calculo : a){
      suma +=calculo;
      
      if(calculo < minimo){
        minimo = calculo;
      }
      
      if(calculo > maximo){
        maximo = calculo;
      }
    }
    
    media = suma/tamano;
    
    System.out.println("Suma: " + suma + "\n Máximo: " + maximo + "\n Mínimo: " + minimo +
      "\n Media: " + media);
  }
  
}
