/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 * total (los puntos que suman entre los tres dados). El programa pregunta si hacer otras 3
 * tiradas.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej1TresTiradasDadoYPreguntaSiHacerOtras3 {
  public static void main(String[] args) {
    
    int tirada = 0;
    int suma = 0;
    String respuesta = "";
  do {
     
    for (int i = 1; i <= 3; i++) {
      tirada = (int)(Math.random()*6 + 1);
      System.out.println("Tirada" + i + " --> " + tirada + " ");
      suma += tirada;  
    }
    
    System.out.println("La suma de las 3 tiradas es: " + suma); 
    System.out.println("¿Quieres hacer otras 3 tiradas? Responde S o N"); 
    respuesta = (System.console().readLine()).toLowerCase();
    suma = 0;  
    } while (respuesta.equals ("s"));
  
  }
}
