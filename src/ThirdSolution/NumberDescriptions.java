package ThirdSolution;

public enum NumberDescriptions {
    НОЛЬ,
    ОДИН,
    ДВА,
    ТРИ,
    ЧЕТЫРЕ,
    ПЯТЬ,
    ШЕСТЬ,
    СЕМЬ,
    ВОСЕМЬ,
    ДЕВЯТЬ,
    ДЕСЯТЬ,
    ОДИНАДЦАТЬ,
    ДВЕНАДЦАТЬ,
    ТРИНАДЦАТЬ,
    ЧЕТЫРНАДЦАТЬ,
    ПЯТНАДЦАТЬ,
    ШЕСТНАДЦАТЬ,
    СЕМНАДЦАТЬ,
    ВОСЕМНАДЦАТЬ,
    ДЕВЯТНАДЦАТЬ,
    ДВАДЦАТЬ,
    ТРИДЦАТЬ,
    СОРОК,
    ПЯТЬДЕСЯТ,
    ШЕСТЬДЕСЯТ,
    СЕМДЕСЯТ,
    ВОСЕМЬДЕСЯТ,
    ДЕВЯНОСТО,
    СТО,
    ДВЕСТИ,
    ТРИСТА,
    ЧЕТЫРЕСТА,
    ПЯТЬСОТ,
    ШЕСТЬСОТ,
    СЕМЬСОТ,
    ВОСЕМЬСОТ,
    ДЕВЯТЬСОТ,
    ОДНА,
    ДВЕ,
    ТЫСЯЧА,
    ТЫСЯЧИ,
    ТЫСЯЧ,
    МИЛЛИОН,
    МИЛЛИОНА,
    МИЛЛИОНОВ;

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
        } if (i == 600) {
            return NumberDescriptions.values()[33].toString();
        } else if (600 < i && i < 700) {
            return NumberDescriptions.values()[33].toString() + " " + turnDecimal(i - 600);
        } if (i == 700) {
            return NumberDescriptions.values()[34].toString();
        } else if (700 < i && i < 800) {
            return NumberDescriptions.values()[34].toString() + " " + turnDecimal(i - 700);
        } if (i == 800) {
            return NumberDescriptions.values()[35].toString();
        } else if (800 < i && i < 900) {
            return NumberDescriptions.values()[35].toString() + " " + turnDecimal(i - 800);
        } if (i == 900) {
            return NumberDescriptions.values()[36].toString();
        } else if (900 < i && i < 1000) {
            return NumberDescriptions.values()[36].toString() + " " + turnDecimal(i - 900);
        }
        return null;
    }

    public static String turnThousands(int i) {
        if (i == 1000) {
            return NumberDescriptions.values()[37].toString() + " " + NumberDescriptions.values()[39].toString();
        } else if (1000 < i && i < 1100) {
            return NumberDescriptions.values()[37].toString() + " " + NumberDescriptions.values()[39].toString() +
                    " " + turnDecimal(i - 1000);
        } else if (1100 <= i && i < 2000) {
            return NumberDescriptions.values()[37].toString() + " " + NumberDescriptions.values()[39].toString() +
                    " " + turnHundreds(i - 1000);
        } if (i == 2000) {
            return NumberDescriptions.values()[38].toString() + " " + NumberDescriptions.values()[40].toString();
        } else if (2000 < i && i < 2100) {
            return NumberDescriptions.values()[38].toString() + " " + NumberDescriptions.values()[40].toString() +
                    " " + turnDecimal(i - 2000);
        } else if (2100 <= i && i < 3000) {
            return NumberDescriptions.values()[38].toString() + " " + NumberDescriptions.values()[40].toString() +
                    " " + turnHundreds(i - 2000);
        } if (i == 3000) {
            return NumberDescriptions.values()[3].toString() + " " + NumberDescriptions.values()[40].toString();
        } else if (3000 < i && i < 3100) {
            return NumberDescriptions.values()[3].toString() + " " + NumberDescriptions.values()[40].toString() +
                    " " + turnDecimal(i - 3000);
        } else if (3100 <= i && i < 4000) {
            return NumberDescriptions.values()[3].toString() + " " + NumberDescriptions.values()[40].toString() +
                    " " + turnHundreds(i - 3000);
        } if (i == 4000) {
            return NumberDescriptions.values()[4].toString() + " " + NumberDescriptions.values()[40].toString();
        } else if (4000 < i && i < 4100) {
            return NumberDescriptions.values()[4].toString() + " " + NumberDescriptions.values()[40].toString() +
                    " " + turnDecimal(i - 4000);
        } else if (4100 <= i && i < 5000) {
            return NumberDescriptions.values()[4].toString() + " " + NumberDescriptions.values()[40].toString() +
                    " " + turnHundreds(i - 4000);
        } if (i == 5000) {
            return NumberDescriptions.values()[5].toString() + " " + NumberDescriptions.values()[41].toString();
        } else if (5000 < i && i < 5100) {
            return NumberDescriptions.values()[5].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnDecimal(i - 5000);
        } else if (5100 <= i && i < 6000) {
            return NumberDescriptions.values()[5].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnHundreds(i - 5000);
        } if (i == 6000) {
            return NumberDescriptions.values()[6].toString() + " " + NumberDescriptions.values()[41].toString();
        } else if (6000 < i && i < 6100) {
            return NumberDescriptions.values()[6].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnDecimal(i - 6000);
        } else if (6100 <= i && i < 7000) {
            return NumberDescriptions.values()[6].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnHundreds(i - 6000);
        } if (i == 7000) {
            return NumberDescriptions.values()[7].toString() + " " + NumberDescriptions.values()[41].toString();
        } else if (7000 < i && i < 7100) {
            return NumberDescriptions.values()[7].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnDecimal(i - 7000);
        } else if (7100 <= i && i < 8000) {
            return NumberDescriptions.values()[7].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnHundreds(i - 8000);
        } if (i == 8000) {
            return NumberDescriptions.values()[8].toString() + " " + NumberDescriptions.values()[41].toString();
        } else if (8000 < i && i < 8100) {
            return NumberDescriptions.values()[8].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnDecimal(i - 8000);
        } else if (8100 <= i && i < 9000) {
            return NumberDescriptions.values()[8].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnHundreds(i - 8000);
        } if (i == 9000) {
            return NumberDescriptions.values()[9].toString() + " " + NumberDescriptions.values()[41].toString();
        } else if (9000 < i && i < 9100) {
            return NumberDescriptions.values()[9].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnDecimal(i - 9000);
        } else if (9100 <= i && i < 10_000) {
            return NumberDescriptions.values()[9].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnHundreds(i - 9000);
        } if (i == 10_000) {
            return NumberDescriptions.values()[10].toString() + " " + NumberDescriptions.values()[41].toString();
        } else if (10_000 < i && i < 10_100) {
            return NumberDescriptions.values()[10].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnDecimal(i - 10_000);
        } else if (10_100 <= i && i < 11_000) {
            return NumberDescriptions.values()[9].toString() + " " + NumberDescriptions.values()[41].toString() +
                    " " + turnHundreds(i - 10_000);
        }
        return null;
    }

    public static String turnToString(int i) {
        if (i < 100) {
            return turnDecimal(i);
        } else if (100 < i && i < 1_000) {
            return turnHundreds(i);
        } else if (1_000 <= i && i < 1_000_000) {
            return turnThousands(i);
        }
        return null;
    }
}
