package Singleton.Exercise2;

import java.util.HashMap;
import java.util.Map;

public class Triple {
    private static Map<Integer, Triple> instanceMap;

    static {
        instanceMap = new HashMap<Integer, Triple>();
        instanceMap.put(1, new Triple(1));
        instanceMap.put(2, new Triple(2));
        instanceMap.put(3, new Triple(3));
    }

    private Triple(int id) {
        System.out.println("id: " + id + " のインスタンスを生成しました。");
    }

    public static Triple getInstance(int id) {
        return instanceMap.get(Integer.valueOf(id));
    }
}
