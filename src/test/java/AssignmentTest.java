import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.talia.Assignment;
import org.talia.Main;

import java.util.ArrayList;

public class AssignmentTest {
    @Test
    public void calcAssignmentAvg1() {
        int[] nums1 = {60, 70, 80, 90};
        int expectedResult = 75;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void calcAssignmentAvg2() {
        int[] nums1 = {82, 84, 89, 90, 60};
        int expectedResult = 81;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void calcAssignmentAvg3() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void calcAssignmentAvg4() {
        int[] nums1 = {0, 70, 80, 90};
        int expectedResult = 60;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void calcAssignmentAvg5() {
        int[] nums1 = null;
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void calcAssignmentAvg6() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }
}
