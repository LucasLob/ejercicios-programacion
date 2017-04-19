/**
* Realiza un simulador de máquina tragaperras simplificada que cumpla los
* siguientes requisitos:
* a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
* figuras posibles: corazón, diamante, herradura, campana y limón.
* b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
* ha perdido”.
* c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
* ha recuperado su moneda”.
* d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
* 10 monedas”.
*
* @author Lucas Lobato 
*/


public class Ejercicio16{

  public static void main(String[] args) {

    int numeroFigura;
    int figura =  0;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    for ( int i = 1; i <= 3; i++) { // Realiza 3 tiradas 
    numeroFigura = (int)(Math.random()* 5 + 1);

      switch (numeroFigura) { //Según el random.num que haya generado muestra una figura.
      case 1:
        System.out.println("♥");
        break;
      case 2:
        System.out.println("♦");
        break;
      case 3:
        System.out.println("Ω");
        break;
      case 4:
        System.out.println("♝");
        break;
      case 5:
        System.out.println("◎");
        break;
      default:
   
      }

      switch (i){ //Según el numero de la tirada almacena en las variables aux una figura para poder compararlas luego.
        case 1:
        figura1 = numeroFigura;
        break;
        case 2:
        figura2 = numeroFigura;
        break;
        case 3:
        figura3 = numeroFigura;
        break;
      default:
    

      }
    }

    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) { // Se comparan las figuras para saber si ha perdido, ganado o recupera su moneda.
      System.out.println("\nLo siento, ha perdido.");
    } else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
    } else {
      System.out.println("\nBien, ha recuperado su moneda.");
    }


  }
}
