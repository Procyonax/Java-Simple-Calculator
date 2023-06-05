import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double result;

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = scanObj.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = scanObj.nextInt();
        System.out.println("What operation would you like to perform? (+, -, *, /): ");
        char operator = scanObj.next().charAt(0);

        switch (operator) {
            case '+': result = num1 + num2;
            break;
            case '-': result = num1 - num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/': result = (double) num1 /num2;
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+result);
    }
}
