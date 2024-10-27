import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getMove() {
        System.out.print("Enter your move (rock, paper, scissors): ");
        String move = scanner.next().toLowerCase();

        while (!isValidMove(move)) {
            System.out.print("Invalid move. Please enter rock, paper, or scissors: ");
            move = scanner.next().toLowerCase();
        }

        return move;
    }

    private boolean isValidMove(String move) {
        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
    }
}