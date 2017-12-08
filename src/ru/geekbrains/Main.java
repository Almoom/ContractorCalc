package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here: while(repeatQuestion!=0){
            System.out.println("Исполнитель Калькулятор преобразует целое число, записанное на экране. У исполнителя две команды, каждой команде присвоен номер: 1 - Прибавь 1, 2 - Умножь на 2. Введите команду.");
            int number = scanner.nextInt();
            int degree = scanner.nextInt();
            int counter = 0;
            int vol = degree;
            if (degree%2 == 0) {
                do {
                    for (int i = 1; i < vol; i++) {
                        vol = vol / 2;
                        counter++;
                    }
                }
                while (vol > 1);
            }else{
                vol = vol-1;
                do {
                    for (int i = 1; i < vol; i++) {
                        vol = vol / 2;
                        counter++;
                    }
                }
                while (vol > 1);
            }
            int rez = number;
            if (degree%2 == 0){
                for (int i = 0; i < counter; i++) {
                    rez = rez*rez;
                }
            }else{
                for (int i = 0; i < counter; i++) {
                    rez = rez*rez;
                }
                rez = rez*number;
            }
            System.out.println(counter + " " + rez);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion==1) continue here;
            else break;
        }
    }
}
