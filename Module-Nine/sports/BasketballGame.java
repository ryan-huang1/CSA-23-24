package sports;

public class BasketballGame {
    private String team1Name;
    private int team1Score;
    private String team2Name;
    private int team2Score;
    private boolean isGameInProgress;

    public BasketballGame(String team1Name, String team2Name) {
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team1Score = 0;
        this.team2Score = 0;
        this.isGameInProgress = true;
    }

    public void recordTeamPoint(int points, int teamNumber) {
        if (teamNumber == 1) {
            team1Score += points;
        } else if (teamNumber == 2) {
            team2Score += points;
        }
        checkGameStatus();
    }

    // Getters for team scores
    public int getTeam1Score() {
        return team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void onePoint(int teamNumber) {
        recordTeamPoint(1, teamNumber);
    }

    public void twoPoints(int teamNumber) {
        recordTeamPoint(2, teamNumber);
    }

    public void threePoints(int teamNumber) {
        recordTeamPoint(3, teamNumber);
    }

    public String getStatus() {
        if (isGameInProgress) {
            return "In-Progress";
        } else {
            return "Finished";
        }
    }

    public String getScore() {
        return team1Name + " " + team1Score + ", " + team2Name + " " + team2Score;
    }

    public String getWinningTeam() {
        if (team1Score > team2Score) {
            return team1Name;
        } else if (team2Score > team1Score) {
            return team2Name;
        } else {
            return "Teams are tied";
        }
    }

    private void checkGameStatus() {
        // assuming maxScore is a variable representing the max score to end the game
        int maxScore = Math.max(team1Score, team2Score);
        if (team1Score >= maxScore || team2Score >= maxScore) {
            isGameInProgress = false;
        }
    }
}
