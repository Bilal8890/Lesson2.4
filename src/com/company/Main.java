package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое мужское имя");
        String man1 = scanner.next();
        System.out.println("Введите второе мужское имя");
        String man2 = scanner.next();
        System.out.println("Введите третье мужское имя");
        String man3 = scanner.next();
        System.out.println("Введите четвертое мужское имя");
        String man4 = scanner.next();
        System.out.println("Введите пятое мужское имя");
        String man5 = scanner.next();

        ArrayList<String> list = new ArrayList<>();
        list.add(man1);
        list.add(man2);
        list.add(man3);
        list.add(man4);


        System.out.println("Первый список " + list);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите первое женское имя");
        String woman1 = scanner.next();
        System.out.println("Введите второе женское имя");
        String woman2 = scanner.next();
        System.out.println("Введите третье женское имя");
        String woman3 = scanner.next();
        System.out.println("Введите четвертое женское имя");
        String woman4 = scanner.next();
        System.out.println("Введите пятое женское имя");
        String woman5 = scanner.next();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add(woman1);
        list2.add(woman2);
        list2.add(woman3);
        list2.add(woman4);
        list2.add(woman5);

        System.out.println("Второй список" + list2);

        Collections.reverse(list2);

        list.addAll(list2);
        System.out.println("Первый список объедененный со вторым " + list);

        ArrayList<String> list3 = new ArrayList<>();
        int countMan = 0;
        int countWomen = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list3.add(list.get(countMan));
                countMan++;

            } else {

                list3.add(list2.get(countWomen));
                countWomen++;


            }
        }
        System.out.println("Третий список " + list3);
        list3.sort(Comparator.comparing(String :: length));
        System.out.println("Отсортированный третий список " + list3);
    }
}
