package Task_6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UserData {

    public static void main(String[] args) {
        Map<String, String> user_data = new HashMap<String, String>();

        user_data.put("Roman", "yeiJu2113");
        user_data.put("Ruslan", "1234");
        user_data.put("Olya", "manywayka");

        for (Map.Entry<String, String> me : user_data.entrySet()) {
            if (me.getValue().length() > 6) {
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
        }
    }
}
