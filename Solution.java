import java.util.Scanner;

public class Solution {

    public static float utility(float probability, int feelingRain, int feelingSun) {

        return probability * feelingRain + (1 - probability) * feelingSun;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input probability to rain: ");
        float pRain = in.nextFloat();

        System.out.println("Input the feeling when you are ");

        System.out.println("1.1  At home and it is raining outside : ");
        int feelingInHomeRain = in.nextInt();

        System.out.println("1.2  At home and it is sunny outside : ");
        int feelingInHomeSun = in.nextInt();


        System.out.println("\n 2.1 At forest and it is raining outside");
        int feelingInForestRain = in.nextInt();

        System.out.println("2.2  At forest and it is sunny outside : ");
        int feelingInForestSun = in.nextInt();

        float utilityInHome =  utility(pRain,feelingInHomeRain,feelingInHomeSun);

        float utilityInForest = utility(pRain,feelingInForestRain,feelingInForestSun);
        System.out.println("\nUtility in Home " + utilityInHome);

        System.out.println("Utility in Forest " + utilityInForest);

        if(utilityInForest>utilityInHome)
            System.out.println("We decide go to the forest");

        if(utilityInHome>utilityInForest)
            System.out.println("We decide stay at home");
    }
}
