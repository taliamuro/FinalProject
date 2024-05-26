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
    @Getter
    private ArrayList<Student> registeredStudents;
    private ArrayList<Double> finalScores;
    static int nextId;


    /**
     * Checks if the sum of weights of all assignments of that course equals to 1 (100%)
     * @return true if the course equals to 1
     */
    public boolean isAssignmentWeightValid() {
        double sum = 0.0;
        for (Assignment assignment : assignments) {
            sum+= assignment.getWeight();
        }

        return Math.abs(sum - 1.0) < 0.0001;
    }

    /**
     * adds a student to the student list of the course, and adds a new null element to each assignment of this course,
     * and add a new null element for the finalScore
     * @param student the input student
     * @return true if course does not contain student
     */
    public boolean registerStudent(Student student) {
        if (registeredStudents.contains(student)) {
            return false;
        }

        registeredStudents.add(student);

        for (Assignment assignment : assignments) {
            assignment.getScores().add(null);
        }

        finalScores.add(null);

        return true;
    }

    /**
     * Calculates the weighted average score of a student
     * @return the weighted average score of a student
     */
    public int[] calcStudentsAverage() {
        int[] studentsAverage = new int[registeredStudents.size()];

        for (int i = 0; i < registeredStudents.size(); i++) {
            Student student = registeredStudents.get(i);
            double weightedSum = 0.0;
            int totalWeight = 0;

            for (int j = 0; j < assignments.size(); j++) {
                Assignment assignment = assignments.get(j);
                Integer score = assignment.getScores().get(i);

                if (score != null) {
                    weightedSum += (double) score * assignment.getWeight();
                    totalWeight += assignment.getWeight();
                }
            }

            if (totalWeight > 0) {
                studentsAverage[i] = (int) Math.round(weightedSum / totalWeight);
            } else {
                studentsAverage[i] = 0;

            }
        }

        return studentsAverage;
    }

    /**
     * Adds a new assignment to the course
     * @param assignmentName the input string
     * @param weight the input double
     * @param maxScore the input int
     * @return true if the assignment has been added
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        Assignment newAssignment = new Assignment(assignmentName, weight, maxScore);
        assignments.add(newAssignment);

        for (int i = 0; i < registeredStudents.size(); i++) {
            newAssignment.getScores().add(null);
        }

        return true;
    }

    /**
     * Generates random scores for each assignment and student, and calculates the final score for each student
     */
    public void generateScores() {

    }

    public void setCourseName(String courseName) {
        this.courseName = Util.toTitleCase(courseName);
    }

    public String toSimplifiedString1() {
        return "CourseId: " + courseId +
                ", Course Name: " + courseName +
                ", Credits: " + credits +
                ", Department: " + department.getDepartmentName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course ID: ").append(courseId).append("\n");
        sb.append("Course Name: ").append(courseName).append("\n");
        sb.append("Credits: ").append(credits).append("\n");
        sb.append("Department: ").append(department.getDepartmentName()).append("\n");

        sb.append("Assignments:\n");
        for (Assignment assignment : assignments) {
            sb.append("\t").append(assignment.getAssignmentName()).append(", Weight: ").append(assignment.getWeight()).append("\n");
        }

        sb.append("Registered Students:\n");
        for (Student student : registeredStudents) {
            sb.append("\tStudent ID: ").append(student.getStudentId()).append(", Student Name: ")
                    .append(student.getStudentName()).append(", Department: ")
                    .append(student.getDepartment().getDepartmentName()).append("\n");
        }

        return sb.toString();
    }
}
