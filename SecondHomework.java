package basic.homeworks;

import java.util.Scanner;

public class SecondHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str1 = scanner.next();
        System.out.print("Enter a word: ");
        String str2 = scanner.next();
        System.out.println("First word = " + str1);
        System.out.println("Second word = " + str2);

        String str3 = (str1.substring(0, str1.length() / 2) + str2.substring(0, str2.length() / 2));

        System.out.println(str3);

        System.out.print("Enter a first number ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter a second number ");
        double num2 = scanner.nextDouble();

        double result1 = sum((int) num1, (int) num2);
        double result2 = substraction((int) num1, (int) num2);
        double result3 = multiplication((int) num1, (int) num2);
        double result4 = division((int) num1, (int) num2);

        System.out.println("Result: " + result1);
        System.out.println("Result: " + result2);
        System.out.println("Result: " + result3);
        System.out.println("Result: " + result4);

        System.out.print("Enter dollars: ");
        double dollars = scanner.nextDouble();
        double exchangeRate = 0.92;

        double euro = convertToEuro(dollars, exchangeRate);

        System.out.printf("%.2f dollars = %.2f euro", dollars, euro);
    }

    static double sum (int num1, int num2) {
        double result1 = (num1 + num2);
        return result1;
    }

    static double substraction (int num1, int num2) {
        double result2 = (num1 - num2);
        return result2;
    }

    static double multiplication (int num1, int num2) {
        double result3 = (num1 * num2);
        return result3;
    }

    static double division (int num1, int num2) {
        double result4 = (num1 / num2);
        return result4;
    }

    public static double convertToEuro(double dollars, double exchangeRate){
        double euro = dollars * exchangeRate;
        return euro;
    }

}
