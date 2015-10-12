/**
 *Escribe un programa que pinte una pirámide rellena con un carácter introducido por
 *teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa
 *debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando
 *hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej15piramide {

  public static void main(String[] args) {
    
		System.out.print("Introduce un carácter de relleno: ");
		String c = System.console().readLine();
		System.out.println("Elije un tipo de pirámide");
		System.out.println("1. Con el vértice hacia arriba");
		System.out.println("2. Con el vértice hacia abajo");
		System.out.println("3. Con el vértice hacia la izquierda");
		System.out.println("4. Con el vértice hacia la derecha");
		int opcion = Integer.parseInt(System.console().readLine());

		switch(opcion) {
			case 1:
        System.out.println("  " + c);
        System.out.println(" " + c + c+ c);
        System.out.println(c + c + c + c + c);
        break;
			case 2:
        System.out.println(c + c + c + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
        break;
			case 3:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
        break;
			case 4:
        System.out.println(c);
        System.out.println(c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c);
        System.out.println(c);
        break;
      default:
		}
	}
}
