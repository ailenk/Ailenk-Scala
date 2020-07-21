package ink.bignose.chapter07.scalapackage

import ink.bignose.chapter07.scalapackage.xh.tigger

object TestTigger {
  def main(args: Array[String]): Unit = {
    //小红的 tigger
    val tigger1 = new tigger
    //小明  tigger
    val tigger2 = new xm.tigger
    println(tigger1+""+tigger2)
   // 包回自动寻找，转换 还会自动清掉   编译器帮我们做的
    //包不能 包含关键字 数字打头 下划线  小圆点
    // lang
    val emploee =new Emploee
  }
}

class Emploee{

}
