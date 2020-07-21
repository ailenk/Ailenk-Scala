package ink.bignose.chapter10.javaDemo;/**
 * @Author :bignose
 * @Date: 2017/8/7 20:03
 */

import java.util.HashMap;

/**
 * @program: java0705scala
 * @description:
 * @author: bignose
 * @create: 2019-08-07 20:03
 **/
public class TestJavaMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap();
        hm.put("no1", 100);
        hm.put("no2", 200);
        hm.put("no3", 300);
        hm.put("no4", 400);

        System.out.println(hm);
        System.out.println(hm.get("no2"));
    }
}

