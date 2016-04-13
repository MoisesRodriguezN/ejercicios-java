package pooArray5;

import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Gestisimal {

  static int N = 3; //Tamaño del array
  
  public static void main(String[] args) {
    
    Articulo[] articulo = new Articulo[N]; //Array "articulo"
    int i;
    int opcion;
    int libre;
    boolean existeCodigo;
    
    for(i = 0; i < N; i++) {
      articulo[i] = new Articulo();
    } //Crea los articulos
    
    do{//Bucle del menú principal
      System.out.println("   ====GESTISIMAL====");
      System.out.println("Elige una de las opciones: \n");
      System.out.println("  1. Listado");
      System.out.println("  2. Alta");
      System.out.println("  3. Baja");
      System.out.println("  4. Modificación");
      System.out.println("  5. Entrada de mercancia");
      System.out.println("  6. Salida de mercancia");
      System.out.println("  7. Salir");
      System.out.println("-----------------------------\n");

      Scanner s = new Scanner(System.in);
      opcion = Integer.parseInt(s.nextLine());
      
      switch(opcion){
        case 1: //Listado de articulos
          
          for(i = 0; i < N; i++) {
            if (!articulo[i].getCodigo().equals("Libre")) {
              System.out.println(articulo[i]);
            }
             
          }
          
        break;
        
        case 2:
        
          //Comprueba la primera posicion libre
        libre = -1;
        do{
          libre ++;
        }while((libre < N) && !(articulo[libre].getCodigo().equals("Libre")));
        
        //Comprueba si existe el código
        if(libre < N){
          existeCodigo = true;
          String codigoIntroducido = "";
          while (existeCodigo) {
            existeCodigo = false;
            System.out.print("Introduce el codigo del artículo: ");
            codigoIntroducido = s.nextLine();

            for (i = 0; i < N; i++)//comprueba si exista el código
              if (codigoIntroducido.equals(articulo[i].getCodigo())) {
                existeCodigo = true;
              }

            if (existeCodigo) { 
              System.out.println("Ese código ya existe en la base de datos.");
              }
            }
              
          articulo[libre].setCodigo(codigoIntroducido);
          System.out.print("Introduce la descripción: ");
          articulo[libre].setDescripcion(s.nextLine());
          System.out.print("Introduce el precio de compra: ");
          articulo[libre].setPrecioCompra(Double.parseDouble(s.nextLine()));
          System.out.print("Introduce el precio de venta: ");
          articulo[libre].setPrecioVenta(Double.parseDouble(s.nextLine()));
          System.out.print("Introduce  el stock: ");
          articulo[libre].setStock(Integer.parseInt(s.nextLine()));
          
          
        }else{
          System.out.println("La base de datos está llena. Borre algun artículo"
            + " antes de crear uno nuevo");
        }
        
        break;
        
        case 3: 
          //Comprueba que existe el codigo del articulo
          System.out.println("Escribe el código del articulo a borrar: ");
          String  codigoIntroducido = s.nextLine();
          i = -1;
          String codigo="";
          do{
            i ++;
             if (i < N) {
              codigo = articulo[i].getCodigo();
            }
          }while((!(codigo.equals(codigoIntroducido))) && (i < N) );
         
          if(i == N){
            System.out.println("El código del artículo no existe");
          }else{
           articulo[i].setCodigo("Libre");
          System.out.println("Artículo borrado");
          }
      }
      
    }while(opcion < 7 || opcion == 0);
    
  }
  
}
