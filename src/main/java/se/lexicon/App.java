package se.lexicon;


public class App 
{
    public static void main( String[] args )
    {
        int a = 10, b = 5, result = 0;
        char operator = '*';
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
        System.out.println( result );
    }
}
