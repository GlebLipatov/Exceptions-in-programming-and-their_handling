package HomeWorks.HW2;

import HomeWorks.HW2.GetNumberFromUser;

public class App {
    public static void main(String[] args) {
        // Задание 1.
        System.out.println("Задание 1.\n");
        try {
            Tasks.Task1(GetNumberFromUser.getNumber("положительное число"));
            Tasks.Task1(GetNumberFromUser.getNumber("0 или отрицательное число"));
        } catch (InvalidNumberException msg) {
            System.out.println(msg.getMessage());
        }

        // Задание 2.
        System.out.println("\nЗадание 2.\n");
        try {

            Tasks.Task2(GetNumberFromUser.getNumber("делимое"), GetNumberFromUser.getNumber("делитель больше 0"));
            Tasks.Task2(GetNumberFromUser.getNumber("делимое"), GetNumberFromUser.getNumber("делитель равный 0"));
        } catch (DivisionByZeroException msg) {
            System.out.println(msg.getMessage());
        }
    }
}
