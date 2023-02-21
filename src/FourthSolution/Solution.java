package FourthSolution;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] array = new int[12][10];          //создаем двумерный массив
        int counter = 120;                        //создаем инт счетчик, значение из которого будем записывать в массив
        for (int i = 0; i < array.length ; i++) {   //этот цикл проходится по строкам массива
            if (i % 2 == 0) {                       //если строка четная
                for (int j = array[i].length - 1; 0 <= j; j--) {    //заполняем ее в обратном порядке
                    array[i][j] = counter;
                    counter--;                                      //убавляем счетчик
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {     //в противном случае заполняем в прямом порядке с начала строки
                    array[i][j] = counter;
                    counter--;                                      //убавляем счетчик
                }
            }
        }
        for (int i = 0; i < array.length; i++) {                    //цикл для красивой печати массива на экран
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
