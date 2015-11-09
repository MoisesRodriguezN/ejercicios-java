/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
 * ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
 * carácter.
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
