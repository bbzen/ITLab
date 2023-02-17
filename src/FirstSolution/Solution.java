package FirstSolution;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();            // создаем массив для хранения найденных простых чисел
        int number;                                         //создаем переменную для хранения числа, считанного с клавы

        try(Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextInt();                     //читаем число с клавы
        }
        for (int i = 2; i < number; i++) {                  //в данном цикле передираем все числа от 2 до заданного
            int devidersCount = 0;                          // создаем счетчик делителей

            for (int j = 1; j < i; j++) {                   //в данном цикле будем проверять текущее число на количество делителей
                if (devidersCount > 1 ) {                   // если делителей больше 1, прекращаем изучение текущего числа
                    devidersCount = 0;                      //обнуляем счетчик
                    break;                                  //прекращаем выполнение цикла
                } else {
                    if (i % j == 0) {                       //проверяем как делиться без остатка текущее число
                        devidersCount++;                    //если делиться, увеличиваем счетчик
                    }
                }
            }
            if (devidersCount == 1) {                       //если в результате выполнения вложенного цикла число делителей равно 1
                primes.add(i);                              //значит число простое, добавляем в список
            }
            devidersCount = 0;                              // обнуляем счетчик, переходим к след числу из ряда 2 - к
        }
        System.out.println(primes);                         //выводи список на экран
    }
}
