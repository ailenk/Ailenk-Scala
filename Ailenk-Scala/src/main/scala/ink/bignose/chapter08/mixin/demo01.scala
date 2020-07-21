package ink.bignose.chapter08.mixin

object demo01 {
  def main(args: Array[String]): Unit = {
    //在不修改定义的基础上  可以试用trait 使他们试用trait
    //当混入多个的时候 叫做特质叠加
    val oracleDB = new OracleDB with Operate3
    oracleDB.insert(100)

    val mysql =new MySQL3 with Operate3
    oracleDB.insert(200)
    //如果动态类有动态方法  如何混入特质
    val mysql3 =new MySQL3_ with Operate3{
      override def say(): Unit = {
        println("say")
      }
    }
    mysql3.insert(300)
    mysql3.say()
  }
}
trait Operate3 {
  def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}
class OracleDB {
}
abstract class MySQL3 {
}
abstract class MySQL3_ {
  def say()
}