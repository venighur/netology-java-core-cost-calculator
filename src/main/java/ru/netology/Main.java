package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Приветствую!");
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int result = Service.calculateCustoms(price, weight);
        System.out.print("Размер пошлины (в руб.) составит: " + result);

        scanner.close();
    }
}