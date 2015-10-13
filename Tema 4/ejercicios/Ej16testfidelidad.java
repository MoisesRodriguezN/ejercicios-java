/**
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo
 *  infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
 *  Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con
 *  falso no suman puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas
 *  y las conclusiones del programa.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej16testfidelidad {

  public static void main(String[] args) {
    
  int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE INFIDELIDAD");
    System.out.println("Responde con V (Verdadero) o con F (Falso)");
    
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    } 
      
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
    
     System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
  
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
    
     System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
    
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
  
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
      
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.print(":");
    respuesta = System.console().readLine().toUpperCase ();  
    if (respuesta.equals("V")) {
      puntos += 3;
    
    }
    
    if ((puntos >=0) && (puntos <=10)){
    System.out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
    System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ((puntos >=0) && (puntos <=10)){
    System.out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
    System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ((puntos >=11) && (puntos <=22)){
    System.out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
    System.out.print("Quizás exista el peligro de otra persona en su ");
    System.out.print("vida o en su mente, aunque seguramente será algo ");
    System.out.print ("sin importancia. No bajes la guardia.");
    }
    
    if ((puntos >=22) && (puntos <=30)){
    System.out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
    System.out.print("Tu pareja tiene todos los ingredientes para estar ");
    System.out.print("viviendo un romance con otra persona. ");
    System.out.print ("Te aconsejamos que indagues un poco mas ");
    System.out.print ("y averigües que es lo que pasa por su cabeza ");
    }
  }
}
