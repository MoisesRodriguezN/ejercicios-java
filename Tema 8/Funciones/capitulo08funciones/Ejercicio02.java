/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo08funciones;

import java.util.Scanner;
import static matematicas.numeros.esPrimo;

/**
 *
 * @author moises
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int x = Integer.parseInt(num.nextLine());
    if(esPrimo(x)){
      System.out.print(x + " Es primo");
    }else{
      System.out.print(x + " No es primo");
    }
  }
  
}
