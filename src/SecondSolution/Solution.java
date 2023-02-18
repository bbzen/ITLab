package SecondSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        List<String> inputStrings = new ArrayList<>();  //создаем список для хранения считанных строк
        try (Scanner scanner = new Scanner(System.in)) {
            while(inputStrings.size() < 2) {
                System.out.println("Введите номер версии");
                inputStrings.add(scanner.next());       //читаем строки
            }
        }
        String[] splitedFirstString = inputStrings.get(0).split("[.]");     //разделяем строки на массив строк по символу "."
        String[] splitedSecondString = inputStrings.get(1).split("[.]");

        List<Integer> splitedFirstInteger = new ArrayList<>();                   //создаем 2 списка для хранения отпарсенных строк
        List<Integer> splitedSecondInteger = new ArrayList<>();

        for (String s : splitedFirstString) {                                   //парсим строки
            splitedFirstInteger.add(Integer.parseInt(s));
        }

        for (String s : splitedSecondString) {
            splitedSecondInteger.add(Integer.parseInt(s));
        }

        boolean flag = false;                                                   //создаем флаг, в который занесем результат сравнения

        for (int i = 0; i < splitedSecondInteger.size(); i++) {
            if (splitedFirstInteger.get(i) == splitedSecondInteger.get(i)) {
                continue;
            } else if (splitedFirstInteger.get(i) < splitedSecondInteger.get(i)) {
                flag = true;
                break;
            } else {
                break;
            }

        }

        if (flag) {
            System.out.println("2я версия старше");
        } else {
            System.out.println("1я версия старше");
        }
    }
}