package poo3;

/**
 *
 * @author Moisés
 */
public class Ave extends Animal{
  
  //Constructor
  public Ave(String sexo) {
    super(sexo);
  }
  
  //Métodos
  
  public void vuela(){
  System.out.println("Estoy volando");
  }
  
  public void ponHuevo(){
    System.out.println("Voy a poner huevos");
  }
 
  /* 
  int cuentaAgitaAlas = 0;
  public void agitaAlas(){
    cuentaAgitaAlas++;
    if(cuentaAgitaAlas <= 2){
      System.out.println("Agitando alas");
    }else{
      System.out.println("No puedo mas, déjame descansar");
    }
  }*/
}
