package ink.bignose.chapter05

object function {
  def main(args: Array[String]): Unit = {
    println(sayhello())
    val n1 =20
    val n2=0
    println("res="+getRes(20,0,'+'))

  }

  def sayhello(): String = {
    return "sayhello"

  }

  def getRes(n1: Int, n2: Int, oper: Char) = {
    if (oper == "+") {
      n1 + n2
    } else if (oper == "-") {
      n1 - n2
    } else {
      null
    }
    null
  }

}
