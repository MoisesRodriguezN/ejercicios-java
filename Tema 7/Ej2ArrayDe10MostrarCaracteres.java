
/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
 * según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
 * del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Moisés Rodríguez Naranjo
 */

public class Ej2ArrayDe10MostrarCaracteres {
  public static void main(String[] args) {
        
    char [] simbolo = new char[10]; // se reserva espacio para 10 símbolos
            
    simbolo[0] = 'a' ;
    simbolo[1] = 'X' ;
    simbolo[4] = '@' ;
    simbolo[6] = ' ' ;
    simbolo[7] = '+' ;
    simbolo[8] = 'Q' ;
    
    System.out.print("Los valores del array n son los siguientes: ");
    for (int i = 0; i < 10; i++){  //EL bucle recorre el array y lo muestra
      System.out.print(simbolo[i] + " ");
    }
    
    //Los que no han sido inicializado se ponen con el simbolo vacio. 
  }
}
