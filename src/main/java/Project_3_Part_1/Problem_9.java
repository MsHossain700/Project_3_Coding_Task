package Project_3_Part_1;

public class Problem_9 {
    public static void main(String[] args) {
        //9. Write a java program to find the second-largest number in the array?

        int[] array={2,5,6,8,9,10,15};

        int largestNumber = array[0];
        int secondLargest = array[0];

        for (int number : array) {
            if (number > largestNumber) {
                secondLargest = largestNumber;
                largestNumber = number;
            } else if (number > secondLargest && number !=largestNumber) {
                secondLargest = number;
            }
        }

        System.out.println(secondLargest);
    }//end of main
}//end of class
