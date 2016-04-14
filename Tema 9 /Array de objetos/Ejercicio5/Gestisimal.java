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
    int stockIntroducido;
    boolean existeCodigo;
    boolean compruebaMercancia;
    
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
        
        case 2: //Alta
        
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

            for (i = 0; i < N; i++)
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
        
        case 3: //Baja
          //Comprueba que existe el codigo del articulo y lo borra.
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
            System.out.println("El codigo no existe en la base de datos.");
          }else{
           articulo[i].setCodigo("Libre");
          System.out.println("Artículo borrado");
          }
        break;
        
        case 4://Modificación
          do{ //Vuelve a pedir el código mientras no existe el introducido.  
          existeCodigo = false;
          System.out.println("Escribe el código del articulo a modificar: ");
          codigoIntroducido = s.nextLine();
          i = -1;
          codigo="";
          do{
              i ++;
              if (i < N) {
                codigo = articulo[i].getCodigo();
              }
            }while((!(codigo.equals(codigoIntroducido))) && (i < N) );//Comprueba que existe al codigo

            
            if(i == N){
              System.out.println("El codigo no existe en la base de datos.");
              
            }else{

              existeCodigo = true;
              System.out.println("Introduce los datos, para dejar algo igual pulsa Intro");
              articulo[i].setCodigo(codigoIntroducido);
              System.out.print("Introduce la descripción: ");

              String descripcion = s.nextLine();
              if(!descripcion.equals("")){
                articulo[i].setDescripcion(descripcion);
              }

              System.out.print("Introduce el precio de compra: ");
              String precioCompra = (s.nextLine());
              if(!precioCompra.equals("")){
                articulo[i].setPrecioCompra(Double.parseDouble(precioCompra));
              }

              System.out.print("Introduce el precio de venta: ");
              String precioVenta = (s.nextLine());
              if(!precioVenta.equals("")){
                articulo[i].setPrecioVenta(Double.parseDouble(precioVenta));
              }

              System.out.print("Introduce  el stock: ");
              String stock = (s.nextLine());
              if(!stock.equals("")){
                articulo[i].setStock(Integer.parseInt(stock));
              }
            }
          }while(!existeCodigo);
            
          break;
          
        case 5://Entrada de mercancia
          do{//Vuelve a pedir el código mientras no existe el introducido. 
            existeCodigo = false;
            System.out.println("Escribe el código del articulo: ");
            codigoIntroducido = s.nextLine();
            i = -1;
            codigo="";
            do{
              i ++;
              if (i < N) {
                codigo = articulo[i].getCodigo();
              }
            }while((!(codigo.equals(codigoIntroducido))) && (i < N) );//Comprueba que existe al codigo

              if(i == N){
                System.out.println("El codigo no existe en la base de datos.");  
              }else{ //Entrada de merancia
                existeCodigo = true;
                System.out.println("EL stock actual para el artículo es : "
                  + articulo[i].getStock() + " Unidades");
                System.out.println("Introduce el número de unidades que entran al almacen: ");
                articulo[i].setStock(articulo[i].getStock() + Integer.parseInt(s.nextLine()));
                System.out.println("La mercancia ha entrado en el almacen. "
                  + "El stock actual es: " + articulo[i].getStock() + " Unidades");
              }
          }while(!existeCodigo);
          break;
          
        case 6://Salida de Mercancia
          do{//Vuelve a pedir el código mientras no existe el introducido. 
            existeCodigo = false;
            System.out.println("Escribe el código del articulo: ");
            codigoIntroducido = s.nextLine();
            i = -1;
            codigo="";
            do{
              i ++;
              if (i < N) {
                codigo = articulo[i].getCodigo();
              }
            }while((!(codigo.equals(codigoIntroducido))) && (i < N) );//Comprueba que existe al codigo

              if(i == N){
                System.out.println("El codigo no existe en la base de datos.");  
              }else{ //Salida de merancia
                existeCodigo = true;
                System.out.println("EL stock actual para el artículo es : "
                  + articulo[i].getStock() + " Unidades");
               
                //Comprueba que hay mercancia suficiente
                do{//Vuelve a pedir la cantidad mientras se intente sacar mas mercancia
                   // de la disponible
                  System.out.println("Introduce el número de unidades que salen almacen: ");
                  stockIntroducido = Integer.parseInt(s.nextLine());
                if(articulo[i].getStock() < stockIntroducido){
                  compruebaMercancia = false;
                  System.out.println("No es posible sacar tantas unidades");
                  System.out.println("Mercancia Actual: " + articulo[i].getStock() 
                    + " Unidades\n " + "Mercancia a sacar: " + stockIntroducido + " Unidades");
                }else{
                  compruebaMercancia = true;
                  articulo[i].setStock(articulo[i].getStock() - stockIntroducido);
                  System.out.println("La mercancia ha salido del almacen."
                  + "El stock actual es: " + articulo[i].getStock() + " Unidades");
                }
                }while(!compruebaMercancia);
 
              }
          }while(!existeCodigo);
      } 
      
    }while(opcion < 7 || opcion == 0);
    
  }
  
}
