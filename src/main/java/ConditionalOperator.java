public class ConditionalOperator {

    // вывести максимальное число из 2х
    public static int maxIntFromTwo(int a, int b) {
        if (a > b ) {
            return a;
        } else {
            return b;
        }
    }

    //вывести единицу, если первое число больше второго, двойку, если второе больше первого, или ноль, если они равны.
    public static int fromZeroToTwo(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return 2;
        }
        return 0;
        }

    //найти наибольшее число из 3х (не меньше, чем любое другое)
    public static int maxIntFromThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    //Даны три натуральных числа A, B, C. Определите, существует ли треугольник с такими сторонами. Если треугольник существует, выведите строку YES, иначе выведите строку NO.
    //Треугольник — это три точки, не лежащие на одной прямой.
    public static String isTriangleExist(int A, int B, int C) {
        if (A + B > C && A + C > B && B + C > A) { //для построения треугольника сумма длин любых двух сторон должна быть больше длины третьей стороны
            return "YES";
        }
        return "NO";
    }

    //Даны три целых числа. Определите, сколько среди них совпадающих.
    // Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадает) или 0 (если все числа различны).
    public static int isNumberMatches(int a, int b, int c) {
        if (a == b &&  b == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        }
        return 0;
    }

   //Дано три числа. Упорядочите их в порядке неубывания.
    public static String fromMinToMax(int a, int b, int c) {
        if (a <= b && b <= c) {
            return a + " " + b + " " + c;
        } else if (b <=a && a <= c) {
            return b + " " + a + " " + c;
        } else if (c <= a && a <= b) {
            return c + " " + a + " " + b;
        } else if (a <= c && c <= b) {
            return a + " " + c + " " + b;
        } else if (c <= b && b <= a) {
            return c + " " + b + " " + a;
        } else {
            return b + " " + c + " " + a;
        }
    }
}
