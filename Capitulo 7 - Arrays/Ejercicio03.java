/**
* Escribe un programa que lea 10 números por teclado y que luego los muestre
* en orden inverso, es decir, el primero que se introduce es el último en
* mostrarse y viceversa.
* @author Lucas Lobato Botelho
*/
public class Ejercicio03 {
  public static void main(String[] args) {

    int[] numero = new int[10];
    int i;

    System.out.print("Escribe 10 números por teclado: ");
    
    for ( i = 0; i < 10; i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Los numeros introducidos mostrados en orden inverso son: ");
    
    for (i = 9;  i >= 0 ; i--){
      System.out.println(numero[i]);
    }
  }
}
    
    
