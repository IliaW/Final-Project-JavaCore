public class Main {
    public static void main(String[] args) {

        Decimal decimal = new Decimal();

        // ВСЕГДА вначале заданное число переводим в десятичною систему (ToDecimal)
        // После - в любую другую до 16 (DecimalTo)

        // Переведём число "ABC" 16-ричной системы в десятичную
        //"ABC" - число в выбраной системе.    16 - выбранная система
        System.out.println(decimal.ToDecimal("ABC", 16)); // Получаем ЧИСЛО INT в десятичной системе

        //Переведём число с 10-тичной системы в 11-тиричную.
        //95842 - число в десятичной системе.     11 - система, в которую переводим
        System.out.println(decimal.DecimalTo(95842, 11)); // Получаем СТРОКУ STRING в выбранной (11) системе

        //Пример перевода 16-ричной системы в двоичную
        System.out.println(decimal.DecimalTo(decimal.ToDecimal("FBD", 16), 2));
    }
}