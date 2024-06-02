import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber;
        int guess;
        boolean correct = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the secret number: ");
        secretNumber = scanner.nextInt();

        while (!correct){
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            if  (guess == secretNumber){
                correct = true;
                System.out.println("you r right");
            }else if (guess< secretNumber) {
                System.out.println("your guess is smaller");

            }else if (guess > secretNumber) {
                System.out.println(" your guess is higher");

            }
        }
    }
}