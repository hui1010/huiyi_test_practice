package se.lexicon;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double a = 0, b = 0;
        char[] defaultOperators = {'+', '-', '*', '/'};
        char operator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please enter the second number: ");
        b = scanner.nextDouble();
        scanner.nextLine();



        while (true) {
            boolean check = false;
            System.out.println("Please choose from (+ - * /)");
            operator = scanner.next().charAt(0);
            scanner.nextLine();

            for (int i = 0; i < defaultOperators.length; i++) {
                if (operator == defaultOperators[i]) {
                    check = true;
                    break;
                }
            }
            if (check = true)
                break;
            else
                continue;
        }

        System.out.println( calculate(operator, a, b));

    }

    public static double calculate(char operator, double a, double b) {
        double result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                break;
        }return result;
    }
}
