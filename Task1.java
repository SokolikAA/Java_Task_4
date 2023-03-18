//        1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<String> textList = new LinkedList<>();
        label:
        while (true) {

            String text = input();

            switch (text) {
                case "quit":
                    break label;
                case "print":
                    for (int i = textList.size() - 1; i >= 0; i--) {
                        System.out.printf("%s ", textList.get(i));
                    }
                    break;
                case "revert":
                    textList.remove(textList.size() - 1);
                    break;
                default:
                    textList.add(text);
                    break;
            }
        }
    }

    private static String input() {
        System.out.print("\nВведите текст: ");
        return scan.nextLine();
    }
}



