package ink.bignose.chapter18.viewbounds

/**
  * @Author :Ailenk
  * @Date: 2017/7/16 19:39
  */
object ViewBoundsDemo {
  def main(args: Array[String]): Unit = {
    val compareComm1 = new CompareComm(20, 30) //
    println(compareComm1.greater)

    val compareComm2 = new CompareComm(Integer.valueOf(20), Integer.valueOf(30))
    println(compareComm2.greater)

    val compareComm4 = new CompareComm[java.lang.Float](201.9f, 30.1f)
    println(compareComm4.greater)
    //上面的小数比较，在视图界定的情况下，就可以这样写了
    val compareComm5 =
      new CompareComm(201.9f, 310.1f)
    println(compareComm5.greater)
  }

}
//1. 视图界定使用了隐试转换 ，所有支持隐式转换 的数据
class CompareComm[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = if(obj1.compareTo(obj2) > 0) obj1 else obj2
}
