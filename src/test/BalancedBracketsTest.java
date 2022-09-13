package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void textAfterBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void textBeforeAndInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void textInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void oneBracketBeforeTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketBetweenTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void insideOutBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void doubleBracketsWithOneInsideOutReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void doubleAndOneSingleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void orphanClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[l[l][]]][k]"));
    }

}
