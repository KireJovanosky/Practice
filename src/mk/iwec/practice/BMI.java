package mk.iwec.practice;

import java.text.DecimalFormat;

public class BMI {

    public static void calculateBMI(int weight, int height){
        double temp = (float) weight / Math.pow(height, 2);
        double result = temp * 10000;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("For the entered Weight of: " + weight + " and Height of: " + height + " the BMI is " + df.format(result));
        if (result <= 18.5){
            System.out.println("Conclusion: Underweight");
        } else if (result > 18.5 && result<= 25 ) {
            System.out.println("Conclusion: Normal weight");
        }else {
            System.out.println("Conclusion: Overweight");
        }
    }

}
