package math_problems;

import java.util.Scanner;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * @return
     */

    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        String fact = null;
        for(int i = 1; i<=n; i++)
        {
         //   fact = fact * i;
        }
        System.out.print("factorial "+fact);
    }

    }
