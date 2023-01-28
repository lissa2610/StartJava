package com.javastart.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод значений переменных на консоль");
        byte yader = 4;
        short proc = 1;
        int videokarta = 1;
        long failov = 123748484;
        float chastotaProcessora = 4.8f;
        double chastotaOperativnoiPamyti = 1.8;
        char g = 103;
        boolean pc = true;

        System.out.println(yader + " - количество ядер");
        System.out.println(proc + " - количество процессоров") ;
        System.out.println(videokarta + " - количество видеокарт") ;
        System.out.println(failov + " - Количество файлов на ПК ") ;
        System.out.println( chastotaProcessora + " - частота процессора");
        System.out.println(chastotaOperativnoiPamyti + " - частота оперативной памяти") ;
        System.out.println(g + " - Символ g") ;
        System.out.println(pc);


System.out.println(" ");

        System.out.println("2.Расчет стоимости товара со скидкой");
        int ruchka = 100;
        int kniga = 200;
        int skidka = (ruchka + kniga) / 100 *11;
        int sum = ruchka + kniga;
        System.out.println(skidka) ;
        System.out.println(sum) ;

System.out.println(" ");

        System.out.println("3.Вывод слова JAVA");
        char jb = 74;
        char a = 97;
        char j = 106;
        char vb = 86;
        char v = 118;
        System.out.println(" " + " " + " " + jb + " " + " " + " " + " "+ 
            a + " " + " " + v + " " + " " + " " + " " + " " + v + " " + " " + a + " " + " " + " ");
        System.out.println(" " + " " + " " + jb + " " + " " + " " + a + " " + 
            a + " " + " " + v 
            + " " + " " + " " + v + " " + " " + a + " " + a + " " + " ");
        System.out.println(jb + " " + " " + jb + " " + " " + a + a + a + a + 
            a + " " + " " + vb + " " + 
            vb + " " + " " + a + a + a + a + a + " ");
        System.out.println(" " + jb + jb + " " + " " + a + " " + " " + " " + " " + " " + a 
            + " " + " " + vb + " " + " " + a + " " + " " + " " + " " + " " + a);
       

System.out.println(" ");



System.out.println("4.Вывод min и max значений целых числовых типов");

        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807l;
        
        System.out.println(num1 + "," + num1++ + ","+ num1--);
        System.out.println(num2 + "," + num2++ + ","+ num2--);
        System.out.println(num3 + "," + num3++ + ","+ num3--);
        System.out.println(num4 + "," + num4++ + ","+ num4--);




        System.out.println(" ");

        System.out.println("5. Перестановка значений переменных");
        
        int u;
        int y;
        u = 2;
        y = 5;
        //int i;

        //1
        int i = u;
        u = y;
        y = i;
System.out.println("с помощью третьей переменной\n" + y);


        //2
        u = u + y;
        y = u - y;
        u = u - y;

        //3



        System.out.println("с помощью третьей переменной\n" + y);



        



System.out.println(" ");


        System.out.println("6.Вывод символов и их кодов");
        char s1 = '#';
        char s2 = '&';
        char s3 = '@';
        char s4 = '^';
        char s5 = '_'; 
        
        int ch1 = (int) s1;
        int ch2 = (int) s2;
        int ch3 = (int) s3;
        int ch4 = (int) s4;
        int ch5 = (int) s5;

           System.out.println("# - 35\n" + "& - 38\n" + "@ - 64\n" + "^ - 94\n" + "_ - 95\n");
           

System.out.println(" ");

           
        

        System.out.println(" ");

System.out.println("7. Вывод в консоль ASCII-арт Дюка");


        System.out.println(" ");
        char ppp = 47; //  /
        char ppl = 92; // \
        char np = 95; // _ 
        char sco = 40; // (
        char scz = 41; // )

        System.out.println(" " + " " + " " + " " 
            + ppp + ppl + " " + " " + " " + " \n" 
            + " " + " " + " " + ppp + " " + " " + ppl 
            + " " + " " + " \n" + " " + " " + ppp + np 
            + sco + " " + scz + ppl + " " + " \n " 
            + ppp + " "  + " " + " " + " " + " " + " " + 
            ppl + " \n" + ppp + np + np + np + np + ppp 
            + ppl + np + np + ppl);


        System.out.println(" ");

        System.out.println("8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;

        int hundred = number / 100;
        int dozens1 = number / 10;
        int dozens = dozens1 % 10;
        int units = number % 10;
        int sumOfNumbers = hundred + dozens + units;
        int productOfNumbers = hundred * dozens * units;

       System.out.println("Число number содержит: \n" + hundred + " - сотен\n" 
        + dozens + " - десятков\n" + units + " - единиц\n");
       System.out.println("Сумма цифр = " + sumOfNumbers + '\n'
        + "Произведение = " + productOfNumbers + '\n');

System.out.println(" ");

            System.out.println("9.Вывод времени");
            int time = 86399;
            int hour = time / 3600; 
            int ostalosMinute = time % 3600; 
            int minute = ostalosMinute / 60; 
            int second = ostalosMinute % 60;
           
            System.out.println(hour + ":" + minute + ":" + second);
    }
}