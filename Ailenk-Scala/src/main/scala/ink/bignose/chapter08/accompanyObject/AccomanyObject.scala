package ink.bignose.chapter08.accompanyObject

object AccomanyObject {
  def main(args: Array[String]): Unit = {
    println(person.name)///等价于 person.&MODULES.name
    println(person.sayHi)///等价于 person.&MODULES.sayhi()
  }

}

//1.但一个文件有 class 与object 同时存在
//2.伴生类   class person将非静态内容内容写入该类中
//3.伴生对象   object person将静态内容内容写入该类中
//4.class person  会生成 person.class
//5.class person 会生成 person$.class
//伴生类
class person {

}

//伴生对象
object person {
  var name: String = _

  def sayHi: Unit = {
    println("sayHi")
  }
}