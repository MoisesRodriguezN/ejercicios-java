
import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class PruebaDisco {

  public static void main(String[] args) {
    
    Disco[] album = new Disco[4];
    int opcion = 0;
    int opcionListado;
    
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
          
          do {
          System.out.println("LISTADO");
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

              for(int i = 0; i < 4; i++) {
                if (!album[i].getCodigo().equals("Libre")) {
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              break;
              
            case 2: 
  
              System.out.print("Introduzca el autor: ");
              String autorIntroducido = s.nextLine();
              
              for(int i = 0; i < 4; i++) {
                if ( (!album[i].getCodigo().equals("Libre")) && (album[i].getAutor().equals(autorIntroducido)) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              break;
              
            case 3: 
  
              System.out.print("Introduzca el género: ");
              String generoIntroducido = s.nextLine();
              
              for(int i = 0; i < 4; i++) {
                if ( (!album[i].getCodigo().equals("Libre")) && (album[i].getGenero().equals(generoIntroducido)) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              break;

            case 4: // 
  
              System.out.println("Establezca el intervalo para la duración");
              System.out.print("Introduzca el límite inferior de duración en minutos: ");
              int limiteInferior = Integer.parseInt(s.nextLine());
              System.out.print("Introduzca el límite superior de duración en minutos: ");
              int limiteSuperior = Integer.parseInt(s.nextLine());
              
              for(int i = 0; i < 4; i++) {
                if ( (!album[i].getCodigo().equals("Libre")) && (album[i].getDuracion() <= limiteSuperior) && (album[i].getDuracion() >= limiteInferior) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                  System.out.println("------------------------------------------");
                }
              }
              
          } 
        } while (opcionListado != 5);

          break;
          
        case 2:
          String codigoIntroducido = "";
          int libre = -1;
          do{
            libre ++;
          }while((libre < album.length) && !(album[libre].getCodigo().equals("Libre")));
        
          if(libre < album.length){
            boolean existeCodigo = true;
            while (existeCodigo) {
              existeCodigo = false;
              System.out.print("Introduce el codigo del disco: ");
              codigoIntroducido = s.nextLine();

              for (int i = 0; i < 4; i++)
                if (codigoIntroducido.equals(album[i].getCodigo())) {
                  existeCodigo = true;
                }

              if (existeCodigo) {
                System.out.println("Ese código ya existe en la base de datos.");
              }
            }          
            
            album[libre].setCodigo(codigoIntroducido);
            System.out.println("Introduce el autor del disco: ");
            album[libre].setAutor((s.nextLine()));
            System.out.println("Introduce el titulo del disco: ");
            album[libre].setTitulo((s.nextLine()));
            System.out.println("Introduce el genero del disco: ");
            album[libre].setGenero((s.nextLine()));
            System.out.println("Introduce la duración del disco: ");
            album[libre].setDuracion(Integer.parseInt(s.nextLine()));
          
          
          }else{
            System.out.print("El album está lleno. Borre algún disco para poder crear uno nuevo ");
          }

          break;
        case 3:
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
          }while((i < album.length) &&!(album[i].getCodigo().equals(codigoIntroducido)));
        
          if(i < album.length){
            album[i].setCodigo("Libre");
          }else{
            System.out.println("El código introducido no existe ");
          }
          
      }
    }while(opcion < 5 || opcion == 0);
  }
  
}
