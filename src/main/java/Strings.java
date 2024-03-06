import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    // Реализовать метод, который будет возвращать количество передаваемого символа в слове
    //Пример: countCharAtWord('a', \"Aligator\") = 2
    public static int counterCharAtWord(char c, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) { //проверка совпадения символов
                count++;
            }
        }
        return count;
    }

    //реализовать метод, который будет возвращать количество подстрок в строке
       public static int word(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile("co[a-z]e");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            count++;
        }
        return count;
    }


    //Напишите функцию, которая проверяет, что строка является полиндромом
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    //посимвольно вставить короткую строку в длинную
    public static String word(String a, String b) {
        int minString = Math.min(a.length(), b.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < minString; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }

        if (a.length() > b.length()) {
            result.append(a.substring(minString));
        } else if (b.length() > a.length()) {
            result.append(b.substring(minString));
        }
        return result.toString();
    }

    //заменить символы в строке
    public static String symbol(String string, char old, char newChar) {
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == old) {
                arr[i] = newChar;
            }
        }
        return String.valueOf(arr);
    }
}

