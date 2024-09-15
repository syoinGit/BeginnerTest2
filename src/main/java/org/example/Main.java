package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    StartMenu mainMenu = new StartMenu();
    StudentInput studentInput = new StudentInput();
    DeleteScore deleteScore = new DeleteScore();
    UpdateScore updateScore = new UpdateScore();
    ScoreAverage scoreAverage = new ScoreAverage();

    List<Student> students = new ArrayList<>();  // 生徒のリストを作成
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        // メニュー選択の入力
        int menuChoice = mainMenu.userInput();
        if (menuChoice == 6) {
          break;
        }

        switch (menuChoice) {
          case 1:
            students.add(studentInput.inputStudentData()); // 生徒追加
            break;

          case 2:
            deleteScore.deleteStudentData(students); // 生徒削除
            break;

          case 3:
            updateScore.updateScoreDate(students); // 点数の更新
            break;

          case 4:
            scoreAverage.studentScoreAverage(students); // 平均値を出力
            break;

          case 5:
            students.forEach(System.out::println); // 生徒全員を出力
            break;

          default:
            break;
        }

      } catch (InputMismatchException e) {
        // 数値以外が入力された場合の処理
        System.out.println("無効な入力です。数値を入力してください。");
        scanner.nextLine();
      }
    }
  }
}