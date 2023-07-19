package ru.netology.services;
public class VacaitionMounthsCalculation {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int balance = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                balance = balance - expenses;
                balance = balance / 3;
            } else {
                balance = balance + income - expenses;
            }
        }
        return count;
    }
}




