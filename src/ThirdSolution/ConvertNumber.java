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

        String[][] numbers = {
                {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"},
                {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"},
        };

        String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] teens = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] decimals = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] forms = {"", "миллион", "миллиона", "миллионов"};

        String forAddingFragments = String.valueOf(number);
        int amountOfFragments = (forAddingFragments.length() / 3) + 1;

        List<String> arrayOfStringFragments = new ArrayList<>();
        List<Integer> arrayOfIntFragments = new ArrayList<>();

        if (amountOfFragments == 1) {
            arrayOfStringFragments.add(forAddingFragments);
        } else {
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

        /*          добавляем фрагменты числа в строковом представлении в массив
         *           если число больше 19 и последняя цифра НЕ ноль, а предпоследняя 1, то первый иф
         *           иначе просто разбивает на символы и добавляет посимвольно в строковый массив
         */


        //new ConvertNumber(1_119_235); //[235, 119, 1]
        //переведем строковый массив в инты

        for (int i = arrayOfStringFragments.size() - 1; 0 <= i; i--) {
            String fragment = arrayOfStringFragments.get(i);
            int temp = Integer.parseInt(arrayOfStringFragments.get(i));
            if (temp < 10) {
                switch (i) {
                    case 2: result += numbers[0][temp];
                    break;
                    case 1: result += numbers[1][temp];
                    break;
                }
            } else if (10 < temp && temp < 20) {
                result += teens[temp - 10];
            } else if (20 <= temp && temp < 100) {
                result += decimals[(temp / 10)];
            } else {
                result += hundreds[(temp - (temp % 100)) / 100 ];
            }

        }

        return result;
    }
}