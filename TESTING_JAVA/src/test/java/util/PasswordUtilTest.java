package util;

import org.junit.Test;

import static org.junit.Assert.*;
import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {
    @Test
    public void weakWhenHasLessThan8Letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("123456"));
    }
    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void mediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void strongWhenHasLettersAndNumbersAndSymbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }
}