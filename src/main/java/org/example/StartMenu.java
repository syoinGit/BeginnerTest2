package org.example;

import java.util.List;
import java.util.Scanner;

public class StartMenu {

  public int userInput() {

    Scanner scanner = new Scanner(System.in);
    List<String> mainMenu = List.of("1.学生を追加", "2.学生を削除", "3.点数を更新",
        "4.平均点を計算", "5.全学生の情報を表示", "6.終了");
    mainMenu
        .forEach(System.out::println);

    System.out.println("選択してください");
    int userInput = scanner.nextInt();
    scanner.nextLine();

    return userInput;
  }
}