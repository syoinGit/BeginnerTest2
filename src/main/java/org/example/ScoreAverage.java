package org.example;

import java.util.List;

public class ScoreAverage {

  public void studentScoreAverage(List<Student> studentList) {

    int average = 0;

    int studentsNumber = studentList.size();
    for (Student student : studentList) {

      int score = student.getScore();

      average = average + score;

    }

    average = average / studentsNumber;

    System.out.println("平均点は" + average + "点です");

  }
}
