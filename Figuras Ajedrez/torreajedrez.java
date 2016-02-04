/**
 * Torre - Ajedrez - Bucles
 *
 * @author Moisés Rodríguez 
 */
public class torreajedrez {
  public static void main(String[] args) {
    
    int columna = 0;
    int fila = 0;
    String pcolumna = "";
    String pfila = "";
    //String coordenadas = "";
    int auxconlumna = 0;
    int auxfila = 0;
    
    //Lectura de datos (Columnas es ABCDEFGH) (Filas es 12345678)
   
    System.out.print("Introduce la posición de la columna : ");
    pcolumna = System.console().readLine().toLowerCase();
    columna = (int)(pcolumna.charAt(0)) - 96;
    System.out.print("Introduce la posición de la fila: ");
    fila = Integer.parseInt(System.console().readLine());
    
    //Otra forma de perdir las coordenadas
    /*
    System.out.print("Introduce las coordenadas : ");
    coordenadas = System.console().readLine().toLowerCase();
    columna = (int)(coordenadas.charAt(0)) - 96;
    fila = (int)(coordenadas.charAt(1)) - 48;
    */
    //Se guarda en la variable auxiliar las posiciones
    //Con esto se podrá devolver la figura a su posición de origen
    auxconlumna = columna;
    auxfila = fila;
    System.out.print("Posiciones: ");
    System.out.println();
    
    //Primer movimiento. Movimiento hacia arriba
    //Se suman filas
    for (int i = fila; i < 8; i++){
      fila += 1;
     switch (columna) {
        case 1:
        System.out.print("A");
        break;
        case 2:
        System.out.print("B");
        break;
        case 3:
        System.out.print("C");
        break;
        case 4:
        System.out.print("D");
        break;
        case 5:
        System.out.print("E");
        break;
        case 6:
        System.out.print("F");
        break;
        case 7:
        System.out.print("G");
        break;
        case 8:
        System.out.print("H");
        break;
        default:
      }
      System.out.print(fila + " ");
    }
    
    
    //Se devuelve la torre a su posición de origen 
    //Para volver a moverla 
    columna = auxconlumna;
    fila = auxfila;
 
    //Segundo movimiento. Movimiento hacia abajo
    //Se restan filas
    for (int i = fila; i > 1; i--){
      fila -= 1;
      switch (columna) {
        case 1:
        System.out.print("A");
        break;
        case 2:
        System.out.print("B");
        break;
        case 3:
        System.out.print("C");
        break;
        case 4:
        System.out.print("D");
        break;
        case 5:
        System.out.print("E");
        break;
        case 6:
        System.out.print("F");
        break;
        case 7:
        System.out.print("G");
        break;
        case 8:
        System.out.print("H");
        break;
        default:
      }
      System.out.print(fila + " ");
    }
    
    //Se devuelve la torre a su posición de origen 
    //Para volver a moverla 
    columna = auxconlumna;
    fila = auxfila;
    
    //Tercer movimiento. Movimiento hacia la derecha
    //Se restan filas
    for (int i = columna; i < 8; i++){
      columna += 1;
      switch (columna) {
        case 1:
        System.out.print("A");
        break;
        case 2:
        System.out.print("B");
        break;
        case 3:
        System.out.print("C");
        break;
        case 4:
        System.out.print("D");
        break;
        case 5:
        System.out.print("E");
        break;
        case 6:
        System.out.print("F");
        break;
        case 7:
        System.out.print("G");
        break;
        case 8:
        System.out.print("H");
        break;
        default:
      }
        
      System.out.print(fila + " ");
    }
    
    //Se devuelve la torre a su posición de origen 
    //Para volver a moverla 
    columna = auxconlumna;
    fila = auxfila;
    
    //Cuarto movimiento. Movimiento hacia la izqueirda
    //Se restan filas
    for (int i = columna; i > 1; i--){
      columna -= 1;
      switch (columna) {
        case 1:
        System.out.print("A");
        break;
        case 2:
        System.out.print("B");
        break;
        case 3:
        System.out.print("C");
        break;
        case 4:
        System.out.print("D");
        break;
        case 5:
        System.out.print("E");
        break;
        case 6:
        System.out.print("F");
        break;
        case 7:
        System.out.print("G");
        break;
        case 8:
        System.out.print("H");
        break;
        default:
      }
      System.out.print(fila + " ");
    }
  }
}
