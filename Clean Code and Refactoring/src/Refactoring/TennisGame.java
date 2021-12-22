package Refactoring;

public class TennisGame {

    public static String getScore(String firstName, String secondName, int firstScore, int secondScore) {
        String score = "";
        int tempScore = 0;
        boolean compareScore = firstScore == secondScore;
        if (compareScore) {
            switch (firstScore) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean isOneOfScoreMoreThan4 = firstScore >= 4 || secondScore >= 4;
            if (isOneOfScoreMoreThan4) {
                int minusResult = firstScore - secondScore;
                boolean isFirstScoreAdvantage = minusResult == 1;
                if (isFirstScoreAdvantage) score = "Advantage player1";
                else {
                    boolean isSecondScoreAdvantage = minusResult == -1;
                    if (isSecondScoreAdvantage) score = "Advantage player2";
                    else {
                        boolean isFirstScoreWin = minusResult >= 2;
                        if (isFirstScoreWin) score = "Win for player1";
                        else score = "Win for player2";
                    }
                }
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = firstScore;
                    else {
                        score += "-";
                        tempScore = secondScore;
                    }
                    switch (tempScore) {
                        case 0:
                            score += "Love";
                            break;
                        case 1:
                            score += "Fifteen";
                            break;
                        case 2:
                            score += "Thirty";
                            break;
                        case 3:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}
