package azheng;
import java.util.Scanner;
import java.lang.Math;
public class azhengLib
{
    public static void guessGameObj1() {
        int number = (int) (10.0 * Math.random());
        System.out.println("Type in your name");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        int guessedNum = 0;
        while (guessedNum != number) {
            System.out.println("Guess a number");
            Scanner searchNum = new Scanner(System.in);
            guessedNum = searchNum.nextInt();
        }
        if (guessedNum == number) {
            System.out.println(username + ", you guessed the number!");
        }
    }



    public static void guessGameUserGuess_Obj2() {
        int number = (int) (10.0 * Math.random());
        System.out.println("Type in your name");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        int guessedNum = 0;
        while (guessedNum != number) {

            System.out.println("Guess a number");
            Scanner searchNum = new Scanner(System.in);
            guessedNum = searchNum.nextInt();
            if (guessedNum < number) {
                System.out.println("The number is greater than what you guessed");
            } else {
                if (guessedNum > number) {
                    System.out.println("The number is less than what you guessed");
                }
            }
        }
        if (guessedNum == number) {
            System.out.println(username + ", you guessed the number!");
        }
    }


    public static void guessGameObj2() {
        int range = 100;
        int half = range / 2;
        int highHalf = range - half;
        System.out.println("Pick a number from 1-" + range + ", i will guess. You just tell whether it is correct(type y) or greater(type g) or less than (type l)");
        System.out.println("type in your name");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        System.out.println(username + ", is      " + half + "     greater than, less than, or equal to your number?");
        Scanner answer = new Scanner((System.in));
        String ans = answer.nextLine();
        while (!ans.equals("y"))
        {
            if (ans.equals("g"))
            {
                half = highHalf/2;
                System.out.println(username + ", is      " + half + "     greater than, less than, or equal to your number?");
            }
            else
            {
                if (ans.equals("l"))
                {
                    half = half/2;
                    System.out.println(username + ", is      " + half + "     greater than, less than, or equal to your number?");
                }
            }
        }
        if (ans.equals("y"))
        {
            System.out.println(username + " I got your number!");
        }
    }


}