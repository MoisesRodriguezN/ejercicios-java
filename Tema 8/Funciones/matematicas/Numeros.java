package matematicas;

/**
 *
 * @author moises
 */
public class Numeros {

  /**
   * Comprueba que es capicua
   * @param n Un número entero introducido
   *
   * @return True si es capicua. False si no es capicua.
   * 
   */
  
  public static boolean esCapicua(long n) {
    return n == voltea(n);
  }
  
  public static boolean esCapicua(int n) {
    return esCapicua((long)n);
  }
  
  /**
   * Voltea un número
   * @param n Un número entero introducido
   *
   * @return True si es capicua. False si no es capicua.
   * 
   */

  public static long voltea (long n) {
    
    long aux = n;
    if (n < 0){
      n = Math.abs(n);
    }
   
    long numero = n;
    long volteado = 0;
    
    if(numero > 0){
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
    }else{
        while (numero < 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
    }
    
    if (aux < 0) {
      return  volteado * (-1) ;
    } else {
      return  volteado;
    }
  }
  
  /**
   * Comprueba si el número es primo.
   * @param x un número entero introducido
   * @return da verdadero si el número es primo o falso si el número no es primo.
   */
  
  public static boolean esPrimo(int x) {
      x= Math.abs(x);
      for (int i = 2; i < x; i++) {
        if ((x % i) == 0) {
          return false;
        }
      }
        return true;
  }
  
  /**
   * Comprueba si el número es primo y da el siguiente número mas chico que sea primo
   * @param n un número entero introducido
   * @return devuelve un número primo siguiente al número introducido
   */
  public static int siguientePrimo(int n) {
    while (!esPrimo(++n)){}
    return n;
  }
  
  
   /**
   * Calcula la potencia dada una base y un exponente
   * @param base la base de la potencia
   * @param exponente la base del exponente
   * @return devuelve la potencia calculada
   */
  
  public static int potencia(int base, int exponente) {
  
   // int potencia = 1;
    
    return (int)Math.pow(base, exponente);
    
    /*for (int i = 0; i < exponente; i++) {   //se declara i como 0, i debe ser menor que el exponente.
      // mientras i sea menor al exponente, se sumará 1 a i hasta que sea igual o mayor al exponente.
      potencia = potencia * base;
      //potencia *= base;
      }
    return potencia;*/
      
        
  }
  
  /**
   * Calcula la potencia dada una base y un exponente
   * @param n un número entero
   * 
   * @return devuelve la potencia calculada
   */
  public static int digitos(int n) {
   
    int cifra = 0;
    
    n = Math.abs(n);
    
    while (n > 0) {  
      n = n /10; 
      cifra ++;
    }
  
    return cifra; 
  }
  
  /**
   * Devuelve el dígito que está en la posición n de un número
   * entero, Se empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x número entero
   * @param n posición dentro del número x
   * @return  dígito que está en la posición n del número <code>x</code>
   *          empezando a contar por el 0 y de izquierda a derecha
   */
  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {  //Al poner 0, el primer digito será la posición 0
      x = x / 10;
    }

    x = x %10;
    return (int)x;
  }
  
  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1.
   *
   * @param x número entero
   * @param d dígito a buscar dentro del número
   * @return  posición de la primera ocurrencia del dígito dentro del número o
   *          -1 si no se encuentra
   */
  public static int posicionDeDigito(long x, int d) {
    int i ;
    
    for(i = 0; i < digitos((int) x) && (digitoN(x, i) != d) ; i++ ){}
      if(digitoN(x, i) == d){
        return digitoN(x, i);  
      } else {
        System.out.print("No encontrado");
        return -1;
      }   
  }
  
  /**
   * Le quita a un número n dígitos por detrás (por la derecha). 
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial x con n dígitos menos
   *          quitados de la derecha
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }
  
   /**
   * Le quita a un número n dígitos por delante (por la izquierda).                                                 *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial x con n dígitos menos
   *          quitados de la izquierda
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); 
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }
  
  /**
   * Añade un dígito a un número por detrás (por la derecha).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return  número inicial x con el dígito d pegado
   *          por la derecha
   */
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }
  
   /**
   * Añade un dígito a un número por delante (por la izquierda).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return  número inicial x con el dígito d pegado
   *          por la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }
  
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * 
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos((int) x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }
  
   /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos x ,y
   */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos((int) y))) + y;
  }
}