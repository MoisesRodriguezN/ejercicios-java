/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

/**
 *
 * @author Moisés
 */
public abstract class Animal {
  //Atributos 
  private String sexo;
  
  //Constructor
  public Animal(String sexo) {
    this.sexo = sexo;
  }

  //Getter
  public String getSexo() {
    return sexo;
  }
  
  //Métodos
  
  public void duerme(){
    System.out.println("Me voy a dormir");
  }
  
  public void come(String comida){
    System.out.println("Voy a comer " + comida);
  }
  
  
}
