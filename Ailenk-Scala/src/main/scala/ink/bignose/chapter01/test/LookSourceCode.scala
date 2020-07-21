package ink.bignose.chapter01.test

object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](10)
    //对代码进行格式化 快捷键  Ctrl +alt +l
    for (item <- arr) {
       println("iten="+item)
    }

    var name="bignose";
    for (i<- 0 until  name.length){
      println(name.charAt(i))
    }

  }
}
