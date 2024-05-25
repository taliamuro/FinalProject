package org.talia;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId;

    public void calcAssignmentAvg(ArrayList<Integer> scores) {
        if (scores.isEmpty()) {
            System.out.println("null");
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum/scores.size());;
    }

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
}
