package ink.bignose.chapter08.myTrait

object mytrartDemo03 {
  def main(args: Array[String]): Unit = {

    val sheep =new Sleep
    println(sheep.sayHi())
    println(sheep.sayHello())
  }
}

// 当一个trait 一个trait 在底层生成 两个类
// 一个为借口 一个为抽象类
//当在 sleep 中药使用trait03的实现的方法 就直接使用 Trait03class.class
trait Trait03 {
  def sayHi()
  def sayHello():Unit={
    println("say Hello--")
  }
}

class  Sleep extends Trait03{
  override def sayHi(): Unit = {
    println("小羊sayHi")
  }
}

