package junit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void equalityExamples() {

    }

    @Test
    public void assertThatAndAssertEqualsExample() {

    }

    @Test
    public void findsSpecialNumbers() {
        assertTrue(Code.isSpecial(0));
        assertTrue(Code.isSpecial(1));
        assertTrue(Code.isSpecial(2));
        assertTrue(Code.isSpecial(3));
        assertFalse(Code.isSpecial(4));

        assertTrue(Code.isSpecial(11));
        assertFalse(Code.isSpecial(15));

        assertTrue(Code.isSpecial(36));
        assertFalse(Code.isSpecial(37));
    }

    @Test
    public void findsLongestStreak() {
        assertThat(Code.longestStreak(""), is(0));

        assertThat(Code.longestStreak("a"), is(1));

        assertThat(Code.longestStreak("abc"), is(1));

        assertThat(Code.longestStreak("abbb"), is(3));

        assertThat(Code.longestStreak("abbcccaaaad"), is(4));
    }

    @Test
    public void findsModeFromCharactersInString() {

        assertThat(Code.mode(null), is(nullValue()));

        assertThat(Code.mode(""), is(nullValue()));

        assertThat(Code.mode("abcb"), is('b'));

        assertThat(Code.mode("cbbc"), is('c'));
    }

    @Test
    public void findsCharacterCountInString() {
        assertThat(Code.getCharacterCount("cbbc", 'b'), is(2));
        assertThat(Code.getCharacterCount("cbbc", 't'), is(0));
    }

    @Test
    public void removesDuplicates() {
        assertThat(Code.removeDuplicates(arrayOf(1, 1)), is(arrayOf(1)));

        assertThat(Code.removeDuplicates(arrayOf(1, 2, 1, 2)), is(arrayOf(1, 2)));

        assertThat(Code.removeDuplicates(arrayOf(1, 2, 3)), is(arrayOf(1, 2, 3)));
    }

    @Test
    public void sumsIgnoringDuplicates() {
        assertThat(Code.sumIgnoringDuplicates(arrayOf(1, 1)), is(1));

        assertThat(Code.sumIgnoringDuplicates(arrayOf(1, 2, 1, 2)), is(3));

        assertThat(Code.sumIgnoringDuplicates(arrayOf(1, 2, 3)), is(6));
    }

    private int[] arrayOf(int... numbers) {
        return numbers;
    }

}
