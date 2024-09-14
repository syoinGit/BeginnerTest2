package org.example;

import java.util.List;
import java.util.Scanner;

public class DeleteScore {

  public void DeleteStudentData(List<Student> studentList) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("削除する生徒の名前を入力してください");
    String userInput = scanner.nextLine();


    boolean isRemoved = studentList.removeIf(student -> student.getName().equals(userInput));

    if (isRemoved) {
      System.out.println("生徒 " + userInput + " を削除しました");
    } else {
      System.out.println("生徒 " + userInput + " が見つかりませんでした");
    }
  }
}