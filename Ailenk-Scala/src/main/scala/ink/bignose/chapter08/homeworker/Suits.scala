package ink.bignose.chapter08.homeworker

//翻转
object Suits extends Enumeration {
  //
  //  def main(args: Array[String]): Unit = {
  //    //type 可以给类型取别名
  //    type MyInt = Int
  //    val num1: MyInt = 888
  //    println(num1)
  //
  //  }
  type Suit = Value

  var Spade = Value("♠")
  var Club = Value("♠")
  var Heart = Value("♠")
  var Diamond = Value("♠")

  override def toString(): String = {
    Suits.values.mkString(",")
  }

  def isRed(card: Suit): Unit = {
    card == Heart || card == Diamond
  }

}
