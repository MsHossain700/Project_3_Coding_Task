package Project_3_Part_1;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {

        //6. Write a java program to check whether a given number is prime or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int num1 = scanner.nextInt();
        boolean isPrime=true;

        for ( int i =2; i < num1; i++){
            if (num1 % i ==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println(num1 + " is a prime number");
        }else {
            System.out.println(num1 + " is not a prime number");
        }



    }//end of main
}//end of class