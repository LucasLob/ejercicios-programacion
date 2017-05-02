/* Funciones matemáticas
@author Lucas Lobato
*/
package matematicas;
public class Matematicas {
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio01 - Devuelve verdadero si el número que se pasa como pará/
  /metro es capicúa y falso en caso contrario.                         */
  ///////////////////////////////////////////////////////////////////////
  public static boolean esCapicua(int x){
    if(x == Matematicas.voltea(x)){
      return true;
    }
    return false;
  } 
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 02 - Devuelve verdadero si el número que se pasa como pará
  /metro es primo y falso en caso contrario.                           */
  ///////////////////////////////////////////////////////////////////////
  
  public static boolean esPrimo(int x){
      
      for (int j = 2; j < x; j++){
        if(x % j == 0){
          return false;
        }
      }
      return true;
    }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 03 - Devuelve el menor primo que es mayor al número que  /
  /se pasa como parámetro.                                             */
  ///////////////////////////////////////////////////////////////////////
  
  public static int siguientePrimo (int x){
    int sPrimo= x + 1;
    for(int i = 2; i < sPrimo;i++){
      if(sPrimo % i == 0){
        sPrimo++;
      };
    }
    return x;
  }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 04 - Dada una base y un exponente devuelve la potencia. */
  ///////////////////////////////////////////////////////////////////////
  
  public static int potencia (int b,int e){
    
    int pot = 1;
    for(int i = 0; i < e; i++){
      pot *= b;      
    }
    
     
    if (e < 0) {
      for (int i = 0; i < - e; i++) {
        pot *= b;
      }      
      pot = 1/pot;
    }
    return pot;
  }
    
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 05 - Cuenta el número de dígitos de un número entero.   */
  ///////////////////////////////////////////////////////////////////////
     
  public static int digitos(long x){
    
    int digitos = 1;
    
    while (x > 9){
      x /= 10;
      digitos++;
    }
    return digitos;
  }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 06 - Le da la vuelta a un número.                       */
  ///////////////////////////////////////////////////////////////////////
  
  public static int voltea (int x){
    int numero = x;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    return volteado;
  }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 07 - Devuelve el dígito que está en la posición n de un  /
  /número entero. Se empieza contando por el 0 y de izquierda a derecha*/
  ///////////////////////////////////////////////////////////////////////
  
  public static int digitoN (int x,int p){
    
    int cont = 0;
    int digito = 0;
    boolean salir = false;
    int numero = Matematicas.voltea(x);
    
    while ((numero > 0) && (!salir)) {
      if (cont == p) {
        digito = numero % 10;
        salir = true;
      } else {
        numero /= 10;
        cont++;
      }
    }
    return digito;
  }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 08 - Da la posición de la primera ocurrencia de un dígito/
  /dentro de un número entero. Si no se encuentra, devuelve -1.        */
  ///////////////////////////////////////////////////////////////////////
  
  public static int posicionDeDigito (int n,int p){
    
    int pos = 0;
    int num = Matematicas.voltea(n);
    
    while (num > 0){
      if (num %10 == p){
        return pos;
      }
      num /= 10;
      pos++;
    }
    return -1;
  }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 09 - Le quita a un número n dígitos por detrás (por la   /
  / derecha).                                                          */   
  ///////////////////////////////////////////////////////////////////////
  
  public static int quitaPorDetras (int x , int y){
    
    int cont = 0;
    do {
      while (cont < y){
        x /= 10;
        cont++;
        
      }
    } while ((x > 0) && (cont != y));
    return x;
  }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 10 - Le quita a un número n dígitos por delante (por la  /
  / izquierda).                                                        */   
  ///////////////////////////////////////////////////////////////////////
  
  public static int quitaPorDelante (int x, int y){
    
    int cont = 0;
    int num = Matematicas.voltea(x);
    
    do {
      while (cont < y){
        num /= 10;
        cont++;
      }
      } while ((num > 0) && (cont != y));
        return Matematicas.voltea(num);
  }
  
  ///////////////////////////////////////////////////////////////////////
  /* Ejercicio 11 -Añade un dígito a un número por detrás.              /
  /////////////////////////////////////////////////////////////////////*/
  
  public static int pegaPorDetras (int y, int x){
    
    int num = (y * 10) + x;
    return num;
  }
  
  ////////////////////////////////////////////////////////////////////////
  /* Ejercicio 12 - Añade un dígito a un número por delante.             /  
  /////////////////////////////////////////////////////////////////////*/
  
  public static int pegaPorDelante ( int y ,int x){
    
    int num = Matematicas.voltea(y);
    int num2 = (num * 10) + x;
    return Matematicas.voltea(num2);
    
  }
  
   /////////////////////////////////////////////////////////////////////////
  /* Ejercicio 13 - Toma como parámetros las posiciones inicial y final   /
  /dentro de un número y devuelve el trozo correspondiente.              /
  /////////////////////////////////////////////////////////////////////*/
  
  public static int trozoDeNumero (int x , int y ,int w){
    int numeroModif = 0;
    int numeroReves = Matematicas.voltea(x);
    int contadorY = 0;
    int contadorZ = 0;
    do {
      if ((contadorY == y) && (contadorZ <= w)) {
        numeroModif = (numeroModif * 10) + (numeroReves % 10);
      }
      numeroReves /= 10;
      if (contadorY < y) {
        contadorY++;
      }
      contadorZ++;
    } while (contadorZ <= w);
    return numeroModif;
  }
  /////////////////////////////////////////////////////////////////////////
  /* Ejercicio 14 - Toma como parámetros las posiciones inicial y final   /
  /dentro de un número y devuelve el trozo correspondiente.              /
  /////////////////////////////////////////////////////////////////////*/
  
  public static int juntaNumeros (int x, int y ){
    int contador = 0;
    int numero = y;
    while (y > 0) {
      y /= 10;
      contador++;
    }
    for (int i = 0; i < contador; i++) {
      x *= 10;
    }
    int numeroModif = x+numero;
    return numeroModif;
  }
  }