package HomeWorks.HW2;

import com.sun.security.jgss.GSSUtil;

import javax.naming.InvalidNameException;

public class Tasks {
    /**
     *
     * Задача 1:
     * Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
     * Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
     * В противном случае, программа должна выводить сообщение "Число корректно".
     *
     * @param number Число которое нужно проверить.
     * @throws InvalidNameException Если число отрицательное или равно нулю выдает исключение.
     */
    public static void Task1(int number) throws InvalidNameException {
        if (number <= 0) {
            throw new InvalidNameException("Некорректное число: " + number);
        }
        else System.out.println("Число корректно: " + number);
    }

    /**
     *
     * Задача 2:
     * Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
     * Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
     * В противном случае, программа должна выводить результат деления.     *
     * Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception.
     * Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.
     *
     * @param divisible делимое.
     * @param divisor делитель.
     * @throws DivisionByZeroException пользовательское исключение, которое выбрасывается если делитель равен 0.
     */
    public static void Task2(int divisible, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException(DivisionByZeroException.class.toString() + ": " +
                    "Деление на ноль недопустимо: " + divisible + " / " + divisor);
        }
        System.out.println("Результат: " + divisible / divisor);
    }

}
