/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
 * tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
 * valor.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej13Tira2DadosHastaQueNoSeanIguales{
  
 public static void main(String[] args) {

    int dado1;
    int dado2;
    
    do {
      dado1 = (int)(Math.random() * 6) + 1; //Tirada dado 1
      dado2 = (int)(Math.random() * 6) + 1; //Tirada dado 2
      System.out.println(dado1 + " " + dado2); 
    } while (dado1 != dado2); //Mientras los dos dados sean diferentes
  }
}
