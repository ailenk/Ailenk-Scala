package ink.bignose.chapter12

/**
  * @Author :bignose
  * @Date: 2017/8/10 14:46
  */
object bookeDemo02 {
  def main(args: Array[String]): Unit = {
    val sale = Bundle("书籍", 10,  Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))
    def price(it: Item): Double = {
      it match {
        case Book(_, p) => p
        //生成一个新的集合,_是将its中每个循环的元素传递到price中it中。递归操作,分析一个简单的流程
        case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
      }
    }

    println(price(Bundle("书籍", 10,  Book("漫画", 40))))



  }
}

abstract class Item // 项

case class Book(description: String, price: Double) extends Item

//Bundle 捆 ， discount: Double 折扣 ， item: Item* ,
case class Bundle(description: String, discount: Double, item: Item*) extends Item
