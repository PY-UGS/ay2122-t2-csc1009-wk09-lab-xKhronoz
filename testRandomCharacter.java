import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.regex.*;  

public class testRandomCharacter {
    private RandomCharacter rc;
    Pattern p; 

    @Before 
    public void setUp(){
        rc = new RandomCharacter();
    }
    
    @Test 
    public final void testGetRandomLowerCaseLetter(){
        assertTrue(  Pattern.matches("[a-z]",Character.toString(rc.getRandomLowerCaseLetter())));
    }

    @Test 
    public final void testGetRandomUpperCaseLetter(){
        assertTrue(Pattern.matches("[A-Z]",Character.toString( rc.getRandomUpperCaseLetter())));
    }

    @Test 
    public final void testGetRandomDigitCharacter(){
        assertTrue(Pattern.matches("[0-9]", Character.toString(rc.getRandomDigitCharacter())));
    }
    @Test 
    public final void testGetRandomCharacter(){
        assertTrue(Pattern.matches("[0-9a-zA-Z]", Character.toString(rc.getRandomDigitCharacter())));
    }

    @Test
    public final void testIsPrime(){
        assertTrue(rc.isPrime(13));
        assertFalse(rc.isPrime(95));
    }
}
