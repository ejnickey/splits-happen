package bowlingchallenge;

/**
 *
 * @author Eric Nickey
 */
public class ScoreCalculator {
    
    private static final int FRAMES = 10;
    
    private String gameScores;
    
    public ScoreCalculator(String scores) {
        gameScores = scores;
        
    }
    
    public int calcScore() {
        
        int frameCounter = 0;
        int totalScore = 0;
        
        int[] scoreArray = parseScores(gameScores);
        
        for (int i = 0; i < FRAMES; i++) {
           
            if (scoreArray[frameCounter] == 10) {
                totalScore += 10 + scoreArray[frameCounter+1] + scoreArray[frameCounter+2];
                frameCounter++;
            } else if (scoreArray[frameCounter] + scoreArray[frameCounter+1] == 10) {
                totalScore += 10 + scoreArray[frameCounter+2];
                frameCounter+=2;
            } else {
                totalScore += scoreArray[frameCounter] + scoreArray[frameCounter+1];
                frameCounter+=2;
            }
            
        }
        
        return totalScore;
    }
      
    public int[] parseScores(String scores) {
        
        int[] intScoreArray = new int[scores.length()];
        int frameCounter = 0;
        
        for (int i = 0; i < scores.length(); i++) {
            String currScore = String.valueOf(scores.charAt(i));
            
            if (currScore.equals("X")) {
                intScoreArray[frameCounter] = 10;
                frameCounter++;
            } else if (currScore.equals("/")) {
                int prevScore = intScoreArray[frameCounter - 1];
                int newScore =  10 - prevScore;
                intScoreArray[frameCounter] = newScore;
                frameCounter++;
            } else if (currScore.equals("-")) {
                intScoreArray[frameCounter] = 0;
                frameCounter++;
            } else {
                intScoreArray[frameCounter] = Integer.parseInt(currScore);
                frameCounter++;
            }
                
        }
        
        return intScoreArray;
    }
}
