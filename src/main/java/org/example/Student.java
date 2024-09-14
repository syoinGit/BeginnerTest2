package org.example;

public class Student {

  String name;

  int score;

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public String toString() {
    return "名前: " + name + " 得点: " + score + "点";
  }
}
