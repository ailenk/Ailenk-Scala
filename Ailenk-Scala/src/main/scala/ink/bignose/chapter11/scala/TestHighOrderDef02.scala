package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/9 18:40
  */
object TestHighOrderDef02 {


  // Double => Double 接受一个函数 返回一个函数 ，
  def main(args: Array[String]): Unit = {
    test2(sayOK)
  }

  def test2(f: () => Unit) = {
    f()
  }

  def sayOK() = {
    println("sayOKKK...")
  }


}
