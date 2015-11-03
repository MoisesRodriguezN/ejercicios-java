/**
 * igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
 * 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej3BarajaEspañola {
  
  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        palo = "sota";
        break;
      case 2:
        palo = "caballo";
        break;
      case 3:
        palo = "rey";
        break;
      case 4:
        palo = "as";
      default:
    }

    int numeroCarta = (int)(Math.random()*7) + 1;
    
    carta = String.valueOf(numeroCarta);
    
    
    System.out.println(carta + " de " + palo);
  }
}
