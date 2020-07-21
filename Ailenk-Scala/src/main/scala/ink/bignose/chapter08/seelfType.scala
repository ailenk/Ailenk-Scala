package ink.bignose.chapter08

object seelfType {
  def main(args: Array[String]): Unit = {

  }
}
//Logger就是自身类型特质
trait Logger {
  // 明确告诉编译器，我就是Exception,如果没有这句话，下面的getMessage不能调用
  this: Exception =>
  def log(): Unit ={
    // 既然我就是Exception, 那么就可以调用其中的方法
    println(getMessage)
  }
}
//class Console extends  Logger {} //对吗? //错误 显示Exception
//class Console extends Exception with Logger//对吗? //先继承Exception


