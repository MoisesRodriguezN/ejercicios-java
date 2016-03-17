package poo3;

/**
 *
 * @author Moisés
 */
public class Lagarto extends Mamifero {
  
  public Lagarto(String sexo) {
    super(sexo);
  }
  
  public void camina() {
    System.out.println("Voy a caminar un rato");
  }

  public void refrescate() {
    System.out.println("Voy a darme un baño");
  }

  public void escondete() {
    System.out.println("Me he escondido");
  }
  
}
