package poo3;

/**
 *
 * @author Moisés
 */
public class Pinguino extends Mamifero {
  
  public Pinguino(String sexo) {
    super(sexo);
  }
  
  public void pia() {
    System.out.println("Soy un pingüino, no puedo piar");
  }

  public void Vuela() {
    System.out.println("No puedo volar");
  }

  public void nada() {
    System.out.println("Estoy nadando");
  }
  
}
