/**
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil
 * se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
 * con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
 */


/**
 *
 * @author Moises Rodriguez
 */
public class Ej8BidimensionalAjedrez {
  public static void main(String[] args) {
    
  int[][] alfil = new int[8][8]; // array de 6 filas por 10 columnas
  int fila = 0;
  String columna ; 
  String columnaprint ="";
  int rellenafila;
  int rellenacolumna = 0;
  int contador = 0;
  int aux1 = 0;
  int aux2 = 0;

    //Rellena el tablero
    /*for(rellenafila = 0; rellenafila < 8; rellenafila ++){
      contador = 0;
      for(rellenacolumna = 0; rellenacolumna <8; rellenacolumna ++){
        contador ++;
        alfil[rellenafila][rellenacolumna] = contador;
      }
    }
    */
    //Pide las coordenadas
    System.out.println("elige la fila");
    rellenafila = Integer.parseInt(System.console().readLine());
    aux1 = rellenafila;
    System.out.println("elige la columna");
    
    columna = System.console().readLine().toLowerCase();
    
    
    if(columna.equals("a")){
      rellenacolumna = 2;
      aux2 = rellenacolumna;
    }
    
    if(columna.equals("b")){
      rellenacolumna = 2;
      aux2 = rellenacolumna;
    }
    if(columna.equals("c")){
      rellenacolumna = 3;
      aux2 = rellenacolumna;
    }
    if(columna.equals("d")){
      rellenacolumna = 4;
      aux2 = rellenacolumna;
    }
    if(columna.equals("e")){
      rellenacolumna = 5;
      aux2 = rellenacolumna;
    }
    if(columna.equals("f")){
      rellenacolumna = 6;
      aux2 = rellenacolumna;
    }
    if(columna.equals("g")){
      rellenacolumna = 7;
      aux2 = rellenacolumna;
    }
    if(columna.equals("h")){
      rellenacolumna = 8;
      aux2 = rellenacolumna;
    }
   // aux2 = rellenacolumna;
    System.out.println("Se puede mover por: " );
     
    //Primer bucle de  movimientos
    rellenafila -=1; //Mueve atrás una columna
    for (; rellenafila >0; rellenafila--){ 
      if(rellenacolumna >1){
      rellenacolumna -=1;
      
       if(rellenacolumna == 1){
      columnaprint = "Posición a";
      }
      
      if(rellenacolumna == 2){
      columnaprint = "Posición b";
      }
      
      if(rellenacolumna == 3){
      columnaprint = "Posición c";
      }
      
      if(rellenacolumna == 4){
      columnaprint = "Posición d";
      }
      
      if(rellenacolumna == 5){
      columnaprint = "Posición e";
      }
      
      if(rellenacolumna == 6){
      columnaprint = "Posición f";
      }
      
      if(rellenacolumna == 7){
      columnaprint = "Posición g";
      }
      
      if(rellenacolumna == 8){
      columnaprint = "Posición h";
      }
      System.out.print(columnaprint);
      System.out.print(rellenafila);
      System.out.println();
      }
    } //Movimiento diagonal hacia abajo izquierda
    
    //Coloca el alfil en la posición de origen
    rellenafila = aux1; 
    rellenacolumna = aux2;
    
    System.out.println();//salto de linea
    
     //Segundo bucle de  movimientos
    rellenafila +=1; //Mueve adelante una columna
    for (; rellenafila <9; rellenafila++){ 
      if(rellenacolumna >1){
      rellenacolumna -=1;
     if(rellenacolumna == 1){
      columnaprint = "Posición a";
      }
      
      if(rellenacolumna == 2){
      columnaprint = "Posición b";
      }
      
      if(rellenacolumna == 3){
      columnaprint = "Posición c";
      }
      
      if(rellenacolumna == 4){
      columnaprint = "Posición d";
      }
      
      if(rellenacolumna == 5){
      columnaprint = "Posición e";
      }
      
      if(rellenacolumna == 6){
      columnaprint = "Posición f";
      }
      
      if(rellenacolumna == 7){
      columnaprint = "Posición g";
      }
      
      if(rellenacolumna == 8){
      columnaprint = "Posición h";
      }
      System.out.print(columnaprint);
      System.out.print(rellenafila);
      System.out.println();
      }
    } //Movimiento diagonal hacia arriba izquierda
    
    //Coloca el alfil en la posición de origen
    rellenafila = aux1; 
    rellenacolumna = aux2;
    System.out.println();//salto de linea
    
    //Tercer bucle de  movimientos
    rellenafila +=1; //Mueve adelante una columna
    for (; rellenafila <9; rellenafila++){ 
      if(rellenacolumna <8 || rellenacolumna >1){
      
      rellenacolumna +=1;
      if(rellenacolumna == 1){
      columnaprint = "Posición a";
      }
      
      if(rellenacolumna == 2){
      columnaprint = "Posición b";
      }
      
      if(rellenacolumna == 3){
      columnaprint = "Posición c";
      }
      
      if(rellenacolumna == 4){
      columnaprint = "Posición d";
      }
      
      if(rellenacolumna == 5){
      columnaprint = "Posición e";
      }
      
      if(rellenacolumna == 6){
      columnaprint = "Posición f";
      }
      
      if(rellenacolumna == 7){
      columnaprint = "Posición g";
      }
      
      if(rellenacolumna == 8){
      columnaprint = "Posición h";
      }
      System.out.print(columnaprint);
   
      }
      System.out.print(rellenafila);
      System.out.println();
    } //Movimiento diagonal hacia arriba derecha
    
     //Coloca el alfil en la posición de origen
    rellenafila = aux1; 
    rellenacolumna = aux2;
    System.out.println();//salto de linea
    
    //Cuarto bucle de movimientos
    rellenafila -=1; //Mueve atrás una columna
    for (; rellenafila >0; rellenafila--){ 
      if(rellenacolumna <8){
     
      rellenacolumna +=1;
       if(rellenacolumna == 1){
      columnaprint = "Posición a";
      }
      
      if(rellenacolumna == 2){
      columnaprint = "Posición b";
      }
      
      if(rellenacolumna == 3){
      columnaprint = "Posición c";
      }
      
      if(rellenacolumna == 4){
      columnaprint = "Posición d";
      }
      
      if(rellenacolumna == 5){
      columnaprint = "Posición e";
      }
      
      if(rellenacolumna == 6){
      columnaprint = "Posición f";
      }
      
      if(rellenacolumna == 7){
      columnaprint = "Posición g";
      }
      
      if(rellenacolumna == 8){
      columnaprint = "Posición h";
      }
      System.out.print(columnaprint);
      System.out.print(rellenafila);
      System.out.println();
      }
    } //Movimiento diagonal hacia abajo derecha
 
  }
}
    
 

