/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
 *en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
 *calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
 *para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej12cuestionario {

  public static void main(String[] args) {
    
  int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO ASIGNATURAS 1º");
    
    System.out.println("1. ¿Que tipo de dato acepta decimales?");
    System.out.println("a) int"); 
    System.out.println("b) double"); 
    System.out.println("c) switch"); 
    System.out.print(":");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Que es el Microsoft Visio?");
    System.out.println("a) Un editor HTML ");
    System.out.println("b) Un programa de diseño de bases de datos ");
    System.out.println("c) Un lenguage de programación ");
    System.out.print(": ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("3. ¿Que va entre el <body> </body> de una pagina web");
    System.out.println("a) Los metadatos");
    System.out.println("b) Los comentarios");
    System.out.println("c) El contenido de la página");
    System.out.print(": ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("4. ¿La memoria cache, de que está construida?");
    System.out.println("a) De transistores"); 
    System.out.println("b) De condensadores"); 
    System.out.println("c) De resistencias"); 
    System.out.print(":  ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    
    System.out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
  }
}
