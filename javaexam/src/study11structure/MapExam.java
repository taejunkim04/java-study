package study11structure;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1922876", "Apple Iphone");
        map.put("1922877", "Apple Ipad");
        map.put("2136861", "Samsung Galaxy");
        map.put("2136863", "Samsung Tablet");

        System.out.println("1922877: " + map.get("1922877"));

        System.out.println("# 키와 값 출력 --------------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s:%s\n", entry.getKey(), entry.getValue());
        }
        System.out.println("# 키만 출력 --------------------");
        for (String string : map.keySet()) {
            System.out.printf("%s\n", string);
            //System.out.printf("%s: %s\n", string,map.get(string));
        }
        System.out.println("# 값만 출력 --------------------");
        for (String value : map.values()) {
            System.out.printf("%s\n", value);
        }
    }
}
