package HomeWorks.HW2;

import java.util.Scanner;

/**
 *
 * Класс который получает от пользователя число и проверяет его на валидность.
 *
 */
public class GetNumberFromUser {
    /**
     * Метод который получает от пользователя число и проверяет его на валидность.
     * @param message Сообщение содержащее информацию для ввода.
     * @return валидное число.
     */
    public static int getNumber(String message){
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        int number = 0;

        while (isContinue) {
            isContinue = false;
            System.out.printf("Введите %s: ", message);
            String inputFromUser = scanner.nextLine();

            for (Character symbol : inputFromUser.toCharArray()) {
                if (!Character.isDigit(symbol)) {
                    isContinue = true;
                    break;
                }
            }

            if (!isContinue) {
                number = Integer.parseInt(inputFromUser);
                break;
            }
        }
        return number;
    }
}
