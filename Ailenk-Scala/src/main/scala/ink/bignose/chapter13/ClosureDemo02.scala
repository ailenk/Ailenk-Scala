package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 18:21
  */
object ClosureDemo02 {
  def main(args: Array[String]): Unit = {
    def makeSuffix(suffix: String) = {
      (name: String) => {
        if (name.endsWith(suffix)) name
        else name + suffix
      }
    }


  }
}
