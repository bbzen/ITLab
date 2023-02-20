package ThirdSolution;

public enum NumberDescriptions {
    ноль,
    один,
    два,
    три,
    четыре,
    пять,
    шесть,
    семь,
    восемь,
    девять,
    десять,
    одинадцать,
    двенадцать,
    тринадцать,
    четырнадцать,
    пятнадцать,
    шестнадцать,
    семнадцать,
    восемнадцать,
    девятнадцать,
    двадцать,
    тридцать,
    сорок,
    пятьдесят,
    шестьдесят,
    семьдесят,
    восемдесят,
    девяносто,
    сто,
    двести,
    триста,
    четыреста,
    пятьсот,
    шестьсот,
    восемьсот,
    девятьсот,
    тысяча,
    тысячи,
    тысяч;

    public static String turnDecimal(int i) {
        if (i < 21) {
            return NumberDescriptions.values()[i].toString();
        } else if (20 < i && i < 30) {
            return NumberDescriptions.values()[20].toString() + " " + NumberDescriptions.values()[i - 20].toString();
        } else if (i == 30) {
            return NumberDescriptions.values()[21].toString();
        } else if (30 < i && i < 40) {
            return NumberDescriptions.values()[21].toString() + " " + NumberDescriptions.values()[i - 30].toString();
        } else if (i == 40) {
            return NumberDescriptions.values()[22].toString();
        } else if (40 < i && i < 50) {
            return NumberDescriptions.values()[22].toString() + " " + NumberDescriptions.values()[i - 40].toString();
        } else if (i == 50) {
            return NumberDescriptions.values()[23].toString();
        } else if (50 < i && i < 60) {
            return NumberDescriptions.values()[23].toString() + " " + NumberDescriptions.values()[i - 50].toString();
        } else if (i == 60) {
            return NumberDescriptions.values()[24].toString();
        } else if (60 < i && i < 70) {
            return NumberDescriptions.values()[24].toString() + " " + NumberDescriptions.values()[i - 60].toString();
        } else if (i == 70) {
            return NumberDescriptions.values()[25].toString();
        } else if (70 < i && i < 80) {
            return NumberDescriptions.values()[25].toString() + " " + NumberDescriptions.values()[i - 70].toString();
        } else if (i == 80) {
            return NumberDescriptions.values()[26].toString();
        } else if (80 < i && i < 90) {
            return NumberDescriptions.values()[26].toString() + " " + NumberDescriptions.values()[i - 80].toString();
        } else if (i == 90) {
            return NumberDescriptions.values()[27].toString();
        } else {
            return NumberDescriptions.values()[27].toString() + " " + NumberDescriptions.values()[i - 90].toString();
        }
    }

    public static String turnHundreds(int i) {
         if (i == 100) {
            return NumberDescriptions.values()[28].toString();
        } else if (100 < i && i < 200) {
            return NumberDescriptions.values()[28].toString() + " " + turnDecimal(i - 100);
        } if (i == 200) {
            return NumberDescriptions.values()[29].toString();
        } else if (200 < i && i < 300) {
            return NumberDescriptions.values()[29].toString() + " " + turnDecimal(i - 200);
        } if (i == 300) {
            return NumberDescriptions.values()[30].toString();
        } else if (300 < i && i < 400) {
            return NumberDescriptions.values()[30].toString() + " " + turnDecimal(i - 300);
        } if (i == 400) {
            return NumberDescriptions.values()[31].toString();
        } else if (400 < i && i < 500) {
            return NumberDescriptions.values()[31].toString() + " " + turnDecimal(i - 400);
        } if (i == 500) {
            return NumberDescriptions.values()[31].toString();
        } else if (500 < i && i < 600) {
            return NumberDescriptions.values()[32].toString() + " " + turnDecimal(i - 500);
        }
         return null;
    }

    public static String turnThousands(int i) {
        return null;
    }

    public static String turnToString(int i) {
        if (i < 100) {
            return turnDecimal(i);
        } else if (100 < i && i < 1000) {
            return turnHundreds(i);
        }
        return null;
    }
}
