import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public static long factorial(int n) {
        int sum = 1;
        for(int i = n; 0 < i; i--)
        {
           sum *= i;
        }
        return sum;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */

    public static long fibonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public static char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][rows];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }

        return triangle;
    }

    public static void main(String[] args) {
    }

}
