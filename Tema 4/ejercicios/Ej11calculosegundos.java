/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los
segundos que faltan para llegar a la medianoche.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej11calculosegundos {

  public static void main(String[] args) {
    
    System.out.println("Intriduce una hora y después los minutos.");
    
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundostotales = (hora * 3600) + (minuto * 60);
    int segundosrestantes = (24 * 3600) - segundostotales;
            
    System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosrestantes + " segundos.");
  
  }
}
