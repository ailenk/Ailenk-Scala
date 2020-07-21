package ink.bignose.chapter10.scalaDemo

/**
  * @Author :bignose
  * @Date: 2017/8/7 15:29
  */
object ofDimDemo {
  def main(args: Array[String]): Unit = {
    /**
      * 说明
        //定义
        val arr = Array.ofDim[Double](3,4)
        //说明：二维数组中有三个一维数组，每个一维数组中有四个元素

        //赋值
        arr(1)(1) = 11.11
      */
    val array1 = Array.ofDim[Int](3, 4)
    array1(1)(1) = 9
    for (item <- array1) {// 取出一行
      for (item2 <- item) { //取出一行的 每一列
        print(item2 + "\t")
      }
      println()
    }
    //传统的下标 方式 来进行遍历
    println("===================")
    for (i <- 0 to array1.length - 1) {
      for (j <- 0 to array1(i).length - 1) {
        printf("arr[%d][%d]=%d\t", i, j, array1(i)(j))
      }
      println()
    }

  }
}
