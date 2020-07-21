package ink.bignose.chapter13

import java.text.SimpleDateFormat
import java.util.Date

/**
  * @Author :bignose
  * @Date: 2017/8/10 19:26
  */
object recursion02 {
  def main(args: Array[String]): Unit = {
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("date=" + date) //输出时间
    // 递归的方式来解决
    def mx(num:BigInt,sum:BigInt):BigInt = {
      if(num <= 99999999l) return mx(num+1,sum + num)
      else return sum
    }

    //测试
    var num = BigInt(1)
    var sum = BigInt(0)
    var res = mx(num,sum)
    println("res=" + res)

    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("date2=" + date2)
  }
}
