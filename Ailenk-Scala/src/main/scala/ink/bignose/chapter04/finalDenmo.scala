package ink.bignose.chapter04

import scala.io.StdIn

/**
  * @bignose
  * @ 2017/8/3 9:42
  */
object finalDenmo {

  def main(args: Array[String]): Unit = {
    //
    //    //    统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
    //    // 1.变量保存班 2.保存学生个数
    //    // 2. class 保存各二个班级总分 tatalScore 标识班级总分
    //    // 3.score 标识学生成绩
    //    // 4. 循环输入成绩
    //

    //
    //    val classNum = 3
    //    val stuNum = 5
    //    var score=0.0
    //    var classScore = 0.0 //平均分
    //    var tatlsorce = 0.0 //全部平均分
    //    for (i <- 1 to classNum) {
    //      classScore = 0.0
    //      for (i <- 1 to stuNum) {
    //        println("请输入学生成绩")
    //        score = StdIn.readDouble()
    //        classScore += score
    //      }
    //      println(classScore/stuNum)
    //
    //    }

    //    统计三个班及格人数，每个班有5名同学。 将上边 加变量加判断

    //    //    打印出九九乘法表
    //思路分析
    val num = 9

    for (i <- 1 to num) {   //定行
      for(j<- 1 to i){     //定列
          printf("%d*%d=%d\t",j,i,i*j)
      }
      println()
    }

  }
}
