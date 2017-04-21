/**
* Realiza un programa que pida 10 números por teclado y que los almacene en
* un array. A continuación se mostrará el contenido de ese array junto al índice
* (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
* “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
* ambos números están entre 0 y 9. El programa deberá colocar el número de
* la posición inicial en la posición final, rotando el resto de números para que no
* se pierda ninguno. Al final se debe mostrar el array resultante.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] input = new int[10];
    int[] desplazado = new int[10];
    int i;
    int j;
    boolean dentroRango;
    int posIn;
    int posFin;
    
    System.out.println("Intoduzca 10 números: ");
    // Asigna los valores dentro del array
    for(i = 0; i < input.length;i++){
      input[i] = Integer.parseInt(n.nextLine());
    }
    
    // Muestra el array original con sus valores almacenados
    for (int w = 0; w < input.length ; w++){
      if (w == 0){
        System.out.printf("%5s%4d" , "Indice|" , w);
      } else {
        System.out.printf("%4d" , w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < input.length; q++){
      if(q == 0){
          System.out.printf("%5s%4d" , "Valor |" , input[q]);
      } else {
          System.out.printf("%4d" , input[q]);
      }
    }
    
    System.out.println();
    System.out.println();
    // Verifica si los numeros introducidos están en el rango y que la posicion
    // inicial es menor que la final.
    do{
      dentroRango = true;
      
      // Se recogen las posiciones inicial y final
      System.out.println("Introduzca la posición inicial: ");
      posIn = Integer.parseInt(n.nextLine());
      
      System.out.println("Introduzca la posición final: ");
      posFin = Integer.parseInt(n.nextLine());
      
      if((posIn < 0) || (posIn > 9)){
        System.out.println("Por favor, el rango debe ser de 0 a 9.");
        dentroRango = false;
      }
      
      if((posFin < 0 ) || (posFin > 9)){
        System.out.println("El rango debe ser de 0 a 9, vuelva a introducirlo");
        dentroRango = false;
      }
      
      if(posIn >= posFin){
        System.out.println("La posición inicial debe ser menor que la posición final");
        dentroRango = false;
      }
    } while (!dentroRango);
    
    // Copia el array input en el array desplazado.
    for (i = 0; i < 10; i++) {
      desplazado[i] = input[i];
    }
    
    desplazado[posFin] = input[posIn];
    
    for (i = posFin + 1; i < 10; i++){
      desplazado[i] = input[i - 1];
    }
    
    desplazado[0] = input[9];
    
    for (i = 0; i < posIn; i++){
      desplazado[i + 1] = input[i];
    }
      
      System.out.println();
      
    // Muestra el array desplazado.
    for (int w = 0; w < input.length ; w++){
      if (w == 0){
        System.out.printf("%5s%4d" , "Indice|" , w);
      } else {
        System.out.printf("%4d" , w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < desplazado.length; q++){
      if(q == 0){
          System.out.printf("%5s%4d" , "Valor |" , desplazado[q]);
      } else {
          System.out.printf("%4d" , desplazado[q]);
      }
    }    
  }
}
