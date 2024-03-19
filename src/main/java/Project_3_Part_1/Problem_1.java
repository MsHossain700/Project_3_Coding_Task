package Project_3_Part_1;

public class Problem_1 {
    public static void main(String[] args) {

        //1. store a list of temperatures for a week
        int temperature[]={59,71,72,62,68,54,50};

        int highestTemp = temperature[0];
        int lowestTemp = temperature[0];

        for (int temp:temperature){
            if(temp > highestTemp) {
                highestTemp = temp;
            }if (temp<lowestTemp)
            lowestTemp=temp;
        }
        System.out.println("Highest temperature: " + highestTemp);
        System.out.println("Lowest temperature: " + lowestTemp);

    }//end of main
}//end of class