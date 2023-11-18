import java.util.Scanner;
import java.util.Random;

public class TASK1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (true) {
            int attempts=0;
            System.out.println("Select the range within which you want to play the Number Game");
            System.out.println("Lower Limit");
            int minValue = scanner.nextInt();
            System.out.println("Upper Limit");
            int maxValue = scanner.nextInt();
            
            System.out.println("The maximum number of attempts provided: 10" );
            int generatedNumber = random.nextInt(maxValue - minValue + 1) + minValue;

            System.out.println("Guess the number between " + minValue + " and " + maxValue);

            while (true) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                } else if (userGuess > generatedNumber) {
                    System.out.println("Your guess is too high.\n---TRY AGAIN---");
                } else {
                    System.out.println("Your guess is too low.\n---TRY AGAIN---");
                }

                if (attempts == 10) {
                    System.out.println("You have reached the maximum number of attempts. The correct number was " + generatedNumber + ".");
                    break;
                }
            }

            System.out.println("Your score is: " + score+"\nNumber of attempts: "+attempts);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
               
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("\t---Thank you for playing! Have a great day!---");
                break;
            }
            }
            scanner.close();
        }
 }
