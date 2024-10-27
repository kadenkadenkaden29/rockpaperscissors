import java.util.Random;

public class GameLogic {
    private Random random;

    public GameLogic() {
        this.random = new Random();
    }

    public String getComputerMove() {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock"; // Default case, should never be reached
        }
    }

    public String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "It's a tie!";
        }

        switch (playerMove) {
            case "rock":
                return (computerMove.equals("scissors")) ? "You win!" : "You lose!";
            case "paper":
                return (computerMove.equals("rock")) ? "You win!" : "You lose!";
            case "scissors":
                return (computerMove.equals("paper")) ? "You win!" : "You lose!";
            default:
                return "Error: Invalid move"; // Should never be reached
        }
    }
}