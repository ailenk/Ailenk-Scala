package ink.bignose.chapter06.constracter

import scala.beans.BeanProperty


object workDemo {
  def main(args: Array[String]): Unit = {
   var w1=new Worker("smith")
    w1.name //不能读inName
    var w2 =new Worker2("sss")
    w2.inName//只读 底层有方法  pervite final
    var w3 =new Worker2("sss")
    w3.inName

  }
}

//这时inName 是一个局部变量
//val 修饰编程一个只读私有属性
class Worker(inName: String) {
  var name =inName
}
class Worker2(val inName: String) {
  var name =inName
}

//@BeanProperty //getter setter两者 可以共存
class Worker3(var inName: String) {
  var name =inName
}
