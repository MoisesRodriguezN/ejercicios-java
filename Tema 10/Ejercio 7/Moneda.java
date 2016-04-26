package Ejercicio7;

/**
 *
 * @author Moisés
 */
public class Moneda {
  
  private String cantidades[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos",
    "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
  private String posiciones[] = {"cara", "cruz"};
  private String cantidad;
  private String posicion;

  public Moneda() {
    this.cantidad = cantidades[(int)(Math.random()*8)];
    this.posicion = posiciones[(int)(Math.random()*2)];
  }

  public String getCantidad() {
    return cantidad;
  }

  public String getPosicion() {
    return posicion;
  }

  @Override
  public String toString() {
    return this.cantidad +  " - " + this.posicion;
  }
  
  
  
  
}
