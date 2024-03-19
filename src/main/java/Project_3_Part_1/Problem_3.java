package Project_3_Part_1;

public class Problem_3 {
    public static void main(String[] args) {

        //3. Create a 2D array

        int [][] array2d = {
                {2, 9, 8, 3, 6, 4},
                {8, 99, 25, 38, 64, 15},
                {17, 22, 38, 37, 19, 24}
            };

        for (int[] myArray : array2d) {
            for (int myArray2d:myArray){
                if(myArray2d%2==0){
                    System.out.print(myArray2d + " ");
                }//end of if
            }//end of 2nd for loop
        }//end of 1st for loop


    }//end of main
}//end of class