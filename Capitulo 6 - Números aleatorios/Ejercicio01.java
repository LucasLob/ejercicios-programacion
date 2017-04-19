/**
*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
*también la suma total (los puntos que suman entre los tres dados).
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50
*
* @author Lucas Lobato Botelho
**/

public class Ejercicio01 {
  public static void main(String[] args) {
    int suma = 0;
  
    System.out.println("Empieza la tirada de dados: ");
    
    for (int contador = 1; contador <= 3; contador++) {
      int numeroAleatorio = ((int)(Math.random()*6 + 1));
      System.out.println  (contador + "º tirada de dados = " + numeroAleatorio);
      suma += numeroAleatorio;
    }

    System.out.println();
    System.out.println("La suma de los números sacados en cada tirada es de " + suma);
  }
}

    
