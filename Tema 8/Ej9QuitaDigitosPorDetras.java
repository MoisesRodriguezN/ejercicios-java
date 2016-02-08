/**
 * Le quita a un número n dígitos por detrás (por la
    derecha)
 * @author Moisés Rodríguez 
 */
public class Ej9QuitaDigitosPorDetras {
  public static void main(String[] args) {
   
   
  int num = 0; 
  int quitadigitos = 0;

    System.out.print("Introduce un numero: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el número de dígitos a quitar: ");
    quitadigitos = Integer.parseInt(System.console().readLine());
    
    if (num < 0) {
      num = -1 * num;
    
    } else {
    
    while (quitadigitos > 0) {  
      num = num /10; 
                  
      quitadigitos --;
    }
    
  
     System.out.println("El número que queda es: " + num);
     
    }
  }
}
