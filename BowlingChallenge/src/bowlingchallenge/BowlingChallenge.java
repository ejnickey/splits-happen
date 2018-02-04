package bowlingchallenge;

/**
 *
 * @author Eric Nickey
 */
public class BowlingChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ScoreCalculator myCalc = new ScoreCalculator("XXXXXXXXXXXX");
        System.out.println("This is the score: " + myCalc.calcScore());
        
        ScoreCalculator myCalc2 = new ScoreCalculator("9-9-9-9-9-9-9-9-9-9-");
        System.out.println("This is the score2: " + myCalc2.calcScore());
        
        ScoreCalculator myCalc3 = new ScoreCalculator("5/5/5/5/5/5/5/5/5/5/5");
        System.out.println("This is the score3: " + myCalc3.calcScore());
        
        ScoreCalculator myCalc4 = new ScoreCalculator("X7/9-X-88/-6XXX81");
        System.out.println("This is the score4: " + myCalc4.calcScore());
        
    }
    
}
