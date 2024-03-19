package Project_3_Part_1;

public class Problem_2 {
    public static void main(String[] args) {

        //2. Create an array of integer values
        int integerValues[] = {2,9,8,3,6,4,8,99,25,38,64,15,46};

        int sum=0;
        for (int numbers:integerValues){
            sum += numbers;
        }
        System.out.println("Sum: " + sum);


    }//end of main
}//end of class