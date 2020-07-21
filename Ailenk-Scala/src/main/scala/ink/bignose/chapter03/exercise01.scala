package ink.bignose.chapter03

object exercise01 {
  //加入还有97天放假 问：还有多少个xx个星期零xx天
  /*
   1.搞清楚需求
   2.思路分析
     （1） 变量保存97
      （2） 使用/7 得到 几个星期
       （3） xx天使用 %
   3.代码实现
   */
  def main(args: Array[String]): Unit = {
    val days = 97
    printf("统计结果还有天 %d星期零 %d天", days / 7, days % 7)
  }

  /**
    * 定义一个 华氏温度  花式温度公是为 5/9*（huashi* 1000） 求摄氏度 232.5
    * 分析 保存华氏温度 变量摄氏温度
    *
    */
  val huashi = 232.5
  val sheshi = 5.0 / 9 * (huashi - 100)
  println("摄氏温度"+sheshi.formatted("%.2f"))


}
