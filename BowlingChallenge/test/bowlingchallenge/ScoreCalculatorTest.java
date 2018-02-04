package bowlingchallenge;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eric Nickey
 */
public class ScoreCalculatorTest {

    /**
     * Test of calcScore method, of class ScoreCalculator.
     */
    @Test
    public void testCalcScore() {
        System.out.println("calcScore");
        
        ScoreCalculator myScoreCalc1 = new ScoreCalculator("XXXXXXXXXXXX");
        int expResult1 = 300;
        int result1 = myScoreCalc1.calcScore();
        assertEquals(expResult1, result1);
        
        ScoreCalculator myScoreCalc2 = new ScoreCalculator("9-9-9-9-9-9-9-9-9-9-");
        int expResult2 = 90;
        int result2 = myScoreCalc2.calcScore();
        assertEquals(expResult2, result2);
        
        ScoreCalculator myScoreCalc3 = new ScoreCalculator("5/5/5/5/5/5/5/5/5/5/5");
        int expResult3 = 150;
        int result3 = myScoreCalc3.calcScore();
        assertEquals(expResult3, result3);
        
        ScoreCalculator myScoreCalc4 = new ScoreCalculator("X7/9-X-88/-6XXX81");
        int expResult4 = 167;
        int result4 = myScoreCalc4.calcScore();
        assertEquals(expResult4, result4);
        
    }
    
}
