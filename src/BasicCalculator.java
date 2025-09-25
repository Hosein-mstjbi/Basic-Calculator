import java.lang.*;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        
        //دو عدد را ذخیره میکند
        double num1, num2;

        //دریافت ورودی از کاربر
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");

        //گرفتن ورودی
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        //دریافت عملگر از کاربر
        System.out.println("Enter the operator (+, -, *, /):");

        char op = sc.next().charAt(0);
        double result = 0;

        switch (op) {

                // جمع دو عدد
            case '+':
                result = num1 + num2;
                break;

                //تفریق دو عدد
            case '-':
                result = num1 - num2;
                break;

                // ضرب دو عدد
            case '*':
                result = num1 * num2;
                break;

                // تقسیمم دو عدد
            case'/':
                result = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");
        System.out.println();

        // چاپ نتیجه نهایی
        System.out.println(num1 + " " +
                op + " " + num2 + " = " + result );
    }
}
