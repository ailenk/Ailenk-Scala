package ink.bignose.chapter16.highfun

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 16:25
  */
object hightfun02 {
  def main(args: Array[String]): Unit = {
    //    2、编写函数values(fun:(Int)=>Int,low:Int,high:Int), //函数形式
    //    该函数输出一个集合，对应给定区间内给定函数的输入和输出。// 区间 （low to hight）
    //    比如，values(x=>x*x,-5,5)应该产出一个对偶的集合(-5,25),(-4,16),(-3,9),…,(5,25)
    // 通过fun函数处理值 返回 一个对偶

    val tuples = values((x: Int) => x * x, -5, 5)
    println(tuples)

  }

  //函数的形式
  def values(fun: (Int) => Int, low: Int, hight: Int) = {
    var array = List[(Int, Int)]() //空集合准备放对偶
    low to hight foreach { // 遍历 low to hight
      item =>
        array = (item, fun(item)) :: array //拼接
        // list((-5,25),(-4,16))
    }
    array.reverse
  }


}
