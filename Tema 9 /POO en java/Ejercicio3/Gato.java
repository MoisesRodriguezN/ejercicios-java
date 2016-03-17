package poo3;

/**
 *
 * @author moises
 */
public class Gato extends Mamifero{
  
  private String raza;
  
  public Gato(String sexo) {
    super(sexo);
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
 
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  
  public void describete(){
    System.out.print("Soy un gato de raza " + this.raza + ". " + "Mi sexo es " + getSexo());
  }
  
  public void canta() {
    System.out.println("lalarilaralilaralali");
  }

  public void caza() {
    System.out.println("Nosotros no cazamos");
  }

  public void pia() {
    System.out.println("Pio pio pio");
  }
  
}
