package product_management;

public class Test {

    public static String getScore(String player1Name, String player2Name, int scroe1, int m_score2) {
        String score = "";
        int tempScore = 0;
        if (scroe1 == m_score2) {
            switch (scroe1) {
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
            boolean check1 = scroe1 >= 4;

            boolean check2 = m_score2 >= 4;

            if (check1 || check2) {

                score = extractMethod1(scroe1, m_score2);

            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = scroe1;
                    else {
                        score += "-";
                        tempScore = m_score2;
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

    public static String extractMethod1(int scroe1, int m_score2) {
        String score;
        int minusResult = scroe1 - m_score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }


}
