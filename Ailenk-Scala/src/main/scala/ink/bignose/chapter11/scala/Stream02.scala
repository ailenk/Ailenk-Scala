package ink.bignose.chapter11.scala

import scala.collection.SeqView

/**
  * @Author :bignose
  * @Date: 2017/8/9 21:45
  */
object Stream02 {
  def main(args: Array[String]): Unit = {
    def multiple(num: Int): Int = {
      num}
    def eq(i: Int): Boolean = {
      i.toString.equals(i.toString.reverse)
    }
    //说明: 没有使用view
    val viewSquares1 = (1 to 100)
      .map(multiple)
      .filter(eq)
    println(viewSquares1)
    //for (x <- viewSquares1) {}
    //使用view
    val viewSquares2 = (1 to 100)
      .view
      .map(multiple)
      .filter(eq)

    println(viewSquares2)
    for (x <- viewSquares2) {
      println(x)
    }
    // view 内部
//    override def view = new SeqView[A, Repr] {
//      protected lazy val underlying = self.repr
//      override def iterator = self.iterator
//      override def length = self.length
//      override def apply(idx: Int) = self.apply(idx)
//    }

  }
}
