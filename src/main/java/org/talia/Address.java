package org.talia;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public Address(int streetNo, String street, String city, String province, String postalCode, String country) {
        if (isPostalCodeValid(postalCode)) {
            this.streetNo = streetNo;
            this.street = street;
            this.city = city;
            this.province = province;
            this.postalCode = postalCode;
            this.country = country;
        } else {
            this.streetNo = 0;
            this.street = null;
            this.city = null;
            this.province = null;
            this.postalCode = null;
            this.country = null;
        }
    }

    public static boolean isPostalCodeValid(String postalCode) {
        if (postalCode.length() == 6) {
            return isValid6(postalCode);
        } else if (postalCode.length() == 7) {
            return isValid7(postalCode);
        }
        return false;
    }

    public static boolean isValid6(String postalCode) {
        return Character.isLetter(postalCode.charAt(0)) &&
                Character.isDigit(postalCode.charAt(1)) &&
                Character.isLetter(postalCode.charAt(2)) &&
                Character.isDigit(postalCode.charAt(3)) &&
                Character.isLetter(postalCode.charAt(4)) &&
                Character.isDigit(postalCode.charAt(5));
    }

    public static boolean isValid7(String postalCode) {
        return Character.isLetter(postalCode.charAt(0)) &&
                Character.isDigit(postalCode.charAt(1)) &&
                Character.isLetter(postalCode.charAt(2)) &&
                postalCode.charAt(3) == ' ' &&
                Character.isDigit(postalCode.charAt(4)) &&
                Character.isLetter(postalCode.charAt(5)) &&
                Character.isDigit(postalCode.charAt(6));
    }
}
