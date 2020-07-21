package ink.bignose.chapter04

object yieidFor {
  def main(args: Array[String]): Unit = {
    //    //i 可以是一个代码块
    //    var res = for (i <- 1 to 10) yield {
    //      if (i % 2 == 0) {
    //        i
    //      } else {
    //        "不是偶数"
    //      }
    //    }
    //    println(res)
    //另一种写法
    //    for {
    //      i <- 1 to 10
    //      j = i - 2
    //    }{
    //     println("不是偶数")
    //    }

    // start end step  def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    //   for(i<- Range(1,10,2)){
    //     println(i)
    //   }


    //控制步长的第二种方式  for循环守卫
    //    for (i <- 1 to 10 if i % 2 == 1) {
    //      println(i)
    //     }
    //练习题  1- 100 9的倍数个数  总数

    val start = 1
    val end = 100
    var count = 0
    var sum = 0
    for (i <- 1 to 100) {
      if (i % 9 == 0) {
        count += 1
        sum += i
      }
    }
    println(count)
    println(sum)

    // 循环加法表达式
    val  num =6
    for( i <- 1 to num ){
      printf("%d+%d=%d\n",i,{num-1},num)
    }

  }
}




