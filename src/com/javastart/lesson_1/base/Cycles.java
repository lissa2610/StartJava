package com.javastart.lesson_1.base;

public class Cycles {

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;
        int i = -10;
        do {
            if(i % 2 == 0) {
                numberOfEvenNumbers += i;
                } else {
                numberOfOddNumbers += i;
                }
                i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " 
                + numberOfEvenNumbers + ", а нечетных = " + numberOfOddNumbers);

        
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10; //, max = 5, min = -1;
        int max = 5;
        int min = -1;
        if (num1 >= max && num1 >= min)
            max = num1;
        else if (max >= num1 && max >= min)
            max = max;
        else
            max = min;
        if (num1 <= max && num1 <= min)
            min = num1;
        else if (max <= num1 && max <= min)
            min = max;
        else
            min = min;
        for (int k = max - 1; k > min; k--) {
            System.out.print(k + " ");
        }
System.out.println(" ");

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int nums = 1234;
        int reversible = 0;
        int digit;
        int num = 0;
        while (nums > 0) {
            digit = nums % 10;
            reversible = reversible * 10 + digit;
            num = num + digit; //считаем сумму
            nums /= 10;
        }
        System.out.print(reversible);
        System.out.println("\nсумма чисел = " + num);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int h = 2; 

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int numbers = 1_435_324_322;
        int copy5 = numbers;
        int countTwos = 0;
        int digit5;
        while (copy5 > 0) {
            digit = copy5 % 10;
            if (digit == 2) {
                countTwos++;
            }
            copy5 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + numbers + " содержит " + countTwos + " четное количество двоек");
        } else {
            System.out.println("Число " + numbers + " содержит " + countTwos + " нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        System.out.println("\nfor - *");
        for(int i1 = 0; i1 < 5; i1++){ 
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nwhile - #");
        int i2 = 5;
        while (i2 >= 1) {
            int k = 1;
            while (k <= i2) {
                System.out.print("#");
                k++;
            }
        System.out.println();
        i2--;
        }

        System.out.println("\ndo-while - $");
        int nums7 = 0;
        int nums8 = 2;
        do {
            int j = 1;
            while (j <= nums7) {
                System.out.print("$");
                j++;
            }
            System.out.println();
            nums7++;
        } while (nums7 <= 3);
        do {
            int k = 1;
            while (k <= nums8) {
                System.out.print("$");
                k++;
            }
            System.out.println();
            nums8--;
        } while (nums8 > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (char w = 0; w <= 127; w++) {
            if (w <= 47 && w % 2 != 0) {
                System.out.printf("%4d%4c%n",(int) w, w);
            }
            if (w >= 97 && w <= 122 && w % 2 == 0) {
                System.out.printf("%4d%4c%n",(int) w, w);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int numbers8 = 1234321;
        int copy58 = numbers8;
        int rem8;
        int reversible8 = 0;
        while (copy58 > 0) {
            rem8 = copy58 % 10;
            reversible8 = reversible8 * 10 + rem8; 
            copy58 /= 10;
        }
        if (numbers8 == reversible8) {
            System.out.println("число " + numbers8 + " является палиндромом");
        } else {
            System.out.println("число " + numbers8 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int happy_num = 996_969;
        int copy9 = happy_num;
        int first_three = copy9 / 1000;
        int second_three = copy9 % 1000;
        int rem9_1;
        int rem9_2;
        int num9_1 = 0;
        int num9_2 = 0;

        while (first_three > 0 && second_three > 0) {
            rem9_1 = first_three % 10;
            num9_1 = num9_1 + rem9_1; //считаем сумму
            first_three /= 10;
            rem9_2 = second_three % 10;
            num9_2 = num9_2 + rem9_2; //считаем сумму
            second_three /= 10;
        }
        if (first_three == second_three) {
            System.out.println("Сумма цифр = " + num9_1 + " = " + num9_2 
                + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр = " + num9_1 + "  != " + num9_2
                + "\nЧисло не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        char sumbol = 124;
        System.out.println("   | 2  3  4  5  6  7  8  9" + "\n___|_______________________");
        for (int l = 2; l < 10; l++) {
            System.out.printf("%2d |", l);
                    for (int j = 2; j < 10; j++)
                        System.out.printf("%2d ", l * j);
                    System.out.printf("\n");
        }
    }
}
