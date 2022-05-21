package day10;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 测试Map集合
 * 用于保存具有映射关系的数组
 */
public class Test6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("b", 1);   //添加数据用 put
        map.put("c", 2);
        map.put("d", 3);
        System.out.println(map);

        System.out.println(map.get("b"));   //根据key取值 ,即key = “某东西”

        map.remove("c");   //根据key来移除徤值对
        System.out.println(map);
        System.out.println(map.size());    //map集合的长度

        System.out.println(map.containsKey("a"));    //判断泪出当前的map集合是否饮食指定的key

        System.out.println(map.containsValue(1));
//        map.clear();    //清空集合

        Set<String> keys = map.keySet();   //获取map集合的key的集合

        map.values();   //获取集合的所有value值

        //遍历map集合
        for (String key : keys) {
            System.out.println("key:" + key + ", value:" + map.get(key));
        }

       //通过 map.entrySet();来遍历
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (Map.Entry<String, Integer> en: entrys){
            System.out.println("key:" + en.getKey() + ", value" + en.getValue());
        }
    }
}
