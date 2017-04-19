/**
 * Ejercicio 1
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
 * @author Lucas Lobato Botelho
 */
 
public class Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.println("Los números múltiplos de 5 son: ");
      for (int i = 0; i < 101; i++){
        if ( i == 100){
          System.out.print (i + ".");
        } else if (i % 5 == 0){
          System.out.print(i + ", ");
        }

      }
    
  }
}
