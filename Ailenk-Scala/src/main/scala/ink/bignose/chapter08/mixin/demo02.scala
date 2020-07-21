package ink.bignose.chapter08.mixin

object demo02 {
  def main(args: Array[String]): Unit = {
    val mysql5 = new MySQL5 with DB5 with File5
    mysql5.insert(20)
  }
}

trait Operate5 {
  def insert(id: Int)
}

trait File5 extends Operate5 {
  //1. 如果在子特质方法中 重写父类方法
  //2.  需要生声明为 abstract override 调用者 还需要 实现
  //3.  super.insert 不一定指向父类 super 指的左边的特质
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中..")
    super.insert(id)
  }
}

trait DB5 extends Operate5 {
  def insert(id: Int): Unit = {
    println("将数据保存到数据库中..")
  }
}

class MySQL5 {}



