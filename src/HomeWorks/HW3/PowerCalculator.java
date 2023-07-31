package HomeWorks.HW3;

/**
 *
 * Калькулятор вещественных чисел.
 * Выполняет операции сложения, вычитания, умножения, деления и возведения в степень.
 *
 */
public class PowerCalculator {
    /**
     *
     * Выполняет сложение вещественных чисел.
     *
     * @param firstSummand Первое слагаемое.
     * @param secondSummand Второе слагаемое.
     * @return Результат сложения firstSummand и secondSummand.
     */
    public static Double sum(Double firstSummand, Double secondSummand) {
        if (Double.MAX_VALUE - firstSummand < secondSummand) {
            throw new InvalidInputException("Сумма больше максимально возможного значения для типа Double");
        } else {
            return firstSummand + secondSummand;
        }
    }

    /**
     *
     * Выполняет вычитание вещественных чисел.
     *
     * @param minuend Уменьшаемое.
     * @param subtrahend Вычитаемое.
     * @return Разность minuend и subtrahend.
     */
    public static Double subtraction(Double minuend, Double subtrahend){
        if (Double.MIN_VALUE + minuend > subtrahend) {
            throw new InvalidInputException("Разность меньше минимально возможного значения для типа Double");
        } else {
            return minuend - subtrahend;
        }
    }

    /**
     *
     * Выполняет произведение вещественных чисел.
     *
     * @param multipliable Множимое.
     * @param multiplier Множитель.
     * @return Произведение multipliable и multiplier.
     */

    public static Double multiplication(Double multipliable, Double multiplier) {
        if (Double.MAX_VALUE / multipliable < multiplier) {
            throw new InvalidInputException("Произведение больше максимально возможного значения для типа Double");
        } else {
            return multipliable * multiplier;
        }
    }

    /**
     *
     * Выполняет деление вещественных чисел.
     *
     * @param divisible Делимое.
     * @param divisor Делитель.
     * @return Частое divisible и divisor.
     */

    public static Double division(Double divisible, Double divisor) {
        if (divisor == 0) {
            throw new InvalidInputException("Делитель не может быть равен 0");
        } else {
            return divisible / divisor;
        }
    }

    /**
     *
     * Выполняет возведение в степень вещественных чисел.
     *
     * @param basis Основание степени.
     * @param power Показатель степени.
     * @return Степень basis от power.
     */

    public static Double pow(Double basis, Double power) {
        if (power <= 0) {
            throw new InvalidInputException("Введено некоректное значение: " + power);
        } else {
            double result = basis;
            while (--power > 0) result *= basis;
            return result;
        }
    }
}
