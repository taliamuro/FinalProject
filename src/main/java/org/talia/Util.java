package org.talia;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Util {
    public static String toTitleCase(String strIn) {
        int spaceIdx = strIn.indexOf(" ");
        String fWord = strIn.substring(0,spaceIdx);
        String lWord = strIn.substring(spaceIdx + 1);
        fWord = fWord.substring(0, 1).toUpperCase();
        lWord = lWord.substring(0, 1);
        return fWord + " " + lWord;
    }
}
