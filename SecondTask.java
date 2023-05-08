package mySelf;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        // Taking Three digit number from user and split digits.
        Scanner print = new Scanner(System.in);
        System.out.println("Enter Three Digit Number ");
        int number = print.nextInt();
        int [] arr = new int[3];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = number % 10;
            number /= 10;
        }

        // Sum of digit
        int sum = 0;
        for (int i = 0; i <3;i++){
            sum += arr[i];
        }

        System.out.println("Digits: " + arr[2] + " " + arr[1] + " " + arr[0]);
        System.out.println("sum = " + sum);
    }



}

