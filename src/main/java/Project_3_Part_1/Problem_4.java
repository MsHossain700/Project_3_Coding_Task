package Project_3_Part_1;

public class Problem_4 {
    public static void main(String[] args) {

        //4. Create a 2D array of integers

        int [][] array2d = {
                {2, 9, 8, 3, 6, 4},
                {8, 99, 25, 38, 64, 15},
                {17, 22, 38, 37, 19, 24}
        };

        int sumOfEven =0;
        int sumOfOdd=0;

        for( int [] myNumbers:array2d){
            for (int my2ndNumbers:myNumbers){
                if(my2ndNumbers%2==0){
                    sumOfEven+=my2ndNumbers;
                }else {
                    sumOfOdd+=my2ndNumbers;
                }
            }
        }
        System.out.println("Sum of even number: " + sumOfEven);
        System.out.println("Sum of odd number: " + sumOfOdd);


    }//end of main
}//end of class