package Project_3_Part_1;

public class Problem_5 {
    public static void main(String[] args) {

        //5. Write a program to swap 2 numbers without a temporary variable

        int num1 = 2;
        int num2 = 3;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);

    }//end of main
}//end of class