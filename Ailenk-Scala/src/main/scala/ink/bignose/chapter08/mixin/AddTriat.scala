package ink.bignose.chapter08.mixin

//混入多个特质的特点 == 叠加特质
object AddTriat {
  def main(args: Array[String]): Unit = {
    //1.同时混入了MySQL4 与 File4
    //2.查看顺序 是什么样的？
    //Operate4...
    //    Data4
    //    DB4
    //    File4
    //    向文件向数据库插入数据 = 888
    // 1.Scala在叠加特质的时候，会首先从后面的特质开始执行
    // 2.Scala中特质中如果调用super，并不是表示调用父特质的方法，而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
    val mysql = new MySQL4 with DB4 with File4
    //val mysql = new MySQL4 with File4 with DB4
    mysql.insert(888)

  }
}
//1本质
trait Operate4 {
  println("Operate4...")

  def insert(id: Int)
}
//2继承1
trait Data4 extends Operate4 {
  println("Data4")

  override def insert(id: Int): Unit = {
    println("插入数据 = " + id) //重写了 继承的方法
  }
}

//3继承3
trait DB4 extends Data4 {
  println("DB4")
  override def insert(id : Int): Unit = {
    print("向数据库")
    super.insert(id)
  }
}


trait File4 extends  Data4 {
  println("File4")
  override def insert(id : Int): Unit = {
    print("向文件")
//    super.insert(id)//这个super 不一定指的是父类
    super[Data4].insert(id)//通过泛型 可以跳过指定
  }}
class MySQL4 {}
