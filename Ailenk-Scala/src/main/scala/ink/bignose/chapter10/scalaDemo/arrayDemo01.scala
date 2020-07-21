package ink.bignose.chapter10.scalaDemo

/**
   定长数组的第一种方式
  */
object arrayDemo01 {
  def main(args: Array[String]): Unit = {
    import java.util
    //不可变集合类似java的数组//不可变集合类似java的数组
    //可变集合举例
    //1.表示创建一个Array对象
    //2.[String] 表示泛型
    // 默认为0
    val arr01 = new Array[Int](4) //底层 int[]arry01=new Array int[10]
    println(arr01.length)

    println("arr01(0)=" + arr01(0))
    for (i <- arr01) {
      println(i)
    }
    println("--------------------")
    arr01(3) = 10 //下标赋值
    for (i <- arr01) {
      println(i)
    }


//    在定义数组时，直接赋值
//    //使用apply方法创建数组对象
//    val arr1 = Array(1, 2)

    //1.这里使用的是 object Array 的apply
    //2.如果你给了 数组的类型 会自动话数据类型  这里是 any
    var arr02 = Array(1, 3, "xxx")
    for (i <- arr02) {
      println(i)
    }

    //另外的 遍历方式 shiyong java 的传统方式
    //使用下标的方式
    for(index<- 0 until arr02.length){
      printf("arr02[%d]=",index,arr02(index))
    }



  }
}
