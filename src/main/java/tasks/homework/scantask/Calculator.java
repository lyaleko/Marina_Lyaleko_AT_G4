package tasks.homework.scantask;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int num1;
        int num2;
        int ans;
        char op;

        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        System.out.print("Enter the first number: ");
        num1 = reader.nextInt();
        System.out.print("Enter the second number: ");
        num2 = reader.nextInt();

        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.printf("\nThe result is: " + ans);
    }

}