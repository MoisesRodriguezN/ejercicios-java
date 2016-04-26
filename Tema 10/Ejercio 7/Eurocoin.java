package Ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author Moisés
 */
public class Eurocoin {

  public static void main(String[] args) {
    ArrayList<Moneda> a = new ArrayList<>();
    String ultimaPosicion;
    String ultimaCantidad;
    
    //Genera una primera moneda y la guarda en el array
    Moneda monedaAux = new Moneda();
    a.add(monedaAux);
    //Obtiene la posición y cantidad de la moneda generada.
    ultimaCantidad = monedaAux.getCantidad();
    ultimaPosicion = monedaAux.getPosicion();
    
    
    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getPosicion()).equals(ultimaPosicion)) && !((monedaAux.getCantidad()).equals(ultimaCantidad)));
      
      a.add(monedaAux);
      //Se obtiene la ultima posición para despues comparar.
      ultimaPosicion = monedaAux.getPosicion();
      ultimaCantidad = monedaAux.getCantidad();
    }
    
    for (Moneda moneda : a) {
      System.out.println(moneda);
    }
  }
  
}
