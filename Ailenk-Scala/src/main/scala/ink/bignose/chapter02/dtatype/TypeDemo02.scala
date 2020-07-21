package ink.bignose.chapter02.dtatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
//    println(sayHello)

    var num = 1.2
    var num2 = 1.7f
    num2 = num.toFloat / num2
    var num3=1.3e2
    var num4=1.3E-2
    println(num3)
    println(num4)
  }

  //有个方法会中断 这时候返回Nothing
  // h会明确表明是否有 正常返回 值
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }

}
