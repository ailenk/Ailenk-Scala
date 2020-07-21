package ink.bignose.chapter18.upbounds

/**
  * @Author :Ailenk
  * @Date: 2017/7/15 20:35
  */
object UpperBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    val compareInt =new CompareInt(10,12)
    println(compareInt.greater)


    /*val compareComm1 = new CompareComm(20, 30)
    println(compareComm1.greater)*/
    val compareComm2 = new CompareComm(Integer.valueOf(20), Integer.valueOf(30))
    println(compareComm2.greater)
    val compareComm3 =
      new CompareComm(java.lang.Float.valueOf(20.1f), java.lang.Float.valueOf(30.1f))
    println(compareComm3.greater)
    //这种写法使用了 隐式转换
    val compareComm4 = new CompareComm[java.lang.Float](201.9f, 30.1f)
    println(compareComm4.greater)


  }
}
/*
编写一个通用的类，可以进行Int之间、Float之间、等实现了Comparable接口的值直接的比较.//java.lang.Integer
分别使用传统方法和上界的方式来完成，体会上界使用的好处.

 */

class CompareInt(n1: Int, n2: Int) {
  def greater = if(n1 > n2) n1 else n2
}
// 使用上下界
//1. T <: Comparable[T] T 必须继承 Comparable
//2. 可以使用  compareTo
class CompareComm[T <: Comparable[T]](obj1: T, obj2: T) {
  def greater = if(obj1.compareTo(obj2) > 0) obj1 else obj2
}
//映射转换 Predef.scala
