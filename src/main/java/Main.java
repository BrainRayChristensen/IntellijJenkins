import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    String command = "";
    while(!(command = scanner.next()).equals("exit")){
      if(command.equals("add")){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("result is: " + calculator.add(a,b));
      }
      else if(command.equals("subtract")){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("result is: " + calculator.subtract(a,b));
      }
      else if(command.equals("multiply")){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("result is: " + calculator.multiply(a,b));
      }
      else if(command.equals("divide")){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("result is: " + calculator.divide(a,b));
      }
      else if(command.equals("binary")){
        int a = scanner.nextInt();
        System.out.println("result is: " + calculator.intToBinaryNumber(a));
      }
      else if(command.equals("fibonacci")){
        int a = scanner.nextInt();
        System.out.println("result is: " + calculator.fibonacciNumberFinder(a));
      }
    }
  }
}
