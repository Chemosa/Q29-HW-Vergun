package tms.lesson9;

import tms.lesson9.domain.User;
import tms.lesson9.exception.NumberOutOfBoundException;
import tms.lesson9.exception.ValidationException;
import tms.lesson9.services.GameService;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please, enter your name:");
        String name = userInput.next();

        System.out.println("Enter yor balance: ");
        int balance = userInput.nextInt();

        User user = new User(name, balance);
        var gameService = new GameService();
        System.out.println(user.getName() + ", welcome to \"Guess or Lose\" game! Your balance is " + user.getBalance() + ".");

        while (user.getBalance() > 0) {

            System.out.println("Please, enter your rate: ");
            int rate = userInput.nextInt();

            try {
                gameService.validate(rate, user);
            } catch (ValidationException validationException) {
                System.out.println(validationException.getValidateMessage());
                continue;
            }

            System.out.println("Please, enter number from 0 to 5 (to exit enter -1): ");
            int number = userInput.nextInt();

            if (number == -1) {
                System.out.println("You are exit the game.");
                break;
            }

            try {
                boolean result = gameService.play(number);
                gameService.change(user, rate, result);
            } catch (NumberOutOfBoundException numberOutOfBoundException) {
                System.out.println("Your number is out of range.");
                continue;
            }

            if (user.getBalance() == 0) {
                System.out.println("You don't have enough money. Game over!");
            }
        }















    }
}
