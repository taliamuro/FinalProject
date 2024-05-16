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
        return false;
    }

    public static boolean dropCourse(Course course) {
        return false;
    }

}
