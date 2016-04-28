package Ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Gestisimal {

  static int N = 3; //Tamaño del array
  
  public static void main(String[] args) {
    
    ArrayList<Articulo> a = new ArrayList<>(); //Array "articulo"
    
    Articulo a2 = new Articulo("1", "Etapas", 10, 20, 80);
    Articulo a3 = new Articulo("2", "Previos", 12, 26, 30);
    a.add(a2);
    a.add(a3);
    
    int i;
    int opcion;
    int posicion = 0;
    String codigo = "";
    String codigoIntroducido = "";
    String descripcionIntroducia ="";
    double precioCompra = 0;
    double precioVenta = 0;
    int stockIntroducido = 0;
    boolean existeCodigo = false;
    boolean compruebaMercancia;
    
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
          
          for(Articulo articuloAux : a) {
            System.out.println(articuloAux);
          }
          
        break;
        
        case 2: //Alta

        //Comprueba si existe el código
          
          do{
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();
            for(Articulo articuloAux : a){
              if(articuloAux.getCodigo().equals(codigoIntroducido)){
                System.out.println("El codigo existe en la base de datos");
                existeCodigo = true;
              }  
            }
          }while(existeCodigo);
          
        //Pide los datos y guarda el artículo
          System.out.print("Introduce la descripción: ");
          descripcionIntroducia = s.nextLine();
          System.out.print("Introduce el precio de compra: ");
          precioCompra = Double.parseDouble(s.nextLine());
          System.out.print("Introduce el precio de venta: ");
          precioVenta = Double.parseDouble(s.nextLine());
          System.out.print("Introduce  el stock: ");
          stockIntroducido = Integer.parseInt(s.nextLine());
          a.add(new Articulo(codigoIntroducido, descripcionIntroducia, precioCompra, 
            precioVenta, stockIntroducido));
          System.out.println("\nArtículo almacenado correctamente\n");
        break;
        
        case 3: //Baja
          //Comprueba que existe el codigo del articulo y borra el artículo.
          do{
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();
            for(Articulo articuloAux : a){ 
              if(articuloAux.getCodigo().equals(codigoIntroducido)){
                posicion = a.indexOf(articuloAux);
                existeCodigo = true;
                System.out.println("Articulo borrado");
              }
            }
            
            if(existeCodigo){
              a.remove(posicion);
            }

            if(!existeCodigo){
                System.out.println("\nNo existe el código del articulo\n");
            }
          }while(!existeCodigo);
        break;
        
        case 4://Modificación
           //Comprueba que existe el código y modifica el artículo. 
          do{
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();
            for(Articulo articuloAux : a){ 
             if(articuloAux.getCodigo().equals(codigoIntroducido)){
              posicion = a.indexOf(articuloAux);
              existeCodigo = true;
            }
          }

          if(existeCodigo){
            //Pide los datos y modifica el artículo
            System.out.print("Introduce la descripción: ");
            a.get(posicion).setDescripcion(s.nextLine());
            System.out.print("Introduce el precio de compra: ");
            a.get(posicion).setPrecioCompra(Double.parseDouble(s.nextLine()));
            System.out.print("Introduce el precio de venta: ");
            a.get(posicion).setPrecioVenta(Double.parseDouble(s.nextLine()));
            System.out.print("Introduce  el stock: ");
            a.get(posicion).setStock(Integer.parseInt(s.nextLine()));
            System.out.print("\nArtículo modificado correctamente\n");
          }
          
          if(!existeCodigo){
            System.out.println("\nNo existe el código del articulo\n");
          }
          
          }while(!existeCodigo);

          break;
          
        case 5://Entrada de mercancia
          do{
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();
            for(Articulo articuloAux : a){ 
              if(articuloAux.getCodigo().equals(codigoIntroducido)){
                posicion = a.indexOf(articuloAux);
                existeCodigo = true;
              }
            }
            
           
            if(existeCodigo){
              System.out.print("Introduce el stock para el articulo Nº: "
              + a.get(posicion).getCodigo() + "\nStock:"
                + " ");
              stockIntroducido = Integer.parseInt(s.nextLine());
              a.get(posicion).setStock(a.get(posicion).getStock()+ stockIntroducido);
              System.out.print("\nStock modificado correctamente\n");
            }

            if(!existeCodigo){
                System.out.println("\nNo existe el código del articulo\n");
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
