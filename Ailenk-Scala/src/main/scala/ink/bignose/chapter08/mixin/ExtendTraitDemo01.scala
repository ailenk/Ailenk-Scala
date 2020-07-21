package ink.bignose.chapter08.mixin

/**
  * @Author :bignose
  * @Date: 2017/8/5 21:47
  */
object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

trait LoggedException extends Exception{
  def log(): Unit ={
    println(getMessage()) // 方法来自于Exception类
  }
}
//UnhappyException 就是Exception的子类.
class UnhappyException extends  LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}

class ccc{

}