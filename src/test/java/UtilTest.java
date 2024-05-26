import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.talia.Util;

public class UtilTest {
    @Test
    public void testToTitleCase1() {
        String str = "hello sailor";
        String expectedResult = "Hello Sailor";
        String result = Util.toTitleCase(str);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testToTitleCase2() {
        String str = "Hello Sailor";
        String expectedResult = "Hello Sailor";
        String result = Util.toTitleCase(str);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testToTitleCase3() {
        String str = "hELLO sAILOR";
        String expectedResult = "Hello Sailor";
        String result = Util.toTitleCase(str);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testToTitleCase4() {
        String str = "hElLo SaIlOr";
        String expectedResult = "Hello Sailor";
        String result = Util.toTitleCase(str);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testToTitleCase5() {
        String str = null;
        String expectedResult = null;
        String result = null;

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testToTitleCase6() {
        String str = "";
        String expectedResult = "";
        String result = Util.toTitleCase(str);

        Assertions.assertEquals(expectedResult, result);
    }
}
