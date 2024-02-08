public class Strings {

    /*    Перевернуть строку без использования методов типа reverse и класса String
    Ипользуйте только массив.
        Пример: myReverse("12345".toCharArray()). Результат "54321" */
    public static char[] myReverse(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
             char temp = arr[i];
             arr[i] = arr[arr.length - i - 1];
             arr[arr.length - i -1] = temp;
        }
        return arr;
    }

    public static char[] myReverse1(String str) {
        char[] arr = str.toCharArray();
        char[] tmp = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[arr.length - i - 1] = arr[i];
        }
        return tmp;
    }

    /* Реализовать метод, который будет возвращать количество передаваемого символа в слове
    Пример: countCharAtWord('a', \"Aligator\") = 2 */
    public static int counterCharAtWord(char c, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) { //проверка совпадения символов
                count++;
            }
        }
        return count;
    }
}

