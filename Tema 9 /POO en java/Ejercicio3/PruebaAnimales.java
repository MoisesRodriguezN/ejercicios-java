package poo3;

/**
 *
 * @author Moisés
 */
public class PruebaAnimales {

  public static void main(String[] args) {
    Gato Tom = new Gato("Macho");
    Gato Luna = new Gato("Hembra");
    Tom.setRaza("Siames");
    Luna.setRaza("Persa");
    Tom.describete();
    Tom.come("Pescado" );
    Luna.describete();
    Luna.cuidaCrias();
    Luna.come("Atum");
    
    Lagarto Lagarto1 = new Lagarto("sexo");
    Lagarto1.camina();
    Lagarto1.refrescate();
    
    Pinguino Pinguino1 = new Pinguino("sexo");
    Pinguino1.Vuela();
    
    Canario Canario1 = new Canario("Sexo");
    Canario1.agitaAlas(); 
  }
  
}
