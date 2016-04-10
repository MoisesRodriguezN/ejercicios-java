/**
 * Crea la clase Fracción. Los atributos serán numerador y
 *    denominador. Y algunos de los métodos pueden ser invierte,
 *    simplifica, multiplica, divide, etc.
 * 
 * @author Moisés Rodríguez
 */
package poo4;
public class PruebaFraccion {
  public static void main(String[] args) {
    
    Fraccion f1 = new Fraccion(-9,4);
    System.out.println(f1 + " x 6 = "+ f1.multiplica(6));
    System.out.println(f1 + " ^-1 = " + f1.invierte());
    
    Fraccion f2 = new Fraccion(6, 8);
    System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
        
    Fraccion f3 = new Fraccion(810, -460);
    System.out.println(f3 + " = " + f3.simplifica());      
  }
}
