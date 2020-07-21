package ink.bignose.chapter12

/**
  * @Author :bignose
  * @Date: 2017/8/10 13:10
  */
object matchObject01 {
  def main(args: Array[String]): Unit = {
    // 模式匹配使用：
    val number: Double = 36.0
    number match {
      // 当我们传入 number 到 Square(n)
      // 1.调用 Square unapply 方法 然后传给 z
      // 2.如果这个对象提取器Option[Double] 返回的是 Some(math.sqrt(z))
       //  同时将sqrt  返回给n
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }
  }
}
//1. unapply 方法是对象提取器, double为自定义
//2. sealed abstract class Option[+A] extends Product with Serializable {
//3. 返回Option[Double]
//4. 返回的值 为 Some(math.sqrt(z))  并 放入到 some
object Square {
  def unapply(z: Double): Option[Double] ={
    println("unapply z:"+z)
    Some(math.sqrt(z)+1)
  }
  def apply(z: Double): Double = {
    println("apply z:"+z)
    z * z
  }
}
