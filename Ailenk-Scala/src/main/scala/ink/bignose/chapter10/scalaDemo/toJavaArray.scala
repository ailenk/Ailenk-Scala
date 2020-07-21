package ink.bignose.chapter10.scalaDemo

import scala.collection.mutable.ArrayBuffer


object toJavaArray {
  def main(args: Array[String]): Unit = {
    // Scala集合和Java集合互相转换
    val arr = ArrayBuffer("1", "2", "3")
    // implicit def bufferAsJavaList[A](b : scala.collection.mutable.Buffer[A]) : java.util.List[A] =

    import scala.collection.JavaConversions.bufferAsJavaList
    //进行了隐性转换
    val javaArr = new ProcessBuilder(arr) //为什么可以这样使用?
    val arrList = javaArr.command()
    println(arrList) //输出 [1, 2, 3]

    //翻转为scala
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    // java.util.List ==> Buffer
    val scalaArr: mutable.Buffer[String] = arrList
    scalaArr.append("jack")
    println(scalaArr)
    //案例演示+说明
  }
}
