package ink.bignose.chapter08

object SingleTonDemo {
  def main(args: Array[String]): Unit = {
    val dog1 =Dog
    val dog2 =Dog
    println(dog1)
    println(dog2)
  }
}

class Dog private{

}

object Dog{
  val singleDog :Dog=null
  def apply(): Dog ={
    if(Dog==null){
      singleDog==new Dog()
      return  singleDog
    }
   return new Dog()
  }
}
