import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.talia.Address;

public class AddressTest {
    @Test
    public void testIsPostalCodeValid1() {
        String str = "H1R2E9";

        Assertions.assertTrue(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid2() {
        String str = "H1R 2E9";

        Assertions.assertTrue(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid3() {
        String str = "H1R 2E9";

        Assertions.assertTrue(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid4() {
        String str = "h1R2e9";

        Assertions.assertTrue(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid5() {
        String str = "h1R 2e9";

        Assertions.assertTrue(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid7() {
        String str = "null";

        Assertions.assertFalse(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid8() {
        String str = "";

        Assertions.assertFalse(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid9() {
        String str = "H1R-2E9";

        Assertions.assertFalse(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid10() {
        String str = "h1R-2e9";

        Assertions.assertFalse(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid11() {
        String str = "H1R 2E";

        Assertions.assertFalse(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid12() {
        String str = "123456";

        Assertions.assertFalse(Address.isPostalCodeValid(str));
    }

    @Test
    public void testIsPostalCodeValid13() {
        String str = "abcdef";

        Assertions.assertFalse(Address.isPostalCodeValid(str));
    }
}
