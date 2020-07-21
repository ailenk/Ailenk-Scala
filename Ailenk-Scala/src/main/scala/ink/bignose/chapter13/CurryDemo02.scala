package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 18:39
  */
object CurryDemo02 {
  def main(args: Array[String]): Unit = {
    def eq2(s1: String)(s2: String): Boolean = {
      s1.toLowerCase == s2.toLowerCase
    }

    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }

    implicit class TestEq(s: String) {
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }
    }

    val str1 = "hello"
    val str2 = "hello"
    val flg = str1.checkEq(str2)(_.equals(_))
    println(flg)

  }
}
