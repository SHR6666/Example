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
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("b", 1);   //��������� put
        map.put("c", 2);
        map.put("d", 3);
        System.out.println(map);

        System.out.println(map.get("b"));   //����keyȡֵ ,��key = ��ĳ������

        map.remove("c");   //����key���Ƴ���ֵ��
        System.out.println(map);
        System.out.println(map.size());    //map���ϵĳ���

        System.out.println(map.containsKey("a"));    //�ж������ǰ��map�����Ƿ���ʳָ����key

        System.out.println(map.containsValue(1));
//        map.clear();    //��ռ���

        Set<String> keys = map.keySet();   //��ȡmap���ϵ�key�ļ���

        map.values();   //��ȡ���ϵ�����valueֵ

        //����map����
        for (String key : keys) {
            System.out.println("key:" + key + ", value:" + map.get(key));
        }

       //ͨ�� map.entrySet();������
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (Map.Entry<String, Integer> en: entrys){
            System.out.println("key:" + en.getKey() + ", value" + en.getValue());
        }
    }
}
