package ink.bignose.chapter05.functiondetail

object detail02 {
  def main(args: Array[String]): Unit = {

    println(getnum3(3, 20))
  }


  def getnum3(n1: Int, n2: Int): Unit = {
    n1 + n2
    return 3
  }

  def getnum4(n1: Int, n2: Int) = {
    n1 + n2
    if(1==2){
       "3"
    } else {
       3
    }
  }

  

}
