package de.codingUtils.typeExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.codingUtils.io.ConsoleANSICode;

public class StringExtensionsTest {
    @Test
    void testRemoveANSICodes() {
        String visible = "abc";
        String str = ConsoleANSICode.FG_BLACK + visible + ConsoleANSICode.COLOR_OFF;

        assertEquals(visible, StringExtensions.removeANSICodes(str));
    }
}
