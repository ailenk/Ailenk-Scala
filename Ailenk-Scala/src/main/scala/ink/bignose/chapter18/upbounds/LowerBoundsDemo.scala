package ink.bignose.chapter18.upbounds

/**
  * @Author :Ailenk
  * @Date: 2017/7/15 20:35
  */
object LowerBoundsDemo01 {

  def main(args: Array[String]): Unit = {

    //下界约束
    println(biophony(Seq(new Animal, new Animal)).map(_.sound())) //?
    println(biophony(Seq(new Earth, new Earth)).map(_.sound())) //?
//    //下届？？？
      // 是父类则是父类
      //  如果是子类 方法覆盖则是子类
    println(biophony(Seq(new Bird, new Bird)).map(_.sound())) //?
//    println(biophony(Seq(new Animal, new Animal)).map(_.sound())) //?
//    println(biophony(Seq(new Moon, new Moon)).map(_.sound())) //?
  }

  def biophony[T >: Animal](things: Seq[T]) = things
}

class Earth { //Earth 类
  def sound() { //方法
    println("hello !")
  }
}

class Animal extends Earth {
  override def sound() = { //重写了Earth的方法sound()
    println("animal sound")
  }
}

class Bird extends Animal {

}

class Moon {}


