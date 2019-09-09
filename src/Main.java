import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int numRemainder = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int totalSum = 0;
        int totalSum2 = 0;


        //1. Write a program that prints the numbers 1-10.

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();

        //2. Write a program that prints the numbers 1-10 backwards.

        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();


        //3. Write a program that prints all the odd numbers from 1-20.

        for (int i = 1; i<=20; i++){
            numRemainder = i % 2;

            if (numRemainder != 0) {
                System.out.println(i);
            }

        }


        System.out.println();
        System.out.println();



        //4. Write a program that prints all the even numbers from 1-20.

        for (int i = 1; i<=20; i++){
            numRemainder = i % 2;

            if (numRemainder == 0) {
                System.out.println(i);
            }

        }


        System.out.println();
        System.out.println();


        //5. Have the user input a number and print all numbers from that input value to 1.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an positive integer:  ");
        System.out.println();
        num1 = input.nextInt();
        System.out.println();

        for (int i = num1; i>=1; i--){



                System.out.println(i);


        }


        System.out.println();
        System.out.println();


        //6. Sum all values from 1-10.

        for(int i = 1; i <= 10; i++) {

            totalSum = totalSum + i;
            //System.out.println(i);
        }

        System.out.println("The sum of the integers 1 through 10 is " + totalSum);

        System.out.println();
        System.out.println();


        //7. Have the user enter a number and print the sum of all numbers from that inputted value to 1.


        System.out.println("Enter an positive integer:  ");
        System.out.println();
        num3 = input.nextInt();
        System.out.println();

        for(int i = num3; i >= 1; i--) {

            totalSum2 = totalSum2 + i;
            //System.out.println(i);
        }

        System.out.println("The sum of the integers " + num3 + " through 1 is " + totalSum2);

        System.out.println();
        System.out.println();




        //8. Write loops to print the following:


        /*i)

**********
**********
**********
**********

        ii)

*
**
***
****
*****

        iii)

        *
       **
      ***
     ****
    *****/



            // Part i:

        for(int j = 1; j <= 4; j++) {
            System.out.println();
            for (int i = 1; i <= 10; i++) {

                System.out.print("*");
                //System.out.println(i);
            }

        }



        System.out.println();
        System.out.println();


            // Part ii:

        for(int j = 1; j <= 5; j++) {
            System.out.println();
            for (int i = 1; i <= 5; i++) {

                if (i <= j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }

        }

        System.out.println();
        System.out.println();


        // Part iii:

        for(int j = 5; j >= 1; j--) {
            System.out.println();
            for (int i = 1; i <= 5; i++) {

                if (i < j) {
                    System.out.print(" ");
                }
                else if (i >= j) {
                    System.out.print("*");
                }


            }

        }

        System.out.println();
        System.out.println();




    }
}
