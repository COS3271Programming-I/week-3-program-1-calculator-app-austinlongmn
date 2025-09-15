import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double firstNumber = scanner.nextDouble();
    scanner.nextLine(); // Flush newline

    System.out.print("Enter the second number: ");
    double secondNumber = scanner.nextDouble();
    scanner.nextLine();

    scanner.close();

    System.out.format(
      "%.2f + %.2f = %.2f\n",
      firstNumber,
      secondNumber,
      firstNumber + secondNumber
    );

    System.out.format(
      "%.2f * %.2f = %.2f\n",
      firstNumber,
      secondNumber,
      firstNumber * secondNumber
    );

    System.out.format(
      "%.2f / %.2f = %.2f\n",
      firstNumber,
      secondNumber,
      firstNumber / secondNumber
    );

    System.out.format(
      "%.2f^%.2f = %.2f\n",
      firstNumber,
      secondNumber,
      Math.pow(firstNumber, secondNumber)
    );

    System.out.format(
      "log%.2f(%.2f) = %.2f\n",
      secondNumber,
      firstNumber,
      Math.log(firstNumber) / Math.log(secondNumber)
    );
  }
}
