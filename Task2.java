//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.Collections;
import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {

            lList.add((int) (Math.random() * 99));
        }
        System.out.printf("Элементы до переворачивания: " + lList);
        Collections.reverse(lList);
        System.out.printf("\nЭлементы после переворачивания: " + lList);
    }
}
