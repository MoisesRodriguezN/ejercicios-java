/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 *  toca a primera hora ese día.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej1diayasigntura {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un día de la semana: ");
    String dia = (System.console().readLine()).toLowerCase(); //.toLowerCase  .toUpperCase  (Mayusculas a minusculas)
    
    String nombreAsignatura;
    
    switch (dia) {
      case "lunes":
        nombreAsignatura = "Fol";
        break;
      case "martes":
        nombreAsignatura = "Programacion";
        break;
      case "miercoles":
        nombreAsignatura = "Sistemas informaticos";
        break;
      case "jueves":
        nombreAsignatura = "Entornos dedesarollo";
        break;
      case "viernes":
        nombreAsignatura = "Bases de datos";
        break;
      default:
        nombreAsignatura = "no hay clase ese día";
    }

    System.out.println("El Dia " + dia + ": " + nombreAsignatura);
  }
}
