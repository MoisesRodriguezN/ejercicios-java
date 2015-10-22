/**
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo
 * (exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
 * entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
 * Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 * @author Moisés Rodríguez Naranjo
 */
public class Ej15SacarPorPantallaPotencias{
  
   public static void main(String[] args) {
    int base;
    int exponente;
    int eleva = 0;
    do {  //El bucle re repite mientras la base sea menor que 0
      System.out.println("Introduce una base");
      base = Integer.parseInt(System.console().readLine());
      if (base < 0) {  //comprueba que sea menor que 0 para mostrar el mensaje
        System.out.println("No se admiten números negativos");
      }
    } while (base <0);
    
    do {
      System.out.println("Introduce un exponente");
      exponente = Integer.parseInt(System.console().readLine());
    
      if ((base < 0) || (exponente < 0)) {
        System.out.println("No se admiten números negativos");
      }
    } while (exponente <0);
        
    
    for (eleva = 1; eleva <= exponente; eleva++){ //empieza a elevar desde 1
      //mientras eleva sea menor o igual que el exponente de la base, súmra 1 
      //cada vez que sume, se irá imprimiendo por pantalla.
      System.out.print(base + "^");
      System.out.println(eleva);
    }
    
  }
}
