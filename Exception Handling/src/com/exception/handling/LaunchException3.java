package com.exception.handling;

import java.util.Scanner;

public class LaunchException3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" Welcome to Division Performing Application:");

            System.out.println("Enter the Fist Number to Divide:");
            int a = scanner.nextInt();
            System.out.println("Enter the Second Number:");
            int b = scanner.nextInt();
            int res = a / b;
            System.out.println("Result=" + res);
        } catch (ArithmeticException e) {
            System.out.println("Oye Bro? Please Enter the Non Zero Second Number: ");
        }
        try {
            System.out.println("Please enter the Size of Array:");
            int size = scanner.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the Element to be Added in Array:");
            int ele = scanner.nextInt();
            System.out.println("Enter the Position at which element to be inserted");
            int pos = scanner.nextInt();

            arr[pos] = ele;
            System.out.println(arr[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Man? Be in Your Limits:");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ohhh Am I Joke? Please Be Positive.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Please enter the Proper Input:");
        }
    }
}
