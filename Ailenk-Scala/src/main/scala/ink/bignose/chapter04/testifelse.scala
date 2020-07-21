package ink.bignose.chapter04

import scala.io.StdIn
import  scala.math._
//下划线标识将scala 下所有的包一起引用

/**
  * :bignose
  * 2017/8/2 19:40
  */
object testifelse {


  def main(args: Array[String]): Unit = {

    //    求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，如果：b2-4ac>0，则有两个解；
    //    b2-4ac=0，则有一个解；b2-4ac<0，则无解； [a=3 b=100 c=6]
    //    提示1：x1=(-b+sqrt(b2-4ac))/2a
    //      X2=(-b-sqrt(b2-4ac))/2a

    /*
      1.思路
        三个变量
        if else 完成
        b2-4ac
     */
    val a = 3
    val b = 100
    val c = 6
    val m = b * b - a * a * c
    var x1 = 0.0
    var x2 = 0.0
    if (m > 0) {
      x1 = (-b + sqrt(m)) / 2 * a
        x2 = (-b - sqrt(m)) / 2*a
    } else {

    }


  }

}
