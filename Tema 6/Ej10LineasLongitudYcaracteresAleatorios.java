/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
 * con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
 * ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Moisés Rodríguez Naranjo
 */
public class Ej10LineasLongitudYcaracteresAleatorios{
  public static void main(String[] args) {
    
    int caracter;
    int longitud;
    String relleno = "";
    
    for(int i = 1; i <= 10; i++) {
      
      longitud = (int)(Math.random() * 40) + 1; //Genera el número de 
      //carácteres que pintará
      caracter = (int)(Math.random() * 6); //número aleatorio para 
      //que salga un caracter aleatorio
      
      switch(caracter) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
      //Cada vez que salga del switch, generará una línea con la longitud
      //generada con números aleatorios.
      for(int j = 1; j <= longitud; j++) {
        System.out.print(relleno);
      }
      System.out.println();
    }
  }
}
