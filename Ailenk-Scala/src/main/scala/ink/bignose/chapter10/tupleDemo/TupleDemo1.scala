package ink.bignose.chapter10.tupleDemo

object TupleDemo1 {
  def main(args: Array[String]): Unit = {
    //Tuple 灵活松散 最大只能放22个元素 但可以tuple说
   Tuple5
    //创建一个tuple1 就是一个元祖 类型tuple5
    //简单说明  根据元祖个数不同设置不同的类型
    //tuple1 -tuple22
    //反编译 看结果  BoxsRunTime.boxto..()
    val tuple1 = (1, 2, 3, "hello", 4)
    println(tuple1)
   //元组访问 从一 和数组方式
    // 底层不用遍历
    println(tuple1._1) //访问元组的第一个元素 ，从1开始
    println(tuple1.productElement(0)) // 访问元组的第一个元素，从0开始

    //元组遍历  不能使用原来方式
    for(item<- tuple1.productIterator){
      println("item="+item)
    }

  }
}
