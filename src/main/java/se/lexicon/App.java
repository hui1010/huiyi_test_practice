package se.lexicon;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double a = 0, b = 0, result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the fist number: ");
        a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please enter the second number: ");
        b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please choose from (+ - * /)");
        char operator = scanner.next().charAt(0);

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
                System.out.println(operator + " is not supported");
        }
        System.out.println(result);
    }
}
