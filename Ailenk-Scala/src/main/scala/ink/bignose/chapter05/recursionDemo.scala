package ink.bignose.chapter05

object recursionDemo {
  def main(args: Array[String]): Unit = {
    //1.当程序执行一个函数是 就会创建一个新的受保护的空间 独立栈
    // 2.函数变量独立 互不影响
    // 3.递归是无限接近的
    // 4.谁调用就返回给谁
    test(4)
  }

  def test(num: Int) {
    if (num > 2) {
      test(num - 1)
    }
    println("n=" + num)
  }

  //支持0到多个参数
  def sum(args :Int*) : Int = {
    return 1
  }
  //支持1到多个参数  可变仓鼠需要放到最后
  def sum(n1: Int, args:  Int*) : Int  = {
    return 1
  }

}
