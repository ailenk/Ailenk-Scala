package ink.bignose.chapter08.myTrait

object mytrartDemo02 {
  def main(args: Array[String]): Unit = {
    val c = new C()
    val f = new F()
    println(c.getConnect())
    println(f.getConnect())
  }
}

trait Trait {
  def getConnect()
}

class A {}

class B extends A {}

class C extends A with Trait {
  override def getConnect(): Unit = {
    println("连接Mysql")
  }
}

class D {}

class E extends A {}

class F extends A with Trait {
  override def getConnect(): Unit = {
    println("连接Orcel")
  }
}
