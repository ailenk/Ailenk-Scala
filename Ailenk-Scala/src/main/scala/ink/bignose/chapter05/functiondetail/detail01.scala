package ink.bignose.chapter05.functiondetail

object detail01 {
  def main(args: Array[String]): Unit = {

    var n1 = 10
    var tigger = new Tigger
    println(tigger.hashCode())
    tigger.name = "zzzz"
    test01(10, tigger) //同一对象
    println(tigger.name)
    println(tigger.hashCode())
    //return 自行推断 无效  编译器无效



    def f1={"aaaaaaaa"}//函数
  }

  def test01(n1: Int, tigger: Tigger): Tigger = {
    println("n1" + n1)
    tigger.name = "jj"
    tigger
  }

}

class Tigger {
  //名字属性
  var name: String = "alienk"
}
