package org.talia;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private ArrayList<Course> registeredCourses;
    private static int nextId = 0;


    // should these methods be static?
    public static boolean registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            return false;
        }
        registeredCourses.add(course);
            return true;
    }

    public static boolean dropCourse(Course course) {
        return false;
    }

    public void setStudentName(String studentName) {
        this.studentName = Util.toTitleCase(studentName);
    }

}
