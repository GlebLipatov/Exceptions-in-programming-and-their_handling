package HomeWorks.HW3;

public class App {
    public static void main(String[] args) {

        System.out.println("\nСложение\n");

        try {
            double firstSummand = GetDoubleFromUser.getNumber("Введите первое слагаемое: ");
            double secondSummand = GetDoubleFromUser.getNumber("Введите второе слагаемое: ");
            double result = PowerCalculator.sum(firstSummand, secondSummand);

            System.out.printf("Сумма %f и %f равна %f", firstSummand, secondSummand, result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nВычитание\n");

        try {
            double minuend = GetDoubleFromUser.getNumber("Введите уменьшаемое: ");
            double subtrahend = GetDoubleFromUser.getNumber("Введите вычитаемое: ");
            double result = PowerCalculator.subtraction(minuend, subtrahend);

            System.out.printf("Разность %f и %f равна %f", minuend, subtrahend, result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nУмножение\n");

        try {
            double multipliable = GetDoubleFromUser.getNumber("Введите множимое: ");
            double multiplier = GetDoubleFromUser.getNumber("Введите множитель: ");
            double result = PowerCalculator.multiplication(multipliable, multiplier);

            System.out.printf("Произведение %f и %f равно %f", multipliable, multiplier, result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nДеление\n");

        try {
            double divisible = GetDoubleFromUser.getNumber("Введите делимое: ");
            double divisor = GetDoubleFromUser.getNumber("Введите делитель: ");
            double result = PowerCalculator.division(divisible, divisor);

            System.out.printf("Частное %f и %f равно %f", divisible, divisor, result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nВозведение в степень\n");

        try {
            double basis = GetDoubleFromUser.getNumber("Введите основание степени: ");
            double power = GetDoubleFromUser.getNumber("Введите показатель степени: ");
            double result = PowerCalculator.pow(basis, power);

            System.out.printf("Степень возведения %f в %f является %f", basis, power, result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

    }
}
