import java.util.*;

public class Decimal {

    // Перевод любой системы с 2 до 16 в десятичную
    public int ToDecimal(String number, int system) {

        Map<Character, Integer> map = new HashMap<>();
        int k = 0;
        for (char j = '0';j <= '9' ;j++){
            map.put(j,k++);
        }
        for (char i = 'A'; i < 'G'; i++) {
            map.put(i, k++);
        }
        System.out.println(map);
        // Разбиваем строку на символы и создаём массив Integer
        List<Integer> arrayInt = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            char symbol = number.charAt(i);
            for (Map.Entry<Character, Integer> c : map.entrySet()) {
                if (symbol == c.getKey()) {
                    arrayInt.add(c.getValue());
                }
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