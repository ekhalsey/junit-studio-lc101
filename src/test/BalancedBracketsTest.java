package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void equalNumberOfOpenAndCloseBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void oddNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }

    @Test
    public void firstCharacterClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void ignoreNonBracketCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void ignoresCurlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{{[[LaunchCode]]}}"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{"));

    }

    @Test
    public void ignoresNumbersInStrings() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[La123unchCode]]"));
    }

    @Test
    public void stringHasNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));

    }

    @Test
    public void ignoresSpecialCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[L@unch$%^&C*de]]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void ignoresSpaces(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch  Code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("L  aunchCode]]"));

    }
}
