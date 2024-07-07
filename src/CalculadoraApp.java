import java.util.Scanner;

public class CalculadoraApp {

  public static void main(String[] args) {
    calculadora();
  }

  public static void calculadora() {
    Scanner consola = new Scanner(System.in);
    boolean salir = false;
    System.out.println("*** Applicacion de Calculadora ***");
    while (!salir) {
      try {
        int opcion = mostrarMenu(consola);
        salir = ejecutarOperaciones(opcion, consola);
      } catch (Exception e) {
        System.out.println("Error de operacion: " + e.getMessage());
      } finally {
        System.out.println();
      }
    }
  }

  private static int mostrarMenu(Scanner consola) {
    System.out.print("""
        Menu:
        1. Suma
        2. Resta
        3. Multiplicacion
        4. Division
        5. Salir
        Operacion a realizar:\s""");
    return Integer.parseInt(consola.nextLine());
  }

  private static boolean ejecutarOperaciones(int opcion, Scanner consola) {
    boolean salir = false;
    double resultado;

    switch (opcion) {
      case 1 -> {
        // Suma
        resultado = suma(consola);
        System.out.println("Resultado Suma: " + resultado);
      }
      case 2 -> {
        //Resta
        resultado = resta(consola);
        System.out.println("Resultado Resta: " + resultado);
      }
      case 3 -> {
        // Multiplicacion
        resultado = multiplicacion(consola);
        System.out.println("Resultado Multiplicacion: " + resultado);
      }
      case 4 -> {
        //Division
        resultado = division(consola);
        System.out.println("Resultado Division: " + resultado);
      }
      case 5 -> {
        System.out.println("Regresa Pronto!!");
        salir = true;
      }
      default -> System.out.println("Opcion erronea :  " + opcion);
    }

    return salir;
  }

  private static double suma(Scanner consola) {
    System.out.print("Proporciona valor de operando1: ");
    double operando1 = Double.parseDouble(consola.nextLine());
    System.out.print("Proporciona valor de operando2: ");
    double operando2 = Double.parseDouble(consola.nextLine());
    return operando1 + operando2;
  }

  private static double resta(Scanner consola) {
    System.out.print("Proporciona valor de operando1: ");
    double operando1 = Double.parseDouble(consola.nextLine());
    System.out.print("Proporciona valor de operando2: ");
    double operando2 = Double.parseDouble(consola.nextLine());
    return operando1 - operando2;
  }

  private static double multiplicacion(Scanner consola) {
    System.out.print("Proporciona valor de operando1: ");
    double operando1 = Double.parseDouble(consola.nextLine());
    System.out.print("Proporciona valor de operando2: ");
    double operando2 = Double.parseDouble(consola.nextLine());
    return operando1 * operando2;
  }

  private static double division(Scanner consola) {
    System.out.print("Proporciona valor de operando1: ");
    double operando1 = Double.parseDouble(consola.nextLine());
    System.out.print("Proporciona valor de operando2: ");
    double operando2 = Double.parseDouble(consola.nextLine());
    return operando1 / operando2;
  }

}
