package tms.lesson9.services;

import tms.lesson9.domain.User;
import tms.lesson9.exception.NumberOutOfBoundException;
import tms.lesson9.exception.ValidationException;

import java.util.Random;

public class GameService {

    public void validate(int rate, User user) {
        if (rate > user.getBalance()) {
            throw new ValidationException("You have not enough money on balance! Reduce your rate. ");
        }

        int maxRate = 100;
        if (rate > maxRate) {
            throw new ValidationException("Your rate is more then allowed: " + maxRate);
            }
    }


    public boolean play(int number) {
        if (number < -1 || number > 5) {
            throw new NumberOutOfBoundException();
        }

        Random random = new Random();
        int randomNumb = random.nextInt(6);

        if (number == randomNumb) {
            return true;
        } else return false;
    }


    public void change(User user, int rate, boolean play) {
        if (play == false) {
            user.setBalance(user.getBalance() - rate);
            System.out.println("You lose. Now your balance is " + user.getBalance());
        } else {
            user.setBalance(user.getBalance() + rate);
            System.out.println(user.getName() + " win! Now your balance is " + user.getBalance());
        }
    }
}

