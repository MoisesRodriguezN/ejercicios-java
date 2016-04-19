/*
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados
 * en una estructura de la clase HashMap.
 */
package ColeccionesYDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Ejercicio6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    HashMap<String, String> m = new HashMap<>();
    Scanner s = new Scanner(System.in);
    String usuario;
    String contraseña;
    int oportunidad = 3;
    boolean accesoCorrecto = false;
    //    Usuario  contraseña
    m.put("admin", "admin1234");
    m.put("supervisor", "visor10");
    m.put("desarrollador", "dev486");
    m.put("moises", "moi389");
    
    //Mientras haya oportunidades y el acceso no sea correcto
    while(oportunidad !=0 && !accesoCorrecto){
      System.out.print("Por favor, introduzca el usuario: ");
      usuario = s.nextLine();
      System.out.print("Por favor, introduzca la contraseña: ");
      contraseña = s.nextLine();
      //Comprueba la clave y el valor si existen en el diccionario
      if(m.containsKey(usuario) && (m.containsValue(contraseña))){
        System.out.println("Has accedido al area restringida");
        accesoCorrecto = true;
      }else{
        System.out.println("Usuario o contraseña incorrectos");
        oportunidad--;
      }
      
      if(oportunidad == 0){
        System.out.println("Lo siento, no tiene acceso al área restringida");
      }
    }   
  }
  
}
