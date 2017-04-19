/**
 * Ejercicio 2
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle 
 * while .
 * @author Lucas Lobato Botelho
 */
 
public class Ejercicio02 {
  public static void main(String[] args) {
    int i = 0;
      
      System.out.println("Los números múltiplos de 5 son: ");
      while (i < 101){
        if ( i == 100){
          System.out.print (i + ".");
        } else if (i % 5 == 0){
          System.out.print(i + ", ");
        }
        i++;
      }
    
  }
}
