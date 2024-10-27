import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner);
        GameLogic gameLogic = new GameLogic();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        boolean playAgain = true;

        while (playAgain) {
            String playerMove = player.getMove();
            String computerMove = gameLogic.getComputerMove();
            System.out.println("Computer chose: " + computerMove);

            String result = gameLogic.determineWinner(playerMove, computerMove);
            System.out.println(result);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}