package com.javastart.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 19;
        String gender = "женский пол";
        double height = 1.67;
        if (age > 20) {
            System.out.println("Ты поменял паспорт?");
        } else {
            System.out.println("Тебе пока не надо менять паспорт. В 20 лет поменяешь:)");
        }
        if (gender != "мужской пол") {
            System.out.println("Тебе не надо случить в армии");
        } else {
            System.out.println("Тебе надо служить в армии");
        }
        if (height < 1.80) {
            System.out.println("Тебе легко подобрать штанишки по росту:)");
        } else {
            System.out.println("Тебе не легко подобрать штанишки по росту;");
        }
        char theFirstletterOfTheName = "Liza".charAt(0); //L 76
        if (theFirstletterOfTheName == 'M') {
            System.out.println("Твое имя начинается с буквы М");
        } else if(theFirstletterOfTheName == 'I') {
            System.out.println("Твое имя начинается с буквы I");
        } else {
            System.out.println("Я не гадалка, чтобы угадывать имя");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 10;
        int num2 = 20;
        if (num1 == num2) {
            System.out.println("Числа равны");
        } else if (num1 > num2) {
            System.out.println(num1 + " - max," + num2 + " - min");
        } if (num1 < num2) {
            System.out.println(num2 + " - max," + num1 + " - min");
        }


        System.out.println("\n3. Проверка числа");
        int num = 19;
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println(num + " - Число является четным");
            } if (num % 2 != 0) {
                System.out.println(num + " - Число является нечентным");
            } if (num > 0) {
                System.out.println(num + " - Число положительное");
            } else {
                System.out.println(num + " - Число отрицательное");
            }
        }
        

 
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int threeDigitNumber1 = 642;
        int threeDigitNumber2 = 678;
        int hundred1 = threeDigitNumber1 / 100; //8
        int dozens01 = threeDigitNumber1 / 10;
        int dozens1 = dozens01 % 10; //2
        int units1 = threeDigitNumber1 % 10; //4
        int hundred2 = threeDigitNumber2 / 100; //6
        int dozens02 = threeDigitNumber2 /10; 
        int dozens2 = dozens02 % 10; //2
        int units2 = threeDigitNumber2 % 10; //9
        if (hundred1 == hundred2) {
            System.out.println("Числа " + threeDigitNumber1 + " и " + threeDigitNumber2 
                + " имеют одинаковые цифры в разряде сотых - " + hundred1 + " и " + hundred2);
        } if (dozens1 == dozens2) {
            System.out.println("Числа " + threeDigitNumber1 + " и " + threeDigitNumber2 
                +" имеют одинаковые цифры в разряде десятых - " + dozens1 + " и " + dozens2);
        } if (units1 == units2) {
            System.out.println("Числа " + threeDigitNumber1 + " и " + threeDigitNumber2 
                + " имеют одинаковые цифры в разряде единиц - " + units1 + " и " + units2);
        } if (hundred1 != hundred2 && dozens1 != dozens2 && units1 != units2) {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057'; //W 
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println( symbol + " - маленькая буквa");
        }
        else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println( symbol + " - большая буква");
        }
        else if (symbol >= '0' && symbol <= '9') {
             System.out.println(symbol + " - число");
        }
        else {
            System.out.println(symbol + " - Error");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        if (deposit < 100_000) {
        int percent1 = deposit / 100 * 5;
            System.out.println("Cуммa вклада - " + deposit + ",\n" + "Начисленный % - " 
                + percent1 + ",\n" + "Итоговая сумма с % - " + (deposit + percent1));
        }

        if (deposit >= 100_000 && deposit <= 300_000) {
        int percent2 = deposit / 100 * 7;
            System.out.println("Cуммa вклада - " + deposit + ",\n" + "Начисленный % - " 
                + percent2 + ",\n" + "Итоговая сумма с % - " + (deposit + percent2));
        }

        if (deposit > 300_000) {
        int percent3 = deposit / 100 * 7;
            System.out.println("Cуммa вклада - " + deposit + ",\n" + "Начисленный % - " 
                + percent3 + ",\n" + "Итоговая сумма с % - " + (deposit + percent3));
        }

        System.out.println("\n7.Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int historyGrade;
        int programmingGrade;
        if (history > 91) {
        historyGrade = 5;
            System.out.println(historyGrade + " - история");
        } else if (history > 73) {
        historyGrade = 4;
            System.out.println(historyGrade + " - история");
        } else if (history > 60) {
        historyGrade = 3;
            System.out.println(historyGrade + " - история");
        } else {
        historyGrade = 2;
             System.out.println(historyGrade + " - история");
        }
        if (programming > 91) {
        programmingGrade = 5;
            System.out.println(programmingGrade + " - программирование");
        } else if (programming > 73) {
        programmingGrade = 4;
             System.out.println(programmingGrade + " - программирование");
        } else if (programming > 60) {
        programmingGrade = 3;
             System.out.println(programmingGrade + " - программирование");
        } else {
        programmingGrade = 2;
            System.out.println(programmingGrade + " - программирование");
        }
        int averageGrade = (historyGrade + programmingGrade) / 2;
        int averagePercentage = (history + programming) / 2;
        System.out.println("Средняя балл оценок по предметам - " + averageGrade 
                + "\nСредний % по предметам - " + averagePercentage);

        System.out.println("\n8. Расчет прибыли за год");
        int room = 5_000;
        int cost_price = 9_000;
        int income = 13_000;
        int expenses = (room + cost_price) * 12; // 168_000 - расходы
        int profit = income * 12;     //прибыль за год - 156_000
        int annual_income =profit - expenses;
        if (annual_income > 0) {
            System.out.println("прибыль за год: +" + annual_income);
        } else {
            System.out.println("прибыль за год: " + annual_income);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int numeric = 567;
        int denomination100 = 10;
        int denomination10 = 5;
        int denomination1 = 50;
        int nominal1 = 100;
        int nominal2 = 10;
        int nominal3 = 1;
        int hundreds = numeric / 100;
        int tens = numeric / 10 % 10;
        int ones = numeric % 10;
        System.out.println("Номиналы банкнот : " + nominal3 + "," + nominal2 + "," + nominal1);
        if (hundreds <= denomination100) {
         System.out.println("Выдаем " + hundreds + " номиналом 100");
        } else {
         tens = (hundreds - denomination100) * 100 + tens;
         hundreds = denomination100;
         System.out.println("Выдаем " + hundreds + " номиналом 100");
        }
        if (tens <= denomination10) {
         System.out.println("Выдаем " + tens + " номиналом 10");
        } else {
         ones = (tens - denomination10) * 10 + ones;
         tens = denomination10;
         System.out.println("Выдаем " + tens + " номиналом 10");
        }
        if (ones <= denomination1) {
         System.out.println("Выдаем " + ones + " номиналом 1");
        } else {
         System.out.println("банкнот не хватает для выдачи нужной суммы");
        }
        int recalculation = (hundreds * nominal1) + (tens * nominal2) + (ones * nominal3);
        System.out.println("Выдаваемая сумма " + recalculation + " USD");
    }
}