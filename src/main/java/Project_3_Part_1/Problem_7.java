package Project_3_Part_1;

public class Problem_7 {
    public static void main(String[] args) {
        //7.Write a Java Program to print the first 10 numbers of Fibonacci series.

        int n = 10;
        int first = 0, second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");


        System.out.println(first);
        System.out.println(second);

        // Generate and print the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }//end of main
}//end of class
