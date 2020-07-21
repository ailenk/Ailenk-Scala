package ink.bignose.chapter01.vars

object varDemo2 {
  def main(args: Array[String]): Unit = {
   //1.类型推到
    //num 为Int
    //通过idea 提示
    var num=10
    println(num)
    //is instance of
    print(num.isInstanceOf[Int])
    //2.类型确定后不能修改  属于强类型语言

    //3.var 与 val 区别  var 修饰可以改变 var 不可变
    var age =10
    age = 20

    val num2=30

    // scala 为什么 这么设计
    //（1）在实际编程中更多的需求是获取或者构建一个对象后 获取对象属性，或者修改对象属性值
    //很少改变对象本身   dog=new Dog() dog.age=10  而不是   dog=new Dog()
    //（2）这是我们就可以使用val 因为 val 没有线程安全问题  所以效率高  scala 尽量使用 val
    // （3）如果对象真的需要变化 则改变var
//    val dog=new Dog
    //     dog=new Dog  不能再分配
    val dog=new Dog
    dog.age=90
    dog.name="笑话"
   //只改变 属性便于优化 效率   val 底层是 final
  }

  class  Dog{
    //声明年龄，名字
    var age :Int = _ //0'
    var name :String = ""

  }

}
