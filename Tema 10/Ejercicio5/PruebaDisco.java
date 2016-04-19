/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class PruebaDisco {

  public static void main(String[] args) {
   
    int opcion = 0;
    int opcionListado;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracioIntroducida;
    String duracioIntroducidaString;
    int i;
    
    ArrayList<Disco> album = new ArrayList<>();
    
    do{
      System.out.println("Elige una de las opciones: ");
      System.out.println("  1. Listado de discos");
      System.out.println("  2. Crear nuevo disco");
      System.out.println("  3. Modificar Disco");
      System.out.println("  4. Borrar disco");
      System.out.println("  5. Salir");
      System.out.println("-----------------------------");

      Scanner s = new Scanner(System.in);
      opcion = Integer.parseInt(s.nextLine());
      
      switch(opcion){
                 
        case 1:
          
          do {
          System.out.println("\nLISTADO");
          System.out.println();
          System.out.println("1. Completo");
          System.out.println("2. Por autor");
          System.out.println("3. Por género");
          System.out.println("4. En un rango de duración");
          System.out.println("5. Menú principal");
          System.out.print("Introduzca una opción: ");
          opcionListado = Integer.parseInt(s.nextLine());        
          
          switch (opcionListado) {

            case 1: 

              for(Disco d : album) {
                if (!d.getCodigo().equals("Libre")) {
                  System.out.println(d);
                }
              }
              break;
              
            case 2: 
  
              System.out.print("Introduzca el autor: ");
              autorIntroducido = s.nextLine();
              
              for(Disco d : album) {
                if ( (!d.getCodigo().equals("Libre")) && (d.getAutor().equals(autorIntroducido)) ){
                  System.out.println(d);
                }
              }
              break;
              
            case 3: 
  
              System.out.print("Introduzca el género: ");
              generoIntroducido = s.nextLine();
              
              for(Disco d : album) {
                if ( (!d.getCodigo().equals("Libre")) && (d.getGenero().equals(generoIntroducido)) ){
                  System.out.println(d);                 
                }
              }
              break;

            case 4: // 
  
              System.out.println("Establezca el intervalo para la duración");
              System.out.print("Introduzca el límite inferior de duración en minutos: ");
              int limiteInferior = Integer.parseInt(s.nextLine());
              System.out.print("Introduzca el límite superior de duración en minutos: ");
              int limiteSuperior = Integer.parseInt(s.nextLine());
              
              for(Disco d : album) {
                if ( (!d.getCodigo().equals("Libre")) && (d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior) ){
                  System.out.println(d);
                }
              }
              
          } 
        } while (opcionListado != 5);

          break;
          
        case 2:
          
            boolean existeCodigo = true;
            codigoIntroducido = "";
            while (existeCodigo) {
              existeCodigo = false;
              System.out.print("Introduce el codigo del disco: ");
              codigoIntroducido = s.nextLine();

              for (Disco d : album){
                if (codigoIntroducido.equals(d.getCodigo())) {
                  existeCodigo = true;
                }
              }
              if (existeCodigo) {
                System.out.println("Ese código ya existe en la base de datos.");
              }         
          }
            System.out.println("Introduce el autor del disco: ");
            autorIntroducido = s.nextLine();
            System.out.println("Introduce el titulo del disco: ");
            tituloIntroducido = s.nextLine();
            System.out.println("Introduce el genero del disco: ");
            generoIntroducido = s.nextLine();
            System.out.println("Introduce la duración del disco: ");
            duracioIntroducida = Integer.parseInt(s.nextLine());
            album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracioIntroducida));
         
          break;
        case 3:
          codigoIntroducido = "";
          existeCodigo = false;
          while (!existeCodigo) {
            existeCodigo = false;
            System.out.print("Introduce el codigo del disco a modificar: ");
            codigoIntroducido = s.nextLine();

            for (Disco d : album){
              if (codigoIntroducido.equals(d.getCodigo())) {
                existeCodigo = true;
              }
            }
            
            if(!existeCodigo){
              System.out.println("No existe el código");
            }
          }
          
          System.out.println("Introduce lo nuevos datos del Disco. Intro para dejar igual.");
          i = album.indexOf(new Disco(codigoIntroducido,"", "", "", 0));
          
          System.out.println("Introduce el codigo del disco: ");
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
          album.get(i).setCodigo(codigoIntroducido);
          }
          
          System.out.println("Introduce el autor del disco: ");
          autorIntroducido = s.nextLine();
          if (!autorIntroducido.equals("")) {
           album.get(i).setAutor(autorIntroducido);
          }
          
          
          System.out.println("Introduce el titulo del disco: ");
          tituloIntroducido = s.nextLine();
          if (!tituloIntroducido.equals("")) {
            album.get(i).setTitulo(tituloIntroducido);
          }

          System.out.println("Introduce el genero del disco: ");
          generoIntroducido = s.nextLine();
          if (!generoIntroducido.equals("")) {
            album.get(i).setGenero(generoIntroducido);
          }
          System.out.println("Introduce la duración del disco: ");
          duracioIntroducidaString = s.nextLine();
          if (!duracioIntroducidaString.equals("")) {
            album.get(i).setDuracion(Integer.parseInt(duracioIntroducidaString));
          }
          
          
          break;
          
        case 4:
          codigoIntroducido = "";
          existeCodigo = false;
          while (!existeCodigo){
            System.out.println("Escribe el código del disco a borrar: ");
            codigoIntroducido = s.nextLine();

            if (!album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
              System.out.println("El código introducido no existe.");
              existeCodigo = false;
             } else {
              album.remove(album.indexOf(new Disco(codigoIntroducido,"", "", "", 0)));
              System.out.println("Disco borrado.");
              existeCodigo = true;
            }
          }
      }
    }while(opcion < 5 || opcion == 0);
  }
  
}
