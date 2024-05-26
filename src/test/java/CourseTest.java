import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.talia.*;

import java.util.ArrayList;

public class CourseTest {
    @Before
    public void setUp() {
        Department department = new Department("Computer Science");
        Course course = new Course("C1", "Programming", department);

        ArrayList<Course> registeredCourses1 = new ArrayList<>();
        ArrayList<Course> registeredCourses2 = new ArrayList<>();
        ArrayList<Course> registeredCourses3 = new ArrayList<>();

        Address address1 = new Address(9070, "Laverdiere", "Montreal", "Quebec", "H1R2E9", "Canada");
        Address address2 = new Address(9080, "Robert", "Toronto", "Ontario", "H1R 2E9", "Canada");

        Assignment assignment1 = new Assignment("Assignment 1", 0.70, 80);
        Assignment assignment2 = new Assignment("Assignment 2", 0.30, 90);

        course.addAssignment("Assignment 1", 0.70, 80);
        course.addAssignment("Assignment 2", 0.30, 90);

        Student student1 = new Student("S1", "Peter", Gender.MALE, address1, department, registeredCourses1);
        Student student2 = new Student("S1", "Peter", Gender.MALE, address1, department, registeredCourses2);
        Student student3 = new Student("S1", "Peter", Gender.MALE, address1, department, registeredCourses3);

        course.registerStudent(student1);
        course.registerStudent(student2);
        course.registerStudent(student3);

        assignment1.setScore(1, 80);
        assignment1.setScore(2, 85);
        assignment1.setScore(3, 90);

        assignment2.setScore(1, 90);
        assignment2.setScore(2, 95);
        assignment2.setScore(3, 70);
    }

    @Test
    public void testIsAssignmentWeightValid1() {
        int[] expectedResult = {85, 90, 80};
        int result = Course.calcStudentsAverage();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid2() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid3() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid4() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid5() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid6() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid7() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid8() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid9() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid10() {
        int[] nums1 = {};
        int expectedResult = 0;
        int result = Assignment.calcAssignmentAvg(nums1);

        Assertions.assertEquals(expectedResult, result);
    }
}
