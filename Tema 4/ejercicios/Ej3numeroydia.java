/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 *  toca a primera hora ese día.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej3numeroydia {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un día de la semana del 1 al 7: ");
    String linea = System.console().readLine();
    int dia = Integer.parseInt( linea );
    
    String diasemana;
    
    switch (dia) {
      case 1:
        diasemana = "Lunes";
        break;
      case 2:
        diasemana = "Martes";
        break;
      case 3:
        diasemana = "Miercoles";
        break;
      case 4:
        diasemana = "Jueves";
        break;
      case 5:
        diasemana = "Viernes";
        break;
      case 6:
        diasemana = "Sábado";
        break;
      case 7:
        diasemana = "Domingo";
        break;
      default:
        diasemana = "Ese día no existe";
    }

    System.out.println("El Dia " + dia + " es: "+ diasemana);
  }
}
