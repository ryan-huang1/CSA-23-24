package sports;

import java.util.Scanner;
import java.util.Random;

public class BasketballGameTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Team #1 Name: ");
        String team1Name = scanner.nextLine();

        System.out.print("Enter Team #2 Name: ");
        String team2Name = scanner.nextLine();

        System.out.print("Enter max score: ");
        int maxScore = scanner.nextInt();

        BasketballGame game = new BasketballGame(team1Name, team2Name);

        while (game.getStatus().equals("In-Progress")) {
            int pointsTeam1 = random.nextInt(4); // Random points 0-3
            int pointsTeam2 = random.nextInt(4); // Random points 0-3

            if (pointsTeam1 > 0) {
                game.recordTeamPoint(pointsTeam1, 1);
            }
            if (pointsTeam2 > 0) {
                game.recordTeamPoint(pointsTeam2, 2);
            }

            System.out.println("Random # for " + team1Name + ": " + pointsTeam1 + " for " + team2Name + ": " + pointsTeam2);
            System.out.println(game.getScore() + "; " + game.getWinningTeam() + " is winning");

            // Check if the max score has been reached by either team to end the game
            if (game.getTeam1Score() >= maxScore || game.getTeam2Score() >= maxScore) {
                System.out.println(game.getScore() + "; " + game.getWinningTeam() + " is winner");
                break;
            }

        }

        scanner.close();
    }
}
