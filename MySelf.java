package mySelf;
import java.util.Scanner;

public class MySelf {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        //Enter username and press Enter

        String userName;
        System.out.println("Enter username");
        userName = myObj.nextLine();
        System.out.println("Username is : " + userName);
        System.out.println(bmiCalculator(1.72,75.8));

        System.out.println(convertCelciusToFahrenheit(1));
        System.out.println(convertFahrenheitToCelcius(1));

    }




    public static double convertCelciusToFahrenheit(double celcius){
        return (celcius * 9/ 5) + 32;
    }
    public static double convertFahrenheitToCelcius(double fahrenheit){
        return (fahrenheit - 32)  * 5 / 9;
    }

    //*************************************************************************************************

    // Bmi calculator
    public static double bmiCalculator(double height, double weight ){
        double squareHeight = height * height;
        return Math.round(weight / squareHeight);
    }

}