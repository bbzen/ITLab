package ThirdSolution;

import java.util.ArrayList;
import java.util.List;

public class ConvertNumber {
    private int number;


    public ConvertNumber(int number) {
        this.number = number;
    }

    public String convertNumber() {
        String result = "";

        if (number == 0) {
            result += "ноль";
        } else {

            //создаем массивы со всеми текстовыми представлениями чисел

            String[][] numbers = {
                    {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"},
                    {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"},
            };

            String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
            String[] teens = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
            String[] decimals = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
            String[] formsThous = {"", "тысяча", "тысячи", "тысяч"};
            String[] formsMil = {"", "миллион", "миллиона", "миллионов"};
            //переводим число в строку
            String forAddingFragments = String.valueOf(number);
            //и определяем количество фрагментов по 3 цифры в числе
            int amountOfFragments = (int) Math.ceil(forAddingFragments.length() / 3.0);
            //создаем список, где будем хранить фрагменты из 3х цифр
            List<String> arrayOfStringFragments = new ArrayList<>();
            /*          добавляем фрагменты числа в строковом представлении в массив
             *           если число больше 19 и последняя цифра НЕ ноль, а предпоследняя 1, то первый иф
             *           иначе просто разбивает на символы и добавляет посимвольно в строковый массив
             */
            if (amountOfFragments == 1) {
                arrayOfStringFragments.add(forAddingFragments);     //если фрагмент единственный, и их количестов равно нулю (для чисел до 1000), добавляем строку полностью в массив
            } else {                                                //если есть фрагмент, делим строку на фрагменты и добавляем фрагменты по 3 цифры в массив
                for (int i = 0; i < amountOfFragments; i++) {
                    String temp;
                    if (3 < forAddingFragments.length()) {
                        temp = forAddingFragments.substring(forAddingFragments.length() - 3);
                        forAddingFragments = forAddingFragments.substring(0, forAddingFragments.length() - 3);
                    } else {
                        temp = forAddingFragments;
                    }
                    arrayOfStringFragments.add(temp);
                }
            }
            //начинаем парсить наш массив
            for (int i = arrayOfStringFragments.size() - 1; 0 <= i; i--) {      //циклом прохлдимся по элементам массива в обратно порядке
                String fragment = arrayOfStringFragments.get(i);                //получаем фрагмент из списка
                int temp = Integer.parseInt(arrayOfStringFragments.get(i));     //парсим инт из фрагмента
                if (temp <= 10) {                                                //далее начинаем получать символьные представления из массивов по числу, здесь обработаем числа до 10
                    switch (i) {
                        case 2:
                            result += numbers[0][temp] + " ";                   //для каждого из блоков берем свою форму, i == 2 для миллионов
                            break;
                        case 1:
                            result += numbers[1][temp] + " ";                   //i == 1 для тысяч
                            break;
                        case 0:
                            result += numbers[0][temp] + " ";                   //i == 0 для чисел до 1000
                    }
                } else if (temp < 20) {
                    result += teens[temp - 10] + " ";
                } else if (temp < 100) {
                    result += decimals[(temp / 10)] + " ";
                    if (temp % 10 != 0) {                                       //проверка для десятков, чтобы не печатать лишние пробелы
                        result += numbers[0][temp % 10] + " ";
                    }
                } else {
                    result += hundreds[(temp - (temp % 100)) / 100] + " ";
                    if (temp % 100 <= 10) {
                        result += numbers[0][(temp % 100)] + " ";
                    }else if (temp % 100 < 20) {
                        result += teens[(temp % 100) - 10] + " ";
                    } else {
                        result += decimals[((temp % 100) - (temp % 10)) / 10] + " ";
                        result += numbers[0][temp % 10] + " ";
                    }
                }
                //далее идет выбор правильной формы для фрагмента
                if (i == 2 && (temp % 10 == 1)) {                           //если число миллионов оканчивается на 1, берем соответсвующую форму из массива
                    result += formsMil[1] + " ";
//                } else if (i == 2 && 20 < temp && (temp % 10 != 0)) {       //здесь проверка для десятков миллионов оканчивающихся любой цифрой кроме нуля
//                    result += formsMil[2] + " ";
                } else if (i == 2 && 2 <= (temp % 10) && (temp % 10) <= 4) {              //если число миллионов заканчивается цифрой от 2 до 4, берем соответсвующую форму из массива
                    result += formsMil[2] + " ";
                } else if (i == 2 && 5 <= (temp % 10) && (temp < 20) {              //если число миллионов больше 4, берем соответсвующую форму из массива
                    result += formsMil[3] + " ";
                } else if (i == 2 && 20 <= temp) {                //здесь проверка для десятков миллинов, оканчивающихся нулем, берем соответсвующую форму из массива
                    result += formsMil[3] + " ";
                }


                else if (i == 1 && temp == 1) {                           // все проверки для тысяч аналогичны миллионам
                    result += formsThous[1] + " ";
                } else if (i == 1 && 20 < temp && (temp % 10 != 0)) {
                    result += formsThous[2] + " ";
                } else if (i == 1 && 2 <= temp && temp <= 4) {
                    result += formsThous[2] + " ";
                } else if (i == 1 && 5 <= temp && temp < 20) {
                    result += formsThous[3] + " ";
                } else if (i == 2 && 20 <= temp) {
                    result += formsThous[3] + " ";
                }
            }
        }
        return result;
    }
}