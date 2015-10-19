/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 *El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
 *mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 *ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 * @author Moisés Rodríguez Naranjo
 */
public class Ej7cajafuerte {
  public static void main(String[] args) {
   
    String linea;
    
    System.out.print("Por favor, introduce la combinacion: ");
    linea = System.console().readLine();
    int  combinacion;
    combinacion = Integer.parseInt( linea );
    int intentos = 3;
        
    if (combinacion == 320) {
      
    System.out.print("La caja fuerte se ha abierto satisfactoriamente"); //Primer intento de combinación
      
    }else{
      do {
        
      if (intentos >= 0)  { //Se comprueba el número de intentos, si quedan, se continua pidiendo la combinacion
     
      System.out.print("Lo siento, esa no es la combinación. ");
      System.out.println("Introducela de nuevo");
      linea = System.console().readLine();
      combinacion = Integer.parseInt( linea );
      if (combinacion == 320) {  //Si en este segundo intento se acierta, la caja se abre y el programa termina
      System.out.print("La caja fuerte se ha abierto satisfactoriamente");
      break;
      }else{ //si no se acierta la combinación anterior, se volverá a pedir, restando un intento.
      
      }
      intentos -- ;
      }} while (intentos >0) ;
      
      
    
       
     
     
      
        

     
     
     
      
     
    
    
   }     
     
  }
}
