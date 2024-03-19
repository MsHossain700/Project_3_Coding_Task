package Project_3_Part_1;

public class Problem_8 {
    public static void main(String[] args) {
        //8. Maximum and minimum number in the array

        int[] array={2,5,6,8,9,10,15};

        int maximumNumber = array[0];
        int minimumNumber = array[0];

        for (int number : array){
            if(number > maximumNumber) {
                maximumNumber = number;
            }if (number<minimumNumber)
                minimumNumber=number;
        }
        System.out.println("Maximum number is: " + maximumNumber);
        System.out.println("Minimum number is: " + minimumNumber);


    }//end of main
}//end of class
