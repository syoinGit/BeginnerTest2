package org.example;

import java.util.Scanner;

public class StudentInput {

  public Student inputStudentData() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("生徒の名前を入力してください");
    String studentName = scanner.nextLine();

    System.out.println("生徒の得点を入力してください");
    int studentScore = scanner.nextInt();
    scanner.nextLine();

    Student student = new Student(studentName, studentScore);
    System.out.println("生徒名:" + studentName + " 得点:" + studentScore + " 追加しました");

    return student;
  }
}