package Daniel;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Church", "2021");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    // Print some text using parameters to greet the user
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    // Get the user's name
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    // Guess the user's age using a formula
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    // Use a loop to count up to a given number
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            // printf lets us use variables without concatenating. Don't forget it doesn't start a new line.
            // %d represents the first integer, \n is an escape character that starts a new line.
            System.out.printf("%d!\n", i);
        }
    }

    // Ask a question, and repeat until given the correct answer
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What programming language is this bot written in?");
        System.out.println("1. C#");
        System.out.println("2. Python");
        System.out.println("3. Java");
        System.out.println("4. Javascript");
        boolean quit = false;
        int answer;
        do { // Start input loop
            answer = scanner.nextInt();
            switch (answer) { // Check the user's answer. Anything other than 3, ask again.
                case 3:
                    quit = true; // Make sure we don't loop again if they got it right
                    break;
                default:
                    System.out.println("Please, try again.");
                    break;
            }
        } while (!quit);
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}