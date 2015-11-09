/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
 * y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
 * oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej6AdivinarNumeroAleatorio {
  public static void main(String[] args) {
    
    int numero = 0;
    int intento = 5;
    int respuesta = 0;
    boolean adivinado = true;

    numero = (int)(Math.random()*100);  //numeros aleatorios del 0 al 100
    System.out.println("Adivina el número, puedes poner un número del 0 al 100");
    
    do { //mientras los intentos sean mayores a 0 (5 intentos) y no esté adivinado
      
      respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta < numero){
              System.out.println("El número introducido es menor");
            }
            if (respuesta > numero){
              System.out.println("El número introducido es mayor");
            }
        if (respuesta == numero){ //Se comprueba que la respuesta es = al número generado
          System.out.print("Has adivinado el número");
          adivinado = true;
        }else{
          intento --; //si no es, se resta un intento
          adivinado = false;
          if (intento == 0 ){ //se comprueban si quedan intentos
            System.out.println("Se acabaron los intentos");
          }else{
          System.out.println("Te quedan " + intento + " intentos, vuelve a probar");
          
          }
        } 
    } while (intento >0 && !adivinado );
     System.out.println("El número era" + numero);
   
  }
}
