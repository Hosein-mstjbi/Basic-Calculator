import java.lang.*;
import java.util.Scanner;
import static java.lang.System.out;

public class BasicCalculator {
    public static void main(String[] args) {
        //دو عدد را ذخیره میکند
        double num1, num2;
        //دریافت ورودی از کاربر
        Scanner sc = new Scanner(System.in);
        out.println("Enter the numbers: ");
        //گرفتن ورودی
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        //دریافت عملگر از کاربر
        out.println("Enter the operator (+, -, *, /):");
        char op = sc.next().charAt(0);
        double result = 0;

        result = getResult(op, result, num1, num2);

        out.println("The final result:");
        out.println();
        // چاپ نتیجه نهایی
        out.println(num1 + " " +
                op + " " + num2 + " = " + result );
    }

    private static double getResult(char op, double result, double num1, double num2) {
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
                out.println("You enter wrong input");
        }
        return result;
    }
}