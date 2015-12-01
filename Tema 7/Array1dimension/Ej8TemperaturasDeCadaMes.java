/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
 * determinado año y que muestre a continuación un diagrama de barras horizontales con
 * esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
 * carácter.
 * @author Moisés Rodríguez Naranjo
 */

public class Ej8TemperaturasDeCadaMes {
  public static void main(String[] args) {
    
    String[] mes = { //Array de String
      "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", 
      "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
        
    int[] numero = new int[12];
    int i;
    int t;
    
    System.out.println("Introduce la temperatura para cada mes");
    
    for (i = 0; i < 12; i++) {
      System.out.print(mes[i] + "  ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (i = 0; i < 12; i++) {
       System.out.printf("\n%12s ", mes[i]);
      for (t = 0; t < numero [i]; t++) {
        System.out.print("▄");
      }
    }


  }
}
