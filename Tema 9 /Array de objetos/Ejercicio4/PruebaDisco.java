/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooArray3;

import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class PruebaDisco {

  public static void main(String[] args) {
    
    Disco[] album = new Disco[4];
    int opcion = 0;
  
    
    for(int i = 0; i < 4; i++) {
      album[i] = new Disco();
    }
    
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
          
          System.out.println("Listado de discos: ");
          for(int i = 0; i < 4; i++) {
            if (!album[i].getCodigo().equals("Libre")) {
              System.out.println(album[i]);
            }
          } 
          break;
          
        case 2:
          int libre = -1;
          do{
            libre ++;
          }while(!(album[libre].getCodigo().equals("Libre")));
          
          System.out.println("Introduce el código del disco: ");
          String codigo = (s.nextLine());
          System.out.println("Introduce el autor del disco: ");
          String autor = (s.nextLine());
          System.out.println("Introduce el titulo del disco: ");
          String titulo = (s.nextLine());
          System.out.println("Introduce el genero del disco: ");
          String genero = (s.nextLine());
          System.out.println("Introduce la duración del disco: ");
          int duracion = Integer.parseInt(s.nextLine());
          
          album[libre] = new Disco(codigo, autor, titulo, genero, duracion);
          
          break;
        case 3:
          String codigoIntroducido;
          System.out.println("Escribe el código del disco a modificar: ");
          codigoIntroducido = s.nextLine();
          int i;
          i = -1;
          do{
            i ++;
          }while(!(album[i].getCodigo().equals(codigoIntroducido)));
             
          System.out.println("Introduce el autor del disco: ");
          album[i].setAutor((s.nextLine()));
          System.out.println("Introduce el titulo del disco: ");
          album[i].setTitulo((s.nextLine()));
          System.out.println("Introduce el genero del disco: ");
          album[i].setGenero((s.nextLine()));
          System.out.println("Introduce la duración del disco: ");
          album[i].setDuracion(Integer.parseInt(s.nextLine()));
          
          break;
          
        case 4:
          
          System.out.println("Escribe el código del disco a borrar: ");
          codigoIntroducido = s.nextLine();
          i = -1;
          do{
            i ++;
          }while(!(album[i].getCodigo().equals(codigoIntroducido)));
        
          album[i].setCodigo("Libre");
      }
    }while(opcion < 5 || opcion == 0);
  }
  
}
