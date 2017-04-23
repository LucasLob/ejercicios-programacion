/**
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
* muestre por pantalla separados por espacios. El programa pedirá entonces
* por teclado dos valores y a continuación cambiará todas las ocurrencias del
* primer valor por el segundo en la lista generada anteriormente. Los números
* que se han cambiado deben aparecer entrecomillados.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] arrayNum = new int[100];
  
    System.out.println("El programa generará 100 números del 0 al 20: ");
    for(int i = 0; i < arrayNum.length; i++){
      arrayNum[i] = (int)(Math.random()*21);
      System.out.print(arrayNum[i] + " ");
    }
    
    
    System.out.println();
    System.out.println();
    System.out.println("Ahora introduzca dos valores: ");
    int primerInput = Integer.parseInt(n.nextLine());
    int segundoInput = Integer.parseInt(n.nextLine());
    
    for(int o = 0; o < arrayNum.length; o++){
      if( arrayNum[o] == primerInput){
        arrayNum[o] = segundoInput;
      }
    }
    
    for(int k = 0; k < arrayNum.length; k++){
      if(arrayNum[k] == segundoInput){
        System.out.print("'" + arrayNum[k] + "' ");
      } else {
          System.out.print(arrayNum[k] + " ");
        }
    }
    
  }
}
