package ink.bignose.chapter06.demo

object excescise02 {

  def main(args: Array[String]): Unit = {
    var res = 1L
    "Hello".foreach(res *= _.toLong)
    println("res=" + res)
   println(mi(10.0,2))
  }

  def mi(x: Double, n: Int): Double = {
    if(n==0){
      0
    }else if(n>0){
      x* mi(x,n-1)
    } else{
       1/mi(x,-1)
    }
  }

}
