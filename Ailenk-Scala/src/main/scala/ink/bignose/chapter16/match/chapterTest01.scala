package ink.bignose.chapter16.`match`

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 15:41
  */
 object chapterTest01 {
  def main(args: Array[String]): Unit = {
//    1、定义一个不可变类Pair[T,S], 带一个swap方法，返回组件交换过位置的新对偶
       println(swap((10,20)))

  }

  def  swap[T,S](tup:(T,S))={
    tup match {
      case (a,b)=>(b,a)
    }
  }

}
