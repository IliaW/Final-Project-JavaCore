import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Decimal {

    // 1. Порефакторить
    // 2. Добавить возможность перевода чисел с плавающей точкой

    // Перевод любой системы с 2 до 16 в десятичную
    public int ToDecimal(String number, int system) {

        // Разбиваем строку на символы и создаём массив Integer
        List<Integer> arrayInt = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            int symbol = number.charAt(i);
            if (symbol < 10) {
                arrayInt.add(symbol);
            } else if (symbol == 'A') {
                arrayInt.add(10);
            } else if (symbol == 'B') {
                arrayInt.add(11);
            } else if (symbol == 'C') {
                arrayInt.add(12);
            } else if (symbol == 'D') {
                arrayInt.add(13);
            } else if (symbol == 'E') {
                arrayInt.add(14);
            } else if (symbol == 'F') {
                arrayInt.add(15);
            }
        }

        // Переводим систему в десятичную
        Collections.reverse(arrayInt);
        int sum = 0;
        for (int i = 0; i < arrayInt.size(); i++) {
            sum += arrayInt.get(i) * (int) Math.pow(system, i);
        }
        return sum;
    }

    // Перевод из десятичной в любую выбранную систему с 2 до 16
    public String DecimalTo(int number, int system) {
        List<String> array = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (number != 0) {
            int remainder = number % system;
            if (remainder < 10) {
                String toString = "" + remainder;
                array.add(toString);
            } else if (remainder == 10) {
                array.add("A");
            } else if (remainder == 11) {
                array.add("B");
            } else if (remainder == 12) {
                array.add("C");
            } else if (remainder == 13) {
                array.add("D");
            } else if (remainder == 14) {
                array.add("E");
            } else if (remainder == 15) {
                array.add("F");
            }
            number /= system;
        }
        Collections.reverse(array);
        array.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}