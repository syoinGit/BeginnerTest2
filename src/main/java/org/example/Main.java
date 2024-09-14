package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Mainmenu mainMenu = new Mainmenu();
    StudentInput studentInput = new StudentInput();
    DeleteScore deleteScore = new DeleteScore();
    UpdateScore updateScore = new UpdateScore();
    ScoreAverage scoreAverage = new ScoreAverage();

    List<Student> students = new ArrayList<>();  // 生徒のリストを作成

    while (true) {
      int menuChoice = mainMenu.UserInput();
      if (menuChoice == 6) {
        break;
      }

      switch (menuChoice) {
        case 1:
          students.add(studentInput.inputStudentData()); // 生徒追加
          break;

        case 2:
          deleteScore.DeleteStudentData(students); // 生徒削除
          break;

        case 3:
          updateScore.UpdateScoreDate(students); // 特典の更新

          break;

        case 4:
          scoreAverage.StudentScoreAverage(students); // 平均値を出力
          break;

        case 5:
          students.forEach(System.out::println); // 生徒全員を出力
          break;

        default:
          System.out.println("1~6の数字を半角で入力してください");
          break;
      }
    }
  }
}