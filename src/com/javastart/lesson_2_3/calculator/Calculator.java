package com.javastart.lesson_2_3.calculator;

public  class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int num1 = 2, num2 = 5;
        char sign = '^';
        int result = 0;
        char plus = '+';
        char minus = '-';
        char asterisk = '*';
        char division = '/';
        char exponentiation = '^';
        char modulo = '%';

        if (sign == plus) {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == asterisk) {
            result = num1 * num2;
        } else if (sign == division) {
            result = num1 / num2;
        } else if (sign == exponentiation) {
            result = num1;
            for (int i = 2; i <= num2; i++) {
                result = result * num1;
            }
        } else if (sign == modulo) {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 
                + " = " + result);
    }
} 