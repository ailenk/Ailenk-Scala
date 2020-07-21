package ink.bignose.chapter12

/**
  * @Author :bignose
  * @Date: 2017/8/10 14:22
  */
object AbstractClassDemo03 {
  def main(args: Array[String]): Unit = {

    List(1, 3, 5, 9) match { //修改并测试
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
      case first :: second :: rest => println(first + ""+second +""+ rest.length) //
      case _ => println("匹配不到...")
    }


  }
}
