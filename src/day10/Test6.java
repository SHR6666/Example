package day10;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ����Map����
 * ���ڱ������ӳ���ϵ������
 */
public class Test6 {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        map.put("b", 1);   //��������� put
//        map.put("c", 2);
//        map.put("d", 3);
//        System.out.println(map);
//
//        System.out.println(map.get("b"));   //����keyȡֵ ,��key = ��ĳ������
//
//        map.remove("c");   //����key���Ƴ���ֵ��
//        System.out.println(map);
//        System.out.println(map.size());    //map���ϵĳ���
//
//        System.out.println(map.containsKey("a"));    //�ж������ǰ��map�����Ƿ���ʳָ����key
//
//        System.out.println(map.containsValue(1));
////        map.clear();    //��ռ���
//
//        Set<String> keys = map.keySet();   //��ȡmap���ϵ�key�ļ���
//
//        map.values();   //��ȡ���ϵ�����valueֵ
//
//        //����map����
//        for (String key : keys) {
//            System.out.println("key:" + key + ", value:" + map.get(key));
//        }
//
//       //ͨ�� map.entrySet();������
//        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
//        for (Map.Entry<String, Integer> en: entrys){
//            System.out.println("key:" + en.getKey() + ", value" + en.getValue());
//        }

        //TreeMap����Ȼ�������ֵ�����
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(4, "a");
        map.put(3, "a");
        map.put(2, "a");
        map.put(1, "a");
        System.out.println(map);

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("b", "a");
        map1.put("c", "a");
        map1.put("d", "a");
        map1.put("ab", "a");
        map1.put("1", "ab");
        map1.put("10", "ab");
        System.out.println(map1);
    }
}
