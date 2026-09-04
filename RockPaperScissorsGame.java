import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        boolean playerWins = (playerMove.equalsIgnoreCase("Rock")
                && computerMove.equalsIgnoreCase("Scissors"))
                || (playerMove.equalsIgnoreCase("Paper")
                && computerMove.equalsIgnoreCase("Rock"))
                || (playerMove.equalsIgnoreCase("Scissors")
                && computerMove.equalsIgnoreCase("Paper"));
        return playerWins ? "Player Wins" : "Computer Wins";
    }

    private static String readMove(Scanner scanner) {
        while (true) {
            System.out.print("Choose Rock, Paper, or Scissors: ");
            String move = scanner.nextLine().trim();
            for (String validMove : MOVES) {
                if (validMove.equalsIgnoreCase(move)) {
                    return validMove;
                }
            }
            System.out.println("Invalid move. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int rounds = 5;
        String[][] results = new String[rounds][3];
        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("Rock-Paper-Scissors: " + rounds + " rounds");
        for (int i = 0; i < rounds; i++) {
            System.out.println("\nRound " + (i + 1));
            String playerMove = readMove(scanner);
            String computerMove = MOVES[random.nextInt(MOVES.length)];
            String outcome = playRound(playerMove, computerMove);

            results[i][0] = playerMove;
            results[i][1] = computerMove;
            results[i][2] = outcome;
            System.out.println("Computer chose " + computerMove + ". " + outcome);

            if (outcome.equals("Player Wins")) {
                wins++;
            } else if (outcome.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        System.out.println("\nFinal Summary");
        System.out.printf("%-7s %-15s %-17s %s%n", "Round", "Player Move", "Computer Move", "Result");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-7d %-15s %-17s %s%n", i + 1, results[i][0], results[i][1], results[i][2]);
        }
        double winPercentage = (wins * 100.0) / rounds;
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);
        scanner.close();
    }
}
