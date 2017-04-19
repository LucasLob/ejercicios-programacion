/**
* Realiza una programa que calcule las horas transcurridas entre dos horas de
* dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
* El día de la semana se puede pedir como un número (del 1 al 7) o como una
* cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
* los datos correctamente y que el segundo día es posterior al primero.
* Ej: Por favor, introduzca la primera hora.
* Día: lunes
* Hora: 18
* Por favor, introduzca la segunda hora.
* Día: martes
* Hora: 20
* Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio30 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  
  
  int primerDia = 0;
  String primerDiaInput;
  int primeraHora;
  int segundoDia = 0;
  String segundoDiaInput;
  int segundaHora;
  String nombreDia = "";
  String nombreDia2 = "";
  boolean esCorrecto = true;
  
    System.out.print("Introduzca un día de la semana: ");
    primerDiaInput = System.console().readLine();
    System.out.print("Introduzca una hora: ");
    primeraHora = Integer.parseInt(n.nextLine());
    
    do {
      switch (primerDiaInput){
        case "lunes":
        case "1":
          primerDia = 1;
          nombreDia = "lunes";
          break;
        
        case "martes":
        case "2":
          primerDia = 2;
          nombreDia = "martes";
          break;
        
        case "miércoles":
        case "3":
          primerDia = 3;
          nombreDia = "miércoles";
          break;
        
        case "jueves":
        case "4":
          primerDia = 4;
          nombreDia = "jueves";
          break;
        
        case "viernes":
        case "5":
          primerDia = 5;
          nombreDia = "viernes";
          break;
          
        case "sábado":
        case "6":
          primerDia = 6;
          nombreDia = "sábado";
          break;
        
        case "domingo":
        case "7":
          primerDia = 7;
          nombreDia = "domingo";
          break;
        default:
      }
      
      
      System.out.println();
      System.out.print("Introduzca el segundo día de la semana (debe ser posterior al primero): ");
      segundoDiaInput = System.console().readLine();
      System.out.print("Introduzca una hora: ");
      segundaHora = Integer.parseInt(n.nextLine());
      
          switch (segundoDiaInput){
        case "lunes":
        case "1":
          segundoDia = 1;
          nombreDia = "lunes";
          break;
        
        case "martes":
        case "2":
          segundoDia = 2;
          nombreDia = "martes";
          break;
        
        case "miércoles":
        case "3":
          segundoDia = 3;
          nombreDia = "miércoles";
          break;
        
        case "jueves":
        case "4":
          segundoDia = 4;
          nombreDia = "jueves";
          break;
        
        case "viernes":
        case "5":
          segundoDia = 5;
          nombreDia = "viernes";
          break;
          
        case "sábado":
        case "6":
          segundoDia = 6;
          nombreDia = "sábado";
          break;
        
        case "domingo":
        case "7":
          segundoDia = 7;
          nombreDia = "domingo";
          break;
        default:
      }
      
      if (segundoDia <= primerDia) {
        System.out.println("El segundo día debe ser posterior al primero.");
        esCorrecto = false;
      }
      
      if ((primerDia == 0) || (segundoDia == 0)) {
        System.out.println("No se ha introducido correctamente el día de la semana.");
        System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
        esCorrecto = false;
      }
      
      if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
        System.out.println("No se ha introducido correctamente la hora del día.");
        System.out.println("Las horas válidas están entre 0 y 23.");
        esCorrecto = false;
      }
      
      
    } while (!esCorrecto);
    
    System.out.print("Entre las " + primeraHora + "hrs del " + primerDiaInput + " y las " + segundaHora + "hrs del " + segundoDiaInput + " hay");
    System.out.println (" " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");
    
          
    }
  }
