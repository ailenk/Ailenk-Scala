package ink.bignose.chapter10.javaDemo;/**
 * @Author :bignose
 * @Date: 2017/8/7 20:59
 */

import java.util.HashSet;

/**
 * @program: java0705scala
 * @description:
 * @author: bignose
 * @create: 2019-08-07 20:59
 **/
public class setdemo {
 public static void main(String[] args){
     HashSet hs = new HashSet<String>();
     hs.add("jack");
     hs.add("tom");
     hs.add("jack");
     hs.add("jack2");
     System.out.println(hs);

 }
}
