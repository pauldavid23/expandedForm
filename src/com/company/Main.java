package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number you want to see in expanded form: ");

            int num = scanner.nextInt();
            scanner.nextLine();

            int lastDigit = 0;
            int midDigit = 0;
            int firstDigit = 0;    //1452
            int lastxDigit = 0;

            if (num >= 1000) {
                firstDigit = num / 1000;
                System.out.println("1000" + " X " + firstDigit);

                num %= 1000;

                midDigit = num / 100;
                System.out.println("100" + " X " + midDigit);

                num%=100;

                lastDigit = num/10;
                System.out.println("10" + " X " + lastDigit);

                num%=10;

                switch (num) {
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                        System.out.print("1" + " X " + num);
                        break;
                }
            } else {
                midDigit = num / 100;
                System.out.println("100" + " X " + midDigit);

                num%=100;

                lastDigit = num/10;
                System.out.println("10" + " X " + lastDigit);

                num%=10;

                switch (num) {
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                        System.out.print("1" + " X " + num);
                        break;
                     }

            }

        }

    }
