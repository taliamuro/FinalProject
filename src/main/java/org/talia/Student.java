package org.talia;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    @Getter
    private ArrayList<Course> registeredCourses;
    private static int nextId = 1;

    public Student(String studentId, String studentName, Gender gender, Address address, Department department,
                   ArrayList<Course> registeredCourses) {
        this.studentId = "S" + nextId++;
        this.studentName = Util.toTitleCase(studentName);
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.registeredCourses = new ArrayList<>();
    }

    /**
     * Adds course to student's registeredCourses list, adds student to the course's registeredStudents list,
     * appends a null for the scores of each assignment of the course.
     * @param course the input course
     * @return true if the course is not registered
     */
    public boolean registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            return false;
        }
        registeredCourses.add(course);

        if (!course.getRegisteredStudents().contains(this)) {
            course.getRegisteredStudents().add(this);
        }

        ArrayList<Integer> scores = new ArrayList<>();

        for (Assignment assignment : course.getAssignments()) {
            assignment.getScores().add(null);
        }

        return true;
    }

    /**
     * Removes the course from the student's registeredCourses list, and removes the student from the course's
     * registeredStudents list
     * @param course the input course
     * @return true if the course is registered
     */
    public boolean dropCourse(Course course) {
        if (!registeredCourses.contains(course)) {
            return false;
        }

        registeredCourses.remove(course);
        course.getRegisteredStudents().remove(this);

        return true;
    }

    public void setStudentName(String studentName) {
        this.studentName = Util.toTitleCase(studentName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", department=" + department +
                ", registeredCourses=" + registeredCourses +
                '}';
    }

    public String toSimplifiedString2() {
        return "Student ID: " + studentId + ", Student Name: " + studentName + ", Department: " + department.getDepartmentName();
    }
}
