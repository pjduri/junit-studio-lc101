package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAroundWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(("[word]")));
    }

    @Test
    public void closingBracketMissing() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("[word")));
    }

    @Test
    public void openingBracketMissing() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("word]")));
    }

    @Test
    public void noBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(("")));
    }

    @Test
    public void multipleBracketReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[word]]"));
    }

    @Test
    public void bracketsWithinWordReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("w[ord]"));
    }

    @Test
    public void multipleWordsWithBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a str[ing of wor]ds"));
    }

    @Test
    public void closingBracketBeforeOpeningBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]word["));
    }

    @Test
    public void moreClosingBracketsThanOpeningBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word]]"));
    }

    @Test
    public void containsCurlyBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{word]"));
    }

    @Test
    public void moreOpeningThanClosing() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[word]"));
    }

}
