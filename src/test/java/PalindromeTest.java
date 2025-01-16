import org.example.PalindromeCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertFalse(PalindromeCheck.isPalindrome(45624));
        assertTrue(PalindromeCheck.isPalindrome(847010748));
    }

}
