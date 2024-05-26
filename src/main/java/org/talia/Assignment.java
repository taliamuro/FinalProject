package org.talia;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

public class Assignment {
    private String assignmentId;
    @Getter
    private String assignmentName;
    @Getter
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    @Getter @Setter
    private ArrayList<Integer> scores;
    private static int nextId = 1;

    public Assignment(String assignmentName, double weight, int maxScore) {
        this.assignmentId = "A" + nextId++;
        this.assignmentName = assignmentName;
        this.weight = weight;
        this.maxScore = maxScore;
    }

    /**
     * Calculates the average score for one assignment
     * @param scores the input int array
     */
    public static int calcAssignmentAvg(int[] scores) {
        if (scores == null) {
            return 0;
        }

        if (scores.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum/scores.length;
    }

    /**
     * Generates random scores for all students in an assignment
     */
    public void generateRandomScore() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(0,11);

        if (randomNumber == 0) {
            randomNumber = rand.nextInt(0,60);
        } else if (randomNumber == 1 || randomNumber == 2) {
            randomNumber = rand.nextInt(60,70);
        } else if (randomNumber == 3 || randomNumber == 4) {
            randomNumber = rand.nextInt(70,80);
        } else if (randomNumber == 5 || randomNumber == 6 || randomNumber == 7 || randomNumber == 8) {
            randomNumber = rand.nextInt(80,90);
        } else if (randomNumber == 9 || randomNumber == 10) {
            randomNumber = rand.nextInt(90,101);
        }
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", assignmentName='" + assignmentName + '\'' +
                ", weight=" + weight +
                ", maxScore=" + maxScore +
                '}';
    }

    public void setScore(int studentId, int score) {
        scores.set(studentId, score);
    }
}
