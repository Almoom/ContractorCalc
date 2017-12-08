package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatQuestion = 1;
        int a = 3;
        here: while(repeatQuestion!=0){
            System.out.println("Исполнитель Калькулятор преобразует целое число, записанное на экране. У исполнителя две команды, каждой команде присвоен номер: 1 - Прибавь 1, 2 - Умножь на 2. Введите команду.");
            int comand = scanner.nextInt();
            if (comand == 1) {
                a = a+1;
            }else if (comand == 2){
                a = a*2;
            }else System.out.println("Ошибка ввода");
            System.out.println(a);
            System.out.println("Продолжить? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion==1) continue here;
            else break;
        }
    }
}
