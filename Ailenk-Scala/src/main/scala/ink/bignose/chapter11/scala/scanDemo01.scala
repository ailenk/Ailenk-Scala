package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/9 20:19
  */
object scanDemo01 {
  def main(args: Array[String]): Unit = {
    def minus( num1 : Int, num2 : Int ) : Int = {
      num1 - num2
    }
    //5 (1,2,3,4,5) =>(5,4,2,-1,-5,-10)
//    Vector(5, 4, 2, -1, -5, -10)
//    Vector(5, 6, 8, 11, 15, 20)
    //  保留 数据
    val i8 = (1 to 5).scanLeft(5)(minus) //IndexedSeq[Int]
    println(i8)
    def add( num1 : Int, num2 : Int ) : Int = {
      num1 + num2
    }
    //5 (1,2,3,4,5) =>(5,6,8, 11,15,20)
    val i9 = (1 to 5).scanLeft(5)(add) //IndexedSeq[Int]
    println(i9)

  }
}
