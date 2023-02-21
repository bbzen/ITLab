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
        List<String> array = new ArrayList<>();

/*        добавляем фрагменты числа
        то добавляем*/
        if (number < 20) {
                array.add(forAddingFragments);
            } else if (number > 19 && forAddingFragments.charAt(forAddingFragments.length() - 2) == '1' && forAddingFragments.charAt(forAddingFragments.length() - 1) != '0') {
                char[] charsFromNumber = forAddingFragments.toCharArray();
                array.add(forAddingFragments.substring(forAddingFragments.length() - 2));
                for (int i = charsFromNumber.length - 3; 0 <= i; i--) {
                    array.add(String.valueOf(charsFromNumber[i]));
                }
            } else {
                char[] charsFromNumber = forAddingFragments.toCharArray();
                for (int i = charsFromNumber.length - 1; 0 <= i; i--) {
                    array.add(String.valueOf(charsFromNumber[i]));
                }
            }
            //new ConvertNumber(1_123_119); //[19, 1, 3, 2, 1, 1]

        for (int i = array.size() - 1; 0 <= i ; i--) {
            if (Integer.parseInt(array.get(i)) <= 10) {
                result += numbers[0][Integer.parseInt(array.get(i))];
            }
        }



        return null;
    }
}