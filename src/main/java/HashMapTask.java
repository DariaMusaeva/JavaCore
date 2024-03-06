import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

    // если есть a и b с одинаковым значением, remove
    public static Map<String, String> mapEquals(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals("b")) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    // если значения а и b имеют разную длину, положить в с длинное значение
    // если длина а и b одинаковая, записать в их значения пустую строку
    public static Map<String, String> mapLength(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {

            String valueA = map.get("a");
            String valueB = map.get("b");
            if (valueA.length() != valueB.length()) {
                map.put("c", valueA.length() > valueB.length() ? valueA : valueB);

            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    //дан массив строк. вернуть мапу, где значением является длина каждой строки
    public static Map<String, Integer> mapStrings(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for(String str:strings){
            map.put(str, str.length());
        }
        return map;
    }

    // дан массив строк. вернуть мапу, где ключ - первый символ, значение - последний символ для каждой строки
    public static Map<String, String> mapBully(String[] strings) {
        Map<String, String> map = new HashMap();
        for(String str:strings){
            String key = str.substring(0, 1);
            String value = str.substring(str.length() - 1);
            map.put(key, value);
        }
        return map;
    }

    //посчитать количество вхождений строк в массив и установить его как значение для каждой строки(ключа)
    public static Map<String, Integer> mapCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String str:strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }

    //firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    public static Map<String, String> mapFirstCharKey(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String str:strings) {
            String first = str.substring(0,1);
            if (map.containsKey(first)) {
                String newstr = map.get(first) + str;
                map.put(first, newstr);
            } else {
                map.put(first, str);
            }
        }
        return map;
    }
}
