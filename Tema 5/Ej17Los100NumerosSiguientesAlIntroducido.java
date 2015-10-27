/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo
 * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
 * número positivo).
 * @author Moisés Rodríguez Naranjo
 */
public class Ej17Los100NumerosSiguientesAlIntroducido{
  
   public static void main(String[] args) {
     
    int numeroIntroducido = 0;

    do {  //El bucle re repite mientras el número introducido sea menor que 0
      System.out.println("Introduce un número positivo");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido < 0) {  //comprueba que sea menor que 0 para mostrar el mensaje
        System.out.println("No se admiten números negativos");
      }
    } while (numeroIntroducido <0);
    
    System.out.println("Sumando 100 números al digito introducido:");
    
    int suma = 0;
    for (int i = numeroIntroducido; i <= numeroIntroducido+99; i++){
      System.out.println(i);
      suma += i;
    }
    System.out.println("total = " + suma);
  }
}
