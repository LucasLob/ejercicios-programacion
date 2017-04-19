/**
* Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado.
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50r 
* @author Lucas Lobato Botelho
**/

public class Ejericio09 {
  public static void main(String[] args){
    System.out.print("Este programa genera numero pares de 0 a 100 ");
    System.out.println("y cuando genere un 24 parará: ");
    System.out.println();

    int numeroAleatorio;
    int numerosGenerados = 0;

    do { 
      numeroAleatorio = (int)(Math.random()*101);
      if (numeroAleatorio % 2 == 0){
      System.out.println(numeroAleatorio);
      numerosGenerados++;
      }
    } while (numeroAleatorio != 24);

    
    System.out.println();
    System.out.println("Se han generado " + numerosGenerados + " numeros pares antes del 24");

  }
}
