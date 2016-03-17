package poo3;

/**
 *
 * @author Moisés
 */
public class Perro extends Mamifero{
  
  public Perro(String sexo) {
    super(sexo);
  }
  
  public void ladra() {
    System.out.println("Guau guau");
  }

  public void dameLaPata() {
    System.out.println("Toma mi patita");
  }

  public void caza() {
    System.out.println("Estoy cazando");
  }
}
