import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class.getName());
    public Calculator() {

    }
    public long factorial(long N) {
        logger.info("[FACTORIAL] - " + N);
        if(N < 0) {
            logger.info("[ERROR - FACTORIAL: Negative Integer Found] - " + N);
            throw new IllegalArgumentException("Invalid Input: Found Negative Number");
        }
        int fact = 1;
        for(int i = 2; i <= N; i ++) {
            fact = fact * i;
        }
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }
    public double sqrt(double N) {
        logger.info("[SQRT] - " + N);
        if(N < 0) {
            logger.info("[ERROR - SQRT: Negative Integer Found] - " + N);
            throw new IllegalArgumentException("Invalid Input: Found Negative Number");
        }
        double ans = Math.sqrt(N * 1.0);
        logger.info("[RESULT - SQRT] - " + ans);
        return ans;
    }
    public long power(long X, long Y) {
        logger.info("[POWER] - " + X + " " + Y);
        long ans = (long) Math.pow(X, Y);
        logger.info("[RESULT - POWER] - " + ans);
        return ans;
    }
    public double log(double N) {
        logger.info("[LOG] - " + N);
        if(N < 0) {
            logger.info("[ERROR - LOG: Negative Number Found] - " + N);
            throw new IllegalArgumentException("Invalid Input: Found Negative Number");
        }
        double ans = Math.log(N);
        logger.info("[RESULT - LOG] - " + ans);
        return ans;
    }
    public static void main(String args[]) {
        Calculator calObject = new Calculator();
        Scanner scannerObject = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Welcome to Calculator App.\nPress 1 to calculate Square Root of an integer\nPress 2 to calculate Factorial of an integer." +
                        "\nPress 3 to calculate Natural log of a number.\nPress 4 to calculate X to the power Y.\nPress 5 to exit the application.");
                int choice = scannerObject.nextInt();
                if (choice == 1) {
                    double N = scannerObject.nextDouble();
                    double ans = calObject.sqrt(N);
                    System.out.println("Square Root of " + N + " = " + ans);
                } else if (choice == 2) {
                    long N = scannerObject.nextLong();
                    long ans = calObject.factorial(N);
                    System.out.println("Factorial of " + N + " = " + ans);
                } else if (choice == 3) {
                    double N = scannerObject.nextDouble();
                    double ans = calObject.log(N);
                    System.out.println("Natural Log of " + N + " = " + ans);
                } else if (choice == 4) {
                    long X = scannerObject.nextInt();
                    long Y = scannerObject.nextInt();
                    long ans = calObject.power(X, Y);
                    System.out.println(X + " to the power " + Y + " = " + ans);
                } else if (choice == 5) {
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid Choice. Exiting!");
                }
            }
            catch (Exception e) {
                System.out.println("Invalid Choice!. Exiting.");
                System.exit(1);
            }
        }
    }
}
