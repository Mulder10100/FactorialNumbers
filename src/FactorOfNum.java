import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorOfNum {

    public static int convert(String str) {
        int val = 0;

        try {
            val = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Please Enter a Number!");

        }
        return val;

    }

    public static void main(String[] args) {
        boolean finished = false;

        while (finished == false) {
            System.out.println("Enter a Positive Value");

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println(">>> ");
            String userString = "";

            try {
                userString = br.readLine();

            } catch (IOException ioe) {
                System.out.println("IO Exception Raised!");

            }

            int userInt = convert(userString);

            if (userInt % 2 == 0) {
                finished = true;
                int total = 1;
                for (int i = 1; i <= userInt; i++) {
                    total = total * i;
                }
                System.out.println("Factorial of "+ userInt + " is " + total);

            } else {
                finished = false;

            }

        }

    }

}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
//
//
// public class FactorOfNum {
//
// static int factorial(int n)
// {
// if (n == 0)
// return 1;
//
// return n*factorial(n-1);
// }
//
// // Function to convert String to integer
// public static int convert(String str)
// {
// int val = 0;
// // Convert the String
// try {
// val = Integer.parseInt(str);
// }
// catch (NumberFormatException e) {
// // This is thrown when the String
// // contains characters other than digits
// System.out.println("Please Enter a Number!");
// }
// return val;
// }
//
//
// public static void main(String[] args) {
// boolean finished = false;
//
// while (finished == false) {
// System.out.println("Enter a Positive Value");
//
// InputStreamReader isr = new InputStreamReader(System.in);
// BufferedReader br = new BufferedReader(isr);
// System.out.println(">>> ");
// String userString = "";
//
// try {
// userString = br.readLine();
//
// } catch (IOException ioe) {
// System.out.println("IO Exception Raised!");
//
// }
//
// int userInt = convert(userString);
//
// System.out.println("Factorial of "+ userInt + " is " + factorial(userInt));
//
// if (userInt % 2 == 0 ){
// finished = true;
// for(int i = 0; i <= userInt ; i++ ) {
//
// int factorial = i*i++;
//
// int num = 5;
//
//
// }
//
//
//
// }else {
// finished = false;
//
// }
//
// }
//
//
//
//
// }
//
// }
