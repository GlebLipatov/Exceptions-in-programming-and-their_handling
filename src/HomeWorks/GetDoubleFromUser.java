package HomeWorks;

import java.util.Scanner;

/**
 * Класс который получает от пользователя число и проверяет его на валидность.
 */
public class GetDoubleFromUser {
    /**
     * Метод который получает от пользователя число и проверяет его на валидность().
     *
     * @param message Сообщение содержащее информацию для ввода.
     * @return валидное число(меньше нуля, ровно нулю, больше нуля).
     */
    public static Double getNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        String inputFromUser;

        while (true) {
            System.out.print(message);
            inputFromUser = scanner.nextLine();

            // Леонид, большое спасибо за комментарий в прошлой дз по валидации =)
            // Очень удобно и красиво выходит!
            // Может знаете и сможете подсказать, где лучше почитать и потренировать регулярки?
            if (inputFromUser.matches("-?\\d+(.\\d+)?")) {
                return Double.parseDouble(inputFromUser);
            }
        }
    }
}
