import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.regex.*;  
import java.lang.Math;

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


    public boolean isPrime(char value){
        int a = value;

        int numbers = (int)Math.sqrt(a);

        for (int i = 2; i< numbers ; i++ ){
            if (a % i == 0 ){
                return true;
            }
        }

        return false;
    }

    @Test 
    public final void testGetRandomLowerCaseLetterisPrime(){
        assertTrue(  Pattern.matches("[a-z]",Character.toString(rc.getRandomLowerCaseLetter())));
    }

    @Test 
    public final void testGetRandomUpperCaseLetterisPrime(){
        assertTrue(Pattern.matches("[A-Z]",Character.toString( rc.getRandomUpperCaseLetter())));
    }

    @Test 
    public final void testGetRandomDigitCharacterisPrime(){
        assertTrue(Pattern.matches("[0-9]", Character.toString(rc.getRandomDigitCharacter())));
    }
    @Test 
    public final void testGetRandomCharacterisPrime(){
        assertTrue(Pattern.matches("[0-9a-zA-Z]", Character.toString(rc.getRandomDigitCharacter())));
    }
}
