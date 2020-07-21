package ink.bignose.chapter10.javaDemo;/**
 * @Author :bignose
 * @Date: 2017/8/6 21:12
 */

import java.util.ArrayList;

/**
 * @program: java0705scala
 * @description:
 * @author: bignose
 * @create: 2019-08-06 21:12
 **/
public class collect {

    public static void main(String[] args){
        //不可变集合类似java的数组
        int[] nums = new int[3];
        nums[2] = 11; //?
//nums[3] = 90; //?
        String[] names = {"bj", "sh"};
        System.out.println(nums + " " + names);
//可变集合举例
        ArrayList al = new ArrayList<String>();
        al.add("zs");
        al.add("zs2");
        System.out.println(al + " " + al.hashCode()); //地址 变化
        al.add("zs3");
        System.out.println(al + " " + al.hashCode()); ///地址 变化

    }
}
