/**
* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
* El programa intentará adivinar el número que estás pensando - un número
* entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
* programa debe preguntar si el número que estás pensando es mayor o menor
* que el que te acaba de decir.
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50
* @author Lucas Lobato Botelho
**/

public class Ejercicio14 {
  public static void main(String[] args){

    int miNumero;
    int intentos = 0;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;

    System.out.print("Di en qué número estás pensando : ");
    miNumero = Integer.parseInt(System.console().readLine());

    do {
      int numeroGenerado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("Intento numero " + (intentos + 1) +  ". El número que hemos pensado es el " + numeroGenerado + ". ¿Es correcto?");
      System.out.println();
      System.out.println("1 - No. Es menor.");
      System.out.println("2 - No. Es mayor.");
      System.out.println("3 - Si");
      System.out.println();
      int respuesta = Integer.parseInt(System.console().readLine());
      intentos++;

        if (respuesta == 1 && intentos < 5 ){
          maximo = numeroGenerado - 1;
        }
        
        if (respuesta == 2 && intentos < 5){
          minimo = numeroGenerado + 1;
        }

        if (respuesta == 4 && intentos < 5){
          acertado = true;
          System.out.println("¡Hemos acertado!");
        }
 
    } while(!acertado && (intentos < 5));

    if (!acertado){
      System.out.println("No hemos podido adivinar tu numero :´(");
    }
  }
}
      


      
  
