package ink.bignose.chapter04

/**
  * @ :bignose
  * @ 2017/8/3 9:23
  */
object whiledemo {
  def main(args: Array[String]): Unit = {
    //for 循环下都是while
    var list = List(1, 2, 3)

    //whil 循环  推荐for循环 因为 保证变量没有使用外边的变量  因为使用递归在内部进行方法
    // 纯函数 函数递归
//    var i = 1
//    while (i < 10) {
//      printf("hello alienk" + i)
//      i += 1
//    }

     //do while
    var i=0
    do{
      println("i"+i)
     i+=1
    }while(i <10)

  }
}
