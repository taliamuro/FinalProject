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
        if (strIn == null || strIn.isEmpty()) {
            return strIn;
        }

        String[] words = strIn.split(" ");
        StringBuilder titleCased = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                titleCased.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return titleCased.toString().trim();
    }
}
