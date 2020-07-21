package ink.bignose.chapter07.visit

object Testvisit {
  def main(args: Array[String]): Unit = {
    val c = new Clerk()
    c.showInfo()
    Clerk.test(c)
  }
}

// 类
class Clerk {
  var name: String = "jack"
  protected var age =10 //通报无法使用
  private var sal: Double = 9999.9

  def showInfo(): Unit = {
    println(" name " + name + " sal= " + sal)
  }
}

//当一个文件 中出现了 ckass Clerk与 object Clerk
// kass Clerk 为半生类
//object Clerk 半生对象
//1.因为 scala 将static 去掉 认为其不是面向对象 java中有 static
//2.因此设计伴生类 伴生对象 将非静态的放入伴生类  静态的放入伴生静态内容
//3.在半生对象中 可以访问私有对象
 object Clerk {
  def test(c: Clerk): Unit = {
    //这里体现出在伴生对象中，可以访问c.sal
    println("test() name=" + c.name + " sal= " + c.sal)
  }


}
class Clerk02{
  // private 加括号 可以扩大范围
//  private [Clerk] val name="jjj"
}
