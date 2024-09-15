package org.example;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UpdateScore {

  public void updateScoreDate(List<Student> studentList) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("点数を更新する生徒の名前を入力してください");
    String userInput = scanner.nextLine();

    Optional<Student> result = studentList.stream()
        .filter(student -> student.getName().equals(userInput))
        .findFirst();

    result.ifPresent(student -> {
      System.out.println("検索対象が見つかりました。更新後の点数を入力してください。");
      int newScore = scanner.nextInt();

      student.setScore(newScore);

      System.out.println("点数が " + newScore + " に更新されました。");
    });


    if (result.isEmpty()) {
      System.out.println("生徒が見つかりませんでした。");
    }
  }
}