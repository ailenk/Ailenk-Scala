package ink.bignose.chapter13

import java.text.SimpleDateFormat
import java.util.Date

/**
  * @Author :bignose
  * @Date: 2017/8/10 19:26
  */
object recursion {
  def main(args: Array[String]): Unit = {
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("date=" + date) //输出时间
    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999l) //BigInt(99999999l)[测试效率大数]
    while (num <= maxVal) {
      res += num
      num += 1
    }
    println("res=" + res)

    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("date2=" + date2)
  }
}
