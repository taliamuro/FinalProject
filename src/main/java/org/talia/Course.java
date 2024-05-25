package org.talia;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@EqualsAndHashCode
@Getter
@Setter
public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> registeredStudents;
    private ArrayList<Double> finalScores;
    static int nextId;

    public void setCourseName(String courseName) {
        this.courseName = Util.toTitleCase(courseName);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course ID: ").append(courseId).append(", Course Name: ").append(courseName).append(", Department: ")
                .append(department.getDepartmentName()).append("\n");
        sb.append("Registered Students:\n");
        for (Student student : registeredStudents) {
            sb.append(student.toSimplifiedString()).append("\n");
        }

        return sb.toString();
    }
}
