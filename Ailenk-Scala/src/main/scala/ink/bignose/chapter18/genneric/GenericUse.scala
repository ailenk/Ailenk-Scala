package ink.bignose.chapter18.genneric

/**
  * @Author :Ailenk
  * @Date: 2017/7/15 20:11
  */
/*
要求:

编写一个Message类
可以构建Int类型的Message,String类型的Message.
要求使用泛型来完成设计,(说明：不能使用Any)
 */
object GenericUse {
  def main(args: Array[String]): Unit = {
    val mes1 = new StrMessage[String]("10")
    println(mes1.get)
    val mes2 = new IntMessage[Int](20)
    println(mes2.get)
  }
}

// 在 Scala 定义泛型用[T]， s 为泛型的引用
abstract class Message[T](s: T) {
  def get: T = s
}

// 子类扩展的时候，约定了具体的类型
class StrMessage[String](msg: String) extends Message(msg)

class IntMessage[Int](msg: Int) extends Message(msg)

