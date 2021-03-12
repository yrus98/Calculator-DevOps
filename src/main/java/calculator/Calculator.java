package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Calculator DevOps Mini Project");
        do {
            System.out.print("\n-----MENU-----\n1. Square Root\n2. Factorial\n3. Natural Log\n4. Power (a^b)\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // sqrt
                    try {
                        System.out.print("Enter the number : ");
                        num1 = scanner.nextDouble();

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Squareroot of " + num1 + " is : " + calculator.sqrt(num1));
                    break;
                case 2:
                    // factorial
                    try {
                        System.out.print("Enter the number : ");
                        num1 = scanner.nextDouble();

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Factcorial of " + num1 + " is : " + calculator.fact(num1));
                    break;
                case 3:
                    // natural log
                    try {
                        System.out.print("Enter the number : ");
                        num1 = scanner.nextDouble();

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Natural log of " + num1 + " is : " + calculator.loge(num1));
                    break;
                case 4:
                    // power
                    try {
                        System.out.print("Enter the base : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the exponent : ");
                        num2 = scanner.nextDouble();

                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println(num1 + " ^ " + num2 + " is : " + calculator.power(num1, num2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double sqrt(double num1) {
        logger.info("[SQRT] - " + num1);
        double ans = -1;
        ans = Math.sqrt(num1);
        logger.info("[RESULT - SQRT] - " + ans);
        if(num1 < 0)
            logger.error("[EXCEPTION - SQRT] - Invalid Input");
        return ans;
    }

    public double fact(double num1) {
        double ans = 0;
        logger.info("[FACTORIAL] - " + num1 );
        try {
            if (num1 != (int) num1 || num1 < 0) {
                throw new Exception();
            }
            ans = 1.0;
            for (int i = 2; i <= num1; i++) {
                ans *= i;
            }
            logger.info("[RESULT - FACTORIAL] - " + ans);
        }catch (Exception e){
            logger.error("[EXCEPTION - FACTORIAL] - Invalid Input");
            return Double.NaN;
        }
        return ans;
    }


    public double loge(double num1) {
        logger.info("[LOG_E] - " + num1);
        double ans = 0;
        ans = Math.log(num1);
        logger.info("[RESULT - LOG_E] - " + ans);
        if(num1 <= 0)
            logger.error("[EXCEPTION - LOG_E] - Invalid Input");
        return ans;
    }

    public double power(double num1, double num2) {
        logger.info("[POWER] - " + num1 + "^" + num2);
        double ans = Math.pow(num1, num2);
        logger.info("[RESULT - POWER] - " + ans);
        return ans;
    }

}
