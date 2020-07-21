package ink.bignose.chapter16.highfun

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 16:43
  */
object hightfun03 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1, 2, 3)
    println(arr.reduceLeft((I,r)=>if(I>r) I else  r))

  }

  def f1(I: Int, r: Int): Int = {
    if (I > r) I else r
  }
}
