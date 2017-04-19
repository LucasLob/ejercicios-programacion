/*  Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
    Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *  @author Lucas Lobato
 */


public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("Vamos a lanzar 5 dados de póker cuyas caras son:");
    System.out.println("As, K, Q, J, 7 y 8");
    System.out.println("______________________________________________");
    System.out.println("Pulse INTRO para tirar los dados.");
    System.console().readLine();
    
    int dado = 0;
    
    for (int i = 1; i <= 5; i++) {
      dado = (int)(Math.random()*6) + 1;
      
      switch (dado) {
        case 1:
        System.out.print("As ");
        break;
        
        case 2:
        System.out.print("K ");
        break;
        
        case 3:
        System.out.print("Q ");
        break;
        
        case 4:
        System.out.print("J ");
        break;
        
        case 5:
        System.out.print("7 ");
        break;
        
        case 6:
        System.out.print("8 ");
        break;
        
        default:
      } //switch
      
    }//for
  }
}
