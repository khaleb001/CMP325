import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeCheckTest {
    @Test
    public void testpalindrome(){
        assertTrue(PalindromeCheck.isPalindrome("racecar"));
        assertTrue(PalindromeCheck.isPalindrome("madam"));
    }
    @Test
    public void testNonPalindrome(){
        assertFalse(PalindromeCheck.isPalindrome("hello"));
        assertFalse(PalindromeCheck.isPalindrome("world"));
    }
    @Test
    public void testEmptyString(){
        assertTrue(PalindromeCheck.ispalindrome(""));
    }
}