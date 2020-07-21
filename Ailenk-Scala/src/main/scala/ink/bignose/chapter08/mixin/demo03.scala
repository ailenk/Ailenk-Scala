package ink.bignose.chapter08.mixin

object demo03 {
  def main(args: Array[String]): Unit = {
//    val ff1 = new FF
//    println(ff1)

    //动态混入  先搞定对象
    val ff2 =new KK with CC with DD
    println(ff2)
  }
}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B....")
}

trait CC extends BB {
  println("C....")
}

trait DD extends BB {
  println("D....")
}

class EE {
  println("E...")
}

class FF extends EE with CC with DD {
  println("F....")
}

class KK extends EE {
  println("K....")
}

