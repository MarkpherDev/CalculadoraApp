import java.util.Scanner;

public class CalculadoraApp {

  public static void main(String[] args) {
    System.out.println("*** Applicacion de Calculadora ***");
    System.out.print("Proporciona valor de operando1: ");
    Scanner consola = new Scanner(System.in);
    int operando1 = Integer.parseInt(consola.nextLine());
    System.out.print("Proporciona valor de operando2: ");
    int operando2 = Integer.parseInt(consola.nextLine());
    int resultado = operando1 + operando2;
    System.out.println("Resultado: " + resultado);
  }
}