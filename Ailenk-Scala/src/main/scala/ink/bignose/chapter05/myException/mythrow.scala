package ink.bignose.chapter05.myException

object mythrow {
  def main(args: Array[String]): Unit = {
    //如果我们希望 抛出异常后戴安可以抛出异常
    try {
      val res = test()
      println(res.toString)
    }catch {
      case ex: Exception =>{
        println("拿到异常")
      }
    }
    println("05")
    f11()
  }


  def test(): Nothing = {
    throw new Exception("不对")
  }

  @throws(classOf[NumberFormatException])//等同于NumberFormatException.class
  def f11()  = {
    "abc".toInt
  }

}
