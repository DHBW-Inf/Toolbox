package de.codingUtils.typeExtension;

public class StringExtensions {
    public static String removeANSICodes(String text) {
        // From: https://stackoverflow.com/a/64677848
        return text.replaceAll("(\\x9B|\\x1B\\[)[0-?]*[ -\\/]*[@-~]", "");
    }
}
