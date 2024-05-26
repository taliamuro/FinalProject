package org.talia;

public class Util {
    public static String toTitleCase(String strIn) {
        if (strIn == null) {
            return null;
        }
        if (strIn == "") {
            return strIn;
        }

        int spaceIdx = strIn.indexOf(' ');

        // title case first word
        String fWord = strIn.substring(0, spaceIdx);
        String fpart1 = fWord.substring(0, 1).toUpperCase();
        String fpart2 = fWord.substring(1).toLowerCase();
        fWord = fpart1 + fpart2;

        // title case last word
        String lWord = strIn.substring(spaceIdx + 1);
        String lpart1 = lWord.substring(0, 1).toUpperCase();
        String lpart2 = lWord.substring(1).toLowerCase();
        lWord = lpart1 + lpart2;
    return fWord + " " + lWord;
    }
}
