package poo3;

/**
 *
 * @author Moisés
 */
public class Mamifero extends Animal{
  
  //Constructor
  public Mamifero(String sexo) {
    super(sexo);
  }
  
  //Metodos
  
  public void anda(){
    System.out.println("Estoy andando");
  }
  
  public void cuidaCrias(){
    System.out.println("Cuidando las crias");   
  }
  
  public void corre(){
    System.out.println("Estoy corriendo");
  }
}
