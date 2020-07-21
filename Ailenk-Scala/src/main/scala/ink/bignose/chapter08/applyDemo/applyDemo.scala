package ink.bignose.chapter08.applyDemo

/**
  * @Author :bignose
  * @Date: 2017/8/4 17:44
  */
object applyDemo {
  def main(args: Array[String]): Unit = {
    var pig1 = Pig("小黑猪")
    var pig2 = Pig()
    println("pig1"+pig1.Name)
    println("pig2"+pig2.Name)
  }
}

class Pig(pName: String) {
  var Name: String = pName
}

object Pig {
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪")
}
