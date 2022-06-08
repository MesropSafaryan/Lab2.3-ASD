package com;

public class Main {
    public static long Factorial(int number) {
        long factorial;
        if (number == 0) {
            return number + 1;
        }
        factorial = number * Factorial(number - 1);
        return factorial;
    }
    public static long Func(int n, int k) {
        return (Factorial(n) / Factorial(n - k));
    }

    public static void main(String[] args) {
        System.out.println("Перший рівень");
        System.out.println("Кількість викладачів на кандидатуру кураторів груп першого курсу: 7");
        System.out.println("Кількість способів: " + (2 * Factorial(6)));
        System.out.println("____________________________________________________________________");
        System.out.println("Другий рівень");
        System.out.println("Кількість літер в діапазоні (a-k): 11");
        System.out.println("Кількість літер в слові: 10");
        System.out.println("Кількість способів: " + (Func(11, 10)));

    }
}
