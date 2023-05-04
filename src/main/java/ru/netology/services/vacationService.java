package ru.netology.services;

public class vacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int balans = 0;
        for (int month = 0; month < 12; month++) {
            if (balans >= threshold) {
                count++;
                balans = (balans - expenses) / 3;
            } else {
                balans += income - expenses;
            }
        }
        return count;
    }
}