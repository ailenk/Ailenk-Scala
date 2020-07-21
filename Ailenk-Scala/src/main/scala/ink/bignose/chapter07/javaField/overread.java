package ink.bignose.chapter07.javaField;/**
 * @Author :bignose
 * @Date: 2017/8/4 15:19
 */

/**
 * @program: java0705scala
 * @description:
 * @author: bignose
 * @create: 2019-08-04 15:19
 **/
class Super2{
    String s="super";
}
class Sub2 extends Super2{
    String s="sub";
}

public class overread {
  public static void main(String[] args){
      Sub2 c1 =new Sub2();
      System.out.print(((Super2)c1).s);

      Super2 c2 =new Sub2();
      System.out.print(c2.s);
  }
}
