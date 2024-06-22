import java.util.Random;
import java.util.Scanner;

class randomNumberGame{

    static int matchNumber(int target, int value){
        if(value <= target + 20 && value > target){
                System.out.println("HIGH");
                return -1;
        }
        else if(value > target + 20){
                System.out.println(" TOO HIGH");
                return -1;
        }
        else if(value >= target - 20 && value < target){
                System.out.println("LOW");
                return -1;
        }
        else if(value < target - 20){
                System.out.println("TOO LOW");
                return -1;
        }
        else{
            System.out.println("CORRECT");
            return 0;
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("RANDOM NUMBER GAME");
        System.out.println("--------------------------------------");
        System.out.println("PLAY ? Y/N :");
        char choice = sc.next().charAt(0);

        while(choice == 'y' || choice == 'Y'){
        int randomNumber = rand.nextInt(100);
        int target = randomNumber + 1;
        System.out.println("Random number generated between 1 and 100");
        int guess = 1;
        int guessRemaining = 6;
        int flag = 0;
        while(guess <= 6){
            System.out.println("Enter Guess " + guess + " : Guesses Remaining : " + guessRemaining);
            int playerGuess = sc.nextInt();
            if(matchNumber(target,playerGuess) == 0){
                System.out.println("YOU WIN");
                flag = 1;
                break;
            }
            guess++;
            guessRemaining--;
        }
        if(flag == 0){
            System.out.println("YOU LOSE");
        }
        System.out.println("The Target number is " + target);

        System.out.println("PLAY AGAIN ? Y/N : ");
        choice = sc.next().charAt(0);
        System.out.println("RANDOM NUMBER GAME");
        System.out.println("--------------------------------------");
        }

    }


}