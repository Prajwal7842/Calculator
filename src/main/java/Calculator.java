import java.util.Scanner;

public class Calculator {
    public Calculator() {

    }
    public long factorial(long N) {
        if(N < 0) {
            throw new IllegalArgumentException("Invalid Input: Found Negative Number");
        }
        int fact = 1;
        for(int i = 2; i <= N; i ++) {
            fact = fact * i;
        }
        return fact;
    }
    public double sqrt(double N) {
        if(N < 0) {
            throw new IllegalArgumentException("Invalid Input: Found Negative Number");
        }
        double ans = Math.sqrt(N * 1.0);
        return ans;
    }
    public long power(long X, long Y) {
        long ans = (long) Math.pow(X, Y);
        return ans;
    }
    public double log(double N) {
        if(N < 0) {
            throw new IllegalArgumentException("Invalid Input: Found Negative Number");
        }
        double ans = Math.log(N);
        return ans;
    }
    public static void main(String args[]) {
        Calculator calObject = new Calculator();
        Scanner scannerObject = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome to Calculator App.\nPress 1 to calculate Square Root of an integer\nPress 2 to calculate Factorial of an integer." +
                    "\nPress 3 to calculate Natural log of a number.\nPress 4 to calculate X to the power Y.\nPress 5 to exit the application.");
            int choice = scannerObject.nextInt();
            if(choice == 1) {
                double N = scannerObject.nextDouble();
                double ans = calObject.sqrt(N);
                System.out.println("Square Root of " + N + " = " + ans);
            }
            else if(choice == 2) {
                long N = scannerObject.nextLong();
                long ans = calObject.factorial(N);
                System.out.println("Factorial of " + N + " = " + ans);
            }
            else if(choice == 3) {
                double N = scannerObject.nextDouble();
                double ans = calObject.log(N);
                System.out.println("Natural Log of " + N + " = " + ans);
            }
            else if(choice == 4) {
                long X = scannerObject.nextInt();
                long Y = scannerObject.nextInt();
                long ans = calObject.power(X, Y);
                System.out.println(X + " to the power " + Y + " = " + ans);
            }
            else if(choice == 5) {
                break;
            }
            else {
                throw new IllegalArgumentException("Invalid Choice. Exiting!");
            }
        }
    }
}
